package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {


    private JPanel panelPrincipal;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JMenu hola;


    public Principal(){
        setContentPane(panelPrincipal);
        setTitle("VTV");
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
