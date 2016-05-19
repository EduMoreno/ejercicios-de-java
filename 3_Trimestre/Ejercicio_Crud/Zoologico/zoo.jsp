<%-- 
    Document   : zoo
    Created on : 13-may-2016, 13:33:02
    Author     : Eduardo Moreno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Zoologico </title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ZOO","root", "");
      
            Statement bd = conexion.createStatement();
        
        
         request.setCharacterEncoding("UTF-8"); %>
        <table>
            <tr id="trcabecera">
                <th id="cabecera" colspan="8">
                    Base de datos del ZOO
                </th>
            </tr>
        
            <tr id="primeraFila">
                    <td class="td1">Código</td>
                    <td>Nombre</td>
                    <td>Tipo de animal</td>
                    <td>Genero</td>
                    <td>Edad</td>
                    <td>Comida</td>
                    <td>Cuidador</td>
                    <td>Botones</td>
            </tr>


            <!-- Alta -->
            <tr>
            <form method="post" action="zoo.jsp">
                <td class="td1"><input type="number" name="codigo"  maxlength="5"></td>
                <td class="td1"><input type="text" name="nombre" maxlength="10"></td>
                <td class="td1"><input type="text" name="tipoanimal" maxlength="10"></td>
                <td class="td1"><input type="text" name="genero" size="7" maxlength="12"></td>
                <td class="td1"><input type="number" name="edad"  maxlength="4"></td> 
                <td class="td1"><input type="text" name="comida" size="7" maxlength="16"></td> 
                <td class="td1"><select name="cuidador">
                        <option>25485755D</option>
                        <option>57894562H</option>
                        <option>45752365J</option>
                        <option>54254123P</option>
                    </select></td>
                <td  class="td1"><input type="submit" value="Añadir"></td>
            </form>
            </tr>
            
        <%
            
            
            // Alta 
       
             // Comprueba si el codigo ya existe
      String consulta = "SELECT COUNT(*) FROM ANIMALES WHERE COD_ANIMAL='"
                        + request.getParameter("codigo")
                        + "'";
      
      ResultSet coincidencias = bd.executeQuery(consulta);
      coincidencias.next();
      
      if (coincidencias.getInt(1) != 0) {
        out.print("<script type=\"text/javascript\">alert(\"Lo siento, el codigo " + request.getParameter("codigo") + " ya existe\");</script>");
      } else if (request.getParameter("codigo")!= null) {
                
                String insert = "Insert INTO animales Values ("
                        + Integer.valueOf(request.getParameter("codigo")) +  ", " +
                        "'" + request.getParameter("nombre") + "', ";
                        
                if (!request.getParameter("tipoanimal").equals(null) && !request.getParameter("tipoanimal").equals("") ) {
                    
                    insert += "'" + request.getParameter("tipoanimal")  + "', ";
                    
                } else {
                    insert += "'NULL" + "', ";
                }
                
                      insert+= "'" + request.getParameter("genero") + "', ";
                        
                  if (!request.getParameter("edad").equals(null) && !request.getParameter("edad").equals("") ) {
                    
                     insert += Integer.valueOf(request.getParameter("edad"))  + ", ";
                    
                   } else {
                          insert += 0 + ", ";
                     }
                      
                      insert+=  "'" + request.getParameter("comida") + "', " +
                        "'" + request.getParameter("cuidador") + "')";
                
                
                bd.execute(insert);
                
              }            
            
          
             // Borrado 
          
         if (request.getParameter("borrado") != null) {
                
                bd.execute ("DELETE FROM ANIMALES WHERE COD_ANIMAL=" + request.getParameter("borrado"));
                
         }
            
            // Modificación 
      
            if (request.getParameter("update") != null) {

                String update = "UPDATE animales SET "
                           + "NOMBRE='" + request.getParameter("nombre1")
                           + "',TIPO_ANIMAL='" + request.getParameter("tipoanimal1")
                           + "', GENERO='" + request.getParameter("genero1")
                           + "', EDAD='" + request.getParameter("edad1")
                           + "', TIPO_COMIDA='" + request.getParameter("comida1")
                           + "', CUIDADOR='" + request.getParameter("cuidador1")
                           + "' WHERE COD_ANIMAL=" + request.getParameter("codigo1");
                                        
                bd.execute(update);
            }
            
            
            ResultSet listado = bd.executeQuery("SELECT * FROM ANIMALES");
            
            while (listado.next()) {
                
                // Linea de modificacion
                
                if (request.getParameter("codigo2") != null && listado.getString("COD_ANIMAL").equals(request.getParameter("codigo2")) ) {
                    
                    out.print("<tr><form method=\"post\" action=\"zoo.jsp\"><td class=\"td1\">" + 
                            "<input type=\"number\" name=\"codigo1\" readonly maxlength=\"5\"  value=\"" + request.getParameter("codigo2") + "\"></td>" + 
                            "<td><input type=\"text\" name=\"nombre1\" maxlength=\"10\" value=\"" + request.getParameter("nombre2") + "\"></td>" + 
                            "<td><input type=\"text\" name=\"tipoanimal1\" maxlength=\"10\" value=\"" + request.getParameter("tipoanimal2") + "\"></td>" +
                            "<td><input type=\"text\" name=\"genero1\" maxlength=\"12\" size=\"7\" value=\"" + request.getParameter("genero2") + "\"></td>" +
                            "<td><input type=\"number\" name=\"edad1\" maxlength=\"4\" value=\"" + request.getParameter("edad2") + "\"></td>" +
                            "<td><input type=\"text\" name=\"comida1\" maxlength=\"16\"size=\"7\" value=\"" + request.getParameter("comida2") + "\"></td>" +
                            "<td><select name=\"cuidador1\">");
                            if (request.getParameter("cuidador2").equals("25485755D")){
                             out.print("<option>25485755D</option><option>57894562H</option><option>45752365J</option><option>54254123P</option>");
                             }
                            if (request.getParameter("cuidador2").equals("57894562H")){
                             out.print("<option>57894562H</option><option>25485755D</option><option>45752365J</option><option>54254123P</option>");
                              }
                             if (request.getParameter("cuidador2").equals("45752365J")){
                             out.print("<option>45752365J</option><option>25485755D</option><option>57894562H</option><option>54254123P</option>");
                              }
                         
                             if (request.getParameter("cuidador2").equals("54254123P")){
                             out.print("<option>54254123P</option><option>25485755D</option><option>57894562H</option><option>45752365J</option>");
                              }

                           out.print("<td class=\"td2\"><input type=\"hidden\" name=\"update\" value=\"modifica\">" +
                                    "<input type=\"submit\" value=\"Aceptar\">" + 
                                    "<a href=\"zoo.jsp\"><input type=\"button\" value=\"Cancelar\"></a>" + 
                                    "</td></form></tr>");
                            
                } else {
                
                    out.println("<tr>" + "<td class=\"td1\">" + listado.getString("COD_ANIMAL") + "</td>" +
                            "<td>" + listado.getString("NOMBRE") + "</td>" +
                            "<td>" + listado.getString("TIPO_ANIMAL") + "</td>" +
                            "<td>" + listado.getString("GENERO") + "</td>" +
                            "<td>" + listado.getString("EDAD") + "</td>" + 
                            "<td>" + listado.getString("TIPO_COMIDA") + "</td>" + 
                            "<td>" + listado.getString("CUIDADOR") + "</td>" + 
                            "<td class=\"td2\">" + 
                            // Formulario Boton de Borrar
                            "<form method=\"post\" action=\"zoo.jsp\">" +
                            "<input type=\"hidden\" name=\"borrado\" value=\"" + listado.getString("COD_ANIMAL") + "\">" +
                            "<input type=\"submit\" value=\"Borrar\">" + "</form>" + // Fin formulario 
                            
                            // Formulario Boton de  Modificar
                            "<form method=\"post\" action=\"zoo.jsp\">" + 
                            "<input type=\"hidden\" name=\"codigo2\" value=\"" + listado.getString("COD_ANIMAL") + "\">" +
                            "<input type=\"hidden\" name=\"nombre2\" value=\"" + listado.getString("NOMBRE") + "\">" +
                            "<input type=\"hidden\" name=\"tipoanimal2\" value=\"" + listado.getString("TIPO_ANIMAL") + "\">" +
                            "<input type=\"hidden\" name=\"genero2\" value=\"" + listado.getString("GENERO") + "\">" +
                            "<input type=\"hidden\" name=\"edad2\" value=\"" + listado.getString("EDAD") + "\">" +
                            "<input type=\"hidden\" name=\"comida2\" value=\"" + listado.getString("TIPO_COMIDA") + "\">" +
                            "<input type=\"hidden\" name=\"cuidador2\" value=\"" + listado.getString("CUIDADOR") + "\">" +
                            "<input type=\"submit\" value=\"Modificar\">" + "</form>" + 
                            "</td></tr>");
                }
                
               
            } 
            
              
      %>
            
        </table>
      
      
       <table class="chica">
            <tr id="trcabecera">
                <th id="cabecera" colspan="4">
                    Base de datos de los cuidadores
                </th>
            </tr>
        
            <tr id="primeraFila">
                    <td class="td1">DNI</td>
                    <td>Nombre</td>
                    <td>Apellidos</td>
                   
            </tr>
            
            
            <% 
                
                ResultSet listado1 = bd.executeQuery ("SELECT DNI, NOMBRE, APELLIDOS FROM CUIDADORES");
		
		
               while (listado1.next()) {
			out.println("<tr>" + "<td class=\"td1\">" +  
                        listado1.getString("DNI")+ "</td>" +
                       "<td>" + listado1.getString ("NOMBRE") + "</td>" +
                        "<td>" + listado1.getString ("APELLIDOS") +  "</td>" +
                         "</tr>");
                 }  
            
  %>  
            </table>
    </body>
</html>