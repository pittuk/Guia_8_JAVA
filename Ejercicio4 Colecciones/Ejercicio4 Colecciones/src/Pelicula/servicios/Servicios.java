/*
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Pelicula.servicios;

import Comparadores.Comparador;
import Pelicula.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Servicios {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> Pelis = new ArrayList();
    public void pedirPeliculas(){
        String opc= null;
        do{
            Pelicula p1 = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula");
            p1.setTitulo(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p1.setHoras(leer.nextDouble());
            System.out.println("Ingrese el director de la pelicula");
            p1.setDirector(leer.next());
            Pelis.add(p1);
            System.out.println("Quiere ingresar una nueva pelicula? (Si/No)");
            opc= leer.next();
        }while(!opc.equalsIgnoreCase("no"));
        
    }
    public void mostrarPelis(){
        for (Pelicula aux : Pelis) {
            System.out.println(aux);
        }
        
    }    
    public void pelis1hr(){
        for (Pelicula aux : Pelis) {
            if (aux.getHoras()>= 1){
                System.out.println(aux);
            }
        }
    }
    public void pelisOrdDuracion (){
        Collections.sort(Pelis, Comparador.ordenarPorDuracionAsc);
        System.out.println("Peliculas ordenadas por Duracion Ascendente");
        mostrarPelis();
         System.out.println("------------------");
        Collections.sort(Pelis, Comparador.ordenarPorDuracionDesc);
        System.out.println("Peliculas ordenadas por Duracion Descendente");
        mostrarPelis();  
    }
    public void pelisOrdDirector(){
        Collections.sort(Pelis, Comparador.ordenarPorDirector);
        System.out.println("Peliculas ordenadas por nombre del director");
        mostrarPelis();
    }
    public void pelisOrdTitulo(){
        Collections.sort(Pelis, Comparador.ordenarPorTitulo);
        System.out.println("Peliculas ordenadas por orden alfabetico ");
        mostrarPelis();
    }
}

