<form method="post" action="/thatzit/search">
<table class="form">
<tr>
    <th colspan="2">Please fill in the form below to search a question.</th>
</tr>
<tr>
    <td>Text to search:</td>
    <td><input type="text" name="query" class="text"></td>
</tr>
<%--
<tr>
    <td>Genre:</td>
    <td><select name="questionGenre">
    <%@ include file="genreList.jsp" %>
    </select></td>
</tr>
--%>
<tr class="center">
    <td colspan="2"><input type="submit" value="Search"></td>
</tr>
</table>
</form>
