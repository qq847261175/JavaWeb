<%@page import="qq.zh.domain.Course"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@page import="qq.zh.domain.Student"%>
<%@ page import="qq.zh.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'ListCourse.jsp' starting page</title>
  </head>
  <body>
   	
   	 ${Student.name} &nbsp &nbsp<a href="<%=basePath %>QuitServlet">退出</a>
   	 &nbsp &nbsp <a href="<%=basePath %>CourseSelect">选课</a>
   	 <table width="100%" border="1" style="text-align: center"  cellspacing="0">
	<tr>
	<th>课程编号<th/>
	<th>课程名称<th/>
	<th>课程学分<th/>
	<tr/>
   	 <c:forEach items="${ selectedcourse}" var="course">
	<tr>   	 
   		<td>	 
		${course.id}    	 
   	 	<td/>
   	 	<td>
   	 	${course.name} 
   	 	<td/>
   	 	<td>
   	 	${course.credit} 
   	 	<td/>
   	 <tr/>
   	 </c:forEach>
   	 </table> 
    
    
    
  </body>
</html>
