<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>main.jsp<br>
	<c:import url="../cookie02.jsp">
		<c:param name="cook" value="myCookie"></c:param>
	</c:import>
	<c:choose>
		<c:when test="${loginUser } == null">
			<script>
				login.href="login";
			</script>
		</c:when>
		<c:otherwise>
			${loginUser }님 안녕하세요<br>만나서 반갑습니다<br>
			<a href="logout">로그아웃</a>
			<a href="login">로그인</a>
		</c:otherwise>
	</c:choose>

</body>
</html>