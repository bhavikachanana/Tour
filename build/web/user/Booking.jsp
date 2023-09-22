<%-- 
    Document   : Booking.jsp
    Created on : 18 Aug, 2023, 6:16:24 PM
    Author     : admin
--%>




<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,Common.ConnectionClass,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking</title>
    </head>
    <body>
        <%@include file="UserHeader.jsp" %>
        <%! 
            ConnectionClass cobj;
            PreparedStatement pst;
            ResultSet rst;
            ArrayList<Object> aobj;
        %>
        <div class="col-md-12">
                        <h1 class="text-black mb-4">Book A Tour</h1>
                        <form method="get" action="http://localhost:8084/Tour/BookingServlet">
                                <div class="row md-5">
                                    <div class="form-floating date col-5" id="date3" data-target-input="nearest">
                                        <input type="date" class="form-control bg-transparent datetimepicker-input" placeholder="Date & Time" name="date" value="" />
                                        <label for="datetime">Date</label>
                                    </div>
                                <!--</div>-->
                            <br>
                                <!--<div class="row md-5">-->
                                    <div class="form-floating col-4">
                                         <input type="text" class="form-control bg-transparent" placeholder="Destination" name="destination" value=""/>
                                        <label for="select1">Destination</label>
                                    </div>
                                </div>
                                <br>
                                <div class="row md-5">
                                    <div class="form-floating col-4">
                                         <input type="text" class="form-control bg-transparent" placeholder="Number of People" name="people" value=""/>
                                        <label for="select1">Number of People</label>
                                    </div>
                                </div>
                                <br>
                                <div class="col-4">
                                    <button class="btn btn-outline-light w-100 py-3" type="submit" value="book" name="btn">Book Now</button>
                                </div>
                        </form>

        </div>
        <hr>
        <h4 class="card-title">Booking Table</h4>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>Destination</th>
                    <th>Transport</th>
                    <th>Accommodation</th>
                    <th>Local Transport</th>
                    <th>Guide</th>
<!--                    <th>Cost Min.</th>
                    <th>Cost Max.</th>-->
                     <th> Cost</th>
                    <th>Click to Book</th>
                    
                </tr>
            </thead>
                 <% 
                cobj=new ConnectionClass();
                cobj.Connect();
                aobj =(ArrayList<Object>)request.getAttribute("list");
                if(aobj!=null)
                {
                for(int i=0;i<aobj.size();i++)
                    {
            %>
            <tbody>
                <%
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
                            %>
                          <tr>
                            <td><%=Location%></td>
                            <td><a href="#Transport" data-bs-toggle="collapse"><%=Transport%></a></td>
                            <div id="Transport" class="collapse">
                                <p>Pick Up Location: <%=rst.getString(3)%><br>
                                Lower Price: <%=rst.getString(4)%><br>
                                Higher Price: <%=rst.getString(5)%><br>
                                Specification: <%=rst.getString(6)%><br></p>
                            </div>
                            <td><a href="#Accommodation" data-bs-toggle="collapse"><%=Accommodation%></a></td>
                            <div id="Accommodation" class="collapse">
                                <p>Stay Name: <%=rst.getString(8)%><br>
                                Lower Price: <%=rst.getString(9)%><br>
                                Higher Price: <%=rst.getString(10)%><br>
                                Specification: <%=rst.getString(11)%><br></p>
                            </div>
                            <td><a href="#LTransport" data-bs-toggle="collapse"><%=LTransport%></a></td>
                            <div id="LTransport" class="collapse">
                                <p>Lower Price: <%=rst.getString(13)%><br>
                                Higher Price: <%=rst.getString(14)%><br>
                                Specification: <%=rst.getString(15)%><br></p>
                            </div>
                                <td><a href="#Guide" data-bs-toggle="collapse"><%=Guide%></a></td>
                            <div id="Guide" class="collapse">
                                <p>Age: <%=rst.getString(17)%><br>
                                Price: <%=rst.getString(18)%><br>
                                Specification: <%=rst.getString(19)%><br></p>
                                
                              
                            </div>
                                
                                <td><a href="#Guide" data-bs-toggle="collapse"><%=Cost%></a></td>
                                <td><form method="get" action="http://localhost:8084/Tour/BookingServlet">
                                <button type="submit" value="Plan" name="btn" class="btn btn-primary me-2">BOOK NOW</button>
                                <input type="text" name="PlanID" value=<%=Plan%> style="display:none">
                                <input type="text" name="Location" value=<%=Location%> style="display:none">
                                <input type="text" name="Transport" value=<%=Transport%> style="display:none">
                                <input type="text" name="Accommodation" value=<%=Accommodation%> style="display:none">
                                <input type="text" name="LTransport" value=<%=LTransport%> style="display:none">
                                <input type="text" name="Guide" value=<%=Guide%> style="display:none">
                                 <input type="text" name="Cost" value=<%=Cost%> style="display:none">
                                <input type="text" name="OrganiserID" value=<%=rst.getString(20)%> style="display:none">
                                <input type="text" name="ClientID" value=<%=session.getAttribute("clientID").toString()%> style="display:none">
                                </form></td>    
                          </tr>
                         <%
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
                        %>
                        </tbody>
            </table>
        <%@include file="UserFooter.jsp" %>
    </body>
</html>

<!--Select tbOrganizerDashboard.Destination,tbTransport.Mode,tbTransport.PickupLocation,tbTransport.LowerPrice,tbTransport.HigherPrice,tbTransport.Specification,
tbAccommodation.Type,tbAccommodation.HotelName,tbAccommodation.LowerPrice,tbAccommodation.HigherPrice,tbAccommodation.Specification,
tbLocalTransport.Type,tbLocalTransport.LowerPrice,tbLocalTransport.HigherPrice,tbLocalTransport.Specification,
tbLocalGuide.Name,tbLocalGuide.Age,tbLocalGuide.Fees,tbLocalGuide.Specification
from tbOrganizerDashboard 
join tbTransport on tbOrganizerDashboard.PlannerID=tbTransport.PlannerID and tbOrganizerDashboard.Transport='yes'
join tbAccommodation on tbOrganizerDashboard.PlannerID=tbAccommodation.PlannerID and tbOrganizerDashboard.Accommodation='yes'
join tbLocalTransport on tbOrganizerDashboard.PlannerID=tbLocalTransport.PlannerID and tbOrganizerDashboard.LocalTransport='yes'
join tbLocalGuide on tbOrganizerDashboard.PlannerID=tbLocalGuide.PlannerID and tbOrganizerDashboard.Guide='yes'
where tbOrganizerDashboard.PlannerID=1 and tbTransport.PlannerID=1 and tbAccommodation.PlannerID=1 and tbLocalTransport.PlannerID=1 and tbLocalGuide.PlannerID=1-->