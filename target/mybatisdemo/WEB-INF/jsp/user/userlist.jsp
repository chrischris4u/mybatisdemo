<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<title>用户列表</title>
</head>
<body>
	<h3>用户列表</h3>
	<c:forEach items="${userlist}" var="u">
		<a href="/${u.name}" >${u.name}</a><br/><br/>
	</c:forEach>
</body>
</html>