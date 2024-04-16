<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Controller.Base"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession();
    String nombre = (String)sesion.getAttribute("nombre");
    String apellidoP = (String)sesion.getAttribute("apellidoP");
    String apellidoM = (String)sesion.getAttribute("apellidoM");
    String correo = (String)sesion.getAttribute("correo");
    String contra = (String)sesion.getAttribute("contra");
    String delegacion = (String)sesion.getAttribute("delegacion");
    String telefono = (String)sesion.getAttribute("telefono");
 /* try{
    int tipoU = (Integer)sesion.getAttribute("tipoUser");
    if(tipoU!=2){
    %>
    <jsp:forward page="index.html">
    <jsp:param name="error" value="Es
               obligatorio identificarse"/>
</jsp:forward>
    <%
        }}catch(Exception e){
        System.out.println("Error: "+e);%>
            <jsp:forward page="index.html">
    <jsp:param name="error" value="Es
               obligatorio identificarse"/>
</jsp:forward>
       <% } */
        %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>Perfil</title>
    <link rel="stylesheet" href="http://icono-49d6.kxcdn.com/icono.min.css">
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" integrity="sha384-" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>
   <link rel="stylesheet" href="css/css/layouts/side-menu.css">
</head>
<body>

<div id="layout">
    <a href="#menu" id="menuLink" class="menu-link"> 
        <span></span>
    </a>

    <div id="menu">
        <div class="pure-menu">
            <a class="pure-menu-heading" href="#">+terApp</a>

            <ul class="pure-menu-list">
                <li class="pure-menu-item"><a href="#" class="pure-menu-link"><i class="icono-user"></i>Perfil</a></li>
                <li class="pure-menu-item"><a href="#" class="pure-menu-link"><i class="icono-search"></i>Buscar</a></li>
                <li class="pure-menu-item"><a href="#" class="pure-menu-link"><i class="icono-commentEmpty"></i>Mensajería</a></li>

                <li class="pure-menu-item menu-item-divided pure-menu-selected">
                    <a href="#" class="pure-menu-link">Cerrar Sesión</a>
                </li>

                
        </div>
    </div>

    <div id="main">
        <div class="header">
            <h1>Perfil</h1>
            <img src="images/Perfil.png" class="responsive"><br><br>
        </div>
        <div class="content">
            <br>
            <table>
                    <tr><td>Nombre:</td></tr>
                    <td><input class="field" id="email" type="text" placeholder="Nombre..." value="<%out.println(nombre);%>" name="nombre" minlength="2" maxlength="20" onkeypress="return validarn(event)" onpaste="return false" ondrop="return false" required></td>
                    <tr class="arriba"><td>Apellido Paterno:</td></tr>
                    <tr><td><input class="field" id="email" type="text" value="<%out.println(apellidoP);%>" placeholder="Apellido..." name="apellidoP" minlength="2" maxlength="20" onkeypress="return validarn(event)" onpaste="return false" ondrop="return false" required>
                    </td></tr>
                    <tr class="arriba"><td>Apellido Materno:</td></tr>
                    <tr><td><input class="field" id="email" type="text" value="<%out.println(apellidoM);%>" placeholder="Apellido..." name="apellidoM" minlength="2" maxlength="20" onkeypress="return validarn(event)" onpaste="return false" ondrop="return false" required>
                    </td></tr>
                    <tr class="arriba"><td>Correo:</td></tr>
                    <tr><td><input class="field" id="email" type="email" value="<%out.println(correo);%>" placeholder="Email..." name="email" minlength="8" maxlength="40" onkeypress="return validarc(event)" onpaste="return false" ondrop="return false" required>
                    </td></tr>
                    <tr class="arriba"><td>Nueva Contraseña:</td></tr>
                    <tr><td><input class="field" id="password" type="password" placeholder="Contraseña..." minlength="6" maxlength="40" name="password" onkeypress="return validarCon(event)">
                    </td></tr>
                    <tr class="arriba"><td>Teléfono:</td></tr>
                    <tr><td><input class="input" id="email" value="<%out.println(telefono);%>" type="text" placeholder="Teléfono..." name="numero" minlength="8" maxlength="10" onkeypress="return validarA(event)" onpaste="return false" ondrop="return false" required></td></tr>
                    <tr class="arriba"><td>Delegación</td></tr>
                    <tr><td><select class="styled-select black rounded" name="delegacion">
                     <%
                        Base db = new Base();
                          try{
                            Connection cn = db.Conectar();
                            PreparedStatement ps = cn.prepareStatement("SELECT * FROM Delegaciones");
                            ResultSet rs = ps.executeQuery();
                            while(rs.next()){
                             %>   
                                <option value="<%out.println(rs.getString("idDelegacion"));%>"
                                        <%if(delegacion.equals(rs.getString("Delegacion"))){out.println("selected='selected'");}%>><%out.println(rs.getString("Delegacion"));%></option>
                            <%
                            }
                          }catch(Exception e){
                              System.out.println("Error: "+e);
                          }
                        %>  
                    </select></td></tr>
                    <tr><td colspan="2"><input type="submit" value="Cambiar datos" class="button"></td></tr>
            </table> 
             <h2 class="content-subhead"> Mis Clases</h2>
            <table border="1" class="tabla">
                
            </table>
            

          
            
        </div>
    </div>
</div>

<script src="js/ui.js"></script>

</body>
</html>

