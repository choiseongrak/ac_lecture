<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var = "aaa" value="${xxx }" scope="application"/> <!-- 변수에 저장 -->
	이름:${aaa }<br>
	이름:<c:out value="${xxx }"/><br> <!-- <c:out /> 출력 -->
	이름:<c:out value="${aaa }"/><br>
</body>
</html>