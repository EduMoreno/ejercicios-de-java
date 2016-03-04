<%-- 
Realiza un cuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
calificación obtenida. Pásale el cuestionario a tus compañeros y pídeles que lo hagan para
ver qué tal andan de conocimientos en las diferentes asignaturas del curso. Utiliza radio
buttons en las preguntas del cuestionario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 9</title>
    </head>
        
    <body>   
        <%
       int puntos = 0;
       
        for ( Integer n = 1; n < 11; n++) {
         puntos += Integer.parseInt(request.getParameter(n.toString()));
        }

        out.print("Has obtenido " + puntos);
      %>
 
    </body>
</html>
 