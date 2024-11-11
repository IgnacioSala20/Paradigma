package org.example.Vista;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {


    private JPanel pnlMenu;
    private JButton registrarFinalizacionButton;
    private JButton registrarVehiculoButton;
    private JButton consultarTurnosButton;
    private JButton btnRegistrarRevision;
    private JLabel txtMENU;
    private JButton button1;
    private JButton button2;
    private JMenu hola;


    public Principal(){
        setContentPane(pnlMenu);
        setTitle("VTV");
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        btnRegistrarRevision.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RegistrarRevision dialog = new RegistrarRevision();
                dialog.setSize(600,500);
                dialog.setVisible(true);
            }
        });
    }

}
