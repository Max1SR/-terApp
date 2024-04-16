package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IniciarSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>+terApp</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/Logo.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/componentes.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animaciones.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@1.0.0/build/pure-min.css\" integrity=\"sha384-\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@1.0.0/build/grids-responsive-min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">  \n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <canvas id=\"nokey\" class=\"inicio\">\n");
      out.write("        </canvas>\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("    <script  src=\"css/animacion2.js\"></script>\n");
      out.write("    <div class=\"splashTool\">\n");
      out.write("        <div class=\"tercesplash\">\n");
      out.write("            <h1 class=\"titulo\">+sterApp</h2>\n");
      out.write("            <div class=\"field\">\n");
      out.write("            <form>\n");
      out.write("                <label for=\"email\">Email:</label><br>\n");
      out.write("                <input class=\"input\" id=\"email\" type=\"email\" placeholder=\"Email...\" required pattern=\"^\\s*([a-zA-Z]+[9-0])\\s*$\"  >\n");
      out.write("                <br>\n");
      out.write("                <label for=\"password\">Contraseña:</label><br>\n");
      out.write("                <input class=\"input\" id=\"password\" type=\"password\" placeholder=\"Contraseña...\" required pattern=\"^\\s*([a-zA-Z]+[9-0])\\s*$\"><br>\n");
      out.write("                <input type=\"submit\" value=\"Iniciar Sesión\" class=\"button\">\n");
      out.write("                <p class=\"par\">¿No tienes cuenta? Da click <a href=\"Registro.jsp\">aquí</a></p>\n");
      out.write("            </form></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
