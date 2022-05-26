/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Usuario
 */
public class TareaCifradoCesar extends JFrame{
    String  alfabeto = "abcdefghijklmnñopqrstuvwxyz";
    private JTextField cuadroMensaje;
    private JTextField cuadroDesplazamiento;
    private JLabel introducirMensaje;
    private JLabel desplazamiento;
    private JLabel mensaje;
    private JLabel m2;
    private JButton boton;

    public TareaCifradoCesar() throws HeadlessException {
        setTitle("Cifrado César");
        setSize(500, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        cuadroDesplazamiento = new JTextField(3);
        cuadroMensaje = new JTextField(25);
        boton = new JButton();
        boton.setBackground(Color.GRAY);
        boton.setOpaque(true);
        boton.setToolTipText("Presione para descifrar el mensaje");
        desplazamiento = new JLabel("Numero de desplazamiento");
        introducirMensaje = new JLabel("Escribe el mensaje");
        mensaje = new JLabel("Mensaje Cifrado : ");
        m2=new JLabel();
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(cuadroDesplazamiento);
        this.getContentPane().add(introducirMensaje);
        this.getContentPane().add(cuadroMensaje);
        this.getContentPane().add(boton);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(m2);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

         this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                char c;
                String t;
                String tc = "";

                try {
                    t = cuadroMensaje.getText();
                    t = t.toLowerCase();
                    int key = Integer.parseInt(cuadroDesplazamiento.getText());

                    for (int i = 0; i < t.length(); i++) {
                        c = t.charAt(i);
                        int pos = alfabeto.indexOf(c);

                        if (pos == -1) {
                            tc += c;
                        } else {
                            tc += alfabeto.charAt((pos + key) % alfabeto.length());
                        }

                    }
                    m2.setText(tc);
                } catch (NumberFormatException ei) {
                    System.out.println(ei.toString());
                    JOptionPane.showMessageDialog(null, "No se introdujo un valor numérico, intentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        });

    }

}
