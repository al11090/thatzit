<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="thatzit.QuestionGenre" %>

<c:forEach var="element" items="<%= QuestionGenre.values() %>">
<option value="${element.id}">${element.name}</option>
</c:forEach>
