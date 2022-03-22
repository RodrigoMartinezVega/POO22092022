/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Emiliano
 */
public class Productora {
    private String productora1;
    private String genero;

    public Productora() {
    }

    public Productora(String productora1, String genero) {
        this.productora1 = productora1;
        this.genero = genero;
    }

    public String getProductora1() {
        return productora1;
    }

    public void setProductora1(String productora1) {
        this.productora1 = productora1;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Productora{" + "productora1=" + productora1 + ", genero=" + genero + '}';
    }

    
    
    
}
