<%-- 
    Document   : NuevoRegistro
    Created on : 29/04/2018, 03:09:07 PM
    Author     : Dany
--%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<%@page import="Controller.Base"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="css/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
        <script src="script/validacion.js" type="text/javascript"></script>
    </head>
    <body>
      <div class="limiter">
          
	<div class="container-register">
	<div class="wrap-login100">
            <form class="login100-form validate-form">
            <span class="login100-form-title p-b-26">
            Registro
            </span>
            <span class="login100-form-title p-b-48">
	<i class="zmdi zmdi-font"></i>
            </span>
        <div class="wrap-input100" >
		<input class="input100" type="text" name="correo" minlength="8" maxlength="40" onkeypress="return validarc(event)" onpaste="return false" ondrop="return false" required>
		<span class="focus-input100" data-placeholder="Nombre"></span>
	</div>
        <i class="zmdi zmdi-font"></i>
            </span>
        <div class="wrap-input100" >
		<input class="input100" type="text" name="correo" minlength="8" maxlength="40" onkeypress="return validarc(event)" onpaste="return false" ondrop="return false" required>
		<span class="focus-input100" data-placeholder="Apellido Paterno"></span>
	</div>
            <i class="zmdi zmdi-font"></i>
            </span>
        <div class="wrap-input100" >
		<input class="input100" type="text" name="correo" minlength="8" maxlength="40" onkeypress="return validarc(event)" onpaste="return false" ondrop="return false" required>
		<span class="focus-input100" data-placeholder="Apellido Materno"></span>
	</div>
        <i class="zmdi zmdi-font"></i>
            </span>
        <div class="wrap-input100" >
		<input class="input100" type="text" name="correo" minlength="8" maxlength="40" onkeypress="return validarc(event)" onpaste="return false" ondrop="return false" required>
		<span class="focus-input100" data-placeholder="Email"></span>
	</div>

        <div class="wrap-input100">
            <span class="btn-show-pass">
            <i class="zmdi zmdi-eye"></i>
	</span>
            <input class="input100" type="password" name="contrasena" minlength="6" maxlength="40" onkeypress="return validarCon(event)" onpaste="return false" ondrop="return false" required>
            <span class="focus-input100" data-placeholder="Contraseña"></span>
        </div>
            <div class="wrap-input100">
            <span class="btn-show-pass">
            <i class="zmdi zmdi-eye"></i>
	</span>
            <input class="input100" type="password" name="contrasena" minlength="6" maxlength="40" onkeypress="return validarCon(event)" onpaste="return false" ondrop="return false" required>
            <span class="focus-input100" data-placeholder="Teléfono"></span>
        </div>
            <div class="wrap-input100">
                <p>Delegación:</p>
            <i class="zmdi zmdi-eye"></i>
	</span>
            <div class="styled-select slate">
                <select>
               <%
                        Base db = new Base();
                          try{
                            Connection cn = db.Conectar();
                            PreparedStatement ps = cn.prepareStatement("SELECT * FROM Delegaciones");
                            ResultSet rs = ps.executeQuery();
                            while(rs.next()){
                             %>   
                                <option value="<%out.println(rs.getString("idDelegacion"));%>"><%out.println(rs.getString("Delegacion"));%></option>
                            <%
                            }
                          }catch(Exception e){
                              System.out.println("Error: "+e);
                          }
                        %>
            </select>
        </div>
        <div class="container-login100-form-btn">
            <div class="wrap-login100-form-btn">
	<div class="login100-form-bgbtn"></div>
	<button class="login100-form-btn">Iniciar</button>
	</div>
	</div>
            
        <div class="text-center p-t-115">
            <span class="txt1">
            Al registrarte, aceptas las <a class="txt2" href="terminos.html">Términos de Uso</a> y el <a class="txt2" href="aviso.html">Aviso de Privacidad</a>.</p
                
            </span>
            </div>
            </form>
           
	</div>
	</div>
	<div id="dropDownSelect1"></div>
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<script src="js/main.js"></script>
        <%
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
        %>
    </body>
</html>
