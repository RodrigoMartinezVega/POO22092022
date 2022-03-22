/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapelicula;

import pelicula.Pelicula;

/**
 *
 * @author Emiliano
 */
public class TareaPelicula {
   public static void main(String[] args) {
    Pelicula peli=new Pelicula();
    peli.setTitulo("The Batman");
       System.out.println("Título: "+peli.getTitulo());
    peli.setEstreno(2022);
       System.out.println("Estreno: "+peli.getEstreno());
    peli.getDirector().setDirector1("Matthew George Reeves");
    peli.getDirector().setAños(55);
    peli.getProductora().setProductora1("DC films");
    peli.getProductora().setGenero("Superheroes");
    peli.getActor().setActor("Robert Douglas Thomas Pattinson");
    peli.getActor().setNacimiento("Londres, Inglaterra");
       System.out.println(peli);
    peli.triunfar("La pelicula ");
    peli.dirigir("La pelicula ");
    peli.interpretar("El actor ");
    peli.lanzar("La productora ");
    System.out.println();
  }  
}
