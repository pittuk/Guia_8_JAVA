/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidad.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioProductos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> products = new HashMap();

    public void agregarProductos() {
        String opcion = "";
        String nombre = "";
        do {
            Productos p1 = new Productos();
            System.out.println("Ingresa el nombre del producto");
            p1.setNombre(leer.next());

            System.out.println("Ingrese el precio del producto");
            p1.setPrecio(leer.nextDouble());

            //AGREGAMOS OBJETO AL MAP
            products.put(p1.getNombre(), p1.getPrecio());
            System.out.println("------------");
            System.out.println("¿Agregar otro producto? SI/NO");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("si"));
    }

    public void mostrarProductos() {
        System.out.println("------------");
        for (Map.Entry<String,Double> entry : products.entrySet()) {
            System.out.println("Producto: " + entry.getKey()
                    + " | Precio: " + entry.getValue());
        }
        System.out.println("------------");
    }

    public void eliminarProducto() {
        int cont = 0;
        System.out.println("Ingrese el producto que desea borrar");
        String buscar = leer.next();
        buscar = buscar.toLowerCase();

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (buscar.equals(entry.getKey())) {
                products.remove(entry.getKey());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No se encontro el producto");
        } else {

            System.out.println(buscar + " ¡ELIMINADO!");
        }

        
    }

    public void editarProducto() {
        int cont = 0;
        System.out.println("Ingrese nombre de producto ha editar");
        String editar = leer.next();
        editar = editar.toLowerCase();

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (editar.equals(entry.getKey())) {
                System.out.println("------------");
                System.out.println("Producto: " + entry.getKey() + " | Precio: " + entry.getValue());
                System.out.println("------------");
                System.out.println("Ingrese su nuevo precio");
                entry.setValue(leer.nextDouble());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No se encontro el producto");
        } else {

            System.out.println(editar + " ¡ACTUALIZADO!");
        }

        
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Agregar Productos");
            System.out.println("2 - Actualizar Precio");
            System.out.println("3 - Eliminar Producto");
            System.out.println("4 - Mostrar Productos");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    agregarProductos();
                    break;
                case 2:
                    editarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));

    }
}
