<%-- 
    Document   : Guide_form
    Created on : 9 Aug, 2023, 12:35:12 AM
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
                    <h4 class="card-title">Guide  Form</h4>
                    <p class="card-description"> Edit & Delete Facts </p>
                    <form class="forms-sample" action="http://localhost:8084/Tour/OrgServlet1">
                  
                    
                         <div class="form-group">
                        <label for="exampleInputName3">Name</label>
                        <input type="text" class="form-control" id="exampleInputName3" name="nmtxt" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName4">Age</label>
                        <input type="text" class="form-control" id="exampleInputName4" name="agtxt" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Fees</label>
                        <input type="text" class="form-control" id="exampleInputName4" name="fetxt" placeholder="Name">
                      </div>
                        
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Specification</label>
                        <input type="text" class="form-control" id="exampleInputName5" name="sptxt" placeholder="Name">
                      </div>
                        

                        <button type="submit" class="btn btn-primary me-2" name="btn" value="Guide_Submit">guide</button>
                      <button class="btn btn-dark">Cancel</button>
                    </form>
                  </div>
                </div>
              </div>
        
        <%@include file="OrgFooter.jsp"%>
    </body>
</html>
