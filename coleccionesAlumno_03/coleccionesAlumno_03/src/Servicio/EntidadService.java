//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//@author Facundo Cruz

public class EntidadService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public List<Alumno> crearAlumno(){
        List<Alumno> alumnos = new ArrayList(); 
        
        char resp='S';
        while (resp=='S') {
            Alumno a1 = new Alumno();
            System.out.println("Ingrese el nombre");
            a1.setNombre(leer.next());
            System.out.println("Ingrese 3 notas");
            for (int i = 0; i < 3; i++) {
                System.out.println("Nota "+(i+1));
                a1.getNotas().add(leer.nextInt());
            }
            alumnos.add(a1);
            System.out.println("¿Deseas cargar otro alumno?(S/N)");
            resp = leer.next().toUpperCase().charAt(0);
        }
        return alumnos;
    }
    
    
    public double notaFinal(List<Integer> notas){
        double notaF= 0;
        for (Integer aux : notas) {
            notaF += aux;
        }
        
        return notaF / 3;
    }
    
    
}
