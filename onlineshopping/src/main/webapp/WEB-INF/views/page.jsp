<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>
<script type="text/javascript">
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>

	<!-- Page Content -->
	<!-- Loaded when clicked home -->
	<c:if test="${clickhome == true}">
		<%@include file="home.jsp" %>
	</c:if>

	<!-- Loaded when clicked about -->
	<c:if test="${clickabout == true}">
		<%@include file="about.jsp" %>
	</c:if>
	
	<!-- Loaded when clicked contact -->
	<c:if test="${clickcontact == true}">
		<%@include file="contact.jsp" %>
	</c:if>
	
	<!-- Footer -->
	<%@include file="./shared/footer.jsp" %>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/popper.min.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<script src="${js}/myapp.js"></script>

</body>

</html>