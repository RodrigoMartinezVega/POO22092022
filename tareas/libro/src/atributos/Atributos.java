/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos ;

import java.awt.Color;

/**
 *
 * @author Emiliano
 */
public class Atributos {
   private String autor;
   private String subgenero;
   private Color color;
   private String titulo;
   private int año;

    public Atributos() {
    }

    public Atributos(String autor, String subgenero, Color color, String titulo, int año) {
        this.autor = autor;
        this.subgenero = subgenero;
        this.color = color;
        this.titulo = titulo;
        this.año = año;
    }

 
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
  
    public void hojear(String sujeto){
    System.out.println(sujeto + this.titulo + " ha cambiado de pagina");
}
   public void cerrar(String sujeto2){
    System.out.println("El libro "+ this.titulo + " se ha cerrado");
    
}
 public void abrir(String sujeto3){
    System.out.println("El libro "+ this.titulo + " se ha abierto");
}
 
 public void leer(String sujeto4){
    System.out.println("El libro "+ this.titulo + " se esta leyendo");
}

}
