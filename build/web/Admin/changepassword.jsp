<%-- 
    Document   : changepassword.jsp
    Created on : 28 Jul, 2023, 3:02:37 PM
    Author     : bhavi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Change Password</title>
    <link href="changecss.css" rel="stylesheet" />
    <link
      href="../css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="signin">
      <div class="back-img">
        <div class="sign-in-text">
          <h2 class="active" style="padding-left: 25px;">Change Password</h2>
          <!-- <h2 class="nonactive">Sign Up</h2> -->
        </div>
        <!--/.sign-in-text-->
        <div class="layer"></div>
        <!--/.layer-->
        <p class="point">&#9650;</p>
      </div>
      <!--/.back-img-->
      <div class="form-section">
        <form action="../AdminServlet" method="get">
          <!--Email-->
          <div class="row mt-1">
            <div class="col-lg-5">Username</div>
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
            <div class="col-lg-5">Old Password</div>
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
            <div class="col-lg-5">New Password</div>
            <div class="col-sm-2 col-lg-1">
              <input
                type="password"
                name="nptxt"
                value=""
                placeholder="Confirm Password"
              />
            </div>
          </div>
          <br>
          <br>
          <button
          input="Submit"
          value="change"
          name="btn"
        class="sign-in-btn mdl-button mdl-js-ripple-effect mdl-js-button mdl-button--raised mdl-button--colored"
      ><p class="active" style="align-items: center; font-size: 1.75rem; padding-top: 5px;">Confirm</p></button>
      <br>
        </form>
      </div>
    </div>
    <!--/.signin-->
  </body>
</html>
