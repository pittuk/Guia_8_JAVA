/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author pittu
 */
public class ServicioPais {

    HashSet<String> paises = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarPais() {
        String opcion = "";
        do {
            System.out.println("Ingrese un país");
            paises.add(leer.next());
            System.out.println("Ingresar otro país SI/NO");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("no"));
    }

    public void mostrarPaises() {
        System.out.println("--------------");
        System.out.println("Lista de paises");
        System.out.println("--------------");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void ordenarPaises() {
        System.out.println("--------------");
        System.out.println("Paises ordenados alfabeticamente");
        System.out.println("--------------");
        ArrayList<String> paisesOrdenados = new ArrayList(paises);
        Collections.sort(paisesOrdenados);
        for (String p1 : paisesOrdenados) {
            System.out.println(p1);
        }
    }

    public void eliminarPais() {
        int cont=0;
        System.out.println("Ingrese el país que desea eliminar");
        String pEliminar=leer.next();
        for (String p : paises) {
            if (pEliminar.equalsIgnoreCase(p)) {
                paises.remove(p);
                cont++;
            }
            
        }
        if (cont==0) {
            System.out.println("El país no se encontro en la lista");
            
        }else{
            System.out.println(pEliminar+" fue eliminado");
        
        }
        
       mostrarPaises(); 
        
    }

}
