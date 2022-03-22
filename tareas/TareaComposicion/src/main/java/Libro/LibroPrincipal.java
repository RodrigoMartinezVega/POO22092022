/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import componentes.Autor;
import componentes.Editorial;

/**
 *
 * @author Emiliano
 */
public class LibroPrincipal {
    String titulo;
    String genero;
    Autor autor;
    Editorial editorial;

    public LibroPrincipal() {
        autor=new Autor();
        editorial=new Editorial();
        
    }

    public LibroPrincipal(String titulo, String genero, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    @Override
    public String toString() {
        String estado="Autor: Nombre: "+this.autor.getNombre()+", Nacionalidad: "+this.autor.getNacionalidad()+"\n";
        estado=estado+"Editorial: Nombre: "+this.editorial.getEdit()+", Fundación: "+this.editorial.getFundacion()+"\n";
        return estado;
    }

   public void publicar(String editorial){
       System.out.println(editorial+ this.editorial.getEdit() + " ha publicado el libro "+this.titulo);
   }
   
   public void leer(String libro){
       System.out.println(libro+ " ha sido leido más de 5 veces");
    }
   
   public void fallecer(String libro){
       System.out.println(libro+this.autor.getNombre()+" ya ha fallecido");
   }
   
  
}
