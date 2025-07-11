/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ariana Egoavil Olive
 */
public class GestionarActasElectorales
{
    private ArrayList<ActaElectoral> lista;

    public GestionarActasElectorales() 
    {
        this.lista = new ArrayList<>();
    }

    public ArrayList<ActaElectoral> getLista() 
    {
        return lista;
    }

    public void registrarActa(ActaElectoral acta) 
    {
        lista.add(acta);
        System.out.println("Acta electoral registrada correctamente.");
    }

    public void modificarActa(String codigoMesa, String nuevoTitulo, String nuevaFecha, 
                                                   String nuevaHora,   String nuevoLugar, 
                                                   int nuevosRegistrados, String nuevaFirma, String nuevoSello,
                                                        String nuevasObservaciones) {

       Iterator<ActaElectoral> it = lista.iterator();

       while (it.hasNext()) {
           ActaElectoral a = it.next();

           if (a.getMesa().getCodigo().equalsIgnoreCase(codigoMesa)) {
               a.setTitulo(nuevoTitulo);
               a.setFecha(nuevaFecha);
               a.setHora(nuevaHora);
               a.setLugar(nuevoLugar);
               a.setTotalVotantesRegistrados(nuevosRegistrados);
               a.setFirma(nuevaFirma);
               a.setSello(nuevoSello);
               a.setObservaciones(nuevasObservaciones);

               System.out.println("Acta modificada correctamente.");
               return;
           }
       }

       System.out.println("No se encontró un acta con ese código de mesa.");
   }


    public void eliminarActa(String codigoMesa)
    {
        Iterator<ActaElectoral> puntero = lista.iterator();
        while (puntero.hasNext()) 
        {
            ActaElectoral a = puntero.next();
            if (a.getMesa().getCodigo().equalsIgnoreCase(codigoMesa)) {
                puntero.remove();
                System.out.println("Acta eliminada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un acta con ese código de mesa.");
    }
    
    
}
