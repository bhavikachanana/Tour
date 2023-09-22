





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Common.ConnectionClass;
import Common.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
static  String BookingID;
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
                    UserModel mobj = new UserModel();
        String Username=request.getParameter("utxt");
        String Password=request.getParameter("ptxt");
        String btn=request.getParameter("btn");
                ConnectionClass cobj=new ConnectionClass();
                PreparedStatement pst;
                ResultSet rst;
                HttpSession session = request.getSession();
        try{
            cobj.Connect();
            if(btn.equals("login")){
                pst=cobj.con.prepareStatement("select * from tbUserRegistration where UserEmail=? and UserPassword=?");
                pst.setString(1,Username);
                pst.setString(2,Password);
                rst=pst.executeQuery();
                if(rst.next()){
                    out.println("Successful");
                    BookingID=rst.getString(1);
                    session.setAttribute("clientID", BookingID);
                    session.setAttribute("clientuser", rst.getString(2));
                    RequestDispatcher reqd=request.getRequestDispatcher("user\\UserIndex.jsp");
                    reqd.forward(request, response);
                }
                else{
                    out.println("Wrong Password");
                    rst.close();
                }   
            }
            else if(btn.equals("signup")){
                String Phone=request.getParameter("phtxt");
                String Address=request.getParameter("atxt");
                if(mobj.insertuser(Username, Password, Phone,Address)==true){
                    RequestDispatcher reqd=request.getRequestDispatcher("user\\login.jsp");
                    reqd.forward(request, response);
                }
                else{
                    System.out.println("Something went wrong in adding");
                }
            }
            
            
            else if(btn.equals("Make_Payment"))
           
            {
               // System.out.println(BookingID);
            //  String PaymentID = request.getParameter("");
            //  String BookingID = request.getParameter(BookingID);
              String CreditCard=request.getParameter("cntxt");
              String HolderName=request.getParameter("chtxt");
             // String cardno=request.getParameter("");
              String expiryDate=request.getParameter("extxt") ;
              String CVV = request.getParameter("cvtxt");
              
        if(mobj.paymentinsert( BookingID , CreditCard , HolderName , expiryDate , CVV )==true)
        {
           RequestDispatcher reqd = request.getRequestDispatcher("user\\Thanku.jsp");
                    reqd.forward(request, response) ;   
        }
             
              
            }
            else if(btn.equals("logout"))
                {
                    session.removeAttribute("clientID");
                    session.removeAttribute("clientuser");
                    session.invalidate();
                    RequestDispatcher reqd=request.getRequestDispatcher("user\\login.jsp");
                    reqd.forward(request, response);
                }
            
            
             cobj.Disconnect();
        }
        catch(Exception ex){
            System.out.println("Exception in user login "+ ex);
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
