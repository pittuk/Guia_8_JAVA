/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Alumno> a1=new ArrayList();
    
    public void crearAlumno(ArrayList<Alumno> a1) {
        int opcion = 0;
        
        do {
           
            Alumno alumno1 = new Alumno();
            System.out.println("Ingrese nombre del alumno");
            
            alumno1.setNombre(leer.next());
            
            for (int i = 0; i < alumno1.getNotas().length; i++) {
                System.out.println("Ingrese nota " + (i + 1));
                alumno1.getNotas()[i] = leer.nextInt();
                
            }
            a1.add(alumno1);
            
            System.out.println("Ingrese 1 para agregar otro alumno o 0 para salir");
            opcion = leer.nextInt();
            
        } while (opcion == 1);
        
        
        
        
        
        //return a1;
        
       
      
        
    }
    
    public void mostrarAlumnos(ArrayList<Alumno> a1) {
        
        for (Alumno alumno1 : a1) {
            System.out.println(alumno1.getNombre());
            
            for (int i = 0; i < 3; i++) {
                System.out.println(alumno1.getNotas()[i]);
                
            }
            
        }
        
    }
    
    public void notaFinal(ArrayList<Alumno> a1) {
        int promedio=0;
        System.out.println("Ingrese nombre de alumno");
        String buscar = leer.next();
        
        for (Alumno alumno1 : a1) {
            if (alumno1.getNombre().equalsIgnoreCase(buscar)) {
                
                promedio=alumno1.getNotas()[0]+alumno1.getNotas()[1]+alumno1.getNotas()[2];
                promedio=promedio/3;
                System.out.println("El promedio de "+alumno1.getNombre()+" es "+promedio);
            }
            
        }
        
        
        
        
    }
    
}
