<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h1>Q. ${question.title}</h1>
<p>${question.genre.name}</p>

<h2>description:</h2>
<div>
	<c:forEach var="desc" items="${question.descriptions}">
		<div>
			wrote on <fmt:formatDate value="${desc.date}" pattern="yyyy-DD-MM hh:mm:ss" />:<br />
			${desc.message}
		</div>
	</c:forEach>
</div>
<p><a href="javascript:alert('Thanks!');">Like this question!</a></p>
<p><a href="javascript:alert('Thanks!');">Report this question</a></p>
<p><a href="/thatzit/jsp/manage.jsp">manage this question</a></p>

<h2>Answers:</h2>
<c:forEach var="ans" items="${question.answers}">
	<c:if test="${!ans.deleted}">
		<div>
			${ans.description}
			<p>like! : ${ans.like}</p>
			<p><a href="javascript:alert('Thanks!');">Like this answer!</a></p>
			<p><a href="javascript:alert('Thanks!');">Report this answer</a></p>
			<p><a href="/thatzit/jsp/answerDelete.html">Delete this answer</a></p>
		</div>
	</c:if>
</c:forEach>
<c:if test="${fn:length(question.answers) == 0}">
 (none)
</c:if>

<h2>Answer this question:</h2>
<form method="post">
	<dl>
		<dt>Your answer:</dt>
		<dd><textarea name="answerDescription" rows="7"></textarea></dd>
		<dt>Password:</dt>
		<dd><input type="password" name="answerPassword" class="text" /></dd>
	</dl>
	<input type="submit" value="Submit answer">
</form>
