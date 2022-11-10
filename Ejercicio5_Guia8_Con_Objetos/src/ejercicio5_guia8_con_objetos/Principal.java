

package ejercicio5_guia8_con_objetos;

//@author pittu

import Servicios.ServicioPaises;


public class Principal {

    public static void main(String[] args) {
        ServicioPaises accion=new ServicioPaises();
        
        accion.cargarPais();
        accion.mostrarPais();
        accion.ordenarPais();
        accion.eliminarPais();
        
        
        
        
    }

}
