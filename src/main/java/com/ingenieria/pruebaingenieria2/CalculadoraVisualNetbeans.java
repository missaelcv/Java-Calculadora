/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ingenieria.pruebaingenieria2;

/**
 *
 * @author josearielpereyra
 */
public class CalculadoraVisualNetbeans extends javax.swing.JFrame {
        String memoria1;
        String signo;
        String memoria2;
    /**
     * Creates new form CalculadoraVisual
     */
    public CalculadoraVisualNetbeans() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        campoDeNumeros = new javax.swing.JTextField();
        panelDeBotones = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 300));
        setPreferredSize(new java.awt.Dimension(250, 300));

        campoDeNumeros.setFont(new java.awt.Font("Monospaced", 0, 30)); // NOI18N
        campoDeNumeros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoDeNumeros.setText("0");
        campoDeNumeros.setFocusable(false);
        campoDeNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeNumerosActionPerformed(evt);
            }
        });
        getContentPane().add(campoDeNumeros, java.awt.BorderLayout.PAGE_START);

        panelDeBotones.setLayout(new java.awt.GridLayout(0, 4));

        jButton21.setForeground(new java.awt.Color(0, 0, 204));
        jButton21.setText("CE");
        panelDeBotones.add(jButton21);

        jButton18.setForeground(new java.awt.Color(0, 0, 204));
        jButton18.setText("C");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton18);

        jButton19.setForeground(new java.awt.Color(0, 0, 204));
        jButton19.setText("Clear");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton19);

        jButton20.setForeground(new java.awt.Color(0, 0, 204));
        jButton20.setText("x2");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton20);

        jButton17.setForeground(new java.awt.Color(0, 0, 204));
        jButton17.setText("%");
        panelDeBotones.add(jButton17);

        jButton22.setForeground(new java.awt.Color(0, 0, 204));
        jButton22.setText("(");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton22);

        jButton23.setForeground(new java.awt.Color(0, 0, 204));
        jButton23.setText(")");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton23);

        jButton24.setForeground(new java.awt.Color(0, 0, 204));
        jButton24.setText("+/-");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton24);

        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("7");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton1);

        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("8");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton2);

        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("9");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton3);

        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("/");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton4);

        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setText("4");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton5);

        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("5");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton6);

        jButton7.setForeground(new java.awt.Color(0, 0, 204));
        jButton7.setText("6");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton7);

        jButton8.setForeground(new java.awt.Color(0, 0, 204));
        jButton8.setText("X");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton8);

        jButton9.setForeground(new java.awt.Color(0, 0, 204));
        jButton9.setText("1");
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton9);

        jButton10.setForeground(new java.awt.Color(0, 0, 204));
        jButton10.setText("2");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton10);

        jButton11.setForeground(new java.awt.Color(0, 0, 204));
        jButton11.setText("3");
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton11);

        jButton12.setForeground(new java.awt.Color(0, 0, 204));
        jButton12.setText("-");
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton12);

        jButton13.setForeground(new java.awt.Color(0, 0, 204));
        jButton13.setText("0");
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton13);

        jButton14.setForeground(new java.awt.Color(0, 0, 204));
        jButton14.setText(".");
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton14);

        jButton15.setForeground(new java.awt.Color(0, 0, 204));
        jButton15.setText("=");
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton15);

        jButton25.setForeground(new java.awt.Color(0, 0, 204));
        jButton25.setText("+");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        panelDeBotones.add(jButton25);

        getContentPane().add(panelDeBotones, java.awt.BorderLayout.CENTER);
        getContentPane().add(jSeparator2, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jSeparator3, java.awt.BorderLayout.LINE_END);

        jMenu1.setText("File");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Nuevo ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Copiar");
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Pegar");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Historial");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Ultimo Resultado");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Resultado Totales");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       campoDeNumeros.setText(campoDeNumeros.getText() + "6");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        campoDeNumeros.setText(campoDeNumeros.getText() + "9");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void campoDeNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeNumerosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        campoDeNumeros.setText(campoDeNumeros.getText() + "8");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          campoDeNumeros.setText(campoDeNumeros.getText() + "7");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        campoDeNumeros.setText(campoDeNumeros.getText() + "4");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        campoDeNumeros.setText(campoDeNumeros.getText() + "5");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       // campoDeNumeros.setText(jButton9.getText());
        campoDeNumeros.setText(campoDeNumeros.getText() + "1");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        campoDeNumeros.setText(campoDeNumeros.getText() + "2");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        campoDeNumeros.setText(campoDeNumeros.getText() + "3");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        campoDeNumeros.setText(campoDeNumeros.getText() + "0");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         //Boton Punto(.)
         String cadena; 
         cadena = campoDeNumeros.getText();
         
         if(cadena.length() <= 0) {
        campoDeNumeros.setText(jButton14.getText());}
         
         else {
             if (!existepunto(campoDeNumeros.getText())) {
                 campoDeNumeros.setText(campoDeNumeros.getText() + ".");
             }
         }
    }//GEN-LAST:event_jButton14ActionPerformed

    public static boolean existepunto(String cadena){
            boolean resultado;
            resultado = false;
            
            for (int i = 0; i < cadena.length(); i++) {
                     if(cadena.substring(i, i + 1).equals("."+".")){
                         resultado = true;
                         break;
            }
         }
            return resultado;
    }
            
            
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        //Boton de Borra (CLEAR)
        String cadena;
        cadena = campoDeNumeros.getText();
        
        if(cadena.length() >0) {
            cadena = cadena.substring( 0, cadena.length() -1);
            campoDeNumeros.setText(cadena);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       campoDeNumeros.setText(jButton22.getText());
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        campoDeNumeros.setText(jButton23.getText());
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
         //Boton de Sumer (+)
        if (campoDeNumeros.getText().equals("")) {
           String memoria1 = campoDeNumeros.getText();
           String signo = "+";
           campoDeNumeros.setText("");
       }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        campoDeNumeros.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       //Boton x2 (x2)
        String cadena;
        Double numero;
        cadena = campoDeNumeros.getText();
        if (cadena.length()>0) {
            numero=1/(Double.parseDouble(cadena));
            campoDeNumeros.setText(numero.toString());
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       //Boton Signo (+/-)
        Double numero;
        String cadena;
        
        cadena= campoDeNumeros.getText();
        if(cadena.length()>0)
        {
            numero=(-1)*Double.parseDouble(cadena);
            campoDeNumeros.setText(numero.toString());
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       //Boton de Restar (-)
        if (campoDeNumeros.getText().equals("")) {
           String memoria1 = campoDeNumeros.getText();
           String signo = "-";
           campoDeNumeros.setText("");
       }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         //Boton de Multiplicar (X)
        if (campoDeNumeros.getText().equals("")) {
           memoria1 = campoDeNumeros.getText();
           signo = "*";
           campoDeNumeros.setText("");
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         //Boton de Dividir (/)
        if (campoDeNumeros.getText().equals("")) {
           memoria1 = campoDeNumeros.getText();
           signo = "/";
           campoDeNumeros.setText("");
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String resultado;
         memoria2 = campoDeNumeros.getText();
         
        
        if(memoria2.equals("")) {
            resultado = calculadora(memoria1, memoria2, signo);
            campoDeNumeros.setText(resultado);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

   public static String calculadora(String memoria1, String memoria2, String signo)
   {
       Double resultado = 0.0;
       String respuesta;
       
       if (signo.equals("-")) {
           resultado = Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
       }
       
       if (signo.equals("+")) {
           resultado = Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
       }
       
       if (signo.equals("*")) {
           resultado = Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
       }
       
       if (signo.equals("/")) {
           resultado = Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
       }
       
       respuesta = resultado.toString();
       return respuesta;
       
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVisualNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVisualNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVisualNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVisualNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraVisualNetbeans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDeNumeros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelDeBotones;
    // End of variables declaration//GEN-END:variables
}
