/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Common.AdminLoginModel;
import Common.ConnectionClass;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author admin
 */
@WebServlet(name = "OrgServlet1", urlPatterns = {"/OrgServlet1"})
public class OrgServlet1 extends HttpServlet {
static String Plan,OrgID;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    PrintWriter out = response.getWriter();
        AdminLoginModel mobj = new AdminLoginModel();
       
        String btn=request.getParameter("btn");
        
     

        ConnectionClass cobj=new ConnectionClass();
        PreparedStatement pst;
        ResultSet rst;
        HttpSession session = request.getSession();
        try{
            cobj.Connect();
            if(btn.equals("login")){
                 String Username=request.getParameter("utxt");
        String Password=request.getParameter("ptxt");
                pst=cobj.con.prepareStatement("select * from tbOrganizerRegistration where Email=? and Password=?");
                pst.setString(1,Username);
                pst.setString(2,Password);
                rst=pst.executeQuery();
                if(rst.next()){
                    out.println("Successful");
                    OrgID=rst.getString(1);
                    session.setAttribute("OrganiserID", OrgID);
                    session.setAttribute("Organiser", rst.getString(4));
                    RequestDispatcher reqd=request.getRequestDispatcher("Organiser\\OrgIndex.jsp");
                    reqd.forward(request, response);
                }
                else{
                    out.println("Wrong Password");
                }   
                rst.close();
            }
            else if(btn.equals("signup")){
                 String Username=request.getParameter("utxt");
        String Password=request.getParameter("ptxt");
                String Phone=request.getParameter("phtxt");
                String Address=request.getParameter("atxt");
                if(mobj.InsertOrg(Username, Password, Phone,Address)==true){
                    RequestDispatcher reqd=request.getRequestDispatcher("Organiser\\OrgLogin.jsp");
                    reqd.forward(request, response);
                }
                else{
                    System.out.println("Something went wrong in adding");
                }
            }
            
            else if(btn.equals("Submit")){
                   String SubID1= request.getParameter("sitxt");
                String Transport= request.getParameter("trans");
        String Accomodation= request.getParameter("accom");
        String LocalTransport = request.getParameter("local"); 
        String Guide= request.getParameter("guide");
                String Destination= request.getParameter("dtxt");
                String FromDate= request.getParameter("fdtxt");
                String ToDate= request.getParameter("tdtxt");
                String Cost = request.getParameter("cstxt");
                System.out.println(OrgID+" "+Destination+Transport+" "+Accomodation+" "+LocalTransport+" "+Guide+" "+SubID1+" "+FromDate+" "+ToDate+""+Cost);
                if(mobj.organizerdashboardinsert(OrgID,Destination,Transport,Accomodation,LocalTransport,Guide,SubID1,FromDate,ToDate,Cost)==true){    
                    pst=cobj.con.prepareStatement("select * from tbOrganizerDashboard where OrganizerID=? and Destination=? and Transport=? and Accommodation=? and LocalTransport=? and Guide=? and SubID=? and FromDate=? and ToDate=? and Cost=?");
                    pst.setInt(1,Integer.parseInt(OrgID));
                    pst.setString(2,Destination);
                    pst.setString(3,Transport);
                    pst.setString(4,Accomodation);
                    pst.setString(5,LocalTransport);
                    pst.setString(6,Guide);
                    pst.setInt(7,Integer.parseInt(SubID1));
                    pst.setString(8,FromDate);
                    pst.setString(9,ToDate);
                    pst.setString(10,Cost);
                    rst=pst.executeQuery();
                    if(rst.next()){
                        Plan=rst.getString(1);
                        
                        
                        
                    }
                    
                    if(Transport.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Transportation_Form.jsp");
                        reqd.forward(request, response);
                    }
                    else if(Accomodation.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Accommodation_form.jsp");
                        reqd.forward(request, response);
                    }
                    else if(LocalTransport.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\LocalTransport_Form.jsp"); 
                        reqd.forward(request, response);
                    }
                    else if(Guide.equals("Yes")){
                       RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Guide_form.jsp");  
                       reqd.forward(request, response);
                    }  
                   else{
                       RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Fact_form.jsp");  
                       reqd.forward(request, response);
                    }
                    rst.close();
                }   
            }
        
            else if(btn.equals("Trans_Submit")){
              //  String Transport= request.getParameter("trans");
        String Accomodation= request.getParameter("accom");
        String LocalTransport = request.getParameter("local"); 
        String Guide= request.getParameter("guide");
                String Mode = request.getParameter("mdtxt");
                String PickUpLocation= request.getParameter("putxt");
                String  LowerPrice= request.getParameter("lptxt");
                String HigherPrice= request.getParameter("hptxt");
                String Specification = request.getParameter("sptxt");

                if(mobj.InsertTransport(Mode , PickUpLocation , LowerPrice ,  HigherPrice , Plan ,  Specification)==true){
                    pst=cobj.con.prepareStatement("select * from tbOrganizerDashboard where PlannerID=?");
                    pst.setInt(1,Integer.parseInt(Plan));
                    rst=pst.executeQuery();
                    if(rst.next()){
                        Accomodation=rst.getString(5);
                        LocalTransport=rst.getString(6);
                        Guide=rst.getString(7);
                    }
                    if(Accomodation.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Accommodation_form.jsp");
                        reqd.forward(request, response);
                    }
                    else if(LocalTransport.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\LocalTransport_Form.jsp"); 
                        reqd.forward(request, response);
                    }
                    else if(Guide.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Guide_form.jsp");  
                        reqd.forward(request, response);
                    }
                    else{
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Fact_form.jsp");  
                        reqd.forward(request, response);
                    }
                    rst.close();
                }
            }
        
            else if(btn.equals("Accommodation_Submit")){
         //       String Transport= request.getParameter("trans");
       // String Accomodation= request.getParameter("accom");
        String LocalTransport = request.getParameter("local"); 
        String Guide= request.getParameter("guide");
                String Type= request.getParameter("tptxt");
                String HotelName= request.getParameter("hntxt");
                String LowerPrice1 = request.getParameter("lptxt");
                String HigherPrice1= request.getParameter("hptxt");
                String  Specification1= request.getParameter("sptxt");

                if(mobj.insertAccomodation(Type , HotelName , LowerPrice1 ,  HigherPrice1 ,  Plan ,  Specification1)==true){
                    pst=cobj.con.prepareStatement("select * from tbOrganizerDashboard where PlannerID=?");
                    pst.setInt(1,Integer.parseInt(Plan));
                    rst=pst.executeQuery();
                    if(rst.next()){
                        LocalTransport=rst.getString(6);
                        Guide=rst.getString(7);
                    }
                    if(LocalTransport.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\LocalTransport_Form.jsp"); 
                        reqd.forward(request, response);
                    }
                    else if(Guide.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Guide_form.jsp");  
                        reqd.forward(request, response);
                    } 
                    else{
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Fact_form.jsp");  
                        reqd.forward(request, response);
                    }
                    rst.close();
                }
            }
            
            else if(btn.equals("LTransport_Submit")){
       //         String Transport= request.getParameter("trans");
       // String Accomodation= request.getParameter("accom");
       // String LocalTransport = request.getParameter("local"); 
        String Guide= request.getParameter("guide");
                String Type= request.getParameter("tptxt");
                String LowerPrice= request.getParameter("lptxt");
                String HigherPrice= request.getParameter("hptxt");
                String Specification2 = request.getParameter("sptxt");

                if(mobj.localtransportinsert(Plan,Type,LowerPrice,HigherPrice,Specification2)==true){
                    pst=cobj.con.prepareStatement("select * from tbOrganizerDashboard where PlannerID=?");
                    pst.setInt(1,Integer.parseInt(Plan));
                    rst=pst.executeQuery();
                    if(rst.next()){
                        Guide=rst.getString(7);
                    }
                    if(Guide.equals("Yes")){
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Guide_form.jsp");  
                        reqd.forward(request, response);
                    }  
                    else{
                        RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Fact_form.jsp");  
                        reqd.forward(request, response);
                    }
                    rst.close();
                }  
            }
            
            else if(btn.equals("Guide_Submit")){
          //      String Transport= request.getParameter("trans");
       // String Accomodation= request.getParameter("accom");
      //  String LocalTransport = request.getParameter("local"); 
       // String Guide= request.getParameter("guide");
                String Name= request.getParameter("nmtxt");
                String  Age= request.getParameter("agtxt");
                String Fees= request.getParameter("fetxt");
                String Specification3 = request.getParameter("sptxt");

                if(mobj.InsertLocalGuide(Plan , Name, Age , Fees, Specification3)==true){ 
                       pst=cobj.con.prepareStatement("select * from tbOrganizerDashboard where PlannerID=?");
                    pst.setInt(1,Integer.parseInt(Plan));
                    
                    rst=pst.executeQuery();
                    
                    System.out.println(Plan +""+Name +""+Age+""+Fees+""+Specification3);
                    if(rst.next()){
                        
                       RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\Fact_form.jsp");  
                        reqd.forward(request, response);  
                    }
                    
                    
                       
                }  
             }
                       else if(btn.equals("Fact_Submit")){
                String Name = request.getParameter("nmtxt");
               String Specification4= request.getParameter("sptxt");
               pst=cobj.con.prepareStatement("select * from tbOrganizerDashboard where PlannerID=?");
                    pst.setInt(1,Integer.parseInt(Plan));
                    
                    rst=pst.executeQuery();
                    
                   
                    if(rst.next()){
 System.out.println(Plan +""+Name+""+Specification4);
                if(mobj.factinsert(Plan ,Name ,Specification4)==true){ 
                       RequestDispatcher reqd= request.getRequestDispatcher("Organiser\\OrgIndex.jsp");  
                        reqd.forward(request, response);
               }  
                    }
                       }
            
            else if(btn.equals("logout"))
                {
                    session.removeAttribute("OrganiserID");
                    session.removeAttribute("Organiser");
                    session.invalidate();
                    RequestDispatcher reqd=request.getRequestDispatcher("Organiser\\OrgLogin.jsp");
                    reqd.forward(request, response);
                }
             cobj.Disconnect();
        }
        catch(Exception ex){
            System.out.println("Exception in Organiser login "+ ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
