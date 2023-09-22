package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Common.ConnectionClass;
import java.util.ArrayList;

public final class Booking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
            ConnectionClass cobj;
            PreparedStatement pst;
            ResultSet rst;
            ArrayList<Object> aobj;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/user/UserHeader.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Booking</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("                                ");
      out.print(session.getAttribute("clientuser").toString());
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                                 ");
}
                                catch(Exception ex)
                                {
                                    RequestDispatcher reqd=request.getRequestDispatcher("login.jsp");
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
      out.write("            <a href=\"http://localhost:8084/Tour/user/Booking.jsp\" class=\"nav-item nav-link\">Booking</a>\n");
      out.write("          </div>\n");
      out.write("            <a href=\"http://localhost:8084/Tour/UserServlet?btn=logout\" class=\"btn btn-primary rounded-pill py-2 px-4\">Log Out</a>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("                        <h1 class=\"text-black mb-4\">Book A Tour</h1>\n");
      out.write("                        <form method=\"get\" action=\"http://localhost:8084/Tour/BookingServlet\">\n");
      out.write("                                <div class=\"row md-5\">\n");
      out.write("                                    <div class=\"form-floating date col-5\" id=\"date3\" data-target-input=\"nearest\">\n");
      out.write("                                        <input type=\"date\" class=\"form-control bg-transparent datetimepicker-input\" placeholder=\"Date & Time\" name=\"date\" value=\"\" />\n");
      out.write("                                        <label for=\"datetime\">Date</label>\n");
      out.write("                                    </div>\n");
      out.write("                                <!--</div>-->\n");
      out.write("                            <br>\n");
      out.write("                                <!--<div class=\"row md-5\">-->\n");
      out.write("                                    <div class=\"form-floating col-4\">\n");
      out.write("                                         <input type=\"text\" class=\"form-control bg-transparent\" placeholder=\"Destination\" name=\"destination\" value=\"\"/>\n");
      out.write("                                        <label for=\"select1\">Destination</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <br>\n");
      out.write("                                <div class=\"row md-5\">\n");
      out.write("                                    <div class=\"form-floating col-4\">\n");
      out.write("                                         <input type=\"text\" class=\"form-control bg-transparent\" placeholder=\"Number of People\" name=\"people\" value=\"\"/>\n");
      out.write("                                        <label for=\"select1\">Number of People</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <br>\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <button class=\"btn btn-outline-light w-100 py-3\" type=\"submit\" value=\"book\" name=\"btn\">Book Now</button>\n");
      out.write("                                </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <h4 class=\"card-title\">Booking Table</h4>\n");
      out.write("        <table class=\"table table-hover\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Destination</th>\n");
      out.write("                    <th>Transport</th>\n");
      out.write("                    <th>Accommodation</th>\n");
      out.write("                    <th>Local Transport</th>\n");
      out.write("                    <th>Guide</th>\n");
      out.write("<!--                    <th>Cost Min.</th>\n");
      out.write("                    <th>Cost Max.</th>-->\n");
      out.write("                     <th> Cost</th>\n");
      out.write("                    <th>Click to Book</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("                 ");
 
                cobj=new ConnectionClass();
                cobj.Connect();
                aobj =(ArrayList<Object>)request.getAttribute("list");
                if(aobj!=null)
                {
                for(int i=0;i<aobj.size();i++)
                    {
            
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    try
                        {
                            String Plan=aobj.get(i).toString();
                            System.out.println(Plan);
                            
                            pst=cobj.con.prepareStatement("SELECT dbo.tbOrganizerDashboard.Destination,dbo.tbTransport.Mode, dbo.tbTransport.PickupLocation, dbo.tbTransport.LowerPrice AS Expr1, dbo.tbTransport.HigherPrice AS Expr2,dbo.tbTransport.Specification AS Expr3, dbo.tbAccommodation.Type, dbo.tbAccommodation.HotelName, dbo.tbAccommodation.LowerPrice,dbo.tbAccommodation.HigherPrice, dbo.tbAccommodation.Specification, dbo.tbLocalTransport.Type AS Expr4, dbo.tbLocalTransport.LowerPrice AS Expr5, dbo.tbLocalTransport.HigherPrice AS Expr6, dbo.tbLocalTransport.Specification AS Expr7, dbo.tbLocalGuide.Name, dbo.tbLocalGuide.Age, dbo.tbLocalGuide.Fees, dbo.tbLocalGuide.Specification AS Expr8,dbo.tbOrganizerDashboard.OrganizerID , dbo.tbOrganizerDashboard.Cost FROM dbo.tbOrganizerDashboard INNER JOIN dbo.tbLocalGuide ON dbo.tbOrganizerDashboard.PlannerID = dbo.tbLocalGuide.PlannerID INNER JOIN dbo.tbLocalTransport ON dbo.tbOrganizerDashboard.PlannerID = dbo.tbLocalTransport.PlannerID INNER JOIN dbo.tbTransport ON dbo.tbOrganizerDashboard.PlannerID = dbo.tbTransport.PlannerID INNER JOIN dbo.tbAccommodation ON dbo.tbOrganizerDashboard.PlannerID = dbo.tbAccommodation.PlannerID where tbOrganizerDashboard.PlannerID=? and tbTransport.PlannerID=? and tbAccommodation.PlannerID=? and tbLocalTransport.PlannerID=? and tbLocalGuide.PlannerID=?");
                            pst.setLong(1,Long.parseLong(Plan));
                            pst.setLong(2,Long.parseLong(Plan));
                            pst.setLong(3,Long.parseLong(Plan));
                            pst.setLong(4,Long.parseLong(Plan));
                            pst.setLong(5,Long.parseLong(Plan));
                            
                            
                            rst=pst.executeQuery();
                            String Location,Transport,Accommodation,LTransport,Guide,Cost;
                            if(rst.next()){
                            Location=rst.getString(1);
                            Transport=rst.getString(2);
                            Accommodation=rst.getString(7);
                            LTransport=rst.getString(12);
                            Guide=rst.getString(16);
                            Cost= rst.getString(21);
                            
      out.write("\n");
      out.write("                          <tr>\n");
      out.write("                            <td>");
      out.print(Location);
      out.write("</td>\n");
      out.write("                            <td><a href=\"#Transport\" data-bs-toggle=\"collapse\">");
      out.print(Transport);
      out.write("</a></td>\n");
      out.write("                            <div id=\"Transport\" class=\"collapse\">\n");
      out.write("                                <p>Pick Up Location: ");
      out.print(rst.getString(3));
      out.write("<br>\n");
      out.write("                                Lower Price: ");
      out.print(rst.getString(4));
      out.write("<br>\n");
      out.write("                                Higher Price: ");
      out.print(rst.getString(5));
      out.write("<br>\n");
      out.write("                                Specification: ");
      out.print(rst.getString(6));
      out.write("<br></p>\n");
      out.write("                            </div>\n");
      out.write("                            <td><a href=\"#Accommodation\" data-bs-toggle=\"collapse\">");
      out.print(Accommodation);
      out.write("</a></td>\n");
      out.write("                            <div id=\"Accommodation\" class=\"collapse\">\n");
      out.write("                                <p>Stay Name: ");
      out.print(rst.getString(8));
      out.write("<br>\n");
      out.write("                                Lower Price: ");
      out.print(rst.getString(9));
      out.write("<br>\n");
      out.write("                                Higher Price: ");
      out.print(rst.getString(10));
      out.write("<br>\n");
      out.write("                                Specification: ");
      out.print(rst.getString(11));
      out.write("<br></p>\n");
      out.write("                            </div>\n");
      out.write("                            <td><a href=\"#LTransport\" data-bs-toggle=\"collapse\">");
      out.print(LTransport);
      out.write("</a></td>\n");
      out.write("                            <div id=\"LTransport\" class=\"collapse\">\n");
      out.write("                                <p>Lower Price: ");
      out.print(rst.getString(13));
      out.write("<br>\n");
      out.write("                                Higher Price: ");
      out.print(rst.getString(14));
      out.write("<br>\n");
      out.write("                                Specification: ");
      out.print(rst.getString(15));
      out.write("<br></p>\n");
      out.write("                            </div>\n");
      out.write("                                <td><a href=\"#Guide\" data-bs-toggle=\"collapse\">");
      out.print(Guide);
      out.write("</a></td>\n");
      out.write("                            <div id=\"Guide\" class=\"collapse\">\n");
      out.write("                                <p>Age: ");
      out.print(rst.getString(17));
      out.write("<br>\n");
      out.write("                                Price: ");
      out.print(rst.getString(18));
      out.write("<br>\n");
      out.write("                                Specification: ");
      out.print(rst.getString(19));
      out.write("<br></p>\n");
      out.write("                                \n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                                <td><a href=\"#Guide\" data-bs-toggle=\"collapse\">");
      out.print(Cost);
      out.write("</a></td>\n");
      out.write("                                <td><form method=\"get\" action=\"http://localhost:8084/Tour/BookingServlet\">\n");
      out.write("                                <button type=\"submit\" value=\"Plan\" name=\"btn\" class=\"btn btn-primary me-2\">BOOK NOW</button>\n");
      out.write("                                <input type=\"text\" name=\"PlanID\" value=");
      out.print(Plan);
      out.write(" style=\"display:none\">\n");
      out.write("                                <input type=\"text\" name=\"Location\" value=");
      out.print(Location);
      out.write(" style=\"display:none\">\n");
      out.write("                                <input type=\"text\" name=\"Transport\" value=");
      out.print(Transport);
      out.write(" style=\"display:none\">\n");
      out.write("                                <input type=\"text\" name=\"Accommodation\" value=");
      out.print(Accommodation);
      out.write(" style=\"display:none\">\n");
      out.write("                                <input type=\"text\" name=\"LTransport\" value=");
      out.print(LTransport);
      out.write(" style=\"display:none\">\n");
      out.write("                                <input type=\"text\" name=\"Guide\" value=");
      out.print(Guide);
      out.write(" style=\"display:none\">\n");
      out.write("                                <input type=\"text\" name=\"OrganiserID\" value=");
      out.print(rst.getString(20));
      out.write(" style=\"display:none\">\n");
      out.write("                                <input type=\"text\" name=\"ClientID\" value=");
      out.print(session.getAttribute("clientID").toString());
      out.write(" style=\"display:none\">\n");
      out.write("                                </form></td>    \n");
      out.write("                          </tr>\n");
      out.write("                         ");

                             }
                            rst.close();
                        }

                        catch(Exception ex)
                        {
                            System.out.println("Error in showing data "+ ex);
                        }
                        }
                        }        
                    cobj.Disconnect();
                        
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("            </table>\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--Select tbOrganizerDashboard.Destination,tbTransport.Mode,tbTransport.PickupLocation,tbTransport.LowerPrice,tbTransport.HigherPrice,tbTransport.Specification,\n");
      out.write("tbAccommodation.Type,tbAccommodation.HotelName,tbAccommodation.LowerPrice,tbAccommodation.HigherPrice,tbAccommodation.Specification,\n");
      out.write("tbLocalTransport.Type,tbLocalTransport.LowerPrice,tbLocalTransport.HigherPrice,tbLocalTransport.Specification,\n");
      out.write("tbLocalGuide.Name,tbLocalGuide.Age,tbLocalGuide.Fees,tbLocalGuide.Specification\n");
      out.write("from tbOrganizerDashboard \n");
      out.write("join tbTransport on tbOrganizerDashboard.PlannerID=tbTransport.PlannerID and tbOrganizerDashboard.Transport='yes'\n");
      out.write("join tbAccommodation on tbOrganizerDashboard.PlannerID=tbAccommodation.PlannerID and tbOrganizerDashboard.Accommodation='yes'\n");
      out.write("join tbLocalTransport on tbOrganizerDashboard.PlannerID=tbLocalTransport.PlannerID and tbOrganizerDashboard.LocalTransport='yes'\n");
      out.write("join tbLocalGuide on tbOrganizerDashboard.PlannerID=tbLocalGuide.PlannerID and tbOrganizerDashboard.Guide='yes'\n");
      out.write("where tbOrganizerDashboard.PlannerID=1 and tbTransport.PlannerID=1 and tbAccommodation.PlannerID=1 and tbLocalTransport.PlannerID=1 and tbLocalGuide.PlannerID=1-->");
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
