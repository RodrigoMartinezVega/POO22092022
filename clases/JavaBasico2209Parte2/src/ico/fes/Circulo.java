/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author david
 */
public class Circulo implements Figura{
    
    //este es un pojo por su sencilla estructura y es diferente a un EJB JAVA ENTERPRISE BEANS
    
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return 3.1416f * (this.radio * this.radio);
    }          // /\
               // |
    //principio de diseño "0, 1 e infinito" solo los valores 0, 1 e infinito son validos
    //para usarse en la codificacion de algoritmos.
    //en lenguaje de programaicon debe proporcionar un mecanismo para evitar usar literales numericasen elprograma
    
}
