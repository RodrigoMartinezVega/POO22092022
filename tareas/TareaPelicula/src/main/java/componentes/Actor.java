/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Emiliano
 */
public class Actor {
    private String actor;
    private String nacimiento;

    public Actor() {
    }

    public Actor(String actor, String nacimiento) {
        this.actor = actor;
        this.nacimiento = nacimiento;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Actor{" + "actor=" + actor + ", nacimiento=" + nacimiento + '}';
    }

    
    
}
