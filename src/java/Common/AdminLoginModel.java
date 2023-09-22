/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;
import Common.ConnectionClass;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author bhavi
 */
public class AdminLoginModel
{
 ConnectionClass cobj;
    PreparedStatement pst;
    ResultSet rst;
    public AdminLoginModel()
    {
        cobj= new ConnectionClass() ;
        
    }
    public boolean AdmincheckLogin(String username , String password)
    {
        boolean flag=false;
        cobj.Connect();
        
       try{
           pst=cobj.con.prepareStatement("Select * from tbAdminLogin where Username=? and Password = ?");
           pst.setString(1,username);
           pst.setString(2, password);
           rst=pst.executeQuery();
           if(rst.next())
           {
               flag= true;
           }
           
           rst.close();
       } 
       catch(Exception ex)
       {
           System.out.println("Error in login"+ex);
       }
       cobj.Disconnect();
       return flag;
    }
    
    public boolean updateadmin(String Username,String OPassword,String NPassword){
        boolean flag=false;
        cobj.Connect();
        try{
            pst=cobj.con.prepareCall("{call AdminLoginUpdate(?,?,?)}");
            pst.setString(1, Username);
            pst.setString(2, OPassword);
            pst.setString(3, NPassword);
            if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                {
                    flag=true;
                }
        }
        catch(Exception ex){
            System.out.println("Error in change password "+ex);
        }
        cobj.Disconnect();
        return flag;
}
    public boolean insertAccomodation(String Type , String HotelName , String LowerPrice , String HigherPrice , String Plan , String Specification)
    {
        boolean flag=false;
        cobj.Connect();
        try
        {
            pst= cobj.con.prepareCall("{call AccommodationInsert(?,?,?,?,?,?)}");
            pst.setString(1 , Type);
            pst.setString(2,HotelName);
             pst.setString(3,LowerPrice); 
             pst.setInt(4 , Integer.parseInt(HigherPrice)); 
             pst.setInt(5 , Integer.parseInt(Plan));
              pst.setString(6,Specification);
              if(pst.execute()==false)
                  if(pst.getUpdateCount()>0)
                  
                   flag=true;
                    }
        catch(Exception ex)
                      {
                      System.out.println("Error in Accomodation model");
                      }  
        cobj.Disconnect();
        System.out.println(flag);
        return flag;
    }
       
     public boolean updateAccomodation(String AccomodationID , String Type , String HotelName , String LowerPrice , String HigherPrice , String PlannerID , String Specification)
     {
         boolean flag= false;
         cobj.Connect();
         
         try
         {
             
           pst= cobj.con.prepareCall("{call AccommodationUpdate(?,?,?,?,?,?,?)}");
           pst.setInt(1, Integer.parseInt(AccomodationID));
            pst.setString(2 , Type);
            pst.setString(3,HotelName);
             pst.setInt(4,Integer.parseInt(LowerPrice)); 
             pst.setInt(5,Integer.parseInt(HigherPrice)); 
             pst.setInt(6,Integer.parseInt(PlannerID));
              pst.setString(7,Specification); 
              if(pst.execute()==false)
                  if(pst.getUpdateCount()>0)
                      flag=true;
         }
         catch(Exception ex)
         {
             System.out.println("Error in Accomodation model");
         }
        cobj.Disconnect();
        return flag;
     }
     public boolean bookinginsert(String UserEmail ,String OrganizerID,String Location ,String Transport , String Accomodation , String LocalTransport ,String LocalGuide ,String TotalCost , String PaidAmount)
     {
         boolean flag=false;
         cobj.Connect();
         try
         {
             pst= cobj.con.prepareCall("{call BookingInsert(?,?,?,?,?,?,?,?,?)}");
             pst.setString(1, UserEmail);
             pst.setInt(2,Integer.parseInt(OrganizerID));
              pst.setString(3,Location);
              pst.setString(4,Transport);
              pst.setString(5,Accomodation);
              pst.setString(6,LocalTransport);
              pst.setString(7, LocalGuide);
               pst.setString(8,TotalCost);
              pst.setString(9, PaidAmount);
              if(pst.execute()==false)
                  if(pst.getUpdateCount()>0)
                      flag=true;
              
              
         }
          catch(Exception ex)
                      {
                      System.out.println("Error in Accomodation model");
                      } 
            return flag;     
     }
     
     public boolean bookingupdate(String BookingID ,String UserEmail ,String OrganizerID,String Location ,String Transport , String Accomodation , String LocalTransport ,String LocalGuide ,String TotalCost , String PaidAmount)
     {
         boolean flag=false ;
         cobj.Connect();
         try
         {
           pst=cobj.con.prepareCall("{call BookingUpdate(?,?,?,?,?,?,?,?,?,?)}"); 
           pst.setInt(1 , Integer.parseInt(BookingID));
           pst.setString(2, UserEmail);
           pst.setString(3, OrganizerID);
             pst.setString(4,Location);
              pst.setString(5,Transport);
              pst.setString(6,Accomodation);
              pst.setString(7,LocalTransport);
              pst.setString(8, LocalGuide);
               pst.setString(9,TotalCost);
              pst.setString(10, PaidAmount);
           
         }
         catch(Exception ex)
         {
             System.out.println("Error in bookingupdate"+ex);
         }
         return flag;
     }
     
     public boolean bookingdelete(String bookingID )
     {
         boolean flag=false ;
         cobj.Connect();
         try
         {
           pst=cobj.con.prepareCall("{call bookingdelete(?)}"); 
           pst.setInt(1 , Integer.parseInt(bookingID));
           
           
         }
         catch(Exception ex)
         {
             System.out.println("Error in bookingupdate"+ex);
         }
         return flag;
     }
     
     public boolean categoryinsert(String Name , String Status , String Description , String PostingDate)
     {
         boolean flag=false;
         cobj.Connect();
         try
         {
          pst= cobj.con.prepareCall("{call CategoryInsert(?,?,?,?)}");
                  pst.setString(1, Name);
                  pst.setString(2, Status);
                  pst.setString(3, Description);
                  pst.setString(4, PostingDate);
                  
                  if(pst.execute()==false)
                      if(pst.getUpdateCount()>0)
                          flag=false;
     }
         catch(Exception ex)
         {
             System.out.println("error in category"+ex);
         }
         cobj.Disconnect();
         return flag;
     }  
        public boolean categoryupdate(String CatID ,String Name , String Status , String Description , String PostingDate)
     {
         boolean flag=false;
         cobj.Connect();
         try
         {
          pst= cobj.con.prepareCall("{call CategoryInsert(?,?,?,?,?)}");
                  pst.setInt(1 , Integer.parseInt(CatID));
                  pst.setString(2, Name);
                  pst.setString(3, Status);
                  pst.setString(4, Description);
                  pst.setString(5, PostingDate);
                  
                  if(pst.execute()==false)
                      if(pst.getUpdateCount()>0)
                          flag=false;
     }
         catch(Exception ex)
         {
             System.out.println("error in category"+ex);
         }
         cobj.Disconnect();
         return flag;
         
     
}
        
        public boolean factinsert( String Plan,String FactName , String FactSpecification)
        {
            cobj.Connect();
            boolean flag=false;
            try
            {
            pst= cobj.con.prepareCall("{call FactsInsert(?,?,?)}");
            pst.setInt(1,Integer.parseInt(Plan));
            pst.setString(2, FactName);
            pst.setString(3,FactSpecification);
            if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                    flag=true;
                
            } 
            catch(Exception ex)
            {
                System.out.println("Eoor in facts"+ex);
            }
            cobj.Disconnect();
            return flag;
            
        }
         public boolean factupdate(String PlannerID,String FactName , String FactSpecification)
        {
            cobj.Connect();
            boolean flag=false;
            try
            {
            pst= cobj.con.prepareCall("{call FactsUpdate(?,? ,?)}");
            pst.setInt(1, Integer.parseInt(PlannerID));
            pst.setString(2, FactName);
            pst.setString(3,FactSpecification);
            if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                    flag=true;
                
            } 
            catch(Exception ex)
            {
                System.out.println("Eoor in facts"+ex);
            }
            cobj.Disconnect();
            return flag;
            
        }
         public boolean InsertOrg(String username, String Password, String phone,String address){
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
         
         public boolean LocalGuideInsert(String Plan,String Name ,String Age , String Fees , String Specification)
         {
             
             
             boolean flag=false;
             cobj.Connect();
             try
             {
                 pst=cobj.con.prepareCall("{call LocalGuideInsert(?,?,?,?,?)}");
                 pst.setInt(1, Integer.parseInt(Plan));
                 pst.setString(2 , Name);
                 pst.setString(3, Age);
                 pst.setString(4,Fees);
                 pst.setString(5,Specification);
                 if(pst.execute()==false)
                     if(pst.getUpdateCount()>0)
                         flag=true;
                 
                 
             }
             catch(Exception ex)
             {
                 System.out.println("Error in Local Guide"+ex);
             }
             cobj.Disconnect();
             return flag;
         }
         
         
           public boolean InsertLocalGuide(String Plan,String Name,String Age,String Fees,String Specification){
        boolean flag=false;
        cobj.Connect();
        try{
            pst= cobj.con.prepareCall("{call LocalGuideInsert(?,?,?,?,?)}");
            pst.setInt(1,Integer.parseInt(Plan));
            pst.setString(2,Name);
            pst.setInt(3,Integer.parseInt(Age));
            pst.setString(4,Fees);
            pst.setString(5,Specification);
            if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                {
                    flag=true;
                }
            }
        catch(Exception ex){
            System.out.println("Error in insert Guide "+ex );
        }
        cobj.Disconnect();
        return flag;
    }
         public boolean LocalGuideUpdate(String GuideID,String PlannerID,String Name ,String Age , String Fees , String Specification)
         {
             
             cobj.Connect();
             boolean flag=false;
             try
             {
                 pst=cobj.con.prepareCall("{call LocalGuideUpdatet(?,?,?,?,?,?)}");
                 pst.setString(1,GuideID);
                 pst.setString(2, PlannerID);
                 pst.setString(3 , Name);
                 pst.setString(4, Age);
                 pst.setString(5,Fees);
                 pst.setString(6,Specification);
                 if(pst.execute()==false)
                     if(pst.getUpdateCount()>0)
                         flag=true;
                 
                 
             }
             catch(Exception ex)
             {
                 System.out.println("Error in Local Guide"+ex);
             }
             cobj.Disconnect();
             return flag;
        
   
         } 
public boolean localtransportinsert(String Plan , String Type , String LowerPrice , String HigherPrice ,String Specification)
{
    boolean flag=false;
    
            cobj.Connect();
            
            try
            {
                pst=cobj.con.prepareCall("{call LocalTransportInsert(?,?,?,?,?)}");
                pst.setInt(1,Integer.parseInt(Plan));
                pst.setString(2 , Type);
                pst.setString(3, LowerPrice);
                pst.setString(4, HigherPrice);
                pst.setString(5,Specification);
                
                if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true;
                
                
            }
            catch(Exception ex)
            {
                System.out.println("Error in local tarnsport"+ex);
                
            }
            cobj.Disconnect();
            return flag;
}

public boolean localtransportupdate(String LocalTransportID,String PlannerID , String Type , String LowerPrice , String HigherPrice ,String Specification)
{
    boolean flag=false;
    
            cobj.Connect();
            
            try
            {
                pst=cobj.con.prepareCall("{call LocalTransportUpdate(?,?,?,?,?,?)}");
                pst.setString(1, LocalTransportID);
                pst.setInt(2,Integer.parseInt(PlannerID));
                pst.setString(3 , Type);
                pst.setString(4, LowerPrice);
                pst.setString(5, HigherPrice);
                pst.setString(6,Specification);
                
                if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true;
                
                
            }
            catch(Exception ex)
            {
                System.out.println("Error in local tarnsport"+ex);
                
            }
            cobj.Disconnect();
            return flag;
}


public boolean organizerdashboardinsert(String OrganizerID ,String Destination ,String Transport ,String Accomodation , String LocalTransport , String Guide ,String SubID, String FromDate ,String ToDate,String Cost)
{
    boolean flag= true;
    cobj.Connect();
    
    try
    {
        pst=cobj.con.prepareCall("{call OrganizerDashboardInsert(?,?,?,?,?,?,?,?,?,?)}");
        pst.setInt(1, Integer.parseInt(OrganizerID));
        pst.setString(2, Destination);
        pst.setString(3, Transport);
        pst.setString(4, Accomodation);
        pst.setString(5, LocalTransport);
        pst.setString(6,Guide);
        pst.setInt(7,Integer.parseInt(SubID));
        pst.setString(8, FromDate);
        pst.setString(9, ToDate);
        pst.setString(10,Cost);
        if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true;
        
    }
    catch(Exception ex)
    {
        System.out.println("Error in organizationdashboard"+ex);
    }
    cobj.Disconnect();
       return flag;
       
    }

    public boolean organizerdashboardupdate(String PlannerID,String OrganizerID ,String Destination ,String Transport ,String Accomodation , String LocalTransport , String Guide ,String SubID,String FromDate , String ToDate)
{
    boolean flag= true;
    cobj.Connect();
    
    try
    {
        pst=cobj.con.prepareCall("{call OrganizerDashboardUpdate(?,?,?,?,?,?,?,?,?,?)}");
        pst.setInt(1, Integer.parseInt(PlannerID));
        pst.setInt(2, Integer.parseInt(OrganizerID));
        pst.setString(3, Destination);
        pst.setString(4, Transport);
        pst.setString(5, Accomodation);
        pst.setString(6, LocalTransport);
        pst.setString(7,Guide);
        pst.setString(8,SubID);
        pst.setString(8, FromDate);
        pst.setString(9, ToDate);
        
        if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true;
        
    }
    catch(Exception ex)
    {
        System.out.println("Error in organizationdashboard"+ex);
    }
    cobj.Disconnect();
       return flag;
       
    }
    
    
     public boolean updatefact(String FactID,String FactName,String FactSpeci){
        boolean flag=false;
        cobj.Connect();
        try{
            pst=cobj.con.prepareCall("{call FactsUpdate(?,?,?)}");
            pst.setInt(1, Integer.parseInt(FactID));
            pst.setString(2, FactName);
            pst.setString(3, FactSpeci);
            if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                {
                    flag=true;
                }
        }
        catch(Exception ex){
            System.out.println("Error in change password "+ex);
        }
        cobj.Disconnect();
        return flag;
    }
    public ArrayList searchFact(String FactID){
        ArrayList aobj=new ArrayList();
        cobj.Connect();
        try{
            pst=cobj.con.prepareStatement("Select * from tbFacts where FactID=?");
            pst.setInt(1, Integer.parseInt(FactID));
            rst=pst.executeQuery();
            if(rst.next()){
                aobj.add(0,rst.getString(1).trim());
                aobj.add(1,rst.getString(3).trim());
                aobj.add(2,rst.getString(4).trim());
            }
            rst.close();
        }
        catch(Exception ex){
            System.out.println("Error in Search "+ex);
        }
        cobj.Disconnect();
        return aobj;
    }

    
    public boolean OrganizerRegistrationinsert(String Name ,String PhoneNo ,String Email , String IdentityID , String IdentityProofNo , String Password)
    {
        boolean flag= true;
    cobj.Connect();
    try
    {
       pst=cobj.con.prepareCall("{call OrganizerRegistrationInsert(?,?,?,?,?,?)}");
       pst.setString(1, Name);
       pst.setString(2, PhoneNo);
       pst.setString(3, Email);
       pst.setString(4, IdentityID);
       pst.setString(5, IdentityProofNo);
       pst.setString(6, Password);
       
       if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true;
       
    }
    catch(Exception ex)
    {
        System.out.println("Error in ");
    }
    cobj.Disconnect();
    return flag;
    

}
 public boolean OrganizerRegistrationupdate(String OrganizerID,String Name ,String PhoneNo ,String Email , String IdentityID , String IdentityProofNo , String Password)
    {
        boolean flag= true;
    cobj.Connect();
    try
    {
       pst=cobj.con.prepareCall("{call OrganizerRegistrationUpdate(?,?,?,?,?,?,?)}");
       pst.setInt(1,Integer.parseInt(OrganizerID));
       pst.setString(1, Name);
       pst.setString(2, PhoneNo);
       pst.setString(3, Email);
       pst.setString(4, IdentityID);
       pst.setString(5, IdentityProofNo);
       pst.setString(6, Password);
       
       if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true;
       
    }
    catch(Exception ex)
    {
        System.out.println("Error in ");
    }
    cobj.Disconnect();
    return flag;
    

}
 public boolean paymentinsert(String BookingID, String CreditCard, String HolderName , String CardNo , String ExpiryDate , String CVV)
 {
     boolean flag=true;
     cobj.Connect();
     
     try
     {
         pst=cobj.con.prepareCall("{call PaymentInsert(?,?,?,?,?,?)}");
         pst.setInt(1, Integer.parseInt(BookingID));
         pst.setString(2 , CreditCard);
           pst.setString(3 , HolderName);
             pst.setString( 4, CardNo);
               pst.setString(5 ,ExpiryDate );
                 pst.setString(6 ,CVV );
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
public boolean paymentupdate(String PaymentID,String BookingID, String CreditCard, String HolderName , String CardNo , String ExpiryDate , String CVV)
 {
     boolean flag=true;
     cobj.Connect();
     
     try
     {
         pst=cobj.con.prepareCall("{call PaymentUpdate(?,?,?,?,?,?,?)}");
         pst.setInt(1, Integer.parseInt(PaymentID));
         pst.setInt(2, Integer.parseInt(BookingID));
         pst.setString(3 , CreditCard);
           pst.setString(4 , HolderName);
             pst.setString(5 , CardNo);
               pst.setString(6 ,ExpiryDate );
                 pst.setString(7 ,CVV );
                   if(pst.execute()==false)
           if(pst.getUpdateCount()>0)
               flag=true; 
             
           
     }
     catch(Exception ex)
     {
         System.out.println("Error in paymentupdate"+ex);
     }
     cobj.Disconnect();
     return flag;
 }

public boolean reviewinsert(String PublicReview , String OrganizerID )
{
    boolean flag=true;
     cobj.Connect();
     
     try
     {
         pst=cobj.con.prepareCall("{call ReviewInsert(?,?)}");
         pst.setString(1,PublicReview);
         pst.setInt(2 , Integer.parseInt(OrganizerID));
         if(pst.execute()==false)
             if(pst.getUpdateCount()>0)
             flag=true;
         
     } 
     catch(Exception ex)
     {
         System.out.println("error in review insert");
     }
     cobj.Disconnect();
     return flag;
}

 public boolean reviewupdate(String PublicReview , String OrganizerID )
{
    boolean flag=true;
     cobj.Connect();
     
     try
     {
         pst=cobj.con.prepareCall("{call ReviewInsert(?,?)}");
         pst.setString(1,PublicReview);
         pst.setString(2 , OrganizerID);
         if(pst.execute()==false)
             if(pst.getUpdateCount()>0)
             flag=true;
         
     } 
     catch(Exception ex)
     {
         System.out.println("error in review insert");
     }
     cobj.Disconnect();
     return flag;
}
 
public boolean subcategoryinsert(String Name , String Description , String Status , String CatID)
{
boolean flag=true;
cobj.Connect();

try
{
    pst=cobj.con.prepareCall("{call SubCategoryInsert(?,?,?,?)}");
    pst.setString(1 ,Name);
    pst.setString(2, Description);
    pst.setString(3,Status);
    pst.setInt(4, Integer.parseInt(CatID));
    if(pst.execute()==false)
        if(pst.getUpdateCount()>0)
          flag=true;    
            }
catch(Exception ex){
System.out.println("Error in insert "+ex);
}
cobj.Disconnect();
return flag;
}


public boolean subcategoryupdate(String SubID,String Name , String Description , String Status , String CatID)
{
boolean flag=true;
cobj.Connect();

try
{
    pst=cobj.con.prepareCall("{call SubCategoryUpdate(?,?,?,?,?)}");
    pst.setInt(1, Integer.parseInt(SubID));
    pst.setString(2 ,Name);
    pst.setString(3, Description);
    pst.setString(4,Status);
    pst.setInt(5, Integer.parseInt(CatID));
    if(pst.execute()==false)
        if(pst.getUpdateCount()>0)
          flag=true;    
            }
catch(Exception ex){
System.out.println("Error in insert "+ex);
}
cobj.Disconnect();
return flag;
}
//public boolean transportinsert (String Mode , String PickUpLocation , String LowerPrice , String HigherPrice , String Plan , String Specification)
//{
//    boolean flag= true;
//    cobj.Connect();
//    
//    try
//    {
//        pst= cobj.con.prepareCall("call tbTransportInsert(?,?,?,?,?,?)");
//        pst.setString(1 , Mode);
//        pst.setString(2 , PickUpLocation);
//        pst.setString(3 , LowerPrice);
//        pst.setString(4 , HigherPrice);
//        pst.setInt(5 , Integer.parseInt(Plan));
//        pst.setString(6 , Specification);
//        if(pst.execute()==false)
//            if(pst.getUpdateCount()>0)
//                return flag;
//        
//    }
//    catch(Exception ex)
//    {
//        System.out.println("Error in insert transport insert"+ex);
//        
//    }
//    cobj.Disconnect();
//    return flag;
//    }
//
//
//
 public boolean InsertTransport(String Mode ,String PickUpLocation,String LowerPrice,String  HigherPrice,String Plan,String Specification){
        boolean flag=false;
        cobj.Connect();
        try{
            pst= cobj.con.prepareCall("{call tbTransportInsert(?,?,?,?,?,?)}");
            pst.setString(1,Mode);
            pst.setString(2,PickUpLocation);
            pst.setString(3,LowerPrice);
            pst.setString(4,HigherPrice);
            pst.setInt(5,Integer.parseInt(Plan));
            pst.setString(6,Specification);
            if(pst.execute()==false)
                if(pst.getUpdateCount()>0)
                {
                    flag=true;
                }
            }
        catch(Exception ex){
            System.out.println("Error in insert Transportation"+ex );
        }
        cobj.Disconnect();
        return flag;
    }

public boolean transportupdate (String TransportID,String Mode , String PickUpLocation , String LowerPrice , String HigherPrice , String PlannerID , String Specification)
{
    boolean flag= true;
    cobj.Connect();
    
    try
    {
        pst= cobj.con.prepareCall("call TransportUpdate(?,?,?,?,?,?,?)");
        pst.setString(1, TransportID);
        pst.setString(2 , Mode);
        pst.setString(3 , PickUpLocation);
        pst.setString(4 , LowerPrice);
        pst.setString(5 , HigherPrice);
        pst.setInt(6 , Integer.parseInt(PlannerID));
        pst.setString(7, Specification);
        if(pst.execute()==false)
            if(pst.getUpdateCount()>0)
                return flag;
        
    }
    catch(Exception ex)
    {
        System.out.println("Error in insert transport insert"+ex);
        
    }
    cobj.Disconnect();
    return flag;
    }

public boolean userregistrationinsert(String UserEmail ,String  UserPassword ,String UserName , String UserPhoneNo , String UserAddress)
{
    boolean flag= false;
    cobj.Connect();
    try
    {
        pst= cobj.con.prepareCall("{call UserRegistrationInsert(?,?,?,?,?)}");
        pst.setString(1 , UserEmail);
        pst.setString(2, UserPassword);
        pst.setString(3, UserName);
        pst.setString(4, UserPhoneNo);
        pst.setString(5,UserAddress);
        if(pst.execute()==false)
            if(pst.getUpdateCount()>0)
                flag= true;
    }
    catch(Exception ex)
    {
        System.out.println("Error in insert"+ex);
    }
    cobj.Disconnect();
    return flag;
}

public boolean userregistrationupdate(String UserID,String UserEmail , String UserPassword , String UserName , String UserPhoneNo ,String UserAddress)
{
    boolean flag= false;
    cobj.Connect();
    try
    {
        pst= cobj.con.prepareCall("{call UserRegistrationUpdate(?,?,?,?,?,?)}");
       pst.setInt(1 , Integer.parseInt(UserID));
        pst.setString(2 , UserEmail);
        pst.setString(3, UserPassword);
        pst.setString(4, UserName);
        pst.setString(5, UserPhoneNo);
        pst.setString(6,UserAddress);
        if(pst.execute()==false)
            if(pst.getUpdateCount()>0)
                flag= true;
    }
    catch(Exception ex)
    {
        System.out.println("Error in insert"+ex);
    }
    cobj.Disconnect();
    return flag;
}

}

             
             
            
             
