package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
public static Connection connection=null;
private static DriverManager DriveManager;

    public static Connection getConnection(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/projectFH?useSSL=false","root","Dsr@12345");

    } catch (ClassNotFoundException | SQLException e) {
     e.printStackTrace();
    }
    System.out.println("success");
    return connection;
}
public static void closeConnection(){
    if(connection!=null) {
        try {
            connection.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    }




}
