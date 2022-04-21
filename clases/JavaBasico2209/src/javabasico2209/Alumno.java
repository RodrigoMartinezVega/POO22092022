/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author Emiliano
 */
public class Alumno {
    private String numerioCuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numerioCuenta, int semestre, float promedio) {
        this.numerioCuenta = numerioCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumerioCuenta() {
        return numerioCuenta;
    }

    public void setNumerioCuenta(String numerioCuenta) {
        this.numerioCuenta = numerioCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numerioCuenta=" + numerioCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar(int minutos){
        System.out.println("Estudiando ... "+"minutos");
    }
    
    public String evaluarDesempenio(){
        return this.promedio >8.0f?"Sobresaliente":"Regular";
        
    }
    
    
}
