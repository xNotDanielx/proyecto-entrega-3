/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.*;

/**
 *
 * @author JOSEPH
 */
public class app extends javax.swing.JFrame {

    /**
     * Creates new form app
     */
    public app() {
        initComponents();
        this.setTitle("Compra y venta el chirrete mayor");
        ImageIcon image = new ImageIcon("./src/imagenes/logoPrincipal.png");
        this.setIconImage(image.getImage());
        this.setExtendedState(JFrame.NORMAL);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitulo = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        BtnRegistrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LblTitulo.setText("Compra y ventas El Chirrete Mayor");
        LblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnRegistrar.setBackground(new java.awt.Color(51, 255, 255));
        BtnRegistrar.setText("Registrar Venta");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnRegistrar1.setBackground(new java.awt.Color(51, 255, 255));
        BtnRegistrar1.setText("Consultar");
        BtnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(LblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(BtnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(BtnRegistrar1)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LblTitulo)
                .addGap(39, 39, 39)
                .addComponent(BtnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(BtnRegistrar1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        GuiRegistrarVenta com = new GuiRegistrarVenta(this, true);
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrar1ActionPerformed
        GuiConsultarVentas con = new GuiConsultarVentas(this, true);
    }//GEN-LAST:event_BtnRegistrar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegistrar1;
    private javax.swing.JLabel LblTitulo;
    // End of variables declaration//GEN-END:variables
}
