/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class GestionarPartidosPoliticos {
    
     private PartidoPolitico[] partidos;
     private int puntero;
     
     
         public GestionarPartidosPoliticos() {
        partidos = new PartidoPolitico[50]; 
        puntero = 0;
    }

    public PartidoPolitico[] getPartidos() {
        return partidos;
    }

    public void setPartidos(PartidoPolitico[] partidos) {
        this.partidos = partidos;
    }

    public int getPuntero() {
        return puntero;
    }

    public void setPuntero(int puntero) {
        this.puntero = puntero;
    }
         
    public void registrarPartido(PartidoPolitico p) {
        if (puntero < partidos.length) {
            partidos[puntero] = p;
            puntero++;
            System.out.println("Partido registrado correctamente.");
        } else {
            System.out.println("Límite de partidos alcanzado.");
        }
    }     
         
     public void modificarPartido(String nombre, String nuevaSigla, String nuevoLogo, String nuevoRepresentante) {
        for (int i = 0; i < puntero; i++) {
            if (partidos[i].getNombre().equalsIgnoreCase(nombre)) {
                partidos[i].setSigla(nuevaSigla);
                partidos[i].setLogo(nuevoLogo);
                partidos[i].setRepresentanteLegal(nuevoRepresentante);
                System.out.println("Partido modificado correctamente.");
                return;
            }
        }
        System.out.println("Partido no encontrado.");
    }     
    
     public void eliminarPartido(String nombre) {
        for (int i = 0; i < puntero; i++) {
            if (partidos[i].getNombre().equalsIgnoreCase(nombre)) {
                partidos[i] = partidos[puntero - 1]; 
                partidos[puntero - 1] = null;
                puntero--;
                System.out.println("Partido eliminado.");
                return;
            }
        }
        System.out.println("Partido no encontrado.");
    }
    
    public void mostrarPartidos() {
        if (puntero == 0) {
            System.out.println("No hay partidos registrados.");
        } else {
            for (int i = 0; i < puntero; i++) {
                partidos[i].mostrarDatos();
            }
        }
    }
    
    
}
