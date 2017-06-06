<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-default">
<div class="container-fluid">
<ul class="nav navbar-nav">
   <li> <a href="home">Home</a> </li>
   <li><a href="aboutus">About Us</a></li>
   
  <url:url value="admin/product/productform" var="url"></url:url>
  
   <li><a href="${url }">Add New Product</a></li>
  	
</ul>
</div>

</nav>
</body>
</html>