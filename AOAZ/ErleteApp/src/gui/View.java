package gui;

import modelo.TaulaModeloa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
import javax.swing.table.TableModel;

public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public TaulaModeloa modelo;

    public View() {
        initComponents();
        /* tabla.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("Herria");
        modelo.addColumn("Probintzia");
        modelo.addColumn("Hondartza");
        modelo.addColumn("Oharra");*/
        // this.tabla.setModel(modelo);
        tabla.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoAnadir = new javax.swing.JDialog();
        elegirProduct = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        tittle1 = new javax.swing.JLabel();
        tittle2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cantidadAnadir = new javax.swing.JTextField();
        AddCantidad = new javax.swing.JButton();
        tittle3 = new javax.swing.JLabel();
        precioAnadir = new javax.swing.JTextField();
        dialogoDinero = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DepositButton = new javax.swing.JButton();
        moneyField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        balancelabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        GehituButton = new javax.swing.JButton();
        EzabatuButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cantidadField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        precioField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        erlete = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuProduct = new javax.swing.JMenu();
        AddProduct = new javax.swing.JMenuItem();
        cambiarCantidadButton = new javax.swing.JMenuItem();
        menuMovement = new javax.swing.JMenu();
        viewMovements = new javax.swing.JMenuItem();
        menuDinero = new javax.swing.JMenu();
        depositMoneyMenu = new javax.swing.JMenuItem();

        dialogoAnadir.setTitle("Add Amount");
        dialogoAnadir.setMinimumSize(new java.awt.Dimension(614, 406));
        dialogoAnadir.setResizable(false);

        elegirProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirProductActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Add Quantity");

        tittle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tittle.setText("Choose Product: ");

        tittle1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tittle1.setText("Quantity of product:");

        tittle2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tittle2.setText("How many products do you want to add?");

        cantidadAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadAnadirActionPerformed(evt);
            }
        });

        AddCantidad.setText("Add");
        AddCantidad.setActionCommand("AddAnadir");

        tittle3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tittle3.setText("Prize(€)");

        precioAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioAnadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoAnadirLayout = new javax.swing.GroupLayout(dialogoAnadir.getContentPane());
        dialogoAnadir.getContentPane().setLayout(dialogoAnadirLayout);
        dialogoAnadirLayout.setHorizontalGroup(
            dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAnadirLayout.createSequentialGroup()
                .addGroup(dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoAnadirLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoAnadirLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogoAnadirLayout.createSequentialGroup()
                                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(elegirProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dialogoAnadirLayout.createSequentialGroup()
                                .addComponent(tittle1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AddCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dialogoAnadirLayout.createSequentialGroup()
                                        .addComponent(cantidadAnadir)
                                        .addGap(22, 22, 22))))
                            .addComponent(tittle2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dialogoAnadirLayout.createSequentialGroup()
                                .addComponent(tittle3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        dialogoAnadirLayout.setVerticalGroup(
            dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAnadirLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tittle)
                        .addComponent(elegirProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoAnadirLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(60, 60, 60)))
                .addGap(37, 37, 37)
                .addComponent(tittle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tittle1)
                    .addComponent(cantidadAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tittle3)
                    .addComponent(precioAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(AddCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        dialogoDinero.setTitle("Add Amount");
        dialogoDinero.setMinimumSize(new java.awt.Dimension(614, 406));
        dialogoDinero.setResizable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Deposit Money");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Add money to the account:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Amount (€)");

        DepositButton.setText("Deposit");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Balance:");

        balancelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        balancelabel.setText("jLabel9");

        javax.swing.GroupLayout dialogoDineroLayout = new javax.swing.GroupLayout(dialogoDinero.getContentPane());
        dialogoDinero.getContentPane().setLayout(dialogoDineroLayout);
        dialogoDineroLayout.setHorizontalGroup(
            dialogoDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoDineroLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(dialogoDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogoDineroLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(36, 36, 36)
                        .addComponent(moneyField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGap(0, 185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoDineroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15))
            .addGroup(dialogoDineroLayout.createSequentialGroup()
                .addGroup(dialogoDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoDineroLayout.createSequentialGroup()
                        .addGroup(dialogoDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogoDineroLayout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(DepositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoDineroLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoDineroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(balancelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dialogoDineroLayout.setVerticalGroup(
            dialogoDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoDineroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(7, 7, 7)
                .addGroup(dialogoDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balancelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(dialogoDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(DepositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(24, 24, 24))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        GehituButton.setText("Add");
        GehituButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GehituButtonActionPerformed(evt);
            }
        });

        EzabatuButton.setText("Delete");

        tabla.setModel(new TaulaModeloa());
        jScrollPane2.setViewportView(tabla);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Erlete Desktop App");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("These are the products in your inventory");

        jLabel2.setText("Admin - Panel");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Add new product:");

        productoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Product name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Product amount:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Prize (€): ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Balance:");

        saldoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saldoLabel.setText("jLabel9");

        erlete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/erlete.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aoaz.png"))); // NOI18N

        menuProduct.setText("Product");

        AddProduct.setText("Add Product");
        AddProduct.setActionCommand("add2");
        AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductActionPerformed(evt);
            }
        });
        menuProduct.add(AddProduct);

        cambiarCantidadButton.setText("Add Quantity");
        menuProduct.add(cambiarCantidadButton);

        MenuBar.add(menuProduct);

        menuMovement.setText("Movements");

        viewMovements.setText("View Movements");
        menuMovement.add(viewMovements);

        MenuBar.add(menuMovement);

        menuDinero.setText("Money");

        depositMoneyMenu.setText("Deposit Money");
        depositMoneyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositMoneyMenuActionPerformed(evt);
            }
        });
        menuDinero.add(depositMoneyMenu);

        MenuBar.add(menuDinero);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(productoField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(saldoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EzabatuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GehituButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21))))
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(erlete)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(productoField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GehituButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EzabatuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erlete)
                    .addComponent(jLabel14))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddProductActionPerformed

    private void productoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoFieldActionPerformed

    private void GehituButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GehituButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GehituButtonActionPerformed

    private void cantidadAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadAnadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadAnadirActionPerformed

    private void precioAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioAnadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioAnadirActionPerformed

    private void elegirProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elegirProductActionPerformed

    private void depositMoneyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositMoneyMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositMoneyMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    

    public static View viewaSortuBistaratu() {
        View v = new View();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v.setVisible(true);
            }
        });
        return v;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddCantidad;
    public javax.swing.JMenuItem AddProduct;
    public javax.swing.JButton DepositButton;
    public javax.swing.JButton EzabatuButton;
    public javax.swing.JButton GehituButton;
    public javax.swing.JMenuBar MenuBar;
    public javax.swing.JLabel balancelabel;
    public javax.swing.JMenuItem cambiarCantidadButton;
    public javax.swing.JTextField cantidadAnadir;
    public javax.swing.JTextField cantidadField;
    public javax.swing.JMenuItem depositMoneyMenu;
    public javax.swing.JDialog dialogoAnadir;
    public javax.swing.JDialog dialogoDinero;
    public javax.swing.JComboBox<String> elegirProduct;
    private javax.swing.JLabel erlete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JMenu menuDinero;
    public javax.swing.JMenu menuMovement;
    public javax.swing.JMenu menuProduct;
    public javax.swing.JTextField moneyField;
    public javax.swing.JTextField precioAnadir;
    public javax.swing.JTextField precioField;
    public javax.swing.JTextField productoField;
    public javax.swing.JLabel saldoLabel;
    public javax.swing.JTable tabla;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel tittle1;
    private javax.swing.JLabel tittle2;
    private javax.swing.JLabel tittle3;
    public javax.swing.JMenuItem viewMovements;
    // End of variables declaration//GEN-END:variables
}
