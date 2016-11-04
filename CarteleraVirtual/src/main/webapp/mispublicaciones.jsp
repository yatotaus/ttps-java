<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	
    
    
    
	
</head>
<body>
<c:if test="${not empty rol}">
		<c:if test="${rol < 3}">
			<jsp:include page="common/head.jsp" flush="true" >
				<jsp:param name="titulo" value="Login"/>
			</jsp:include>
		</c:if>
		<c:if test="${rol >= 3}">
			<jsp:forward page="index.jsp" />    	
		</c:if>
    </c:if>
    <c:if test="${empty rol}">
    		<jsp:forward page="index.jsp" />
    </c:if>
    </body>
</html>
