/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.validacionejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author josegaspar
 */
public class ValidacionTradicional extends javax.swing.JFrame {
    private boolean validarFormulario()
    {
        String nombre=jTextFieldNombre.getText();
        int edad=0;
        
        if(nombre==null || "".equals(nombre))
        {
            JOptionPane.showMessageDialog(this, "El nombre es un campo obligatorio", "Error: Nombre vacio",JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: El nombre es un campo obligatorio");
            return false;
        }
        
        try{
            edad=Integer.parseInt(jTextFieldEdad.getText());
        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Revise la edad", "Error: La edad introducida no es un número",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        System.out.println("Edad: "+edad);
        
        
        return true;
    }
    /**
     * Creates new form ValidacionTradicional
     */
    public ValidacionTradicional() {
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

        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2, 10, 5));

        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre);
        getContentPane().add(jTextFieldNombre);

        jLabelEdad.setText("Edad:");
        getContentPane().add(jLabelEdad);
        getContentPane().add(jTextFieldEdad);
        getContentPane().add(jLabel3);

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonValidar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        // TODO add your handling code here:
        if(validarFormulario()){
            System.out.println("Los datos introducidos son correctos");
            JOptionPane.showMessageDialog(this,"Los datos introducidos son correctos", "Información validación", JOptionPane.INFORMATION_MESSAGE);
        }
    
        
    }//GEN-LAST:event_jButtonValidarActionPerformed

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
            java.util.logging.Logger.getLogger(ValidacionTradicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidacionTradicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidacionTradicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidacionTradicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidacionTradicional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
