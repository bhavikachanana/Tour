package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>User Login</title>\n");
      out.write("    <link href=\"http://localhost:8084/Tour/user/userlogincss.css\" rel=\"stylesheet\" />\n");
      out.write("    <link\n");
      out.write("      href=\"http://localhost:8084/Tour/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <script src=\"login.js\"></script>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"signin\">\n");
      out.write("      <div class=\"back-img\">\n");
      out.write("        <div class=\"sign-in-text\">\n");
      out.write("          <h2 class=\"active\" style=\"padding-left: 25px;\">Sign In</h2>\n");
      out.write("          <!-- <h2 class=\"nonactive\">Sign Up</h2> -->\n");
      out.write("        </div>\n");
      out.write("        <!--/.sign-in-text-->\n");
      out.write("        <div class=\"layer\"></div>\n");
      out.write("        <!--/.layer-->\n");
      out.write("        <p class=\"point\">&#9650;</p>\n");
      out.write("      </div>\n");
      out.write("      <!--/.back-img-->\n");
      out.write("      <div class=\"form-section\">\n");
      out.write("        <form action=\"http://localhost:8084/Tour/UserServlet\" name=\"myloginform\" method=\"get\"  >\n");
      out.write("          <!--Email-->\n");
      out.write("          <div class=\"row mt-1\">\n");
      out.write("            <div class=\"col-lg-3\">Username</div>\n");
      out.write("            <div class=\"col-sm-2 col-lg-1\">\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                name=\"utxt\"\n");
      out.write("                value=\"\"\n");
      out.write("                id=\"user\"\n");
      out.write("                placeholder=\"Enter Username\"\n");
      out.write("              /><b><span class=\"formerror\"> </span></b>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <br />\n");
      out.write("          <!--Password-->\n");
      out.write("          <div\n");
      out.write("            class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\"\n");
      out.write("          >\n");
      out.write("          <div class=\"row mt-1\">\n");
      out.write("            <div class=\"col-lg-3\">Password</div>\n");
      out.write("            <div class=\"col-sm-2 col-lg-1\">\n");
      out.write("              <input\n");
      out.write("                type=\"password\"\n");
      out.write("                name=\"ptxt\"\n");
      out.write("                value=\"\"\n");
      out.write("                id=\"pass\"\n");
      out.write("                placeholder=\"Enter Password\"\n");
      out.write("              /><b><span class=\"formerror\"> </span></b>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <br />\n");
      out.write("          <div style=\"text-align: right;\"><a href=\"#\" class=\"forgot-text\">Forgot Password ?</a></div>\n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("        <button\n");
      out.write("        class=\"sign-in-btn mdl-button mdl-js-ripple-effect mdl-js-button mdl-button--raised mdl-button--colored\"\n");
      out.write("        input=\"Submit\"\n");
      out.write("        value=\"login\"\n");
      out.write("        name=\"btn\" onclick=\"return validateForm()\"><p class=\"active\" style=\"align-items: center;font-size: 1.75rem; padding-top: 5px;\">Sign In</p></button>\n");
      out.write("        </form>\n");
      out.write("          <p style=\"margin-left:60px;margin-top: 10px;\">Not a member? <a href=\"http://localhost:8084/Tour/user/SignUp.jsp\" style=\"color: #7e7d7d;\n");
      out.write("        text-decoration:none; \">SignUp Now</a></p>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("<!--      <button\n");
      out.write("        class=\"sign-in-btn mdl-button mdl-js-ripple-effect mdl-js-button mdl-button--raised mdl-button--colored\"\n");
      out.write("        input=\"Submit\"\n");
      out.write("        name=\"login\"\n");
      out.write("      ><p class=\"active\" style=\"align-items: center;font-size: 1.75rem; padding-top: 5px;\">Sign In</p></button>-->\n");
      out.write("<!--      <p style=\"margin-left:60px;margin-top: 10px;\">Not a member? <a href=\"#\" style=\"color: #7e7d7d;\n");
      out.write("        text-decoration:none; \">SignUp Now</a></p>-->\n");
      out.write("    </div>\n");
      out.write("    <!--/.signin-->\n");
      out.write("  </body>\n");
      out.write("  \n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
