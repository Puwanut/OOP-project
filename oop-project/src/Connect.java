/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanasin
 */
import java.sql.*;
public class Connect {
    
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/mdb";
            Connection con = DriverManager.getConnection(url, "root", "");
            return con;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;    
}
}
