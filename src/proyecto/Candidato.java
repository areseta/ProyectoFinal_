/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class Candidato {

    static Object getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nombre;
    private String apellido;
    private String dni;
    private String partidopolitico;

    public Candidato(String nombre, String apellido, String dni, String partidopolitico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.partidopolitico = partidopolitico;
    }

    @Override
public String toString() {
    return nombre + " " + apellido;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartidopolitico() {
        return partidopolitico;
    }

    public void setPartidopolitico(String partidopolitico) {
        this.partidopolitico = partidopolitico;
    }

     public String  getNombreCompleto() {
        return this.nombre +" "+ this.apellido;
    }
    
     public void mostrarDatos() {
        System.out.println("El nombre y apellido son: "+this.nombre+" "+this.apellido);
         System.out.println("el dni es: "+this.dni);
         System.out.println("el partido politico es: "+this.partidopolitico);
        

    }
    
    

}

    

