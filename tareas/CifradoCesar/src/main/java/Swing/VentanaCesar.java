/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import com.sun.source.tree.CatchTree;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Emiliano
 */
public class VentanaCesar extends JFrame {

    private JTextField cuadro;
    private JTextField cuadro2;
    private JButton boton;
    private JLabel resultado;
    private JLabel resultado2;
    String abcdario = "abcdefghijklmnñopqrstuvwxyz";
    private JLabel mensaje;
    private JLabel mensaje2;
    

    public VentanaCesar() throws HeadlessException {
        
        setTitle("Cifrado de mensaje Cesar");
        setSize(1000, 100);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        cuadro2 = new JTextField(50);
        cuadro2.setBackground(Color.WHITE);
        cuadro2.setOpaque(true);
        boton = new JButton("Cifrar");
        boton.setBackground(Color.GREEN);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para cifrar el mensaje :D");
        resultado = new JLabel("Tipo de desplazamiento: ");
        resultado2 = new JLabel("Escriba el mensaje: ");
        mensaje = new JLabel("El mensaje con cifrado Cesar es: ");
        mensaje2 = new JLabel();
        this.getContentPane().add(resultado);
        this.getContentPane().add(cuadro);
        this.getContentPane().add(resultado2);
        this.getContentPane().add(cuadro2);
        this.getContentPane().add(boton);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(mensaje2);
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
                String textoCifrado = "";
                char caracter;
                String texto;

                try {
                    texto = cuadro2.getText();
                    texto = texto.toLowerCase();
                    int llave = Integer.parseInt(cuadro.getText());

                    for (int i = 0; i < texto.length(); i++) {
                        caracter = texto.charAt(i);
                        int num = abcdario.indexOf(caracter);

                        if (num == -1) {
                            textoCifrado += caracter;
                        } else {
                            textoCifrado += abcdario.charAt((num + llave) % abcdario.length());
                        }

                    }
                    mensaje2.setText(textoCifrado);
                } catch (NumberFormatException ei) {
                    System.out.println(ei.toString());
                    JOptionPane.showMessageDialog(null, "No se introdujo un valor numérico, intentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        });
    }
}
