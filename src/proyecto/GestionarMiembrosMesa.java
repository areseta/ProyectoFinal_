/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class GestionarMiembrosMesa {
    
    private MiembroMesa[] miembros;
    private int puntero;
       
    public MiembroMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getPuntero() {
        return puntero;
    }

    public void setPuntero(int puntero) {
        this.puntero = puntero;
    }

     public void registrarMiembro(MiembroMesa miembro) 
    {
        if (puntero < miembros.length) 
        {
            miembros[puntero++] = miembro;
        }
    }  
    
     public GestionarMiembrosMesa() {
        miembros = new MiembroMesa[90]; 
        puntero = 0;
    }
    
    
     public void modificarMiembro(String nombreBuscado, String nuevoNombre, String nuevoApellido, String nuevoTipo) {
        for (int i = 0; i < puntero; i++) {
            if (miembros[i].getNombreCompleto().equalsIgnoreCase(nombreBuscado)) {
                miembros[i].setNombre(nuevoNombre);
                miembros[i].setApellido(nuevoApellido);
                miembros[i].setTipo(nuevoTipo);
                System.out.println("Miembro modificado");
                return;
            }
        }
        System.out.println("Miembro no encontrado");
    }
    
     public void eliminarMiembro(String nombreBuscado) {
        for (int i = 0; i < puntero; i++) {
            if (miembros[i].getNombreCompleto().equalsIgnoreCase(nombreBuscado)) {
                miembros[i] = miembros[puntero - 1];
                miembros[puntero - 1] = null;
                puntero--;
                System.out.println("Miembro eliminado");
                return;
            }
        }
        System.out.println("El Miembro no se encontro");
    }
    
     public void mostrarMiembros() {
        if (puntero == 0) {
            System.out.println("No hay miembros registrados");
        } else {
            for (int i = 0; i < puntero; i++) {
                miembros[i].mostrar();
            }
        }
    }
    
  
}
