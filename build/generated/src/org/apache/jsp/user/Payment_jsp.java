package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/user/UserFooter.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"icons/css/all.min.css\">\n");
      out.write("          <script src=\"https://kit.fontawesome.com/d3964de134.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <section class=\"gradient-custom\">\n");
      out.write("  <div class=\"container my-5 py-5\">\n");
      out.write("    <div class=\"row d-flex justify-content-center py-5\">\n");
      out.write("      <div class=\"col-md-7 col-lg-5 col-xl-4\">\n");
      out.write("        <div class=\"card\" style=\"border-radius: 15px;\">\n");
      out.write("          <div class=\"card-body p-4\">\n");
      out.write("            <form method=\"get\" action=\"http://localhost:8084/Tour/UserServlet\">\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"text\" id=\"typeText\" name=\"cntxt\" class=\"form-control form-control-lg\" siez=\"17\"\n");
      out.write("                    placeholder=\"1234 5678 9012 3457\" minlength=\"19\" maxlength=\"19\" />\n");
      out.write("                  <label class=\"form-label\" for=\"typeText\">Card Number</label>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"https://img.icons8.com/color/48/000000/visa.png\" alt=\"visa\" width=\"64px\" />\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center mb-4\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"text\" id=\"typeName\" name=\"chtxt\" class=\"form-control form-control-lg\" siez=\"17\"\n");
      out.write("                    placeholder=\"Cardholder's Name\" />\n");
      out.write("                  <label class=\"form-label\" for=\"typeName\">Cardholder's Name</label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center pb-2\">\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"text\" id=\"typeExp\" name=\"extxt\" class=\"form-control form-control-lg\" placeholder=\"MM/YYYY\"\n");
      out.write("                    size=\"7\" id=\"exp\" minlength=\"7\" maxlength=\"7\" />\n");
      out.write("                  <label class=\"form-label\" for=\"typeExp\">Expiration</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-outline\">\n");
      out.write("                  <input type=\"password\" name=\"cvtxt\" id=\"typeText2\" class=\"form-control form-control-lg\"\n");
      out.write("                    placeholder=\"&#9679;&#9679;&#9679;\" size=\"1\" minlength=\"3\" maxlength=\"3\" />\n");
      out.write("                  <label class=\"form-label\" for=\"typeText2\">Cvv</label>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                      \n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary me-2\" name=\"btn\" value=\"Make_Payment\"> Make Payment</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>footer for the website</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container-fluid bg-dark text-light footer pt-5 mt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <div class=\"row g-5\">\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h4 class=\"text-white mb-3\">Company</h4>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">About Us</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Contact Us</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Privacy Policy</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\n");
      out.write("                    <a class=\"btn btn-link\" href=\"\">FAQs & Help</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h4 class=\"text-white mb-3\">Contact</h4>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>123 Street, New York, USA</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+012 345 67890</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>info@example.com</p>\n");
      out.write("                    <div class=\"d-flex pt-2\">\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h4 class=\"text-white mb-3\">Gallery</h4>\n");
      out.write("                    <div class=\"row g-2 pt-2\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"http://localhost:8084/Tour/img/package-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"http://localhost:8084/Tour/img/package-2.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"http://localhost:8084/Tour/img/package-3.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"http://localhost:8084/Tour/img/package-2.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"http://localhost:8084/Tour/img/package-3.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <img class=\"img-fluid bg-light p-1\" src=\"http://localhost:8084/Tour/img/package-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                    <h4 class=\"text-white mb-3\">Newsletter</h4>\n");
      out.write("                    <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>\n");
      out.write("                    <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\n");
      out.write("                        <input class=\"form-control border-primary w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Your email\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2\">SignUp</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\n");
      out.write("                        &copy; <a class=\"border-bottom\" href=\"#\">Your Site Name</a>, All Right Reserved.\n");
      out.write("\n");
      out.write("                        <!--/* This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. */-->\n");
      out.write("                        Designed By <a class=\"border-bottom\" href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 text-center text-md-end\">\n");
      out.write("                        <div class=\"footer-menu\">\n");
      out.write("                            <a href=\"\">Home</a>\n");
      out.write("                            <a href=\"\">Cookies</a>\n");
      out.write("                            <a href=\"\">Help</a>\n");
      out.write("                            <a href=\"\">FQAs</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Back to Top -->\n");
      out.write("    <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- JavaScript Libraries -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"http://localhost:8084/Tour/lib/wow/wow.min.js\"></script>\n");
      out.write("    <script src=\"http://localhost:8084/Tour/lib/easing/easing.min.js\"></script>\n");
      out.write("    <script src=\"http://localhost:8084/Tour/lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"http://localhost:8084/Tour/lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"http://localhost:8084/Tour/lib/tempusdominus/js/moment.min.js\"></script>\n");
      out.write("    <script src=\"http://localhost:8084/Tour/lib/tempusdominus/js/moment-timezone.min.js\"></script>\n");
      out.write("    <script src=\"http://localhost:8084/Tour/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Template Javascript -->\n");
      out.write("    <script src=\"http://localhost:8084/Tour/js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("                <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
