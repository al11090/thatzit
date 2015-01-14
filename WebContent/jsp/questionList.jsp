<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table>
	<tr>
		<th>Likes!</th>
		<th>Title</th>
	</tr>
	<c:forEach var="question" items="${questions}">
		<tr>
			<td>${question.numLikes}</td>
			<td><a href="/thatzit/view?id=${question.id}">${question.title}</a></td>
		</tr>
	</c:forEach>
</table>
