<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>用户详情</title>
</head>
<body>
	姓名:"${userinfo.name}" <br/>
	性别:"${userinfo.sex}" <br/>
	手机:"${userinfo.tel}" <br/>
	地址:"${userinfo.address}" <br/>
	<a href="/mybatisdemo">返回</a>
</body>
</html>