<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanEmploy" class="com.infinite.BeanDemo1.Employ" scope="page"></jsp:useBean>
	<jsp:setProperty property="*" name="beanEmploy"/>
	Employ no:<jsp:getProperty property="empno" name="beanEmploy"/><br><br/><br><br/>
	Employ name:<jsp:getProperty property="name" name="beanEmploy"/><br><br/><br><br/>
	Department:<jsp:getProperty property="dept" name="beanEmploy"/><br><br/><br><br/>
	Designation:<jsp:getProperty property="desig" name="beanEmploy"/><br><br/><br><br/>
	Basic:<jsp:getProperty property="basic" name="beanEmploy"/><br><br/><br><br/>
	

</body>
</html>