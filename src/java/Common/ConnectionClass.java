/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author bhavi
 */
public class ConnectionClass {
     public Connection con;
   public void Connect()
   {
       try
       {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dbTour_and_Travel1;integratedSecurity=true;");
           //con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dbdemo;uid=username;pwd=password;");
           System.out.println("connected");
           
       }
       catch(Exception ex)
       {
           System.out.println("error in connection"+ex);
       }
   }
   
   public void Disconnect()
   {
       try{
           con.close();
           
           System.out.println("disconnected");
       }
       catch(Exception ex)
       {
           System.out.println("error in disconnection"+ex); 
       }
   }
   public static void main(String args[])
   {
       ConnectionClass cobj= new ConnectionClass();
       cobj.Connect();
       cobj.Disconnect();
   }
}

  
