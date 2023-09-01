/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Sena
 */
public class Recepcion {
    private String rol;
    private int cedulaUsuario;

    // Constructor
     public Recepcion(String rol, int cedulaUsuario) {
        this.rol = rol;
        this.cedulaUsuario = cedulaUsuario;
    }
    //getters y setters

    public String getRol() {
        return rol;
    }

    public int getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setCedulaUsuario(int cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }
    
   
}
