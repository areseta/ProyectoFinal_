/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class Eleccion {
    
    private String fecha;
    private String tipo; // "Municipal", "Nacional", "Referéndum"
    

    public Eleccion(String fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrar(GestionarCandidato c) {
        System.out.println("Tipo de elección: " + this.tipo);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Candidatos:");
        c.mostrarCandidatos(); 
    }
    
    
    
    
}

    

