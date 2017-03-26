<%-- 
    Document   : index
    Created on : 22/03/2017, 11:52:33 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--meta http-equiv="Content-Type" content="text/html; charset=UTF-8"-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>bancoFiusac</title>
    </head>
    <body>
        <h2>Practica3 Analisis y Diseño de Sistemas 1</h2>
        <h1>bancoFiusac</h1>
        <h2>Login</h2>
        <form action = "loginControlador.do" method = "post">
            Codigo: <input type ="text" name ="txtCode" placeholder="Introduzca codigo"/><br /><br/><br/>
            Usuario: <input type ="text" name ="txtUser" placeholder="Introduzca usuario"/><br /><br/><br/>
            Contraseña: <input type ="password" name ="txtPassword" placeholder="Introduzca contraseña"/><br /><br/><br/>
            <input type ="submit" value ="Entrar"/><br/><br/>
            <a href = "registro.jsp">Registrarme</a>
        </form>
        
    </body>
</html>
