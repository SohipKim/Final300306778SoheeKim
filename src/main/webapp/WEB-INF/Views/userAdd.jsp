<%--
  Created by IntelliJ IDEA.
  User: Sohee Kim
  Date: 2021-08-12
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <h1>Add an entry</h1>
    <form method="POST">
        <fieldset class="form-group">
            <label> Customer number :</label>
            <input name="custno" type="text" class="form-control" required />
        </fieldset>

        <fieldset class="form-group">
            <label>Customer Name :</label>
            <input name="custname" type="text" class="form-control" required />
        </fieldset>

        <fieldset class="form-group">
            <label>Customer Deposit: </label>
            <input name="cdep" type="text" class="form-control" required />
        </fieldset>


        <fieldset class="form-group">
            <label>Number of Years: </label>
            <input name="nyears" type="text" class="form-control" required />
        </fieldset>

        <fieldset class="form-group">
            <label>Sayings Type: </label>
            <input name="savtype" type="text" class="form-control" required />
        </fieldset>



        <input class="btn btn-success" type="submit" value="Submit" />
    </form>

</div>


<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
