/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import com.sun.xml.ws.org.objectweb.asm.Type;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class UsuarioDAO {
    Conexion conexion;
    
    public UsuarioDAO(){
        conexion = new Conexion();
        
    }
    
    public Usuario login(String user, String pass, int cod){
        Usuario temp = null;
        ResultSet rs;
        try{
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{call sp_login(?,?,?)}");
            cs.setString(1,user);
            cs.setString(2,pass);
            cs.setInt(3,cod);
            rs = cs.executeQuery();
            if(rs.next()){
                temp = new Usuario();
                temp.setCuenta(rs.getString(1));
                temp.setNombre(rs.getString(2));
                temp.setCodigo(cod);
                return temp;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return temp;
    }
    
    public boolean existUsuario(String user){
        boolean resp = false;
        ResultSet rs;
        try{
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{call sp_existUsuario(?)}");
            cs.setString(1,user);
            rs = cs.executeQuery();
            if(rs.next()){
                return true; //si existe el usuario
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resp;
    }
    
    public boolean insertUsuario(String nombre, String usuario, String correo, String password){
        boolean resp = false;
        
        try{
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{call sp_insertarUsuario(?,?,?,?)}");
            cs.setString(1,nombre);
            cs.setString(2,usuario);
            cs.setString(3,correo);
            cs.setString(4,password);
            cs.execute();
            final ResultSet rs = cs.getResultSet();
            while (rs.next()) {
                System.out.println("Cadena de caracteres pasada como parametro de entrada="+rs.getInt(1));
            }
                resp = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resp;
    }
}
