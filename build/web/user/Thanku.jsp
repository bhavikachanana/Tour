<%-- 
    Document   : Thanku
    Created on : 24 Aug, 2023, 10:11:19 PM
    Author     : admin
--%>

<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <title>OTP Verification Form</title>
    <link rel="stylesheet" href="http://localhost:8084/Tour/user/style.css" />
    <!-- Boxicons CSS -->
    <link href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css" rel="stylesheet" />
   <script src="http://localhost:8084/Tour/user/script.js" defer></script>
  </head>
  <body>
    <div class="container">
      <header>
        <i class="bx bxs-check-shield"></i>
      </header>
      <h4>Enter OTP Code</h4>
      <form action=""http://localhost:8084/Tour/Thankyou" method="get">
        <div class="input-field">
          <input type="number" id="first" />
          <input type="number" disabled id="second"/>
          <input type="number" disabled id="third"/>
          <input type="number" disabled id="fourth"/>
        </div>
        <button onclick="validateOTP(otpText)">Verify OTP</button>

        <p id="text">
      </form>
    </div>
  </body>
</html>

