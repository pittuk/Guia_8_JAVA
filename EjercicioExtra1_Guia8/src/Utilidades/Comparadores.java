/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilidades;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author pittu
 */

public class Comparadores {
    //ordenamos alfabeticamente por nombre
    public static Comparator<Alumno> alfabeticoNombre=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t.getNombre().compareTo(t1.getNombre());

        }
    };
     //ordenamos alfabeticamente por apellido
    public static Comparator<Alumno> alfabeticoApellido=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getApellido().compareTo(t.getApellido());

        }
    };

}
