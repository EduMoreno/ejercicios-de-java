<%-- 
    Mejora la aplicación anterior de tal forma que no haga falta introducir el día de la semana
    en que cae el día 1 y el número de días que tiene el mes. El programa debe deducir estos
    datos del mes y el año. Pista: puedes usar la clase Calendar (java.util.Calendar).
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 12</title>
    </head>
    <LINK REL="stylesheet" HREF="css.css" TYPE="text/css">
    <body>
        
     <%
      int mes = Integer.parseInt(request.getParameter("mes"));
      int ano = Integer.parseInt(request.getParameter("ano"));
     String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
     Calendar miCalendario = Calendar.getInstance();
      
      miCalendario.set(ano, mes - 1, 1); // los meses van de 0 a 11

      int dias = miCalendario.getActualMaximum(Calendar.DAY_OF_MONTH);

      int diasemana = miCalendario.get(Calendar.DAY_OF_WEEK);
      if (diasemana == 1) {
        diasemana = 7; // el domingo es día 1
      } else {
        diasemana--;
      }

       %> 
        
    <% out.print("<h1>"+ nombreMes[mes - 1] + " " + ano);%>
    
    <table>
      <tr>
          <th>Lunes</th>
          <th>Martes</th>
          <th>Miércoles</th>
          <th>Jueves</th>
          <th>Viernes</th>
          <th>Sábado</th>
          <th>Domingo</th>
      </tr>
      <tr>
      <%
          int contador = 0;
      for (int n = 1; n < dias + diasemana; n++) {
        if (n >= diasemana) {
          out.print("<td>" + (n - diasemana + 1) + "</td>");
        } else {
          out.print("<td> </td>"); 
        }
        contador++;
        if (contador == 7) { 
          out.println("</tr><tr>");
          contador = 0;
        }
      }
      %>
      </tr>
    </table>
    </body>
</html>
