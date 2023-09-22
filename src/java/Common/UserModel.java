/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */

  public class UserModel {
    ConnectionClass cobj;
      PreparedStatement pst;
      ResultSet rst;
    
    public UserModel(){
        cobj=new ConnectionClass();
    }
    
    public boolean insertuser(String username, String Password, String phone,String address){
        boolean flag=false;
        cobj.Connect();
        try{
            pst= cobj.con.prepareCall("{call UserRegistration(?,?,?,?)}");
            pst.setString(1, username);
            pst.setString(2, Password);
            pst.setString(3, phone);
            pst.setString(4, address);
        if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                {
                    flag=true;
                }
        }
        catch(Exception ex){
            System.out.println("Error in insert "+ex );
        }
        cobj.Disconnect();
        return flag;
    }
    
     public ArrayList searchplan(String date,String destination){
        ArrayList aobj=new ArrayList();
        cobj.Connect();
        try{
            pst=cobj.con.prepareStatement("Select PlannerID from tbOrganizerDashboard where ? between FromDate and ToDate and Destination=?");
            pst.setString(1, date);
            pst.setString(2, destination);
            rst=pst.executeQuery();
            if(rst.next()){
                aobj.add(0,rst.getString(1).trim());
            }
            rst.close();
        }
        catch(Exception ex){
            System.out.println("Error in Searching Plan "+ex);
        }
        cobj.Disconnect();
        return aobj;
    }
     
     
     public boolean paymentinsert(String BookingID, String CreditCard, String HolderName ,String ExpiryDate , String CVV)
 {
     boolean flag=true;
     cobj.Connect();
     
     try
     {
         pst=cobj.con.prepareCall("{call PaymentInsert(?,?,?,?,?)}");
         pst.setInt(1, Integer.parseInt(BookingID));
         pst.setString(2 , CreditCard);
           pst.setString(3 , HolderName);
       //      pst.setString( 4, CardNo);
               pst.setString(4 ,ExpiryDate);
                 pst.setInt(5 ,Integer.parseInt(CVV));
                   if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true; 
             
           
     }
     catch(Exception ex)
     {
         System.out.println("Error in paymentinsert"+ex);
     }
     cobj.Disconnect();
     return flag;
 }
     
    public boolean insertplan(String UserID,String OrganiserID,String Location,String Transport,String Accommodation,String LTransport,String Guide, String TotalCost,String PlanID){
        boolean flag=false;
        cobj.Connect();
        try{
            pst= cobj.con.prepareCall("{call BookingInsert(?,?,?,?,?,?,?,?,?)}");
            pst.setInt(1, Integer.parseInt(UserID));
            pst.setInt(2, Integer.parseInt(OrganiserID));
            pst.setString(3, Location);
            pst.setString(4, Transport);
            pst.setString(5, Accommodation);
            pst.setString(6, LTransport);
            pst.setString(7, Guide);
            pst.setString(8, TotalCost);
            pst.setInt(9, Integer.parseInt(PlanID));
        if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                {
                    flag=true;
                }
        }
        catch(Exception ex){
            System.out.println("Error in insert "+ex );
        }
        cobj.Disconnect();
        return flag;
    }
}  

