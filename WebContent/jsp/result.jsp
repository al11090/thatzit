<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="java.util.List,thatzit.Question" %>
<% List<Question> searchResult = (List<Question>)request.getAttribute("searchResult"); %>

<%@ include file="header.html" %>
<%@ include file="menu.html" %>

<p>Your search has returned <%=searchResult.size() %> results.</p>

<%@ include file="questionList.html" %>
<%@ include file="footer.html" %>
