/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.


 */
package ejercicio1y2_guia8;

//@author pittu
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1y2_Guia8 {

    public static void main(String[] args) {
        int cont = 0;
        ArrayList<String> Razas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opciones;

        do {
            System.out.println("Ingrese la raza");
            Razas.add(leer.next());
            System.out.println("Quiere agregar otra raza");
            opciones = leer.next();

        } while (!opciones.equalsIgnoreCase("no"));

        System.out.println("-----------------------------------------------------");
        for (String aux : Razas) {
            System.out.println(aux);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Hay " + Razas.size() + " Razas en la lista");
        System.out.println("-----------------------------------------------------");

        System.out.println("Ingrese la raza a buscar");
        String razaBuscar = leer.next();

        Iterator<String> it = Razas.iterator();

        while (it.hasNext()) {
            String aux2 = it.next();

            if (aux2.equalsIgnoreCase(razaBuscar)) {
                it.remove();
                cont++;

            }

        }
        if (cont > 0) {
            System.out.println("-----------------------------------------------------");
            System.out.println("La raza se encontro " + cont + " veces en la lista");
            System.out.println("Se elimino la raza de la lista");
            System.out.println("-----------------------------------------------------");

        } else {

            System.out.println("No se encontro la raza en la lista");
            System.out.println("-----------------------------------------------------");

        }

        Collections.sort(Razas);
        for (String aux : Razas) {
            System.out.println(aux);
        }
        

        System.out.println("Hay " + Razas.size() + " razas en la lista");

    }

}
