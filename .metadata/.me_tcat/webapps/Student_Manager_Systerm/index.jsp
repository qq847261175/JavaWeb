<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>学生管理系统登录</title>
  </head>
  <body>
  <div align="center">
    <h1>学生选课系统</h1>
  <form action="/Student_Manager_Systerm/LoginServlet" method="post">
    <table cellspacing="8" style="border-width: 1;border-style: solid;">
    <tr>
    <td>
     ${msg} 
    <td>
    <tr/>   
    <tr>
    <td>账号 <td/>
    <td><input type="text" name="username"/><td/>
    <tr/>
    <tr>
    <td>密码 <td/>
    <td><input type="password" name="password"/><td/>
     <tr/>
	<tr>
    <td colspan="2"><input  type="submit" value="登录"/><td/>
     <tr/>   
    </table>
    </form>
    <div/>
  </body>
</html>
