<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>장바구니</h1>
<jsp:include page="common/top.jsp" flush="false"></jsp:include><br>
<jsp:include page="common/menu.jsp" flush="false"></jsp:include><br>
<hr/>
<jsp:include page="goods/cartList_stu.jsp"></jsp:include>
</body>
</html>