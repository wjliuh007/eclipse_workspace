<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	This is my JSP page.tomcat-B
	<br>
	<%
		HttpSession mysession = request.getSession(false);
		if (mysession == null) {
			mysession = request.getSession(true);
			mysession.setAttribute("appname", "value-A");
			out.println("new session:" + mysession.getId());
		} else {
			out.println("old session:" + mysession.getId());
		}
		out.println("appname=" + mysession.getAttribute("appname"));
	%>
</body>
</html>