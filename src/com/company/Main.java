package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                IniciodeSesión inicio = new IniciodeSesión();
                JFrame ventana = new JFrame("Inicio de Sesion");
                ventana.setContentPane(inicio.getPanel());
                ventana.pack();
                ventana.setVisible(true);
            }
        });
    }
}
