package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NuevoRegistro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/animate/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/animsition/css/animsition.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/select2/select2.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/css/main.css\">\n");
      out.write("        <script src=\"script/validacion.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"limiter\">\n");
      out.write("          \n");
      out.write("\t<div class=\"container-register\">\n");
      out.write("\t<div class=\"wrap-login100\">\n");
      out.write("            <form class=\"login100-form validate-form\">\n");
      out.write("            <span class=\"login100-form-title p-b-26\">\n");
      out.write("            Registro\n");
      out.write("            </span>\n");
      out.write("            <span class=\"login100-form-title p-b-48\">\n");
      out.write("\t<i class=\"zmdi zmdi-font\"></i>\n");
      out.write("            </span>\n");
      out.write("        <div class=\"wrap-input100\" >\n");
      out.write("\t\t<input class=\"input100\" type=\"text\" name=\"correo\" minlength=\"8\" maxlength=\"40\" onkeypress=\"return validarc(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("\t\t<span class=\"focus-input100\" data-placeholder=\"Nombre\"></span>\n");
      out.write("\t</div>\n");
      out.write("        <i class=\"zmdi zmdi-font\"></i>\n");
      out.write("            </span>\n");
      out.write("        <div class=\"wrap-input100\" >\n");
      out.write("\t\t<input class=\"input100\" type=\"text\" name=\"correo\" minlength=\"8\" maxlength=\"40\" onkeypress=\"return validarc(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("\t\t<span class=\"focus-input100\" data-placeholder=\"Apellido Paterno\"></span>\n");
      out.write("\t</div>\n");
      out.write("            <i class=\"zmdi zmdi-font\"></i>\n");
      out.write("            </span>\n");
      out.write("        <div class=\"wrap-input100\" >\n");
      out.write("\t\t<input class=\"input100\" type=\"text\" name=\"correo\" minlength=\"8\" maxlength=\"40\" onkeypress=\"return validarc(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("\t\t<span class=\"focus-input100\" data-placeholder=\"Apellido Materno\"></span>\n");
      out.write("\t</div>\n");
      out.write("        <i class=\"zmdi zmdi-font\"></i>\n");
      out.write("            </span>\n");
      out.write("        <div class=\"wrap-input100\" >\n");
      out.write("\t\t<input class=\"input100\" type=\"text\" name=\"correo\" minlength=\"8\" maxlength=\"40\" onkeypress=\"return validarc(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("\t\t<span class=\"focus-input100\" data-placeholder=\"Email\"></span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("        <div class=\"wrap-input100\">\n");
      out.write("            <span class=\"btn-show-pass\">\n");
      out.write("            <i class=\"zmdi zmdi-eye\"></i>\n");
      out.write("\t</span>\n");
      out.write("            <input class=\"input100\" type=\"password\" name=\"contrasena\" minlength=\"6\" maxlength=\"40\" onkeypress=\"return validarCon(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("            <span class=\"focus-input100\" data-placeholder=\"Contraseña\"></span>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"wrap-input100\">\n");
      out.write("            <span class=\"btn-show-pass\">\n");
      out.write("            <i class=\"zmdi zmdi-eye\"></i>\n");
      out.write("\t</span>\n");
      out.write("            <input class=\"input100\" type=\"password\" name=\"contrasena\" minlength=\"6\" maxlength=\"40\" onkeypress=\"return validarCon(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("            <span class=\"focus-input100\" data-placeholder=\"Teléfono\"></span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-login100-form-btn\">\n");
      out.write("            <div class=\"wrap-login100-form-btn\">\n");
      out.write("\t<div class=\"login100-form-bgbtn\"></div>\n");
      out.write("\t<button class=\"login100-form-btn\">Iniciar</button>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <div class=\"text-center p-t-115\">\n");
      out.write("            <span class=\"txt1\">\n");
      out.write("            Al registrarte, aceptas las <a class=\"txt2\" href=\"terminos.html\">Términos de Uso</a> y el <a class=\"txt2\" href=\"aviso.html\">Aviso de Privacidad</a>.</p\n");
      out.write("                \n");
      out.write("            </span>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("           </div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
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
