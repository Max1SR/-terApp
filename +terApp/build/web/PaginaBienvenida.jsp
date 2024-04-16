<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  /*try{
    HttpSession sesion = request.getSession();
    int tipoU = (Integer)session.getAttribute("tipoUser");
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
       <% }*/
        %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>Responsive Side Menu &ndash; Layout Examples &ndash; Pure</title>
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
                <li class="pure-menu-item"><a href="Perfil.jsp" class="pure-menu-link"><i class="icono-user"></i>Perfil</a></li>
                <li class="pure-menu-item"><a href="Buscar.jsp" class="pure-menu-link"><i class="icono-search"></i>Buscar</a></li>
                <li class="pure-menu-item"><a href="#" class="pure-menu-link"><i class="icono-commentEmpty"></i>Mensajería</a></li>
                <li class="pure-menu-item menu-item-divided pure-menu-selected">
                <a href="#" class="pure-menu-link">Cerrar Sesión</a>
                </li>
        </div>
    </div>

    <div id="main">
        <div class="header">
            <h1>Bienvenido a +terApp</h1>
            
    </div>

        <div class="content">
            <h2 class="content-subhead">Estas clases están cerca de ti, tal vez te interese alguna.</h2>
            <table>
                <td class="abajo">Materia</td>
                <td class="abajo">Profesor</td>
                <tr class="arriba">
                    <td>Ejemplo</td>
                    <td>Ejemplo</td></tr>
            </table> 
           

        </div>
    </div>
</div>



<script src="css/js/ui.js"></script>

</body>
</html>

