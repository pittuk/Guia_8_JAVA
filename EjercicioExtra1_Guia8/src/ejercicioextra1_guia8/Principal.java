package ejercicioextra1_guia8;

//@author pittu
import Entidad.Alumno;
import Servicio.ServicioAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno accion = new ServicioAlumno();
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<Alumno> alumnosArg = new ArrayList();
        ArrayList<Alumno> alumnosChi = new ArrayList();
        ArrayList<Alumno> alumnosVen = new ArrayList();

        int opcion;
        do {
            System.out.println("-------------------------------");
            System.out.println("\tGestión de alumnos");
            System.out.println("-------------------------------");
            System.out.println("1 - Agregar");
            System.out.println("2 - Eliminar o modificar");
            System.out.println("3 - Mostrar Alumnos");
            System.out.println("4 - Buscar Alumno");
            System.out.println("5 - Reporte Final");
            System.out.println("6 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    String opcion2 = "";
                    
                    do {
                        Alumno a1 = accion.crearAlumno();

                        alumnos.add(a1);
                        
                        
                            if (a1.getNacionalidad().equalsIgnoreCase("Argentina")) {
                                alumnosArg.add(a1);
                            }
                            if (a1.getNacionalidad().equalsIgnoreCase("Chilena")) {
                                alumnosChi.add(a1);
                            }
                            if (a1.getNacionalidad().equalsIgnoreCase("Venezolana")) {
                                alumnosVen.add(a1);
                            }

                        
                        
                        System.out.println("¿Agregar otro alumno? SI/NO");
                        opcion2 = leer.next();

                    } while (!opcion2.equalsIgnoreCase("no"));

                    break;
                case 2:
                    accion.eliminarModificar(alumnos);
                    break;
                case 3:
                    accion.menuMostrar(alumnos);
                    break;
                case 4:
                    accion.buscarAlumno(alumnos);
                    break;
                case 5:
                    accion.reporteFinal(alumnos, alumnosArg, alumnosChi, alumnosVen);
                    break;
                case 6:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 6));

    }

}
