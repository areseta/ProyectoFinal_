/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Ariana Egoavil Olive
 */
public class GestionarOperadores 
{
        private Operador[] listaOperadores;
        private int puntero;
        
        public GestionarOperadores()
        {
            listaOperadores = new Operador[10];  // 10: num de personas admitidas max
            puntero = 0;
            
            listaOperadores[puntero++] = new Operador("nombre", "1234");
            listaOperadores[puntero++] = new Operador("name2", "cod2");
            
        }
        
        public boolean validarCodigo(String codIngresado)
        {
            for (int i = 0; i < puntero; i++) {
                //Operador listaOperadore = listaOperadores[i]
                if (listaOperadores[i].getCodigo().equals(codIngresado))
                {
                    return true;
                }
            }
            return false;
        
        }
    
}
