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
        
         <link rel="stylesheet" href="http://localhost:8084/Tour/Admin/assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="http://localhost:8084/Tour/Admin/assets/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="http://localhost:8084/Tour/Admin/assets/vendors/jvectormap/jquery-jvectormap.css">
    <link rel="stylesheet" href="http://localhost:8084/Tour/Admin/assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="http://localhost:8084/Tour/Admin/assets/vendors/owl-carousel-2/owl.carousel.min.css">
    <link rel="stylesheet" href="http://localhost:8084/Tour/Admin/assets/vendors/owl-carousel-2/owl.theme.default.min.css">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="http://localhost:8084/Tour/Admin/assets/css/style.css">
    <!-- End layout styles -->
    <link rel="shortcut icon" href="http://localhost:8084/Tour/Admin/assets/images/favicon.png" />
    </head>
    <body>
         <div class="col-12 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Guide  Form</h4>
                    <p class="card-description"> Edit & Delete Facts </p>
                    <form class="forms-sample">
                    
                        <div class="form-group" action="http://localhost:8084/Tour/OrgServlet1">
                        <label for="exampleInputName2">Planner ID</label>
                        <input type="text" class="form-control" id="exampleInputName2"  name="pitxt" placeholder="Name">
                      </div>
                        
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
                        
                      
                      <button type="submit" class="btn btn-primary me-2" mame="sbtn" value="Guide_Submit"/>
                      <button class="btn btn-dark">Cancel</button>
                    </form>
                  </div>
                </div>
              </div>
        
        <%@include file="Footer.jsp"%>
    </body>
</html>
