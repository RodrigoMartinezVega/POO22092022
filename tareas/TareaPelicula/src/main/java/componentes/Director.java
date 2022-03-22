/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Emiliano
 */
public class Director {
    private String director1;
    private int años;

    public Director() {
    }

    public Director(String director1, int años) {
        this.director1 = director1;
        this.años = años;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getDirector1() {
        return director1;
    }

    public void setDirector1(String director1) {
        this.director1 = director1;
    }

    @Override
    public String toString() {
        return "Director{" + "director1=" + director1 + ", a\u00f1os=" + años + '}';
    }
  
     
    
}
