<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
  body {
      font: 20px Montserrat, sans-serif;
      line-height: 1.8;
      color: #f5f6f7;
  }
  p {font-size: 16px;}
  .margin {margin-bottom: 45px;}
  .bg-1 { 
      background-color: #fffffff; /* Blue */
      color: #000000;
  }
  .bg-2 { 
      background-color: #474e5d; /*  Blue */
      color: #ffffff;
  }
  .bg-3 { 
      background-color: #000000; /*Blue */
      color: #555555;
  }
  .bg-4 { 
      background-color: #2f2f2f; /* Blue */
      color: #fff;
  }
  .container-fluid {
      padding-top: 70px;
      padding-bottom: 70px;
  }
  .navbar {
      padding-top: 15px;
      padding-bottom: 15px;
      border: 0;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 12px;
      letter-spacing: 5px;
  }
  .navbar-nav  li a:hover {
      color: #1abc9c !important;
  }
  </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Me</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav navbar-left">
  <li><a href="#">  <span class="glyphicon glyphicon-home"></span> HOME</a></li>
</ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="<c:url value="login"></c:url>"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li>
        <li><a href="<c:url value="signup"></c:url>"><span class="glyphicon glyphicon-user"></span>SIGN UP</a></li>
        <li><a href="#">ABOUT US</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- First Container -->`
<div class="container-fluid bg-1 text-center">
  <h3 class="margin">MY LAPTOPS</h3>
  <img src="E:\Ecp\images\laptop.jpg" class="img-responsive img-rounded margin" style="display:inline" alt="Bird" width="650" height="650">
  <h3></h3>
</div>

<!-- Second Container -->
<div class="container-fluid bg-2 text-center">
  <h3 class="margin"> MY LAPTOPS</h3>
  <p>TO MAKE YOUR LIFE BETTER & EASIER</p>
  <a href="#" class="btn btn-default btn-lg">
    <span class="glyphicon glyphicon-search"></span> Search
  </a>
</div>

<!-- Third Container (Grid) -->
<div class="container-fluid bg-3 text-center">    
  <h3 class="margin">BRANDS</h3><br>
  <div class="row">
    <div class="col-sm-4">
      <p>AIO.</p>
      <img src="E:\Ecp\images\lap3.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-4"> 
      <p>MAC.</p>
      <img src="E:\Ecp\images\lap4.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-4"> 
      <p>WINDOWS.</p>
      <img src="E:\Ecp\images\lap5.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
  </div>
</div>

<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
  <p>Bootstrap Theme Made By <a href="https://www.w3schools.com">www.w3schools.com</a></p> 
</footer>

</body>
</html>