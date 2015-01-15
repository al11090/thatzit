<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<table>
	<tr>
		<!-- <th>Likes!</th> -->
		<th>Title</th>
		<th>date</th>
	</tr>
	<c:forEach var="question" items="${questions}">
		<tr>
			<!-- <td>${question.numLikes}</td> -->
			<td><a href="/thatzit/view?id=${question.id}">${question.title}</a></td>
			<td class="date"><fmt:formatDate value="${question.descriptions[0].date}" pattern="yyyy-DD-MM hh:mm:ss" /></td>
		</tr>
	</c:forEach>
</table>
