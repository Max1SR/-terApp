<%-- 
    Document   : Mensajeria
    Created on : 7/05/2018, 03:07:00 PM
    Author     : Dany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>+terApp</title>
    <link rel="shortcut icon" href="images/Logo.ico" />
    <link rel="stylesheet" href="http://icono-49d6.kxcdn.com/icono.min.css">
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" integrity="sha384-" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>
    <link rel="stylesheet" href="css/layouts/side-menu.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css'>
    <link rel="stylesheet" href="css/chat.css">
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
    </div>
   
   
    <div class="people-list" id="people-list">
      <div class="search">
        <input type="text" placeholder="search" />
        <i class="fa fa-search"></i>
      </div>
      <ul class="list">
        <li class="clearfix">
          <img src="images/chat.png" alt="avatar" />
          <div class="about">
            <div class="name">Nombre Usuario</div>
            <div class="status">
              <i class="fa fa-circle online"></i> online
            </div>
          </div>
        </li>
              </ul>
    </div>
    
    <div class="chat">
      <div class="chat-header clearfix">
        <img src="images/Conec.png" alt="avatar" />
        
        <div class="chat-about">
          <div class="chat-with">Chat con Nombre Usuario</div>
          <div class="chat-num-messages"></div>
        </div>
        <i class="fa fa-star"></i>
      </div> 
      
      <div class="chat-history">
        <ul>
          <li class="clearfix">
            <div class="message-data align-right">
              <span class="message-data-time" >10:10 AM, FEcha</span> &nbsp; &nbsp;
              <span class="message-data-name" >Usuario</span> <i class="fa fa-circle me"></i>
              
            </div>
            <div class="message other-message float-right">
              Como vas con los retos dany? jejeje
            </div>
          </li>
          
          <li>
            <div class="message-data">
              <span class="message-data-name"><i class="fa fa-circle online"></i> Nombre de Usuario</span>
              <span class="message-data-time">10:12 AM, fecha</span>
            </div>
            <div class="message my-message">
                Bien...(tono de miedo)
            </div>
          </li>
          
          <li class="clearfix">
            <div class="message-data align-right">
              <span class="message-data-time" >10:14 AM, fecha</span> &nbsp; &nbsp;
              <span class="message-data-name" >Nombre Usuario</span> <i class="fa fa-circle me"></i>
              
            </div>
            <div class="message other-message float-right">
            jejejeje...(sobando espalda)
            </div>
          </li>
          
          <li>
            <div class="message-data">
              <span class="message-data-name"><i class="fa fa-circle online"></i> Nombre usuario</span>
              <span class="message-data-time">10:20 AM, fecha</span>
            </div>
            <div class="message my-message">
                bla bla bla
            </div>
              
          </li>
          
          <li>
            <div class="message-data">
              <span class="message-data-name"><i class="fa fa-circle online"></i> Nombre USuario</span>
              <span class="message-data-time">10:31 AM, fecha</span>
            </div>
            <i class="fa fa-circle online" style="color:#9028d8"></i>
             <i class="fa fa-circle online" style="color: #af7ed1"></i>
            <i class="fa fa-circle online" style="color: #c689f0 "></i>
           
           
          </li>
          
        </ul>
        
      </div> 
      
      <div class="chat-message clearfix">
        <textarea name="mensaje" id="message-to-send" placeholder ="Escribe tu mensaje" rows="3"></textarea>
        
        
        <button>Enviar</button>

      </div> 
      
    </div> 
    

   

<script id="message-template" type="text/x-handlebars-template">
  <li class="clearfix">
    <div class="message-data align-right">
      <span class="message-data-time" >{{time}}, Today</span> &nbsp; &nbsp;
      <span class="message-data-name" >Olia</span> <i class="fa fa-circle me"></i>
    </div>
    <div class="message other-message float-right">
      {{messageOutput}}
    </div>
  </li>
</script>

<script id="message-response-template" type="text/x-handlebars-template">
  <li>
    <div class="message-data">
      <span class="message-data-name"><i class="fa fa-circle online"></i> Vincent</span>
      <span class="message-data-time">{{time}}, Today</span>
    </div>
    <div class="message my-message">
      {{response}}
    </div>
  </li>
</script>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.0/handlebars.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/list.js/1.1.1/list.min.js'></script>

  

    <script  src="css/js/chat.js"></script>
    </body>
</html>
