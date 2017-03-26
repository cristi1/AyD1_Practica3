<%-- 
    Document   : registro
    Created on : 23/03/2017, 11:55:21 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--meta http-equiv="Content-Type" content="text/html; charset=UTF-8"-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>REGISTRO</title>
    </head>
    <body>
        <h2>Practica3 Analisis y Diseño de Sistemas 1</h2>
        <h1>bancoFiusac</h1>
        <h2>Registro</h2>
        <form action = "registroControlador.do" method = "post">
            Nombre: <input type ="text" name ="txtName" placeholder="Introduzca nombre"/><br /><br/><br/>
            Usuario: <input type ="text" name ="txtUser" placeholder="Introduzca usuario"/><br /><br/><br/>
            Correo: <input type ="text" name ="txtEmail" placeholder="Introduzca correo"/><br /><br/><br/>
            Contraseña: <input type ="password" name ="txtPassword" placeholder="Introduzca contraseña"/><br /><br/><br/>
            <input type ="submit" value ="Registrar"/><br/><br/>
            <a href = "index.jsp">Inicio </a>
        </form>
    </body>
</html>
