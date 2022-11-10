

package ejercicio4_guia8;

//@author pittu

import Entidad.Pelicula;
import Servicio.ServicioPelicula;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
       
        ServicioPelicula accion=new ServicioPelicula();
        
        accion.cargarPeliculas();
        accion.mostrarPeliculas();
        System.out.println("----------------------");
        accion.mayorA1();
        System.out.println("----------------------");
        accion.ordenar();
        
        
        
        
        
    }

}
