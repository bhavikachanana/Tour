<%-- 
    Document   : SignUp
    Created on : 18 Aug, 2023, 6:16:41 PM
    Author     : admin
--%>





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>User SignUp</title>
    <link href="http://localhost:8084/Tour/user/signup.css" rel="stylesheet" />
    <link
      href="http://localhost:8084/Tour/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="signin">
      <div class="back-img">
        <div class="sign-in-text">
          <h2 class="active" style="padding-left: 25px;">Sign Up</h2>
          <!-- <h2 class="nonactive">Sign Up</h2> -->
        </div>
        <!--/.sign-in-text-->
        <div class="layer"></div>
        <!--/.layer-->
        <p class="point">&#9650;</p>
      </div>
      <!--/.back-img-->
      <div class="form-section">
        <form action="http://localhost:8084/Tour/UserServlet" method="get">
          <!--Email-->
          <div class="row mt-1">
            <div class="col-lg-3">Username</div>
            <div class="col-sm-2 col-lg-1">
              <input
                type="text"
                name="utxt"
                value=""
                placeholder="Enter Username"
              />
            </div>
          </div>
          <br />
          <!--Password-->
          <div
            class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label"
          >
          <div class="row mt-1">
            <div class="col-lg-3">Password</div>
            <div class="col-sm-2 col-lg-1">
              <input
                type="password"
                name="ptxt"
                value=""
                placeholder="Enter Password"
              />
            </div>
          </div>
          <br />
          <div
            class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label"
          >
          <div class="row mt-1">
            <div class="col-lg-3">Phone</div>
            <div class="col-sm-2 col-lg-1">
              <input
                type="text"
                name="phtxt"
                value=""
                placeholder="Enter Phone Number"
              />
            </div>
          </div>
          <br />
          <div
            class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label"
          >
          <div class="row mt-1">
            <div class="col-lg-3">Address</div>
            <div class="col-sm-2 col-lg-1">
              <input
                type="text"
                name="atxt"
                value=""
                placeholder="Enter Address"
              />
            </div>
          </div>
          <br />
          <br>
        <button
        class="sign-in-btn mdl-button mdl-js-ripple-effect mdl-js-button mdl-button--raised mdl-button--colored"
        input="Submit"
        value="signup"
        name="btn"><p class="active" style="align-items: center;font-size: 1.75rem; padding-top: 5px;">Sign Up</p></button>
        </form>
          <p style="margin-left:60px;margin-top: 10px;">Already a member <a href="http://localhost:8084/Tour/user/login.jsp" style="color: #7e7d7d;
        text-decoration:none; ">SignIn Now</a></p>
      </div>
      <br>
    </div>
  </body>
</html>