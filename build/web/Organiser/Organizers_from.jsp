<%-- 
    Document   : Accommodation_form.jsp
    Created on : 8 Aug, 2023, 9:04:58 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,Common.ConnectionClass"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
    </head>
    <body>
        <%@include file="OrgHeader.jsp" %>
        <%!
            ConnectionClass cobj;
            PreparedStatement pst;
            ResultSet rst;
            %>
            <%
                cobj= new ConnectionClass();
                cobj.Connect();
                %>
                
            
        
                <form name="OrganizerForm" action="http://localhost:8084/Tour/OrgServlet1">
       <div class="col-12 grid-margin">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Organizer form</h4>
                    <form class="form-sample">
                      <p class="card-description"> Info </p>
<!--                      
                      <div>
                            <label class="col-sm-3 col-form-label">OrganizerID</label>
                          <input type="text" name="otxt" class="form-control">
                      </div>-->

                      <div class="row">
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Destination</label>
                            <div class="col-sm-9">
                              <input type="text" class="form-control" name="dtxt" />
                            </div>
                          </div>
                        </div>
                        
                      </div>
                     
                      <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Transportation</label>
                            
                            <div class="col-sm-4">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="trans" id="membershipRadios1" value="Yes" > Yes </label>
                              </div>
                            </div>
                            <div class="col-sm-5">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="trans" id="membershipRadios2" value="No"> No </label>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                      
                      

                      
                      
                       <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Accommodation</label>
                            <div class="col-sm-4">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="accom" id="membershipRadios3" value="Yes" > Yes </label>
                              </div>
                            </div>
                            <div class="col-sm-5">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="accom" id="membershipRadios4" value="No"> No </label>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                      
                      
                      
                       <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Local Transport</label>
                            <div class="col-sm-4">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="local" id="membershipRadios5" value="Yes" checked> Yes </label>
                              </div>
                            </div>
                            <div class="col-sm-5">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="local" id="membershipRadios6" value="No"> No </label>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                      
                      
                      
                       <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Guide</label>
                            <div class="col-sm-4">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="guide" id="membershipRadios7" value="Yes" checked> Yes </label>
                              </div>
                            </div>
                            <div class="col-sm-5">
                              <div class="form-check">
                                <label class="form-check-label">
                                  <input type="radio" class="form-check-input" name="guide" id="membershipRadios8" value="No"> No </label>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                      
                      
                      
                      
                       <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Select Fact</label>
                           
                            <Select name="sitxt">
                                
                            <%
                                try
                                {
                                    pst= cobj.con.prepareStatement("Select SubID , Name from tbSubCategory ");
                                    rst=pst.executeQuery();
                                    while(rst.next())
                                    {%>
                                      
                                    <option value="<%=rst.getString(1)%>"><%=rst.getString(2)%></option>                                                                                        
                                            
                                   <% }
                                  rst.close();

                                }
                                catch(Exception ex)

                                {
                               System.out.println("Error in "+ex);
                                }
%>
</select>

                          </div>
                        </div>
                      </div>
                      
                      
                      
                      
                      <div class="row">
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">fromdate</label>
                            <div class="col-sm-9">
                              <input type="date" class="form-control" name="fdtxt" />
                            </div>
                          </div>
                        </div>
                        
                      </div>

                     <div class="row">
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">todate</label>
                            <div class="col-sm-9">
                              <input type="date" class="form-control" name="tdtxt" />
                            </div>
                          </div>
                        </div>
                        
                      </div>
                      

                       <div class="row">
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">cost</label>
                            <div class="col-sm-9">
                              <input type="text" class="form-control" name="cstxt" />
                            </div>
                          </div>
                        </div>
                        
                      </div>
                      
            
                      
                      <input type="submit" name="btn" value="Submit">
                     
                    
                    </form>
                  </div>
                </div>
              </div>
                    
                    
         
                </form>   
 <%@include file="OrgFooter.jsp"%>
    </body>
</html>
