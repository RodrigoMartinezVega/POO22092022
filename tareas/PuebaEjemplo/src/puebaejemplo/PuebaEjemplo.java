/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puebaejemplo;



/**
 *
 * @author Emiliano
 */
public class PuebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("--------clase Cuentahabiente----------");
        Cuentahabiente per1 =new Cuentahabiente(123456,"Matías Zepeda",100000.0f);
        System.out.println(per1);
        per1.retirarDinero(3000);
        System.out.println(per1.evaluarNivelCliente());
        
        System.out.println("\n");
        System.out.println("Arreglo de balance");
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0]= new Cuentahabiente(12345,"Rodrigo Vega",100000.0f);
        lista[1]= new Cuentahabiente(56473,"Cristiano Ronaldo",1000000000.0f);
        lista[2]= new Cuentahabiente(10456,"Paul McCartney",1000000000.0f);
        lista[3]= new Cuentahabiente(45838,"Juan Pérez",300.0f);
        lista[4]= new Cuentahabiente(45678,"Javier Talán",30000.0f);
        System.out.println("Con for each");
        for (Cuentahabiente prueba: lista) {
            System.out.println(prueba);
            System.out.println(prueba.evaluarNivelCliente());
        }
        
       
        
    }

 
    
}
