/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class MiembroMesa {
     private String nombre;
    private String apellido;
    private String DNI;
    private String tipo; 

    public MiembroMesa(String nombre, String apellido, String DNI, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.tipo = tipo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
      public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    
     public void mostrar() {
        System.out.println(this.tipo + ": " + getNombreCompleto());
    }
    
}
