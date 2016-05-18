<%-- 
    Document   : acceso
    Created on : 13-may-2016, 13:15:52
    Author     : Eduardo Moreno
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
	<title>Zoologico</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="acceso.css">
  </head>
  
  <body>
    <%
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root", "");
    Statement bd = conexion.createStatement();

    request.setCharacterEncoding("UTF-8");

  
    String mensaje= " ";
    String enlace= " ";
   
    
   if (request.getParameter("nombre").equals("administrador") && (request.getParameter("contrasena").equals("1234"))){ 
      mensaje = "<h3 style=color:white;>Bienvenido al zoo Administrador.</h3>";
      enlace="zoo.jsp";
    } else {
      mensaje = "<h3 style=color:white;>Acceso denegado.</h3>";
      enlace="index.jsp";
    }
    %>
   
         
    <div id="form-main">
  <div id="form-div">
       <h2 style="color: white ; text-align: center; font-family: Comic sans ms;"> CONTROL DE ACCESO </h2>
      <form class="form" id="form1" action= acceso.jsp method="post">
      
      <p class="name">
        <input  type="text"  name="nombre" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Nombre" id="name" />
      </p>
      
      <p class="password">
        <input type="password"   name="contrasena" class="validate[required,custom[password]] feedback-input" id="password" placeholder="Contraseña" />
      </p>
      
          <div class="submit">
        <input type="submit" value="Enviar" id="button-blue"/>
        <div class="ease"></div>
      </div>
    </form>
          
         <p class="password">
       <%=mensaje %>
       
         </p>   
       
         <META HTTP-EQUIV="Refresh" CONTENT="2; URL=<%=enlace%>"
         <br>
       </div>
    </body>
</html>
