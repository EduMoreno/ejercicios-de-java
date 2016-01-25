<%-- 
      Crea la aplicación "El Trile". Deben aparecer tres cubiletes por pantalla y el usuario deberá seleccionar uno de ellos. Para dicha selección se
      puede usar un formulario con radio-button, una lista desplegable, hacer clic en el cubilete o lo que resulte más fácil. Se levantarán los tres
      cubiletes y se verá si estaba o no la bolita dentro del que el usuario indicó, así mismo, se mostrará un mensaje diciendo "Lo siento, no has
      acertado" o "¡Enhorabuena!, has encontrado la bolita". La probabilidad de encontrar la bolita es de 1/3.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 18</title>
    </head>
    <body>
        <%
      int bola = (int)(Math.random() * 3);
      int cubilete = Integer.parseInt(request.getParameter("cubilete"));
      
      String imagen[] = {"cubilete_sin_bola.png", "cubilete_sin_bola.png", "cubilete_sin_bola.png"};
      imagen[bola] = "cubilete_con_1bola.png";
      
      String mensaje;
      if (bola == cubilete) {
        mensaje = "¡Enhorabuena!, has encontrado la bolita";
      } else {
        mensaje = "Lo siento, no has acertado";
      }
      
    %>  
    
        <img src="<%= imagen[0] %>">
        <img src="<%= imagen[1] %>">
        <img src="<%= imagen[2] %>">
        <%= mensaje %>
       
    </body>
</html>
