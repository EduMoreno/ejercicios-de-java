<%-- 
  Transforma el test de infidelidad realizado anteriormente para consola en una aplicación
  web
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 13</title>
    </head>
    <body>
      <form method="post" action="test.jsp">
      1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.
      <br>
      <input type="radio" name="1" value="3"> Verdadero
      <input type="radio" name="1" value="0"> Falso
      <br>
      2. Ha aumentado sus gastos de vestuario
      <br>
      <input type="radio" name="2" value="3"> Verdadero
      <input type="radio" name="2" value="0"> Falso
      <br>
      3. Ha perdido el interés que mostraba anteriormente por ti
      <br>
      <input type="radio" name="3" value="3"> Verdadero
      <input type="radio" name="3" value="0"> Falso
      <br>
      4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)
      <br>
      <input type="radio" name="4" value="3"> Verdadero
      <input type="radio" name="4" value="0"> Falso
      <br>
      5. No te deja que mires la agenda de su teléfono móvil
      <br>
      <input type="radio" name="5" value="3"> Verdadero
      <input type="radio" name="5" value="0"> Falso
      <br>
      6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante
      <br>
      <input type="radio" name="6" value="3"> Verdadero
      <input type="radio" name="6" value="0"> Falso
      <br>
      7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
      <br>
      <input type="radio" name="7" value="3"> Verdadero
      <input type="radio" name="7" value="0"> Falso
      <br>
      8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo
      <br>
      <input type="radio" name="8" value="3"> Verdadero
      <input type="radio" name="8" value="0"> Falso
      <br>
      9. Has notado que últimamente se perfuma más
      <br>
      <input type="radio" name="9" value="3"> Verdadero
      <input type="radio" name="9" value="0"> Falso
      <br>
      10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
      <br>
      <input type="radio" name="10" value="3"> Verdadero
      <input type="radio" name="10" value="0"> Falso
      <br>
      <input type="submit">
    </form>
    </body>
</html>
