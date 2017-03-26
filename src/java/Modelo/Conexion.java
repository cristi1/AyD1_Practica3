/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Conexion {
    public Conexion(){
        
    }
    
    public Connection getConexion(){
        Connection cn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoFiusac","root","admin");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return cn;
    }
}
