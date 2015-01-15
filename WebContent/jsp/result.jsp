<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ include file="template/header.html" %>
<%@ include file="template/menu.html" %>

<p>Your search has returned ${fn:length(questions)} results.</p>

<%@ include file="template/questionList.jsp" %>
<%@ include file="template/footer.html" %>
