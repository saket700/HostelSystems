<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
 
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/signin.css" rel="stylesheet">
</head>
<body>
<div id="wrapper">
<header id="top">
<center><h1><B>Hostel Management System</B></h1></center>
<div class="container"> 
<center>
<br><br>
<form class="form-signin" role="form"  action ="login" method="post">
<h3 class="form-signin-heading">Please sign in</h3>
<br>
 
<input type="email" name="username" class="form-control" id="ex2" placeholder="Email address" required autofocus>
<br>
<input type="password" name="password" class="form-control" placeholder="Password" required>
<br>
<div class="checkbox">
<label>
<input type="checkbox" value="remember" name ="remember">Remember me
            <br>
</label>
</div>
<input name="submit"button class="btn btn-lg btn-primary btn-block" type="submit" value=" Sign in">
<span><?php echo $error; ?></span>
<br>
<a href="">Forgot your password?</a> 
</form>
</center>
</body>
</html>