/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentayprueba;

/**
 *
 * @author Emiliano
 */
public class Cuentahabiente {
    private int id;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int id, String nombre, float balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "id=" + id + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
        
     public void retirarDinero( float monto ){
            //código para restarle el monto al balance
            this.balance -= monto;
            System.out.println("Dinero retirado= "+this.balance);
        
    }
        
    public String evaluarNivelCliente(){
            /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
            return this.balance >= 50000?"Cliente Premium":"Cliente Regular";
            
    }

}
