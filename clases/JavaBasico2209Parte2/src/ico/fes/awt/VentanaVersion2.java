/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author david
 */
public class VentanaVersion2 extends Frame{
    private TextField cuadro;
    private Button boton1;
    private Label etiqueta;
    private FlowLayout layout;

    public VentanaVersion2() throws HeadlessException {
        this.setTitle("ventana 2");
        this.setSize(300, 220);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        cuadro=new TextField(15);
        this.add(cuadro);
        boton1= new Button("presioname");
        this.add(boton1);
        etiqueta= new Label("texto inicial");
        this.add(etiqueta);
        
        //objeto anonimo
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Hola "+cuadro.getText());
                System.out.println("coordenada "+e.getX());
                System.out.println("coordenada"+ e.getY());
                System.out.println("boton presionado"+e.getButton());
            }
            
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.cuadro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }
        
                    
        });
        
        this.setVisible(true);
        
        
    }
    
    
    
}
