/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposicion;

import Libro.LibroPrincipal;

/**
 *
 * @author Emiliano
 */
public class Tarea {
      public static void main(String[] args) {
        LibroPrincipal lib= new LibroPrincipal();
        lib.setTitulo("La divina comedia");
        System.out.println("Titulo: "+lib.getTitulo());
        lib.setGenero("Epopeya");
        System.out.println("Genero: "+lib.getGenero());
        lib.getAutor().setNombre("Dante Alighieri");
        lib.getAutor().setNacionalidad("Italiano");
        lib.getEditorial().setEdit("Mirlo");
        lib.getEditorial().setFundacion(2015);
        System.out.println(lib);
        lib.leer("El libro ");
        lib.fallecer("El autor ");
        lib.publicar("La editorial ");
          System.out.println();
        
      
        
      }
      
}
