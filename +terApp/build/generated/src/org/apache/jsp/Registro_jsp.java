package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;
import Controller.Base;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"script/validacion.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"condiciones\">\n");
      out.write("        <canvas id=\"nokey\" class=\"registro\">\n");
      out.write("        </canvas>\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("    <script  src=\"css/animacion2.js\"></script>\n");
      out.write("    <div class=\"splash-mini\">\n");
      out.write("        <div class=\"segundosplash\">\n");
      out.write("            \n");
      out.write("            <div class=\"field\">\n");
      out.write("                  <h1 class=\"titulo\">+terApp</h1>\n");
      out.write("            <table >\n");
      out.write("            <form name=\"registro\"  method=\"post\" action=\"Registro.jsp\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"email\">Nombre:</label><br>\n");
      out.write("                    <td><input class=\"input\" id=\"email\" type=\"text\" placeholder=\"Nombre...\" name=\"nombre\" minlength=\"2\" maxlength=\"20\" onkeypress=\"return validarn(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("                \n");
      out.write("                    <td><label for=\"email\">Apellido Paterno:</label><br>\n");
      out.write("                    <td><input class=\"input\" id=\"email\" type=\"text\" placeholder=\"Apellido...\" name=\"apellidoP\" minlength=\"2\" maxlength=\"20\" onkeypress=\"return validarn(event)\" onpaste=\"return false\" ondrop=\"return false\" required></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"email\">Apellido Materno:</label><br>\n");
      out.write("                    <td><input class=\"input\" id=\"email\" type=\"text\" placeholder=\"Apellido...\" name=\"apellidoM\" minlength=\"2\" maxlength=\"20\" onkeypress=\"return validarn(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("                \n");
      out.write("                    <td><label for=\"email\">Email:</label><br>\n");
      out.write("                    <td><input class=\"input\" id=\"email\" type=\"email\" placeholder=\"Email...\" name=\"email\" minlength=\"8\" maxlength=\"40\" onkeypress=\"return validarc(event)\" onpaste=\"return false\" ondrop=\"return false\" required></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"password\">Contraseña:</label><br>\n");
      out.write("                    <td><input class=\"input\" id=\"password\" type=\"password\" placeholder=\"Contraseña...\" minlength=\"6\" maxlength=\"40\" name=\"password\" onkeypress=\"return validarCon(event)\" required> \n");
      out.write("                \n");
      out.write("                    <td><label for=\"email\">Teléfono</label><br>\n");
      out.write("                    <td><input class=\"input\" id=\"email\" type=\"text\" placeholder=\"Teléfono...\" name=\"numero\" minlength=\"8\" maxlength=\"10\" onkeypress=\"return validarA(event)\" onpaste=\"return false\" ondrop=\"return false\" required>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\"><label>\n");
      out.write("                        Delegación: \n");
      out.write("                    <td colspan=\"2\"><span>\n");
      out.write("                    <select class=\"styled-select black rounded\" name=\"delegacion\">\n");
      out.write("                        ");

                        Base db = new Base();
                          try{
                            Connection cn = db.Conectar();
                            PreparedStatement ps = cn.prepareStatement("SELECT * FROM Delegaciones");
                            ResultSet rs = ps.executeQuery();
                            while(rs.next()){
                             
      out.write("   \n");
      out.write("                                <option value=\"");
out.println(rs.getString("idDelegacion"));
      out.write('"');
      out.write('>');
out.println(rs.getString("Delegacion"));
      out.write("</option>\n");
      out.write("                            ");

                            }
                          }catch(Exception e){
                              System.out.println("Error: "+e);
                          }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </span></label></td></tr></table>\n");
      out.write("                 <br>\n");
      out.write("                <input type=\"submit\" value=\"Registrar\" class=\"button\">\n");
      out.write("                <br>\n");
      out.write("                <p class=\"par\">Al registrarte, aceptas las <a href=\"terminos.html\">Términos de Uso</a> y el <a href=\"aviso.html\">Aviso de Privacidad</a>.</p\n");
      out.write("                </form></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("                    \n");
      out.write("   ");

            if(request.getParameter("Registrar")!=null){
                String nombre = request.getParameter("nombre");
                String apellidoP = request.getParameter("apellidoP");
                String apellidoM = request.getParameter("apellidoM");
                String num = request.getParameter("numero");
                String del = request.getParameter("delegacion");
                String email = request.getParameter("email");
                String pass = request.getParameter("password");
                
                if(db.registroEstudiante(nombre, apellidoP, apellidoM, num, del, email, pass)){
                    out.println("<script>alert('Registro concluido con exito');</script>");
                    response.sendRedirect("IniciarSesion.jsp");
                    System.out.println("Registro concluido con exito");
                }else{
                    out.println("<script>alert('El correo ya esta asociado a una cuenta, utilice uno diferente');</script>");
                    System.out.println("Error al registrar: ya hay una cuenta asociada a ese correo");
                }                
            }
        
      out.write("\n");
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
