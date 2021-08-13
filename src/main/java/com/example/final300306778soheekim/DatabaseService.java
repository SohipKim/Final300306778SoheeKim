package com.example.final300306778soheekim;


import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService implements DatabaseInterface{

    Connection con;

    public DatabaseService(Connection con) {
        this.con = con;
    }


    @Override
    public void add(User user) throws ClassNotFoundException, SQLException {
        String quer1 = "INSERT INTO savingstable VALUES(?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(quer1);

        query.setString(1, user.getCustno());
        query.setString(2, user.getCustname());
        query.setString(3, user.getCdep());
        query.setString(4, user.getNyears());
        query.setString(5, user.getNyears());



        query.executeUpdate();
    }

    @Override
    public User edit(User user, String custno) throws ClassNotFoundException, SQLException {
        PreparedStatement query;

        query = con.prepareStatement("UPDATE savingstable SET custno=?, custname=?, cdep=?, nyears=?,savtype=? WHERE custno=?");

        query.setString(1, user.getCustno());
        query.setString(2, user.getCustname());
        query.setString(3, user.getCdep());
        query.setString(4, user.getNyears());
        query.setString(5, user.getNyears());
        query.setString(1, user.getCustno());

        query.executeUpdate();

        return user;



    }

    @Override
    public void delete(String custno) throws ClassNotFoundException, SQLException {

        String quer1 = "DELETE FROM savingstable WHERE custno=?";
        PreparedStatement query = con.prepareStatement(quer1);
        query.setString(1, custno);
        query.executeUpdate();
    }

    @Override
    public User search(String custno) throws SQLException, ClassNotFoundException {


        String quer1 = "SELECT * FROM savingstable WHERE custno=?";
        PreparedStatement query = con.prepareStatement(quer1);
        query.setString(1, custno);

        ResultSet rs = query.executeQuery();

        if(!rs.first()){
            System.out.println("Record not existing");
            return null;
        }

        User obj1 = null;

        obj1 = new User(rs.getString("custno"), rs.getString("custname"),
                rs.getString("cdep"), rs.getString("nyears"),
                rs.getString("savtype"));

        return obj1;
    }

    @Override
    public List<User> display() throws ClassNotFoundException, SQLException {

        List<User> Userlist = new ArrayList<User>();

        String quer1 = "SELECT * FROM savingstable";
        PreparedStatement query = con.prepareStatement(quer1);
        ResultSet rs = query.executeQuery();

        User obj1 = null;

        while(rs.next()){
            obj1 = new User(rs.getString("custno"), rs.getString("custname"),
                    rs.getString("cdep"), rs.getString("nyears"),
                    rs.getString("savtype"));

            Userlist.add(obj1);
        }

        return Userlist;
    }
}
