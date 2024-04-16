package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"A layout example with a side menu that hides on mobile, just like the Pure website.\">\r\n");
      out.write("    <title>+terApp</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/Logo.ico\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://icono-49d6.kxcdn.com/icono.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@1.0.0/build/pure-min.css\" integrity=\"sha384-\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/css/layouts/side-menu.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"layout\">\r\n");
      out.write("    <a href=\"#menu\" id=\"menuLink\" class=\"menu-link\"> \r\n");
      out.write("        <span></span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"menu\">\r\n");
      out.write("        <div class=\"pure-menu\">\r\n");
      out.write("            <a class=\"pure-menu-heading\" href=\"#\">+terApp</a>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"pure-menu-list\">\r\n");
      out.write("                <li class=\"pure-menu-item\"><a href=\"#\" class=\"pure-menu-link\"><i class=\"icono-user\"></i>Perfil</a></li>\r\n");
      out.write("                <li class=\"pure-menu-item\"><a href=\"#\" class=\"pure-menu-link\"><i class=\"icono-search\"></i>Buscar</a></li>\r\n");
      out.write("                <li class=\"pure-menu-item\"><a href=\"#\" class=\"pure-menu-link\"><i class=\"icono-commentEmpty\"></i>Mensajería</a></li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"pure-menu-item menu-item-divided pure-menu-selected\">\r\n");
      out.write("                    <a href=\"#\" class=\"pure-menu-link\">Cerrar Sesión</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"main\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <h1>Perfil</h1>\r\n");
      out.write("            <img src=\"images/Perfil.png\" class=\"responsive\"><br><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <table class=\"tabla2\">\r\n");
      out.write("                    <tr><td>Nombre:</td></tr>\r\n");
      out.write("                    <td><input class=\"field\" id=\"nombre\" type=\"text\" placeholder=\"Nombre...\" value=\"");
out.println(nombre);
      out.write("\" name=\"nombre\" minlength=\"2\" maxlength=\"20\" onkeypress=\"return validarn(event)\" onpaste=\"return false\" ondrop=\"return false\" required></td>\r\n");
      out.write("                    <tr class=\"arriba\"><td>Apellido Paterno:</td></tr>\r\n");
      out.write("                    <tr><td><input class=\"field\" id=\"apellidoP\" type=\"text\" value=\"");
out.println(apellidoP);
      out.write("\" placeholder=\"Apellido...\" name=\"apellidoP\" minlength=\"2\" maxlength=\"20\" onkeypress=\"return validarn(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\r\n");
      out.write("                    </td></tr>\r\n");
      out.write("                    <tr class=\"arriba\"><td>Apellido Materno:</td></tr>\r\n");
      out.write("                    <tr><td><input class=\"field\" id=\"apellidoM\" type=\"text\" value=\"");
out.println(apellidoM);
      out.write("\" placeholder=\"Apellido...\" name=\"apellidoM\" minlength=\"2\" maxlength=\"20\" onkeypress=\"return validarn(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\r\n");
      out.write("                    </td></tr>\r\n");
      out.write("                    <tr class=\"arriba\"><td>Correo:</td></tr>\r\n");
      out.write("                    <tr><td><input class=\"field\" id=\"email\" type=\"email\" value=\"");
out.println(correo);
      out.write("\" placeholder=\"Email...\" name=\"email\" minlength=\"8\" maxlength=\"40\" onkeypress=\"return validarc(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\r\n");
      out.write("                    </td></tr>\r\n");
      out.write("                    <tr class=\"arriba\"><td>Nueva Contraseña:</td></tr>\r\n");
      out.write("                    <tr><td><input class=\"field\" id=\"contra\" type=\"password\" placeholder=\"Contraseña...\" minlength=\"6\" maxlength=\"40\" name=\"password\" onkeypress=\"return validarCon(event)\">\r\n");
      out.write("                    </td></tr>\r\n");
      out.write("                    <tr class=\"arriba\"><td>Delegación</td></tr>\r\n");
      out.write("                    <tr><td><select class=\"styled-select black rounded\" name=\"delegacion\">\r\n");
      out.write("                      \r\n");
      out.write("                    </select></td></tr>\r\n");
      out.write("                    <tr><td colspan=\"2\"><input type=\"submit\" value=\"Cambiar datos\" class=\"button\"></td></tr>\r\n");
      out.write("            </table> \r\n");
      out.write("             <h2 class=\"content-subhead\"> Mis Clases</h2>\r\n");
      out.write("            <table border=\"1\" class=\"tabla\">\r\n");
      out.write("                \r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
