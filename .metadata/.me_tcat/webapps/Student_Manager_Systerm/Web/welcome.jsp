<%@page import="qq.zh.domain.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table cellspacing="8" style="border-width: 1;border-style: solid " >
  <tr>
    <td>Welcome ${Student.name} !!<br/><td/>
    <tr/>
   <tr>
	<td><a href="<%=basePath %>ListSeletedCourse">课程清单</a><br/><td/>
	<td><a href="<%=basePath %>CourseSelect">课程选择</a><br/><td/>
	<td><a href="<%=basePath %>QuitServlet">系统退出</a><br/><td/>
  <tr/>
  </table>
  </body>
</html>
