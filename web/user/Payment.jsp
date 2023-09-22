<%-- 
    Document   : Payment
    Created on : 24 Aug, 2023, 9:28:31 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
          <link rel="stylesheet" href="icons/css/all.min.css">
          <script src="https://kit.fontawesome.com/d3964de134.js" crossorigin="anonymous"></script>
    </head>
    <body>
        
        <section class="gradient-custom">
  <div class="container my-5 py-5">
    <div class="row d-flex justify-content-center py-5">
      <div class="col-md-7 col-lg-5 col-xl-4">
        <div class="card" style="border-radius: 15px;">
          <div class="card-body p-4">
            <form method="get" action="http://localhost:8084/Tour/UserServlet">
              <div class="d-flex justify-content-between align-items-center mb-3">
                <div class="form-outline">
                  <input type="text" id="typeText" name="cntxt" class="form-control form-control-lg" siez="17"
                    placeholder="1234 5678 9012 3457" minlength="19" maxlength="19" />
                  <label class="form-label" for="typeText">Card Number</label>
                </div>
                <img src="https://img.icons8.com/color/48/000000/visa.png" alt="visa" width="64px" />
              </div>

              <div class="d-flex justify-content-between align-items-center mb-4">
                <div class="form-outline">
                  <input type="text" id="typeName" name="chtxt" class="form-control form-control-lg" siez="17"
                    placeholder="Cardholder's Name" />
                  <label class="form-label" for="typeName">Cardholder's Name</label>
                </div>
              </div>

              <div class="d-flex justify-content-between align-items-center pb-2">
                <div class="form-outline">
                  <input type="text" id="typeExp" name="extxt" class="form-control form-control-lg" placeholder="MM/YYYY"
                    size="7" id="exp" minlength="7" maxlength="7" />
                  <label class="form-label" for="typeExp">Expiration</label>
                </div>
                <div class="form-outline">
                  <input type="password" name="cvtxt" id="typeText2" class="form-control form-control-lg"
                    placeholder="&#9679;&#9679;&#9679;" size="1" minlength="3" maxlength="3" />
                  <label class="form-label" for="typeText2">Cvv</label>
                </div>
                <br>
                
                      
              
              </div>
                <button type="submit" class="btn btn-primary me-2" name="btn" value="Make_Payment"> Make Payment</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
        <%@include file="UserFooter.jsp" %>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
     
    </body>
</html>
