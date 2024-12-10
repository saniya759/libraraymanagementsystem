package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu1.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<h3>REGISTRATION</h3>\n");
      out.write("<link rel=\"stylesheet\" href=\"abc.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li>Home</li>\n");
      out.write("<li><a href=\"StudentLogin.jsp\">StudentLogin</a></li>\n");
      out.write("<li><a href=\"Admin.jsp\">Admin</a></li>\n");
      out.write("<li>About</li>\n");
      out.write("<li>Contact</li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("<div id=\"mydata\">\n");
      out.write("<center>\n");
      out.write("<form action=\"SignUp1.jsp\">\n");
      out.write("<table cellpadding=\"12px\">\n");
      out.write("<tr>\n");
      out.write("<td>Full Name:</td>\n");
      out.write("<td><input type=\"text\" name=\"un\" class=\"A\" placeholder=\"Enter FullName\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Password:</td>\n");
      out.write("<td><input type=\"password\" name=\"ut\" class=\"A\" placeholder=\"Enter your password:\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Email-id:</td>\n");
      out.write("<td><input type=\"text\" name=\"ue\" class=\"A\" placeholder=\"Enter Email\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Conform password:</td>\n");
      out.write("<td><input type=\"password\" name=\"uc\" class=\"A\" placeholder=\"Conform password\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Mobile number:</td>\n");
      out.write("<td><input type=\"text\" name=\"um\" class=\"A\" placeholder=\"Enter Mobile number\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"><input type=\"Submit\" class=\"B\" value=\"Register\"></th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
