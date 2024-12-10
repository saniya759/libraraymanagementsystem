<%@page import="java.sql.*"%>
<%
    String s1=request.getParameter("un");
	String s2=request.getParameter("ue");
	String s3=request.getParameter("uc");
        String s4=request.getParameter("um");
	String s5=request.getParameter("ut");
        
        try{
			
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///library?useSSL=false","root","root");
	Statement st=con.createStatement();
	st.executeUpdate("insert into Signup values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
	con.close();
	response.sendRedirect("StudentLogin.jsp");
	}
	catch(Exception e){
    out.println(e);		
	}
        %>