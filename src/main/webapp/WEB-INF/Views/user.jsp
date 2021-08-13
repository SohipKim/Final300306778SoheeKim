<%--
  Created by IntelliJ IDEA.
  User: Sohee Kim
  Date: 2021-08-12
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script>

        function myFunction(){
            document.getElementById("mes").innerHTML="";
        }

    </script>

    <title>My Page</title>
    <style>
        h1{
            text-align: center;
        }
    </style>
</head>
<body>

<h1>Saving Investment Record</h1>
<div class="container2">
    <h2>Categories</h2>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Customer number</th>
            <th>Customer Name</th>
            <th>Customer Deposit</th>
            <th>Number of Years </th>
            <th>Sayings Type</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${todos}" var="todo">

            <tr>
                <td>${todo.custno}</td>
                <td>${todo.custname}</td>
                <td>${todo.cdep}</td>
                <td>${todo.nyears}</td>
                <td>${todo.savtype}</td>

                <td>    <a type="button" class="btn btn-primary"
                           href="update-todo?id=${todo.custno}" >Edit</a> </td>

                <td>    <a type="button" class="btn btn-primary"
                           href="delete-todo?id=${todo.custno}" >Delete</a> </td>

<%--                <td>    <a type="button" class="btn btn-primary" onmouseout="myFunction()"--%>
<%--                           href="see-todo?id=${todo.custno}" >Items</a> </td>--%>

            </tr>

        </c:forEach>

        </tbody>
    </table>
</div>

<a class="btn btn-success" href="add-todo">Add</a>

</body>
</html>
