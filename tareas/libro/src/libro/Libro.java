/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

import java.awt.Color;
import atributos.Atributos;
/**
 *
 * @author Emiliano
 */
public class Libro {
    
    public static void main(String[] args) {
        // TODO code application logic here
     Atributos fantasia= new Atributos();
    fantasia.setSubgenero("Alta fantasia");
        System.out.println("Subgenero: "+fantasia.getSubgenero());
    fantasia.setTitulo("El señor de los anillos");
        System.out.println("Titulo: "+fantasia.getTitulo());
    fantasia.setAño(1954);
        System.out.println("Año: "+fantasia.getAño());
    fantasia.setAutor("J.R.R. Tolkien");
        System.out.println("Autor: "+fantasia.getAutor());
    fantasia.setColor(Color.red);
        System.out.println("Color: "+fantasia.getColor());
    fantasia.hojear("El libro ");
    fantasia.cerrar("El libro ");
    
     Atributos suspenso= new Atributos();
    suspenso.setSubgenero("Espionaje");
        System.out.println("Subgenero: "+suspenso.getSubgenero());
    suspenso.setTitulo("El espia que surgio del frio");
        System.out.println("Titulo: "+suspenso.getTitulo());
    suspenso.setAño(1963);
        System.out.println("Año: "+suspenso.getAño());
    suspenso.setAutor("John le Carre");
        System.out.println("Autor: "+suspenso.getAutor());
    suspenso.setColor(Color.black);
        System.out.println("Color: "+suspenso.getColor());
     suspenso.abrir("El libro ");
     suspenso.leer("El libro ");
    }
 
}
