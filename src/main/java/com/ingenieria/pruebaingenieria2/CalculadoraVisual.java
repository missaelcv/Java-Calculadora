/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingenieria.pruebaingenieria2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author josearielpereyra
 */
public class CalculadoraVisual extends JFrame {

    public CalculadoraVisual() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setLocationRelativeTo(null);
        
        JTextField campoDeNumeros = new JTextField("0");
        campoDeNumeros.setHorizontalAlignment( SwingConstants.RIGHT);
        campoDeNumeros.setFont( new Font("Monospace", Font.PLAIN, 30));
        campoDeNumeros.setFocusable(false);
        
        JPanel panelDeBotones = new JPanel( new GridLayout(0, 4));
        
        String[] textoBotones = "M,%,C,CE,7,8,9,/,4,5,6,X,1,2,3,-,0,.,=,+".split(",");
        
        for (int i = 0; i < textoBotones.length; i++) {
            JButton botonActual = new JButton( textoBotones[i] );
            panelDeBotones.add(botonActual);
            botonActual.setFocusable(false);
        }
           
        this.add(campoDeNumeros, BorderLayout.NORTH);
        this.add(panelDeBotones, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CalculadoraVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        new CalculadoraVisual().setVisible(true);
    }
}