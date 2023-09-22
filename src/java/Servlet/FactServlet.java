/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import Common.ConnectionClass;
import Common.AdminLoginModel;

import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


/**
 *
 * @author admin
 */
@WebServlet(name = "FactServlet", urlPatterns = {"/FactServlet"})
public class FactServlet extends HttpServlet {
static String factid;
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
        try{
            cobj.Connect();
            if(btn.equals("Edit")){
                String FactID= request.getParameter("idtxt");
                ArrayList aobj = new ArrayList();
                aobj = mobj.searchFact(FactID);
                factid = aobj.get(0).toString();
                request.setAttribute("list", aobj);
                RequestDispatcher reqd = request.getRequestDispatcher("Admin\\FactUpdate.jsp");
                reqd.include(request, response);
            }
            else if(btn.equals("Update")){
                String FactName=request.getParameter("FactName");
                String FactSpeci=request.getParameter("FactSpeci");
//                System.out.println(SubID);
                if(mobj.updatefact(factid, FactName, FactSpeci)){
                RequestDispatcher reqd=request.getRequestDispatcher("Admin\\ManageFacts.jsp");
                reqd.forward(request, response);
                }
            }
            cobj.Disconnect();
        }
        catch(Exception ex){
            System.out.println("Error in fact "+ex);
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
