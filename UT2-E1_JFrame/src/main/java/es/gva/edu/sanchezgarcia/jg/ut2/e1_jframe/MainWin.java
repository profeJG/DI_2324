/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.ut2.e1_jframe;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author josegaspar
 */
public class MainWin extends javax.swing.JFrame {

    private String dimensiones="300x300";
    private String posiciones="Centro";
    private final Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
    private int dimension=300;
    
    /**
     * Creates new form MainWin
     */
    public MainWin() {
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

        jPanelArriba = new javax.swing.JPanel();
        btnArribaIzquierda = new javax.swing.JButton();
        btnArribaDerecha = new javax.swing.JButton();
        jPanelCentro = new javax.swing.JPanel();
        tglDimension = new javax.swing.JToggleButton();
        jPanelAbajo = new javax.swing.JPanel();
        btnAbajoIzquierda = new javax.swing.JButton();
        btnAbajoDerecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dimensiones y posiciones – Centro – 300×300.");
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName("fraVentana"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 300));
        setSize(new java.awt.Dimension(300, 300));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        btnArribaIzquierda.setText("Arriba Izquierda");
        btnArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaIzquierdaActionPerformed(evt);
            }
        });

        btnArribaDerecha.setText("Arriba Derecha");
        btnArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaDerechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelArribaLayout = new javax.swing.GroupLayout(jPanelArriba);
        jPanelArriba.setLayout(jPanelArribaLayout);
        jPanelArribaLayout.setHorizontalGroup(
            jPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArribaIzquierda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(btnArribaDerecha)
                .addContainerGap())
        );
        jPanelArribaLayout.setVerticalGroup(
            jPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArribaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArribaDerecha)
                    .addComponent(btnArribaIzquierda)))
        );

        getContentPane().add(jPanelArriba, java.awt.BorderLayout.PAGE_START);

        tglDimension.setText("Aumenta Dimensión");
        tglDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglDimensionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCentroLayout = new javax.swing.GroupLayout(jPanelCentro);
        jPanelCentro.setLayout(jPanelCentroLayout);
        jPanelCentroLayout.setHorizontalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCentroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tglDimension)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelCentroLayout.setVerticalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCentroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tglDimension)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelCentro, java.awt.BorderLayout.CENTER);

        btnAbajoIzquierda.setText("Abajo Izquierda");
        btnAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoIzquierdaActionPerformed(evt);
            }
        });

        btnAbajoDerecha.setText("Abajo Derecha");
        btnAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoDerechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAbajoLayout = new javax.swing.GroupLayout(jPanelAbajo);
        jPanelAbajo.setLayout(jPanelAbajoLayout);
        jPanelAbajoLayout.setHorizontalGroup(
            jPanelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbajoIzquierda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(btnAbajoDerecha)
                .addContainerGap())
        );
        jPanelAbajoLayout.setVerticalGroup(
            jPanelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAbajoLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbajoIzquierda)
                    .addComponent(btnAbajoDerecha))
                .addContainerGap())
        );

        getContentPane().add(jPanelAbajo, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaIzquierdaActionPerformed
        // TODO add your handling code here:
        this.setLocation(0, 0);
        this.posiciones="Arriba izquierda";
        this.setTitle("Dimensiones y posiciones – "+posiciones+" – "+dimensiones);
        
    }//GEN-LAST:event_btnArribaIzquierdaActionPerformed

    private void btnAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoIzquierdaActionPerformed
        // TODO add your handling code here:
        int y=(int)this.screen.getHeight()-dimension/2;
        this.setLocation(0, y);
        this.posiciones="Abajo izquierda";
        this.setTitle("Dimensiones y posiciones – "+posiciones+" – "+dimensiones);
    }//GEN-LAST:event_btnAbajoIzquierdaActionPerformed

    private void btnArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaDerechaActionPerformed
        // TODO add your handling code here:
        int x=(int)this.screen.getWidth()-dimension/2;
        this.setLocation(x, 0);
        this.posiciones="Arriba derecha";
        this.setTitle("Dimensiones y posiciones – "+posiciones+" – "+dimensiones);
    }//GEN-LAST:event_btnArribaDerechaActionPerformed

    private void btnAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoDerechaActionPerformed
        // TODO add your handling code here:
        int x=(int)this.screen.getWidth()-dimension/2;
        int y=(int)this.screen.getHeight()-dimension/2;
        this.setLocation(x, y);
        this.posiciones="Abajo derecha";
        this.setTitle("Dimensiones y posiciones – "+posiciones+" – "+dimensiones);
    }//GEN-LAST:event_btnAbajoDerechaActionPerformed

    private void tglDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglDimensionActionPerformed
        // TODO add your handling code here:
        if(tglDimension.isSelected())
        {
            this.tglDimension.setText("Disminuye dimensión");
            this.dimension=600;
            
        }else{
            this.tglDimension.setText("Aumenta dimensión");
            this.dimension=300;
        }
        
        dimensiones=dimension+"x"+dimension;
        this.setTitle("Dimensiones y posiciones – "+posiciones+" – "+dimensiones);
        this.setSize(dimension,dimension);
        
    }//GEN-LAST:event_tglDimensionActionPerformed

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
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbajoDerecha;
    private javax.swing.JButton btnAbajoIzquierda;
    private javax.swing.JButton btnArribaDerecha;
    private javax.swing.JButton btnArribaIzquierda;
    private javax.swing.JPanel jPanelAbajo;
    private javax.swing.JPanel jPanelArriba;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JToggleButton tglDimension;
    // End of variables declaration//GEN-END:variables
}
