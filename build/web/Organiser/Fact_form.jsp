<%-- 
    Document   : Fact_form
    Created on : 9 Aug, 2023, 12:49:32 AM
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
                    <h4 class="card-title">Facts Form</h4>
                    <p class="card-description"> Edit & Delete Facts </p>
                    <form class="forms-sample" action="http://localhost:8084/Tour/OrgServlet1">
                    
<!--                        <div class="form-group">
                        <label for="exampleInputName2">Planner ID</label>
                        <input type="text" class="form-control" id="exampleInputName2" placeholder="Name">
                      </div>-->
                        
                         <div class="form-group">
                        <label for="exampleInputName3">FactName</label>
                        <input type="text" class="form-control" id="exampleInputName3" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName4">FactSpecification</label>
                        <input type="text" class="form-control" id="exampleInputName4" placeholder="Name">
                      </div>
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Higher Price </label>
                        <input type="text" class="form-control" id="exampleInputName4" placeholder="Name">
                      </div>
                        
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Specification</label>
                        <input type="text" class="form-control" id="exampleInputName5" placeholder="Name">
                      </div>
                        
                        
                        
                        
                        
                         <div class="form-group">
                        <label for="exampleInputName2">Total Cost</label>
                        <input type="text" class="form-control" id="exampleInputName7" placeholder="Name">
                      </div>
                        
                        <div class="form-group">
                        <label for="exampleInputName2">Paid Amount</label>
                        <input type="text" class="form-control" id="exampleInputName8" placeholder="Name">
                      </div>
                        
                      
                      <input type="submit" class="btn btn-primary me-2" value="Fact_Submit" name ="btn" >
                      <button class="btn btn-dark">Cancel</button>
                    </form>
                  </div>
                </div>
              </div>
        
        <%@include file="OrgFooter.jsp"%>

    </body>
</html>
