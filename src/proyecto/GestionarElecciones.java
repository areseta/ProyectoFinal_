/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class GestionarElecciones {
    private Eleccion[] elecciones = new Eleccion[100];
    private int puntero;

    public GestionarElecciones() {
        puntero = 0;
    }

    public void insertarEleccion(Eleccion e) {
        if (puntero < elecciones.length) {
            elecciones[puntero] = e;
            puntero++;
        } else {
            System.out.println("No se puede agregar más elecciones (límite alcanzado).");
        }
    }

    public boolean eliminarEleccionPorFecha(String fecha) {
        for (int i = 0; i < puntero; i++) {
            if (elecciones[i].getFecha().equals(fecha)) {
                for (int j = i; j < puntero - 1; j++) {
                    elecciones[j] = elecciones[j + 1];
                }
                elecciones[puntero - 1] = null; // Limpiar última posición
                puntero--;
                return true;
            }
        }
        return false;
    }

    public Eleccion[] getArrayElecciones() {
        return elecciones;
    }

    public int getPuntero() {
        return puntero;
    }
}