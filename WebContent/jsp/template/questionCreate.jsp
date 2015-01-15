<form method="post" action="/thatzit/ask">
<table class="form">
<tr>
    <th colspan="2">Please fill in the form below to submit a question:</th>
</tr>
<tr>
    <td>Title:</td>
    <td>Q.<input type="text" name="questionTitle" class="text">${questionTitle}</td>
</tr>
<tr>
    <td>Description:</td>
    <td><textarea name="questionDescription" rows="7">${questionDescription}</textarea></td>
</tr>
<tr>
    <td>Genre:</td>
    <td><select name="questionGenre">
    <%@ include file="genreList.jsp" %>
    </select></td>
</tr>
<%--
<tr>
    <td>Password:</td>
    <td><input type="password" name="questionPassword" class="text"></td>
</tr>
--%>
<tr class="center">
    <input type="hidden" name="password" value=""></td>
    <input type="hidden" name="ask" value="1"></td>
    <td colspan="2"><input type="submit" value="Submit question"></td>
</tr>
</table>
</form>
