/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Sena
 */
public class Usuario {
    private int cedula;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;
    private String email;

    
    // Constructor,

    public Usuario(int cedula, String nombre, String apellidos, String celular, String direccion, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
    }

    Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //getters y setters
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

