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
    public static void main(String[] args) {
       new Connect().connectDB();
    }
    public void  connectDB(){
        String db_name="mdb";
        String user="root";
        String hostName="localhost";
        String driverName="com.mysql.jdbc.Driver";
        try{
            Class.forName(driverName);
            String url="jdbc:mysql://"+hostName+"/"+db_name;
            Connection con=DriverManager.getConnection(url, user, "");
            System.out.println("เชื่อมต่อสำเร็จ");
            
        } catch (Exception e){
            System.out.println("e.getMesssage()");
        }
    }
}
        
    
      
