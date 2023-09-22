<%-- 
    Document   : LocalTransport
    Created on : 9 Aug, 2023, 12:23:56 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
         <%@include file="OrgHeader.jsp" %>
         
          <div class="col-12 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Local Transportation Form</h4>
                    <p class="card-description"> Edit & Delete Facts </p>
                    <form class="forms-sample" action="http://localhost:8084/Tour/OrgServlet1">
                    
<!--                        <div class="form-group">
                        <label for="exampleInputName2">Planner ID</label>
                        <input type="text" class="form-control" id="exampleInputName2" name="pitxt" placeholder="Name">
                      </div>-->
                        
                         <div class="form-group">
                        <label for="exampleInputName3">Type</label>
                        <input type="text" class="form-control" id="exampleInputName3" name="tptxt" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName4">Lower Price</label>
                        <input type="text" class="form-control" id="exampleInputName4" name="lptxt" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Higher Price </label>
                        <input type="text" class="form-control" id="exampleInputName4" name="hptxt" placeholder="Name">
                      </div>
                        
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Specification</label>
                        <input type="text" class="form-control" id="exampleInputName5" name="sptxt" placeholder="Name">
                      </div>
                        
<!--                         <div class="form-group">
                        <label for="exampleInputName2">Specification</label>
                        <input type="text" class="form-control" id="exampleInputName6" placeholder="Name">
                      </div>-->
                        
                        <!--
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Total Cost</label>
                        <input type="text" class="form-control" id="exampleInputName7" placeholder="Name">
                      </div>
                        
                        <div class="form-group">
                        <label for="exampleInputName2">Paid Amount</label>
                        <input type="text" class="form-control" id="exampleInputName8" placeholder="Name">
                      </div>-->
                        
                      
                      <button type="submit" class="btn btn-primary me-2" name="btn" value="LTransport_Submit">
                      <button class="btn btn-dark">Cancel</button>
                    </form>
                  </div>
                </div>
              </div>
        
        <%@include file="OrgFooter.jsp"%>
    </body>
</html>
