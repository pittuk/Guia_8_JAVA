/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pittu
 */

public class ServicioPelicula {
    //scanner para la carga de peliculas
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //arraylist donde guardaremos las peliculas
    ArrayList<Pelicula> peliculas=new ArrayList();
    
    //metodo para cargar peliculas
    
    public void cargarPeliculas(){
    String opcion="";
    
        do {
            Pelicula p1=new Pelicula();
            System.out.println("Ingrese el título");
            p1.setTitulo(leer.next());
            System.out.println("Ingrese el director");
            p1.setDirector(leer.next());
            System.out.println("Ingrese la duración");
            p1.setDuracion(leer.nextDouble());
            
            peliculas.add(p1);
            System.out.println("---------------------------------");
            System.out.println("¿Quieres agregar otra pelicula? si/no");
            opcion=leer.next();
            
        } while (opcion.equalsIgnoreCase("si"));
     }
    
    //metodo para mostrar peliculas
    public void mostrarPeliculas(){
        
        for (Pelicula p1 : peliculas) {
            System.out.println("----------------------");
            System.out.println("Título: "+ p1.getTitulo());
            System.out.println("Director: "+ p1.getDirector());
            System.out.println("Duración: "+ p1.getDuracion()+" horas");
            
        }
     }
    
    //metodo para mostrar peliculas mayores a 1 hora
    public void mayorA1(){
        for (Pelicula p1 : peliculas) {
            if (p1.getDuracion()>1) {
                System.out.println(p1);
            }
        }
    }
    
    //metodo ordenar, llama a todos los comparadores
    public void ordenar(){
        
        //ordenamos de mayor a menor por duracion
        Collections.sort(peliculas, Comparadores.mayorMenorDuracion);
        System.out.println("----------------------");
        System.out.println("Peliculas ordenadas por duracion de mayor a menor");
        for (Pelicula p1 : peliculas) {
            
            System.out.println("----------------------");
            System.out.println("Título: "+ p1.getTitulo());
            System.out.println("Director: "+ p1.getDirector());
            System.out.println("Duración: "+ p1.getDuracion()+" horas");
        }
        //ordenamos de menor a mayor por duracion
        Collections.sort(peliculas, Comparadores.menorMayorDuracion);
        System.out.println("----------------------");
        System.out.println("Peliculas ordenadas por duracion de menor a mayor");
        for (Pelicula p1 : peliculas) {
            
            System.out.println("----------------------");
            System.out.println("Título: "+ p1.getTitulo());
            System.out.println("Director: "+ p1.getDirector());
            System.out.println("Duración: "+ p1.getDuracion()+" horas");
        }
        //ordenamos alfabeticamente titulo
        Collections.sort(peliculas, Comparadores.alfabeticoTitulo);
        System.out.println("----------------------");
        System.out.println("Peliculas ordenadas alfabeticamente por titulo");
        for (Pelicula p1 : peliculas) {
            
            System.out.println("----------------------");
            System.out.println("Título: "+ p1.getTitulo());
            System.out.println("Director: "+ p1.getDirector());
            System.out.println("Duración: "+ p1.getDuracion()+" horas");
        }
        //ordenamos alfabeticamente director
        Collections.sort(peliculas, Comparadores.alfabeticoDirector);
        System.out.println("----------------------");
        System.out.println("Peliculas ordenadas alfabeticamente por director");
        for (Pelicula p1 : peliculas) {
            
            System.out.println("----------------------");
            System.out.println("Título: "+ p1.getTitulo());
            System.out.println("Director: "+ p1.getDirector());
            System.out.println("Duración: "+ p1.getDuracion()+" horas");
        }
    }
}
