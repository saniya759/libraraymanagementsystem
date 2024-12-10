<%@page import="java.sql.*"%>
<%
        String s1=request.getParameter("u1");
	String s2=request.getParameter("u2");
             try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///library?useSSL=false","root","root");
	Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from SignUp where un='"+s1+"' AND ut='"+s2+"'");
        if(rs.next())
        {
            response.sendRedirect("menudemo.jsp");
        }
        else
        {
            response.sendRedirect("StudentLogin.jsp?s1=Invalid user name and password");  
        }
        con.close();
        }
             catch(Exception e)
             {
                 out.println(e);
             }
%>