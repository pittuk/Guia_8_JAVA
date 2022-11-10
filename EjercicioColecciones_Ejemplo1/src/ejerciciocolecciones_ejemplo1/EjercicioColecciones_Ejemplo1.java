package ejerciciocolecciones_ejemplo1;

//@author pittu
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class EjercicioColecciones_Ejemplo1 {

    public static void main(String[] args) {
        //listas
       
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        x = 30;
         numerosA.add(x);
        x = 40;
         numerosA.add(x);
        x = 30;
         numerosA.add(x);
        x = 45;
         numerosA.add(x);
        
        numerosA.remove(4);
        System.out.println("-------Listas-------");
        for (Integer mostrar:numerosA) {
            System.out.println(mostrar);
        }

        //conjuntos
        HashSet<Integer> numerosB = new HashSet();
        int y = 30;
         numerosB.add(y);
        y = 20;
         numerosB.add(y);
        y = 10;
         numerosB.add(y);
        y = 70;
         numerosB.add(y);
        y = 90;
         numerosB.add(y);

        System.out.println("-------Conjuntos-------");
        numerosB.remove(90);
        for (Integer mostrar:numerosB) {
            System.out.println(mostrar);
        }

        //mapas
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 95447827;
        String nombreAlumno = "Luis";
        alumnos.put(dni, nombreAlumno);
        dni=95253685;
        nombreAlumno="jose";
        alumnos.put(dni, nombreAlumno);
        dni=95253683;
        nombreAlumno="Juan";
        alumnos.put(dni, nombreAlumno);
        dni=95253684;
        nombreAlumno="Carlos";
        alumnos.put(dni, nombreAlumno);
        dni=95253681;
        nombreAlumno="Miguel";
        alumnos.put(dni, nombreAlumno); //agregamos la llave y el valor
        alumnos.remove(95253681);
        System.out.println("-------Mapas-------");
        for (Map.Entry<Integer, String> mostrar : alumnos.entrySet()) {
            System.out.println("Documento: " + mostrar.getKey()
                    + ", Nombre: "+mostrar.getValue());
            
            
            
        }

    }

}
