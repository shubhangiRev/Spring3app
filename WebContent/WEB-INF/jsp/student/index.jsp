<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Responsive Login Form</title>
  
  
  <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

      <spring:url value="/resources/css/style.css" var="r1" />
	  <spring:url value="/resources/js/index.js" var="r2"/>
	
	<link href="${r1}" rel="stylesheet" />
    <script src="${r2}"></script>
      
     
</head>
<body>
   <!--<form:errors path="index.**"></form:errors>-->
<form action="student/log" method="post">

  <link href='https://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>

<div class="login">
  <div class="login-header">
    <h1>Login</h1>
  </div>
  <div class="login-form">
   <table>
			<tr> <td>Name: </td> <td><input type="text" name="username"> <form:errors cssStyle="color:red" path="index.username"></form:errors> </td></tr>
			<tr> <td>Password: </td> <td><input type="text" name="password"> <form:errors cssStyle="color:red" path="index.password"></form:errors> </td></tr></table>
							     <br>
    <input type="submit" value="Login" class="login-button"/>
    <br>
    <a class="sign-up">Sign Up!</a>
    <br>
    <h6 class="no-access">Can't access your account?</h6>
  </div>
</div>
<div class="error-page">
  <div class="try-again">Error: Try again?</div>
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
   </form>
   </body>

</html>
