/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author blazquez.asier
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        bannerlabel = new javax.swing.JLabel();
        manageProductsButton = new javax.swing.JButton();
        anadirCantidadButton = new javax.swing.JButton();
        movementsButton = new javax.swing.JButton();
        depositDineroButton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bannerlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerjava.png"))); // NOI18N
        getContentPane().add(bannerlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        manageProductsButton.setText("Manage Products");
        manageProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(manageProductsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 140, 80));

        anadirCantidadButton.setText("Add Quantity");
        anadirCantidadButton.setActionCommand("anadirCantidadMenu");
        anadirCantidadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirCantidadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(anadirCantidadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, 80));

        movementsButton.setText("Movements");
        movementsButton.setActionCommand("verMovimientos");
        movementsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movementsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(movementsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 140, 80));

        depositDineroButton.setText("Deposit Money");
        depositDineroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositDineroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(depositDineroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 140, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductsButtonActionPerformed
 
        
    }//GEN-LAST:event_manageProductsButtonActionPerformed

    private void anadirCantidadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirCantidadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anadirCantidadButtonActionPerformed

    private void movementsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movementsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movementsButtonActionPerformed

    private void depositDineroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositDineroButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositDineroButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static Menu MenuaSortuBistaratu() {
        Menu m = new Menu();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                m.setVisible(true);
            }
        });
        return m;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton anadirCantidadButton;
    public javax.swing.JLabel bannerlabel;
    public javax.swing.JButton depositDineroButton;
    private javax.swing.JLabel fondo;
    public javax.swing.JButton manageProductsButton;
    public javax.swing.JButton movementsButton;
    // End of variables declaration//GEN-END:variables
}