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
        <title>Ejercicio 10</title>
    </head>
    <body>
     
 <form action="test.jsp" method="post">
        
     <h1>TEST</h1>
    <br>
    1. ¿Que signfica  las siglas RAM? <br>
   <input type="radio" name="1" value="1">a) Random Access Memory  <br>
   <input type="radio" name="1" value="0">b) Renew Access Motherboard <br>
   <input type="radio" name="1" value="0">c) Renove Access MEMOR <br>
    <br>
   2. ¿Que comando se usa para crear una carpeta en linux? <br>
   <input type="radio" name="2" value="0">a) create dir <br>
   <input type="radio" name="2" value="1">b) mkdir <br>
   <input type="radio" name="2" value="0">c) cut <br>
    <br>    
   3. ¿Que programa se puede usar para retoque de paginas WEB? <br>
   <input type="radio" name="3" value="1"> a) Adobe Dreamviewer <br>
   <input type="radio" name="3" value="0"> b) Cpu-z <br>
   <input type="radio" name="3" value="0"> c) Jdowloader <br>
    <br>    
   4. ¿Cual es el comando para instalar un programa en linux? <br>
   <input type="radio" name="4" value="0"> a) sudo apt-get update <br>
   <input type="radio" name="4" value="1"> b) sudo apt-get install  <br>
   <input type="radio" name="4" value="0"> c) sudo apt-get upgrade  <br>
    <br>       
   5. ¿Que componente de ordenador se necesita para poder visualizar un videojuego? <br>
   <input type="radio" name="5" value="0"> a) HDD <br>
   <input type="radio" name="5" value="0"> b) Lector DVD  <br>
   <input type="radio" name="5" value="1"> c) Tarjeta Gráfica <br>
    <br>      
   6. ¿HTML es un lenguaje de marcas? <br>
   <input type="radio" name="6" value="1"> a) Si  <br>
   <input type="radio" name="6" value="0"> b) No  <br>
   <input type="radio" name="6" value="0"> c) Si, aunque ya no se usa <br>
    <br>      
   7. ¿Que programa usamos para ver la informacion de nuestro ordenador? <br>
    <input type="radio" name="7" value="1"> a) Aida 64 <br>
    <input type="radio" name="7" value="0"> b) Partition Magic <br>
    <input type="radio" name="7" value="0"> c) Ninguna de las anteriores <br>
    <br> 
   8. ¿La RAM es obligatoria para que el sistema pueda funcionar? <br>
    <input type="radio" name="8" value="0"> a) No <br>
    <input type="radio" name="8" value="1">b) Si  <br>
    <input type="radio" name="8" value="0">c) No, la cache se encarga de respaldar a la RAM <br>
   <br>
   9. ¿Se siguen fabricando los procesadores Pentium 2?  <br>
    <input type="radio" name="9" value="0"> a) Si <br>
    <input type="radio" name="9" value="1"> b) No  <br>
    <input type="radio" name="9" value="0"> c) Si, para empresas con niveles de programacion muy altos  <br>
    <br>      
   10. ¿Quien es Steve Jobs? <br>
    <input type="radio" name="10" value="1"> a) Fundador de Apple <br>
    <input type="radio" name="10" value="0"> b) Fundador de Microsoft <br>
    <input type="radio" name="10" value="0"> c) Fundador de Oracle  <br>
   <br>
  <input type="submit">
 </form>
  
   </body>
</html>
