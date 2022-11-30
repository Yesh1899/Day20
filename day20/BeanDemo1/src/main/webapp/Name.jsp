<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanName" class="com.infinite.BeanDemo1.NumBean" scope="page"></jsp:useBean>

<jsp:setProperty property="firstName" name="beanName"/>
<jsp:setProperty property="lastName" name="beanName"/>
<br><hr/>
First Name:
<jsp:getProperty property="firstName" name="beanName"/>
Last Name:
<jsp:getProperty property="lastName" name="beanName"/>
</body>
</html>