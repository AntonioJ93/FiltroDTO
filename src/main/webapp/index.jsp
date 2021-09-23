<%-- 
    Document   : index
    Created on : 22 sept. 2021, 9:44:05
    Author     : pryet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        ${bandera}
        <form action="miServlet">
            <input type="text" name="valor1" placeholder="valor 1">    
            <input type="text" name="valor2" placeholder="valor 2">  
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
