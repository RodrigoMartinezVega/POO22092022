/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author Emiliano
 */
public class Automovil {
    private String marca; //Los atributos van en notacion lower camel case
    private String submarca;//lower camel case todas en minusculas y a partir 
                    // de la segunda palabra todo en mayusculas
    private int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, int modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", submarca=" + submarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
}

