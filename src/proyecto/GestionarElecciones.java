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
    private Eleccion[] elecciones;
    private int puntero;

    public GestionarElecciones() {
        elecciones = new Eleccion[100];
        puntero = 0;
    }

    public void MeterEleccion(Eleccion e) {
        if (puntero < elecciones.length) {
            elecciones[puntero] = e;
            puntero++;
        }
    }

    public Eleccion[] getArrayElecciones() {
        return elecciones;
    }

    public int getPuntero() {
        return puntero;
    }

    void setPuntero(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
