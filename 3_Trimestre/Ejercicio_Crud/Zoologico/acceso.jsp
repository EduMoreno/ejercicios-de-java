<%-- 
    Document   : acceso
    Created on : 13-may-2016, 13:15:52
    Author     : Eduardo Moreno
--%>


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

           
            String enlace = " ";

            if (request.getParameter("nombre").equals("administrador") && (request.getParameter("contrasena").equals("1234"))) {
                out.print("<script type=\"text/javascript\">alert(\"Bienvenido al ZOO  Administrador \");</script>");
                enlace = "zoo.jsp";
            } else {
                out.print("<script type=\"text/javascript\">alert(\"Acceso Denegado\");</script>");
                enlace = "index.jsp";
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

                <META HTTP-EQUIV="Refresh" CONTENT="0; URL=<%=enlace%>"
                      <br>
            </div>
    </body>
</html>
