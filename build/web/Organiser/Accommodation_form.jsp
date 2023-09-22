<%-- 
    Document   : AccommodationOrg_form
    Created on : 8 Aug, 2023, 10:43:15 PM
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
                    <h4 class="card-title">Accomodation form</h4>
                    <p class="card-description"> Edit & Delete Facts </p>
                    <form class="forms-sample" action="http://localhost:8084/Tour/OrgServlet1">
                      <div class="form-group">
                        <label for="exampleInputName1">Type</label>
                        <input type="text" class="form-control"  name="tptxt" id="exampleInputName1" placeholder="Name">
                      </div>
                        <div class="form-group">
                        <label for="exampleInputName2">Hotel Name</label>
                        <input type="text" class="form-control" id="exampleInputName2" name="hntxt" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName3">Lower Price</label>
                        <input type="text" class="form-control" id="exampleInputName3" name="lptxt" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName4">Higher Price</label>
                        <input type="text" class="form-control" id="exampleInputName4"  name="hptxt"  placeholder="Name">
                      </div>
                        
<!--                         <div class="form-group">
                        <label for="exampleInputName2">PlannerID </label>
                        <input type="text" class="form-control" id="exampleInputName4"  name="pitxt"  placeholder="Name">
                      </div>-->
                        
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Specification</label>
                        <input type="text" class="form-control" id="exampleInputName5"  name="sptxt"  placeholder="Name">
                      </div>
                        
<!--                         <div class="form-group">
                        <label for="exampleInputName2">Local Guide</label>
                        <input type="text" class="form-control" id="exampleInputName6" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Total Cost</label>
                        <input type="text" class="form-control" id="exampleInputName7" placeholder="Name">
                      </div>
                        
                        <div class="form-group">
                        <label for="exampleInputName2">Paid Amount</label>
                        <input type="text" class="form-control" id="exampleInputName8" placeholder="Name">
                      </div>-->
                        
                      
<button type="submit" class="btn btn-primary me-2" name="btn" value="Accommodation_Submit"> Next</button>
                      <button class="btn btn-dark">Cancel</button>
                    </form>
                  </div>
                </div>
              </div>
        
        <%@include file="OrgFooter.jsp"%>
    </body>
</html>
