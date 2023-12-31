package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Common.ConnectionClass;

public final class Check_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
            ConnectionClass cobj;
            PreparedStatement pst;
            ResultSet rst;
            String BookingID;
            int People;
        
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
      out.write("<!doctype html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("  <!-- Turn off iOS phone number autodetect -->\n");
      out.write("  <meta name=\"format-detection\" content=\"telephone=no\">\n");
      out.write("  <style>\n");
      out.write("    body, p {\n");
      out.write("          font-family: 'Helvetica Neue', Helvetica,Arial, sans-serif;\n");
      out.write("          -webkit-font-smoothing: antialiased;\n");
      out.write("          -webkit-text-size-adjust: none;\n");
      out.write("      }\n");
      out.write("      table {\n");
      out.write("          border-collapse: collapse;\n");
      out.write("          border-spacing: 0;\n");
      out.write("          border: 0;\n");
      out.write("          padding: 0;\n");
      out.write("      }\n");
      out.write("      img {\n");
      out.write("          margin: 0;\n");
      out.write("          padding: 0;\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      .content {\n");
      out.write("          width: 600px;\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      .no_text_resize {\n");
      out.write("          -moz-text-size-adjust: none;\n");
      out.write("          -webkit-text-size-adjust: none;\n");
      out.write("          -ms-text-size-adjust: none;\n");
      out.write("          text-size-adjust: none;\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      /* Media Queries */\n");
      out.write("      @media all and (max-width: 600px) {\n");
      out.write("  \n");
      out.write("          table[class=\"content\"] {\n");
      out.write("              width: 100% !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          tr[class=\"grid-no-gutter\"] td[class=\"grid__col\"] {\n");
      out.write("              padding-left: 0 !important;\n");
      out.write("              padding-right: 0 !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          td[class=\"grid__col\"] {\n");
      out.write("              padding-left: 18px !important;\n");
      out.write("              padding-right: 18px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          table[class=\"small_full_width\"] {\n");
      out.write("              width: 100% !important;\n");
      out.write("              padding-bottom: 10px;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          a[class=\"header-link\"] {\n");
      out.write("              margin-right: 0 !important;\n");
      out.write("              margin-left: 10px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          a[class=\"btn\"] {\n");
      out.write("              width: 100%;\n");
      out.write("              border-left-width: 0px !important;\n");
      out.write("              border-right-width: 0px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          table[class=\"col-layout\"] {\n");
      out.write("              width: 100% !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          td[class=\"col-container\"] {\n");
      out.write("              display: block !important;\n");
      out.write("              width: 100% !important;\n");
      out.write("              padding-left: 0 !important;\n");
      out.write("              padding-right: 0 !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          td[class=\"col-nav-items\"] {\n");
      out.write("              display: inline-block !important;\n");
      out.write("              padding-left: 0 !important;\n");
      out.write("              padding-right: 10px !important;\n");
      out.write("              background: none !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          img[class=\"col-img\"] {\n");
      out.write("              height: auto !important;\n");
      out.write("              max-width: 520px !important;\n");
      out.write("              width: 100% !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          td[class=\"col-center-sm\"] {\n");
      out.write("              text-align: center;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          tr[class=\"footer-attendee-cta\"] > td[class=\"grid__col\"] {\n");
      out.write("              padding: 24px 0 0 !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          td[class=\"col-footer-cta\"] {\n");
      out.write("              padding-left: 0 !important;\n");
      out.write("              padding-right: 0 !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          td[class=\"footer-links\"] {\n");
      out.write("              text-align: left !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .hide-for-small {\n");
      out.write("              display: none !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .ribbon-mobile {\n");
      out.write("              line-height: 1.3 !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .small_full_width {\n");
      out.write("              width: 100% !important;\n");
      out.write("              padding-bottom: 10px;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .table__ridge {\n");
      out.write("              height: 7px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .table__ridge img {\n");
      out.write("              display: none !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .table__ridge--top {\n");
      out.write("              background-image: url(https://cdn.evbstatic.com/s3-s3/marketing/emails/modules/ridges_top_fullx2.jpg) !important;\n");
      out.write("              background-size: 170% 7px;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .table__ridge--bottom {\n");
      out.write("              background-image: url(https://cdn.evbstatic.com/s3-s3/marketing/emails/modules/ridges_bottom_fullx2.jpg) !important;\n");
      out.write("              background-size: 170% 7px;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .summary-table__total {\n");
      out.write("              padding-right: 10px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .app-cta {\n");
      out.write("              display: none !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .app-cta__mobile {\n");
      out.write("              width: 100% !important;\n");
      out.write("              height: auto !important;\n");
      out.write("              max-height: none !important;\n");
      out.write("              overflow: visible !important;\n");
      out.write("              float: none !important;\n");
      out.write("              display: block !important;\n");
      out.write("              margin-top: 12px !important;\n");
      out.write("              visibility: visible;\n");
      out.write("              font-size: inherit !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          /* List Event Cards */\n");
      out.write("          .list-card__header {\n");
      out.write("              width: 130px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .list-card__label {\n");
      out.write("              width: 130px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .list-card__image-wrapper {\n");
      out.write("              width: 130px !important;\n");
      out.write("              height: 65px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .list-card__image {\n");
      out.write("              max-width: 130px !important;\n");
      out.write("              max-height: 65px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .list-card__body {\n");
      out.write("              padding-left: 10px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .list-card__title {\n");
      out.write("              margin-bottom: 10px !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .list-card__date {\n");
      out.write("              padding-top: 0 !important;\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      @media all and (device-width: 768px) and (device-height: 1024px) and (orientation:landscape) {\n");
      out.write("          .ribbon-mobile {\n");
      out.write("              line-height: 1.3 !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .ribbon-mobile__text {\n");
      out.write("              padding: 0 !important;\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      @media all and (device-width: 768px) and (device-height: 1024px) and (orientation:portrait) {\n");
      out.write("          .ribbon-mobile {\n");
      out.write("              line-height: 1.3 !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .ribbon-mobile__text {\n");
      out.write("              padding: 0 !important;\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      @media screen and (min-device-height:480px) and (max-device-height:568px), (min-device-width : 375px) and (max-device-width : 667px) and (-webkit-min-device-pixel-ratio : 2), (min-device-width : 414px) and (max-device-width : 736px) and (-webkit-min-device-pixel-ratio : 3) {\n");
      out.write("  \n");
      out.write("          .hide_for_iphone {\n");
      out.write("              display: none !important;\n");
      out.write("          }\n");
      out.write("  \n");
      out.write("          .passbook {\n");
      out.write("              width: auto !important;\n");
      out.write("              height: auto !important;\n");
      out.write("              line-height: auto !important;\n");
      out.write("              visibility: visible !important;\n");
      out.write("              display: block !important;\n");
      out.write("              max-height: none !important;\n");
      out.write("              overflow: visible !important;\n");
      out.write("              float: none !important;\n");
      out.write("              text-indent: 0 !important;\n");
      out.write("              font-size: inherit !important;\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" bgcolor=\"#F7F7F7\" style=\"margin: 0;\">\n");
      out.write("          ");
      out.write("\n");
      out.write("        ");
 
            cobj=new ConnectionClass();
            cobj.Connect();
            BookingID =(String)request.getAttribute("BookingID");
            People =Integer.parseInt(request.getAttribute("people").toString());
        
      out.write("\n");
      out.write("  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" bgcolor=\"#F7F7F7\">\n");
      out.write("    <tr>\n");
      out.write("      <td>\n");
      out.write("        <table class=\"content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" bgcolor=\"#F7F7F7\" style=\"width: 600px; max-width: 600px;\">\n");
      out.write("          <tr>\n");
      out.write("            <td colspan=\"2\" style=\"background: #fff; border-radius: 8px;\">\n");
      out.write("              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("                  <td style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;\">\n");
      out.write("                    <tr class=\"\">\n");
      out.write("                      <td class=\"grid__col\" style=\"font-family: 'Helvetica neue', Helvetica, arial, sans-serif; padding: 32px 40px; \">\n");
      out.write("                        <table width=\"100%\" border=\"2\" cellspacing=\"0\" cellpadding=\"0\" style=\"margin-top: 12px; margin-bottom: 12px; margin: 24px 0; color: #666666; font-weight: 400; font-size: 15px; line-height: 21px; font-family: 'Helvetica neue', Helvetica, arial, sans-serif;\" >\n");
      out.write("                          <tr>\n");
      out.write("                              ");

                                  pst=cobj.con.prepareStatement("select tbBooking.Location,tbBooking.Transport,tbBooking.Accommodation,tbBooking.LocalTransport,tbBooking.LocalGuide,tbAccommodation.HotelName,tbAccommodation.Price,tbTransport.PickupLocation,tbTransport.Name,tbTransport.Price,tbLocalTransport.Price,tbLocalGuide.Fees from tbBooking join tbAccommodation on tbAccommodation.PlannerID=tbBooking.PlannerID join tbTransport on tbTransport.PlannerID=tbBooking.PlannerID join tbLocalTransport on tbLocalTransport.PlannerID=tbBooking.PlannerID join tbLocalGuide on tbLocalGuide.PlannerID=tbBooking.PlannerID where BookingID=?");
                                  pst.setInt(1,Integer.parseInt(BookingID));
                                  rst=pst.executeQuery();
                                  if(rst.next()){
                              
      out.write("\n");
      out.write("                            <td style=\"padding:20px 20px 0px ; font-weight:700; font-size: 25px; \">\n");
      out.write("                              Itinerary <br><p style=\"padding-top:0px; font-weight:700; font-size: 12px; \">Booking Confirmation Code: ");
      out.print(BookingID);
      out.write("</p>\n");
      out.write("                            </td>\n");
      out.write("                          </tr> \n");
      out.write("                           <tr>\n");
      out.write("                               <td style=\"padding:20px 20px 10px ; font-weight:700; font-size: 18px; \">\n");
      out.write("                                   Accommodation Mode : ");
      out.print(rst.getString(3));
      out.write("<br>\n");
      out.write("                                   Accommodation Name : ");
      out.print(rst.getString(6));
      out.write("<br>\n");
      out.write("                                   Transport Mode : ");
      out.print(rst.getString(2));
      out.write("<br>\n");
      out.write("                                   Transport Name : ");
      out.print(rst.getString(9));
      out.write("<br>\n");
      out.write("                               </td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                               <td>\n");
      out.write("                                <table style=\"width: 100%;\">\n");
      out.write("                                ");

                                    int accommodation=(People/2)*rst.getInt(7);
                                    int transport=People*rst.getInt(10);
                                    int ltransport=People*rst.getInt(11);
                                    int guide=rst.getInt(12);
                                    int sum=(accommodation + transport + ltransport + guide);
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"padding:20px 20px 0px 20px ; font-weight:700; font-size: 18px; \">Total Payable</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\" colspan:2; padding:20px 20px 5px 20px ; font-weight:300; font-size: 14px;\">Accommodation</td><td></td>\n");
      out.write("                                    <td style=\"  padding:20px 20px 5px 30px ; font-weight:300; font-size: 14px;\">₹ ");
      out.print( accommodation);
      out.write("</td>                         \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\" colspan:2; padding:5px 20px 10px 20px ; font-weight:400; font-size: 14px;\">Transport</td><td></td>\n");
      out.write("                                    <td style=\"  padding:5px 20px 10px 30px ; font-weight:400; font-size: 14px;\">₹ ");
      out.print( transport);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>    \n");
      out.write("                                    <td style=\" colspan:2; padding:5px 20px 10px 20px ; font-weight:700; font-size: 14px;\">Local Transport </td><td></td>\n");
      out.write("                                    <td  style=\" padding:5px 20px 10px 30px ; font-weight:700; font-size: 14px; \">₹ ");
      out.print( ltransport);
      out.write("</td>\n");
      out.write("                                </tr> \n");
      out.write("                                <tr>    \n");
      out.write("                                    <td style=\" colspan:2; padding:5px 20px 10px 20px ; font-weight:700; font-size: 14px;\">Guide </td><td></td>\n");
      out.write("                                    <td  style=\" padding:5px 20px 10px 30px ; font-weight:700; font-size: 14px; \">₹ ");
      out.print( guide);
      out.write("</td>\n");
      out.write("                                </tr> \n");
      out.write("                                <tr>    \n");
      out.write("                                    <td style=\" colspan:2; padding:5px 20px 10px 20px ; font-weight:700; font-size: 14px; color:#000\">Grand Total </td><td></td>\n");
      out.write("                                    <td  style=\" padding:5px 20px 10px 30px ; font-weight:700; font-size: 14px; color:#000;\">₹ ");
      out.print( sum);
      out.write("</td>\n");
      out.write("                                </tr>                                          \n");
      out.write("                                </table>\n");
      out.write("                               </td>\n");
      out.write("                           </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <table style=\"width: 100%\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\" colspan:2; padding:5px 20px 10px 20px ; font-weight:400; font-size: 14px;\">\n");
      out.write("                                                <form method=\"get\" action=\"http://localhost:8084/Tour/BookingServlet\">\n");
      out.write("                                                <button type=\"submit\" value=\"Save\" name=\"btn\" >SAVE</button>\n");
      out.write("                                                </form>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td style=\"  padding:5px 20px 10px 30px ; font-weight:400; font-size: 14px;\">\n");
      out.write("                                                <form method=\"get\" action=\"http://localhost:8084/Tour/BookingServlet\">\n");
      out.write("                                                <button type=\"submit\" value=\"Delete\" name=\"btn\" >Delete</button>\n");
      out.write("                                                <input type=\"text\" name=\"BookingID\" value=");
      out.print(BookingID);
      out.write(" style=\"display:none\">\n");
      out.write("                                                </form>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </td>\n");
      out.write("                                ");

                                    }
                                    cobj.Disconnect();
                                
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                      </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                    <p style=\"color: #666666; font-weight: 400; font-size: 15px; line-height: 21px; font-family: 'Helvetica neue', Helvetica, arial, sans-serif; \" class=\"\">Hope you enjoyed the booking experience and will like the stay too.</p>\n");
      out.write("                    <p style=\"color: #666666; font-weight: 400; font-size: 17px; line-height: 24px; font-family: 'Helvetica neue', Helvetica, arial, sans-serif; margin-bottom: 6px; margin-top: 24px;\" class=\"\">Cheers</p>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("</body>\n");
      out.write("\n");
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
