<%-- 
Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144… El número n se debe introducir por teclado.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio14</title>
    </head>
    <body>
    <form method="post" action="fibonacci.jsp">    
    <%out.print("<h1>Fibonacci</h1>");%> 
     <br>
     <input type="number" name="segnum">
     <br>
     <input type="submit">
    </form>
    </body>
</html>
