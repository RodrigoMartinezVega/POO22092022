/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class JavaBasico2209parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //excepciones
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("pedro");
        nombres.add("carlos");
        nombres.add("jair");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
            
        }
        
        System.out.println("-------------------");
        System.out.println("que numero de lista eres?");
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;
        
        String elNombre="";
        try {
            seleccion = teclado.nextInt();
            elNombre=nombres.get(seleccion);
            
        } catch(InputMismatchException ie){
            System.out.println("debe teclear valores numericos");
        }catch(IndexOutOfBoundsException ioe){
             System.out.println("error debe ser entre 0 y 33");
            elNombre=nombres.get(0);
        }
       
        catch (Exception e) {
            System.out.println("generico");
            elNombre=nombres.get(1);
        }finally{
            System.out.println(elNombre);
        }
        //System.out.println(nombres.get(seleccion));
        System.out.println("continua el programa");
        
        Aritmetica cal = new Aritmetica(4, 2);
        System.out.println(cal.getA()+"+"+cal.getB()+"="+ cal.sumar());
        
        try {
            System.out.println(cal.getA()+"/"+cal.getB()+"="+cal.dividir());
        } catch (Exception e) {
            System.out.println("error de aritmetica2"
                    + "");
        }
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("area del cuadrado: "+cuad.calcularArea());
        System.out.println("area del ciculo: "+circ.calcularArea());
        
        System.out.println("--------------------");
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setCarrera("ico");
        eda.setDisciplinaDeportiva("futbol");
        eda.setEdad(18);
        eda.setGeneroArtistico("guitarra");
        eda.setNombre("david");
        eda.setNumeroCuenta("319097944");
        
        System.out.println("fin del programa");
       
    }
    
}
