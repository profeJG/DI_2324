/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.joptionpaneexample;

import javax.swing.JOptionPane;

/**
 *
 * @author josegaspar
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMensaje = new javax.swing.JButton();
        jButtonConfirmacion = new javax.swing.JButton();
        jButtonEntrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo JoptionPane: José Gaspar Sánchez García");
        getContentPane().setLayout(new java.awt.GridLayout(3, 1, 20, 20));

        jButtonMensaje.setText("Mensaje");
        jButtonMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensajeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMensaje);

        jButtonConfirmacion.setText("Confirmación");
        jButtonConfirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmacion);

        jButtonEntrada.setText("Entrada");
        jButtonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrada);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensajeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Esto es un mensaje de prueba","Mensaje - Título",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButtonMensajeActionPerformed

    private void jButtonConfirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmacionActionPerformed
        // TODO add your handling code here:
        int resultado=JOptionPane.showConfirmDialog(this, "¿Realmente desea ejecutar la ACCIÓN?","Confirmación - Título",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resultado==JOptionPane.OK_OPTION)
        {
           JOptionPane.showMessageDialog(this, "Ejecutamos ACCIÓN","Mensaje - Título",JOptionPane.INFORMATION_MESSAGE); 
        }else if(resultado==JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(this, "NO ejecutamos ACCIÓN","Mensaje - Título",JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jButtonConfirmacionActionPerformed

    private void jButtonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntradaActionPerformed
        // TODO add your handling code here:
        
        String nombre;
        nombre = JOptionPane.showInputDialog(this,"Introduce tu nombre", "Título - Input Dialog",JOptionPane.QUESTION_MESSAGE);
        System.out.println("Hola "+nombre);
        JOptionPane.showMessageDialog(this, "Hola "+nombre,"Mensaje - Título",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButtonEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmacion;
    private javax.swing.JButton jButtonEntrada;
    private javax.swing.JButton jButtonMensaje;
    // End of variables declaration//GEN-END:variables
}
