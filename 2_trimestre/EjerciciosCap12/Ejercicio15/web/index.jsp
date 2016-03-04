<%-- 
Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los primos deberán
aparecer en un color diferente al resto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 15</title>
    </head>
    <body>
     <%
    boolean primo = true;
   
    for (int n = 1; n <= 100; n++) {
        int num = (int)(Math.random() * 200) + 1;
        primo = true;
      
      for (int e = 2; e < n; e++) {
        if ((n % e) == 0) {
        primo = false;
        }
      }
      
       if (primo) {
           out.print("<font color=\"red\">" + num + "</font> ");
       } 
        else {
            out.print(num + " ");
        }      
    }    
      %>
     
  </body>
</html>
  
   

