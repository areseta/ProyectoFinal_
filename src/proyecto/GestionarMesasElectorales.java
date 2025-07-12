/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */

public class GestionarMesasElectorales {

    private MesaElectoral[] arrayMesas;
    private int puntero;

    public GestionarMesasElectorales() {
        arrayMesas = new MesaElectoral[100];  
        puntero = 0;
    }

    public void registrarMesaElectoral(MesaElectoral mesa) {
        if (puntero < arrayMesas.length) {
            arrayMesas[puntero] = mesa;
            puntero++;
            System.out.println("Mesa registrada correctamente.");
        } else {
            System.out.println("No hay espacio para registrar más mesas.");
        }
    }

    public void modificarMesa(String codigo,
                              String nuevaUbicacion,
                              MiembroMesa nuevoPresidente,
                              MiembroMesa nuevoSecretario,
                              MiembroMesa nuevoVocal) {

        for (int i = 0; i < puntero; i++) {
            if (arrayMesas[i].getCodigo().equalsIgnoreCase(codigo)) {
                arrayMesas[i].setUbicacion(nuevaUbicacion);
                arrayMesas[i].setPresidente(nuevoPresidente);
                arrayMesas[i].setSecretario(nuevoSecretario);
                arrayMesas[i].setVocal(nuevoVocal);
                System.out.println("Mesa modificada correctamente.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public void eliminarMesa(String codigo) {
        for (int i = 0; i < puntero; i++) {
            if (arrayMesas[i].getCodigo().equalsIgnoreCase(codigo)) {
                // mover la última mesa al lugar eliminado
                arrayMesas[i] = arrayMesas[puntero - 1];
                arrayMesas[puntero - 1] = null;
                puntero--;
                System.out.println("Mesa eliminada correctamente.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public MesaElectoral buscarMesaPorCodigo(String codigo) {
        for (int i = 0; i < puntero; i++) {
            if (arrayMesas[i].getCodigo().equalsIgnoreCase(codigo)) {
                return arrayMesas[i];
            }
        }
        return null;
    }

    public MesaElectoral getMesa(int index) {
    if (index >= 0 && index < puntero) {
        return arrayMesas[index];
    }
    return null;
}

    
    public MesaElectoral[] getArrayMesas() {
        return arrayMesas;
    }

    public int getPuntero() {
        return puntero;
    }

    
    
    public void mostrarMesas() {
        for (int i = 0; i < puntero; i++) {
            arrayMesas[i].mostrarDatos();
        }
    }
}
