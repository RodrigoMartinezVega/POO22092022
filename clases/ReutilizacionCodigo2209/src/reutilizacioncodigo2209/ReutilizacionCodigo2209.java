/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author Emiliano
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        
        /*JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
         Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //ejercicio establecer mouse marca logitech tipo optico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        Computadora compu2 = new Computadora("Apple", "MacBook Pro", 
                new Monitor("toshiba",14),
                new Mouse("Acteck", "optico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 2.4f));
        
         compu2.setRaton(new Mouse("apple", "Tocuh"));
         System.out.println(compu2);
         
         System.out.println("----------------------------------------");
         Alumno alu1=new Alumno();
         alu1.setNombre("Jose");
         alu1.setEdad(13);
         
         Alumno alu2 = new Alumno("319097944", "ico", "jose", 20);
         System.out.println(alu2);
         
         System.out.println("-----------composicion y herencia en la misma clase--------------------------------");
         
         Servidor server = new Servidor();
         server.setNumeroTarjetasRed(2);
         server.setMarca("HP");
         server.getRaton().setMarca("Logitech");
         server.getRaton().setTipo("optico");
         
         System.out.println("------------ejemplo polimorfismo------------");
         Perro dog = new Perro("bull dog", "5 estrellas", 4);
         Animal animal = new Animal(4);
         dog.emitirSonido();
         animal.emitirSonido();
       
    }  
    
}
