/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private int codigo;
    private String nombre;
    private String cuenta;

    public Usuario() {
        this.codigo = -1;
        this.nombre = "";
        this.cuenta = "";
    }
    
    public Usuario(int codigo, String nombre, String cuenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

}
