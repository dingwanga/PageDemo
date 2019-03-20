<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>考勤记录信息表</title>
</head>
<body style="text-algin:center">
	<div style="width:600px;">
	
		<table border="1" width="80%">
			<tr>
				<th colspan="4" style="background-color:green">考勤记录信息表</th>
			</tr>
			<tr>
				<th>用户编码</th>
				<th>用户名称</th>
				<th>用户密码</th>
				<th>出生日期</th>
				<th>操作</th>
			</tr>
			<!-- 循环输出商品信息 -->
			<c:forEach var="user" items="${userlist}"
				varStatus="status">
				<!-- 如果是偶数行，为该行换背景颜色 -->
				<tr
					<c:if test="${status.index % 2 == 1 }"> style="background-color:rgb(219,241,212);"</c:if>>
					<td>${user.userCode}</td>

					<td>${user.userName}</td>

					<td>${user.userPassword }</td>

					<td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></td>
					
					<td><a href="#">查看</a></td>
					
				</tr>
			</c:forEach>
		</table>
		
		
	</div>
</body>
</html>
