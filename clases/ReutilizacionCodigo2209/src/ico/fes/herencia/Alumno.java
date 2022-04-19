/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author Emiliano
 */
public class Alumno extends Persona {
    String numeroCuenta;
    String carrera;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public Alumno(String numeroCuenta, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public Alumno(String string, String ico_José_Perez, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + '}';
    }
    public void estudiar(int cantidad){
        System.out.println(this.getNombre()+"Esta estudiando"+cantidad+"Hrs.");
    }
     
    //Polimorfismo por sobre escritura
    @Override
    public void dormir(){
        System.out.println("El estudiante "+this.getNombre()+" Está durmiendo 5 horas . . .");
    }
    
    //polimorfismo por sobrecargar
    public void dormir(int horasEstudio){
        int horasDormir=8;
        System.out.println(this.getNombre()+" está durmiendo "+(horasDormir-horasEstudio)+" Horas");
    }
}
