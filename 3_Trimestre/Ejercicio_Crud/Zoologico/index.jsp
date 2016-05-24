
<%-- 
    Document   : index.jsp
    Created on : 12-may-2016, 9:46:52
    Author     : Eduardo Moreno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zoologico</title>
        <link rel="stylesheet" href="acceso.css">

    </head>

    <body>

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
            </div>

    </body>
</html>
