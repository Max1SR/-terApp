
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>+terApp</title>
    <link rel="shortcut icon" href="images/Logo.ico" />
    <link rel="stylesheet" href="http://icono-49d6.kxcdn.com/icono.min.css">
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" integrity="sha384-" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>
    <link rel="stylesheet" href="css/layouts/side-menu.css">
     <link rel="stylesheet" href="css/style.css">
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
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
            <h1>Búsqueda</h1>
            
    </div>

        <div class="content">
            <h2 class="content-subbus">Escoge un área.</h2>
            
    <div class='btns'>
      <label>
        <input checked='' name='exactas' type='radio' value='exactas'>
          <span class='btn first'>Ciencias Exactas</span>
        </input>
      </label>
      <label>
        <input name='button-group' type='radio' value='sociales'>
          <span class='btn'>Ciencias Sociales</span>
        </input>
      </label>
      <label>
        <input name='button-group' type='radio' value='idiomas'>
          <span class='btn'>Idiomas</span>
        </input>
      </label>
      <label>
        <input name='button-group' type='radio' value='artes'>
          <span class='btn'>Artes</span>
        </input>
      </label>
    </div>
            
    <h2 class="content-subbus2">Escoge la materia.</h2>
    <div class="select">
        <select name="slct" id="slct">
        <option>Escoge</option>
        <option value="1">Balbala</option>
      <option value="2">gwrgdcbfgr</option>
      <option value="3">grfrtgfer</option>
    </select>
    </div>
    
        </div>
        
    </div>
   <table>
    <th><input type="submit" value="Buscar" class="button"></th>     
   </table>
    <br>
    <br>
    <br>
    <table>
                <td class="abajo">Materia</td>
                <td class="abajo">Profesor</td>
                <tr class="arriba">
                    <td>Ejemplo</td>
                    <td>Ejemplo</td></tr>
            </table>
    </div>
 




<script src="js/ui.js"></script>

</body>
</html>



