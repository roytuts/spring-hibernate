<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>Spring Boot MVC and Hibernate CRUD Example</title>
<body>
	<h2>Spring Boot MVC and Hibernate CRUD Example</h2>
	<c:if test="${not empty msg}">
        ${msg}
    </c:if>
	<h3>Update User</h3>
	<form method="POST" name="update_teacher"
		action="<%=request.getContextPath()%>/update/teacher">
		<input hidden="hidden" name="id" value="${id}" type="text" /> Name: <input
			name="name" value="${teacher.name}" type="text" /> <br /> <br />
		Expertise: <input name="expertise" value="${teacher.expertise}"
			type="text" /> <br /> <br /> <input value="Update User"
			type="submit" />
	</form>
</body>
</html>