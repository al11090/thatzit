<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="java.util.List,thatzit.Question" %>
<% List<Question> searchResult = (List<Question>)request.getAttribute("searchResult"); %>

<%@ include file="template/header.html" %>
<%@ include file="template/menu.html" %>

<p>Your search has returned <%=searchResult.size() %> results.</p>

<%@ include file="template/questionList.jsp" %>
<%@ include file="template/footer.html" %>
