<%@include file="menu1.jsp"%>
<html>
<head>
<h3>WELCOME BACK STUDENT SIGN IN LIBRARY MANAGEMENT SYSTEM</h3>
<link rel="stylesheet" href="abc.css"/>
</head>
<body>
<div id="mydata">
<center>
<form action="StudentLogin1.jsp">
    <%
        String s2=request.getParameter("s1");
        if(s2!=null)
        { %>
            <%=s2%>
            <%}%>
<table cellpadding="12px">
<tr>
<td>Enter Username:</td>
<td><input type="text" name="u1" class="A" placeholder="Enter username"></td>
</tr>
<tr>
<td>Enter password:</td>
<td><input type="password" name="u2" class="A" placeholder="Enter password"></td>
</tr>
<tr>
<th colspan="2"><input type="Submit" class="B" value="SignUp"></th>
</tr>
<tr>
<th colspan="2"><input type="Submit" class="B" value="LogIn"></th>
</tr>
</table>
</form>
</center>
</div>
</body>
</html>