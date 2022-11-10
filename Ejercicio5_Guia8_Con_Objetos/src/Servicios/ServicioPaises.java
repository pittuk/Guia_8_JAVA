/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioPaises {

    HashSet<Paises> p1 = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPais() {
        String opcion = "";
        do {
            Paises o1 = new Paises();
            System.out.println("Ingrese un pais");
            o1.setNombre(leer.next());
            p1.add(o1);
            System.out.println("¿Ingresar otro país? SI/NO");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("no"));
    }

    public void mostrarPais() {
        System.out.println("-----------------");
        System.out.println("Paises ingresados");
        System.out.println("-----------------");
        for (Paises mostrar : p1) {
            System.out.println(mostrar.getNombre());
        }
    }
    //comparador
    public static Comparator<Paises> alfabeticoNombre = new Comparator<Paises>() {
        @Override
        public int compare(Paises t, Paises t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
   

    public void ordenarPais() {
        System.out.println("-----------------");
        System.out.println("Paises ordenados alfabeticamente");
        System.out.println("-----------------");
        ArrayList<Paises> p2 = new ArrayList(p1);
        Collections.sort(p2, alfabeticoNombre);
        for (Paises mostrar : p2) {
            System.out.println(mostrar.getNombre());
        }
    }

    public void eliminarPais() {
        System.out.println("-----------------");
        System.out.println("Ingrese el país que desea eliminar");
        String paisBuscar = leer.next();
        int cont = 0;

        Iterator<Paises> it = p1.iterator();

        while (it.hasNext()) {
            String aux = it.next().getNombre();

            if (aux.equalsIgnoreCase(paisBuscar)) {
                it.remove();
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El país no esta en la lista");

        } else {
            System.out.println(paisBuscar + " fue eliminado");
        }
        
        mostrarPais();
    }

}
