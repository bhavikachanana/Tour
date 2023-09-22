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
 * @author bhavi
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/AdminServlet"})
public class AdminServlet extends HttpServlet {

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
                pst=cobj.con.prepareStatement("select * from tbAdminLogin where Username=? and Password=?");
                pst.setString(1,Username);
                pst.setString(2,Password);
                rst=pst.executeQuery();
                if(rst.next()){
                    out.println("Successful man great job");
                    session.setAttribute("adminuser", rst.getString(1));
                    
                    RequestDispatcher reqd=request.getRequestDispatcher("Admin\\index.jsp");
                    reqd.forward(request, response);
                }
                else{
                    out.println("Wrong Password");
                    rst.close();
                }   
            }
            else if(btn.equals("change")){
                String NPassword=request.getParameter("nptxt");
                if(mobj.updateadmin(Username, Password, NPassword)==true){
                    out.println("Successful man great job");
                }
                else{
                   out.println("Wrong Password");
                }
            }
            else if(btn.equals("logout"))
                {
                    session.removeAttribute("adminuser");
                    session.invalidate();
//                    response.sendRedirect("")
                    RequestDispatcher reqd=request.getRequestDispatcher("Admin\\login.jsp");
                    reqd.forward(request, response);
                }
            else if(btn.equals("search")){
                String CatID=request.getParameter("Categroy");
                String SubID=request.getParameter("SubCategroy");
//                System.out.println(SubID);
                request.setAttribute("SubID", SubID);
                RequestDispatcher reqd=request.getRequestDispatcher("Admin\\ManageFacts.jsp");
                reqd.include(request, response);
            }
            cobj.Disconnect();
        }
        
        catch(Exception ex){
            System.out.println("Exception in admin login "+ ex);
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
