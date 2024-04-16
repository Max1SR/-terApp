package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaginaBienvenida_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"A layout example with a side menu that hides on mobile, just like the Pure website.\">\n");
      out.write("    <title>Responsive Side Menu &ndash; Layout Examples &ndash; Pure</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://icono-49d6.kxcdn.com/icono.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@1.0.0/build/pure-min.css\" integrity=\"sha384-\" crossorigin=\"anonymous\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/css/layouts/side-menu.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"layout\">\n");
      out.write("    <a href=\"#menu\" id=\"menuLink\" class=\"menu-link\">\n");
      out.write("        <span></span>\n");
      out.write("    </a>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("        <div class=\"pure-menu\">\n");
      out.write("            <a class=\"pure-menu-heading\" href=\"#\">+terApp</a>\n");
      out.write("            <ul class=\"pure-menu-list\">\n");
      out.write("                <li class=\"pure-menu-item\"><a href=\"Perfil.jsp\" class=\"pure-menu-link\"><i class=\"icono-user\"></i>Perfil</a></li>\n");
      out.write("                <li class=\"pure-menu-item\"><a href=\"Buscar.jsp\" class=\"pure-menu-link\"><i class=\"icono-search\"></i>Buscar</a></li>\n");
      out.write("                <li class=\"pure-menu-item\"><a href=\"#\" class=\"pure-menu-link\"><i class=\"icono-commentEmpty\"></i>Mensajería</a></li>\n");
      out.write("                <li class=\"pure-menu-item menu-item-divided pure-menu-selected\">\n");
      out.write("                <a href=\"#\" class=\"pure-menu-link\">Cerrar Sesión</a>\n");
      out.write("                </li>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"main\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Bienvenido a +terApp</h1>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h2 class=\"content-subhead\">Estas clases están cerca de ti, tal vez te interese alguna.</h2>\n");
      out.write("            <table>\n");
      out.write("                <td class=\"abajo\">Materia</td>\n");
      out.write("                <td class=\"abajo\">Profesor</td>\n");
      out.write("                <tr class=\"arriba\">\n");
      out.write("                    <td>Ejemplo</td>\n");
      out.write("                    <td>Ejemplo</td></tr>\n");
      out.write("            </table> \n");
      out.write("           \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/ui.js\"></script>\n");
      out.write("\n");
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
