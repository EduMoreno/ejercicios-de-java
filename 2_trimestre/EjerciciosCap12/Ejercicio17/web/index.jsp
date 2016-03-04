<%-- 
Realiza un configurador del interior de un vehículo. El usuario puede elegir, mediante
un formulario, el color de la tapicería – blanco, negro o berengena - y el material de las
molduras – madera o carbono. Se debe mostrar el interior del coche tal y como lo quiere
el usuario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 17</title>
    </head>
    <body>
        <form method="get" action="configurador.jsp">
      <h1>Tapicería:</h1>
      <select name="tapiceria">
        <option value="negro" > Negro</option>
        <option value="berengena"> Berengena</option>
        <option value="blanco"> Blanco</option>
      </select>
      <br>
      
      <h1>Tipo de moldura interior:</h1>
      <select name="moldura">
        <option value="carbono" selected="selected">Carbono</option>
        <option value="madera">Madera</option>
      </select>
      <br>
      <input type="submit">
        </form>
    </body>
</html>
