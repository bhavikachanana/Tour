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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "BookingServlet", urlPatterns = {"/BookingServlet"})
public class BookingServlet extends HttpServlet {
  static String people;
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
        String btn=request.getParameter("btn");
        ConnectionClass cobj=new ConnectionClass();
        PreparedStatement pst;
        ResultSet rst;
        try{
            cobj.Connect();
            if(btn.equals("book")){
                String date=request.getParameter("date");
                String destination=request.getParameter("destination");
                people=request.getParameter("people");
                ArrayList aobj = new ArrayList();
//                aobj.add(0,date.trim());
//                aobj.add(1,destination.trim());
                aobj = mobj.searchplan(date,destination);
                request.setAttribute("list", aobj);
                RequestDispatcher reqd = request.getRequestDispatcher("user\\Booking.jsp");
                reqd.include(request, response);
            }
            
            
            else if(btn.equals("Plan")){
                String PlanID=request.getParameter("PlanID");
                String Location=request.getParameter("Location");
                String Transport=request.getParameter("Transport");
                String Accommodation=request.getParameter("Accommodation");
                String LTransport=request.getParameter("LTransport");
                String Guide=request.getParameter("Guide");
                String OrganiserID=request.getParameter("OrganiserID");
                String TotalCost= request.getParameter("Cost");
                String UserID=request.getParameter("ClientID");
                
                
                if(mobj.insertplan(UserID,OrganiserID,Location,Transport,Accommodation,LTransport,Guide,TotalCost,PlanID)==true){
                    RequestDispatcher reqd = request.getRequestDispatcher("user\\Payment.jsp");
                    reqd.forward(request, response);
                }
    }
            
            
        }
        catch(Exception ex)
        {
            System.out.println("error");
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
