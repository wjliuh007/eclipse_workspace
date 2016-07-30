<%@ page language="java" pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<title>Insert title here</title> 
<style type="text/css">
.login {
	background:#EEE;
	box-shadow:0px 0px 0px #616161;
	width: 245px;
	height: 80px;
	
	margin: 100px auto;
}
.btn{
	margin: 9px 9px 10px 92px;
}

</style> 
</head>  
<body>  
    <form class="login" action="mylogin.action" method="post">    
        Username:<input type="text" name="username"/><br/>    
        Password:<input type="password" name="password"/><br/>    
        <input class="btn" type="submit" value="Submit"/>     
    </form>  
</body>  
</html>