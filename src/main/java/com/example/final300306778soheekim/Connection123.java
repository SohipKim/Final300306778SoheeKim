package com.example.final300306778soheekim;

import org.springframework.stereotype.Service;
import java.sql.DriverManager;
import java.sql.SQLException;


@Service
public class Connection123 {

    public java.sql.Connection connect() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");

        java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/savings", "root", "");

        return con1;
    }

    public int executeQuery(String query) throws ClassNotFoundException, SQLException {
        return connect().createStatement().executeUpdate(query);
    }
}
