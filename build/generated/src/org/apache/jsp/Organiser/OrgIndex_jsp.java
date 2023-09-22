package org.apache.jsp.Organiser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OrgIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Organiser/OrgHeader.jsp");
    _jspx_dependants.add("/Organiser/OrgFooter.jsp");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header for Website</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"\" name=\"keywords\">\n");
      out.write("    <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Icon Font Stylesheet -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"http://localhost:8084/Tour/lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://localhost:8084/Tour/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://localhost:8084/Tour/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"http://localhost:8084/Tour/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link href=\"http://localhost:8084/Tour/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Spinner Start -->\n");
      out.write("    <div\n");
      out.write("      id=\"spinner\"\n");
      out.write("      class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\"\n");
      out.write("    >\n");
      out.write("      <div\n");
      out.write("        class=\"spinner-border text-primary\"\n");
      out.write("        style=\"width: 3rem; height: 3rem\"\n");
      out.write("        role=\"status\"\n");
      out.write("      >\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Spinner End -->\n");
      out.write("\n");
      out.write("    <!-- Topbar Start -->\n");
      out.write("    <div class=\"container-fluid bg-dark px-5 d-none d-lg-block\">\n");
      out.write("      <div class=\"row gx-0\">\n");
      out.write("        <div class=\"col-lg-8 text-center text-lg-start mb-2 mb-lg-0\">\n");
      out.write("          <div class=\"d-inline-flex align-items-center\" style=\"height: 45px\">\n");
      out.write("            <p class=\"preview-subject mb-1\">Welcome \n");
      out.write("                                ");
try
                                {
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");
      out.print(session.getAttribute("Organiser").toString());
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                                 ");
}
                                catch(Exception ex)
                                {
                                    RequestDispatcher reqd=request.getRequestDispatcher("Organiser\\SignIn.jsp");
                                    reqd.forward(request, response);
                                }
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4 text-center text-lg-end\">\n");
      out.write("          <div class=\"d-inline-flex align-items-center\" style=\"height: 45px\">\n");
      out.write("            <a\n");
      out.write("              class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\"\n");
      out.write("              href=\"\"\n");
      out.write("              ><i class=\"fab fa-twitter fw-normal\"></i\n");
      out.write("            ></a>\n");
      out.write("            <a\n");
      out.write("              class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\"\n");
      out.write("              href=\"\"\n");
      out.write("              ><i class=\"fab fa-facebook-f fw-normal\"></i\n");
      out.write("            ></a>\n");
      out.write("            <a\n");
      out.write("              class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\"\n");
      out.write("              href=\"\"\n");
      out.write("              ><i class=\"fab fa-linkedin-in fw-normal\"></i\n");
      out.write("            ></a>\n");
      out.write("            <a\n");
      out.write("              class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2\"\n");
      out.write("              href=\"\"\n");
      out.write("              ><i class=\"fab fa-instagram fw-normal\"></i\n");
      out.write("            ></a>\n");
      out.write("            <a\n");
      out.write("              class=\"btn btn-sm btn-outline-light btn-sm-square rounded-circle\"\n");
      out.write("              href=\"\"\n");
      out.write("              ><i class=\"fab fa-youtube fw-normal\"></i\n");
      out.write("            ></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Topbar End -->\n");
      out.write("\n");
      out.write("    <!-- Navbar & Hero Start -->\n");
      out.write("    <div\n");
      out.write("      class=\"container-fluid position-relative p-0\"\n");
      out.write("      style=\"margin-bottom: 99.5px; margin-top: 1px\"\n");
      out.write("    >\n");
      out.write("      <nav\n");
      out.write("        class=\"navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0 bg-secondary\"\n");
      out.write("      >\n");
      out.write("        <a href=\"\" class=\"navbar-brand p-0\">\n");
      out.write("          <h1 class=\"text-primary m-0\">\n");
      out.write("            <i class=\"fa fa-map-marker-alt me-3\"></i>Tourist\n");
      out.write("          </h1>\n");
      out.write("          <!-- <img src=\"img/logo.png\" alt=\"Logo\"> -->\n");
      out.write("        </a>\n");
      out.write("        <button\n");
      out.write("          class=\"navbar-toggler\"\n");
      out.write("          type=\"button\"\n");
      out.write("          data-bs-toggle=\"collapse\"\n");
      out.write("          data-bs-target=\"#navbarCollapse\"\n");
      out.write("        >\n");
      out.write("          <span class=\"fa fa-bars\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("          <div class=\"navbar-nav ms-auto py-0\">\n");
      out.write("            <a href=\"index.html\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("            <a href=\"about.html\" class=\"nav-item nav-link\">About</a>\n");
      out.write("            <a href=\"service.html\" class=\"nav-item nav-link\">Services</a>\n");
      out.write("            <a href=\"package.html\" class=\"nav-item nav-link\">Packages</a>\n");
      out.write("            <div class=\"nav-item dropdown\">\n");
      out.write("              <a\n");
      out.write("                href=\"#\"\n");
      out.write("                class=\"nav-link dropdown-toggle\"\n");
      out.write("                data-bs-toggle=\"dropdown\"\n");
      out.write("                >Pages</a>\n");
      out.write("              <div class=\"dropdown-menu m-0\">\n");
      out.write("                <a href=\"destination.html\" class=\"dropdown-item\">Destination</a>\n");
      out.write("                <a href=\"booking.html\" class=\"dropdown-item\">Booking</a>\n");
      out.write("                <a href=\"team.html\" class=\"dropdown-item\">Travel Guides</a>\n");
      out.write("                <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\n");
      out.write("                <a href=\"404.html\" class=\"dropdown-item\">404 Page</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"http://localhost:8084/Tour/Organiser/Organizers_from.jsp\" class=\"nav-item nav-link\">Add Plan</a>\n");
      out.write("          </div>\n");
      out.write("            <a href=\"http://localhost:8084/Tour/OrgServlet?btn=logout\" class=\"btn btn-primary rounded-pill py-2 px-4\">Log Out</a>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("</html>\n");
      out.write("\n");
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
