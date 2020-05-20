<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>login.jsp<br>
	<!--%@ include file="../cookie02.jsp" %-->
	<!-- jsp:include page="../cookie02.jsp"-->
	<c:import url="/cookie02">
		<c:param name="cook" value="myCookie"></c:param>
	</c:import>
	<form method="post" action="chkUser">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="password" name="pwd" placeholder="비밀번호"><br>
		<input type="submit" value="로그인">
	</form>

</body>
</html>