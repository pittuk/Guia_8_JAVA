/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import Utilidades.Comparadores;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        Alumno a1 = new Alumno(); //obejto alumno
        //pedimos datos para crear el alumno
        System.out.println("Ingrese nombre del alumno");
        a1.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        a1.setApellido(leer.next());
        System.out.println("Ingrese nacionalidad");
        int opcion;
        do {
            System.out.println("\tSeleccione nacionalidad ");
            System.out.println("1 - Argentina");
            System.out.println("2 - Chilena");
            System.out.println("3 - Venezolana");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    a1.setNacionalidad("Argentina");
                    opcion=5;
                    break;
                case 2:
                     a1.setNacionalidad("Chilena");
                     opcion=5;
                    break;
                case 3:
                     a1.setNacionalidad("Venezolana");
                     opcion=5;
                    break;
               default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
        
        
        
        System.out.println("Ingrese día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        int anio = leer.nextInt();
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);
        a1.setFechaNacimiento(fechaIngresada);

        //retornamos el arraylist
        return a1;
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        //dandole formato a la fecha
        String formato = "dd-MM-yyyy";
        SimpleDateFormat fechaSimple = new SimpleDateFormat(formato);
        String fechaSimplificada;

        //mostramos por como fueron ingresados
        for (Alumno aux : alumnos) {
            System.out.println("-----------");
            System.out.println("Nombre: " + aux.getNombre() + " " + aux.getApellido());
            System.out.println("Nacionalidad: " + aux.getNacionalidad());
            fechaSimplificada = fechaSimple.format(aux.getFechaNacimiento());
            System.out.println("Fecha de nacimiento: " + fechaSimplificada);
        }

    }

    public void menuMostrar(ArrayList<Alumno> alumnos) {
        int opcion;
        do {
            System.out.println("-------------------------------");
            System.out.println("\tMostrar Alumnos ");
            System.out.println("-------------------------------");
            System.out.println("1 - Orden alfabetico nombre");
            System.out.println("2 - Orden alfabetico apellido");
            System.out.println("3 - Salir al menú principal");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    //mostramos por orden alfabetico de nombres
                    Collections.sort(alumnos, Comparadores.alfabeticoNombre);
                    mostrarAlumnos(alumnos);
                    break;
                case 2:
                    //mostramos por orden alfabetico de apellido
                    Collections.sort(alumnos, Comparadores.alfabeticoApellido);
                    mostrarAlumnos(alumnos);
                    break;
                case 3:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 3));

    }

    public void eliminarModificar(ArrayList<Alumno> alumnos) {

        int opcion;
        do {
            System.out.println("-------------------------------");
            System.out.println("\tEliminar o modificar alumno");
            System.out.println("-------------------------------");
            System.out.println("1 - Eliminar");
            System.out.println("2 - Editar");
            System.out.println("3 - Salir al menú principal");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    eliminarAlumno(alumnos);
                    break;
                case 2:
                    modificarAlumno(alumnos);
                    break;
                case 3:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 3));

    }

    public void eliminarAlumno(ArrayList<Alumno> alumnos) {

        System.out.println("Ingrese nombre del alumno a elimnar");
        String alumnoEliminar = leer.next();
        int cont = 0;
        for (Alumno aux : alumnos) {
            if (aux.getNombre().equalsIgnoreCase(alumnoEliminar)) {
                alumnos.remove(aux);
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println("¡El alumno " + alumnoEliminar + " ¡no pudo ser encontrado!");
        } else {
            System.out.println("¡El alumno " + alumnoEliminar + " fue elimando!");

        }
    }

    public void modificarAlumno(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese nombre del alumno a modificar");
        String alumnoModificar = leer.next();

        int cont = 0;
        for (Alumno aux : alumnos) {
            if (aux.getNombre().equalsIgnoreCase(alumnoModificar)) {
                cont++;
                int opcion;

                System.out.println("-------------------------------");
                System.out.println("\t¿Qué desea editar? ");
                System.out.println("-------------------------------");
                System.out.println("1 - Editar Nombre");
                System.out.println("2 - Editar Apellido");
                System.out.println("3 - Editar Nacionalidad");
                System.out.println("4 - Editar Fecha de nacimiento");
                System.out.println("Elija su opcion:");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese nuevo nombre");
                    aux.setNombre(leer.next());
                } else if (opcion == 2) {
                    System.out.println("Ingrese nuevo apellido");
                    aux.setApellido(leer.next());
                } else if (opcion == 3) {
                    System.out.println("Ingrese nueva nacionalidad");
                    aux.setNacionalidad(leer.next());
                } else if (opcion == 4) {
                    System.out.println("Ingrese nuevo día de nacimiento");
                    int dia = leer.nextInt();
                    System.out.println("Ingrese nuevo mes");
                    int mes = leer.nextInt();
                    System.out.println("Ingrese nuevo año");
                    int anio = leer.nextInt();
                    Date fechaIngresada2 = new Date(anio - 1900, mes - 1, dia);
                    aux.setFechaNacimiento(fechaIngresada2);
                } else {
                    System.out.println("Opcion no valida");
                }

            }

        }
        if (cont == 0) {
            System.out.println("El alumno " + alumnoModificar + " ¡No pudo ser encontrado!");
        } else {
            System.out.println("El alumno " + alumnoModificar + " ¡Fue actualizado!");

        }

    }

    public void buscarAlumno(ArrayList<Alumno> alumnos) {
        //dandole formato a la fecha
        String formato = "dd-MM-yyyy";
        SimpleDateFormat fechaSimple = new SimpleDateFormat(formato);
        String fechaSimplificada;

        System.out.println("Ingrese nombre del alumno a buscar");
        String alumnoBuscar = leer.next();

        for (Alumno aux : alumnos) {
            if (aux.getNombre().equalsIgnoreCase(alumnoBuscar)) {

                System.out.println("-----------");
                System.out.println("Nombre: " + aux.getNombre() + " " + aux.getApellido());
                System.out.println("Nacionalidad: " + aux.getNacionalidad());
                fechaSimplificada = fechaSimple.format(aux.getFechaNacimiento());
                System.out.println("Fecha de nacimiento: " + fechaSimplificada);
                Date fechaActual = new Date();
                System.out.println("Edad: " + (fechaActual.getYear() - aux.getFechaNacimiento().getYear()));
                break;
            }

        }

    }
    
    public void reporteFinal(ArrayList<Alumno> alumnos,ArrayList<Alumno> alumnosArg,ArrayList<Alumno> alumnosChi,ArrayList<Alumno> alumnosVen){
        
        Date fechaActual = new Date();
         int cont=0,cont2=0;       
        for (Alumno aux : alumnos) {
            if ((fechaActual.getYear() - aux.getFechaNacimiento().getYear())>25) {
                cont++;
            }
            if (aux.getApellido().substring(0, 1).equalsIgnoreCase("l")||aux.getApellido().substring(0, 1).equalsIgnoreCase("p")) {
               cont2++; 
            }
            
            
            
        }
        System.out.println("Hay "+cont+" mayores de 25 años");
        System.out.println("-----------------------");
        System.out.println("hay " +cont2+" alumnos con apellidos que empiezan con L o P");
        System.out.println("-----------------------");
        System.out.println("hay " + alumnosArg.size()+ " Alumnos Argentinos");
        System.out.println("-----------------------");
        System.out.println("hay " + alumnosChi.size()+ " Alumnos Chilenos");
        System.out.println("-----------------------");
        System.out.println("hay " + alumnosVen.size()+ " Alumnos Venezolanos");
        
    
    
    
    
    
    }

}
