<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%
	response.sendRedirect("http://localhost:8080/SyainKanri/list.action");
%>
=======
<%@ taglib prefix="s" uri="/struts-tags" %>
    
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 + Ibatis</title>
<script type="text/javascript">
	function reg(){
		location.href='http://localhost:8080/Struts2IBA/getmaxno.action';
	}
</script>
</head>
<body>
	<s:property value="hello" />
	<s:form action="hello">
		<s:submit value="show hello" />
	</s:form>
</body>
</html>
>>>>>>> origin/master
