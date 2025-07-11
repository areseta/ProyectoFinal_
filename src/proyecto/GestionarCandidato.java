/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author gilar
 */
public class GestionarCandidato {
    private ArrayList<Candidato> lista;

    public GestionarCandidato() {
        lista = new ArrayList<>();
    }

     public ArrayList<Candidato> getLista() {
     return lista;
     }
     
    public void MeterCandidato(Candidato aux) {
        lista.add(aux);
        System.out.println("Candidato registrado correctamente.");
    }
    
    public void modificarCandidato(String dni, String nuevoNombre, String nuevoApellido, String nuevoPartido) 
    {
        Iterator<Candidato> it = lista.iterator(); 

        while (it.hasNext()) 
        {
            Candidato c = it.next();

            if (c.getDni().equals(dni))
            {
                c.setNombre(nuevoNombre);
                c.setApellido(nuevoApellido);
                c.setPartidopolitico(nuevoPartido);
                System.out.println("Candidato modificado correctamente.");
                return;
            }
        }

        System.out.println("Candidato no encontrado.");
    }

    
    public void eliminarCandidato(String dni) {
        Iterator<Candidato> it = lista.iterator();
        while (it.hasNext()) {
            Candidato c = it.next();
            if (c.getDni().equals(dni)) {
                it.remove();
                System.out.println("Candidato eliminado correctamente.");
                return;
            }
        }
        System.out.println("Candidato no encontrado.");
    }
    
}
