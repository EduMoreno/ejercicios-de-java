<%-- 
Combina las dos aplicaciones anteriores en una sola de tal formaque en la página principal
se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
foto o dibujo.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 7</title>
    </head>
      <LINK REL="stylesheet" HREF="css.css" TYPE="text/css">
    <body>
     <%
        
       if (request.getParameter("convertir").equals("Euros")) {  
        double euros = Double.valueOf(request.getParameter("dinero"));
        double pesetas = euros * 166.386;
        out.print( euros + " € son " + pesetas + " pts");   
       } 
       else{
        int pesetas = Integer.valueOf(request.getParameter("dinero"));
        double euros = pesetas / 166.386;
        out.print( pesetas + " pts son " + euros + " €");
       }
      
     %>       
    </body>
</html>
 