//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

package coleccionesalumno_03;

//@author Facundo Cruz

import Entidad.Alumno;
import Servicio.EntidadService;
import java.util.List;
import java.util.Scanner;


public class ColeccionesAlumno_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EntidadService sv = new EntidadService();
        List<Alumno> listaAlumnos = sv.crearAlumno();
        double promedio = 0;
        System.out.println("Ingrese el nombre de un alumno para calcular el promedio");
        String nombre = leer.next();
        int cont = 0;
        for (Alumno aux : listaAlumnos) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                
                promedio = sv.notaFinal(aux.getNotas());
                cont++;
            }
        }
        if (cont>0) {
            System.out.println("El promedio de " + nombre + " es "+promedio);
        }else{
            System.out.println("El alumno no ha sido encontrado");
        }
    }
   

}
