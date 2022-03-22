/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

import componentes.Actor;
import componentes.Director;
import componentes.Productora;
/**
 *
 * @author Emiliano
 */
public class Pelicula {
    private String titulo;
    private int estreno;
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
        director=new Director();
        productora=new Productora();
        actor=new Actor();
    }

    public Pelicula(String titulo, int estreno, Director director, Productora productora, Actor actor) {
        this.titulo = titulo;
        this.estreno = estreno;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    @Override
    public String toString() {
    String estado="Director: Nombre: "+this.director.getDirector1()+", Años: "+this.director.getAños()+"\n";
    estado=estado+"Productora: "+this.productora.getProductora1()+", Género: "+this.productora.getGenero()+"\n";
    estado=estado+"Actor: Nombre: "+this.actor.getActor()+", Nacimiento: "+this.actor.getNacimiento()+"\n";
    return estado;
    }

    public void triunfar(String pelicula){
        System.out.println(pelicula+this.titulo+" ha sido un éxito en taquillas");
    }
    
    public void dirigir(String pelicula){
        System.out.println(pelicula+" fue dirigida por "+this.director.getDirector1());
    }
    
    public void interpretar(String pelicula){
        System.out.println(pelicula + this.actor.getActor()+" ha interpretado el papel del murcielago de gótica");
    }
    
    public void lanzar (String pelicula){
        System.out.println(pelicula + this.productora.getProductora1()+" ha lanzado la pelicula a los cines");
    }
}
