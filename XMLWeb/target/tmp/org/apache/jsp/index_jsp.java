/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.28.v20200408
 * Generated at: 2020-12-14 20:25:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/Users/Viktoria/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1607867877155L));
    _jspx_dependants.put("jar:file:/C:/Users/Viktoria/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425967870000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Lato, sans-serif;\n");
      out.write("            margin: auto;\n");
      out.write("            width: 800px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            margin: 10px 0;\n");
      out.write("        }\n");
      out.write("        p{\n");
      out.write("            margin: 5px 0;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            width: 400px;\n");
      out.write("            margin: auto;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 20px auto;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            outline: 0;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            margin: 5px;\n");
      out.write("            border: 2px solid #1D2A31;\n");
      out.write("            background-color: #E5E5E5;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            border: none;\n");
      out.write("            outline: 0;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            color: #1D2A31;\n");
      out.write("            background-color: #52B792;\n");
      out.write("            margin: 5px;\n");
      out.write("        }\n");
      out.write("        .radio-choice {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: row;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .radio__wrapper {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: row;\n");
      out.write("            margin: auto;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
 if (session.getAttribute("login")==null)
{
    response.sendRedirect("/register.jsp");
}
      out.write("\n");
      out.write("<form action=\"/displayInfo\", method=\"get\">\n");
      out.write("    <a href=\"/logout\">Logout from the site</a>\n");
      out.write("    <p>Chose a parser:</p>\n");
      out.write("    <div class=\"radio__wrapper\">\n");
      out.write("        <div class=\"radio-choice\">\n");
      out.write("            <input type=\"radio\" name=\"parser\" value=\"sax\" id=\"sax\">\n");
      out.write("            <label for=\"sax\">SAX</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"radio-choice\">\n");
      out.write("            <input type=\"radio\" name=\"parser\" value=\"dom\" id=\"dom\">\n");
      out.write("            <label for=\"dom\">DOM</label>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <label>File name: </label>\n");
      out.write("    <input type=\"text\" name=\"fileName\" value=\"developers\">\n");
      out.write("    <button>Parse</button>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
