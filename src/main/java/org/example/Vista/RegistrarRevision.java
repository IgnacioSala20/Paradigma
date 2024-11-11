package org.example.Vista;

import javax.swing.*;

public class RegistrarRevision extends JFrame{
    private JLabel txtNum;
    private JLabel txtRegRev;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton BUSCARButton;
    private JButton BUSCARButton1;
    private JButton BUSCARButton2;
    private JButton REGISTRARVEHICULOButton;
    private JButton REGISTRARCOBROButton;
    private JButton button6;
    private JButton ACEPTARButton;
    private JButton CONFIRMARButton;
    private JPanel pnlRegistrarRevision;

    public RegistrarRevision(){
        setContentPane(pnlRegistrarRevision);
        setTitle("Registrar Revision");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
