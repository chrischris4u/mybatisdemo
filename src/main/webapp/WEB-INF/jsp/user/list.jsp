<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<title>用户列表</title>
</head>
<body>
	<h3>当前共有${userlist.size()}名用户</h3>
	<c:forEach items="${userlist}" var="u">
		<a href="user/${u.name}" >${u.name}</a><br/><br/>
	</c:forEach>
	<a href="addOne">AddOne</a>
</body>
</html>