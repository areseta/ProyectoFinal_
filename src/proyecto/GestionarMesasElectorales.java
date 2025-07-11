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
public class GestionarMesasElectorales {
   
    private ArrayList<MesaElectoral> lista;

    public GestionarMesasElectorales() 
    {
        lista = new ArrayList<>();
    }

    public ArrayList<MesaElectoral> getLista() 
    {
        return lista;
    }

    public void registrarMesa(MesaElectoral mesa) 
    {
        lista.add(mesa);
        System.out.println("Mesa registrada correctamente.");
    }

    public void modificarMesa(String codigo, String nuevaUbicacion, MiembroMesa nuevoPresidente, MiembroMesa nuevoSecretario, MiembroMesa nuevoVocal) {
        for (MesaElectoral m : lista) 
        {
            if (m.getCodigo().equalsIgnoreCase(codigo))
            {
                m.setUbicacion(nuevaUbicacion);
                m.setPresidente(nuevoPresidente);
                m.setSecretario(nuevoSecretario);
                m.setVocal(nuevoVocal);
                System.out.println("Mesa modificada correctamente.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public void eliminarMesa(String codigo) {
        Iterator<MesaElectoral> it = lista.iterator();
        while (it.hasNext()) {
            MesaElectoral m = it.next();
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                it.remove();
                System.out.println("Mesa eliminada correctamente.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public MesaElectoral buscarMesaPorCodigo(String codigo) {
        for (MesaElectoral m : lista) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                return m;
            }
        }
        return null;
    }

    public void mostrarMesas() {
        Iterator<MesaElectoral> it = lista.iterator();
        while (it.hasNext()) {
            MesaElectoral m = it.next();
            m.mostrarDatos();
        }
    }
}