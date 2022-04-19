/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author Emiliano
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad= 20;
        System.out.println("Edad = "+edad);
        Integer edad2= new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(",-,-,-,-,-,-,-,-,-,");
        //convertir Strings a entero.
        String cadena= "99";
        int altura= Integer.parseInt(cadena);
        System.out.println("Altura = "+altura);
        
        float y=Float.parseFloat(cadena);
        y = y+0.5f;
        System.out.println("Altura = "+y);
     
    }
    
}
