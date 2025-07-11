/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class PartidoPolitico {
    
     private String nombre;
    private String sigla;
    private String logo;
    private String representanteLegal;

    public PartidoPolitico(String nombre, String sigla, String logo, String representanteLegal) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representanteLegal = representanteLegal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
    
        public void mostrarDatos() {
        System.out.println("Partido: " + this.nombre + "-" + this.sigla );
        System.out.println("Logo: " + this.logo);
        System.out.println("Representante Legal: " + this.representanteLegal);
        System.out.println("----------------------------");
    }
    
    
    
    
}
