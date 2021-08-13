package com.example.final300306778soheekim;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface {

    public void add(User cat) throws ClassNotFoundException, SQLException;
    public User edit(User cat, String catcode) throws ClassNotFoundException, SQLException;
    public void delete(String catcode) throws ClassNotFoundException, SQLException;
    public User search(String catcode) throws SQLException, ClassNotFoundException;
    public List<User> display() throws ClassNotFoundException, SQLException;
//    public List<Items> display2(String catcode) throws ClassNotFoundException, SQLException;
}
