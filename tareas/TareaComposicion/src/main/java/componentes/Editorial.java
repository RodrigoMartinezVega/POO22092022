/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Emiliano
 */
public class Editorial {
    String edit;
    int fundacion;

    public Editorial() {
    }

    public Editorial(String edit, int fundacion) {
        this.edit = edit;
        this.fundacion = fundacion;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "edit=" + edit + ", fundacion=" + fundacion + '}';
    }

    
   
    
    
}
