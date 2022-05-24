package com.jdbc;
import java.sql.*;
public class CreateDb {
    public static void main(String[] args) {
        String  url ="jdbc:mysql://localhost:3306";
        String username = "root";
        String password ="annapoorani@2022";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            String sql="CREATE DATABASE JDBC";
            Statement stm = connection.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Successfully database created!");

        }
        catch(SQLException e){
            System.out.println("Database is not created");
            e.printStackTrace();
        }
    }
}
