/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author ikhsan
 */
public class FrmKalkulator extends javax.swing.JFrame {

    /**
     * Creates new form FrmKalkulator
     */
    public FrmKalkulator() {
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

        jLabel1 = new javax.swing.JLabel();
        txtAngka1 = new javax.swing.JTextField();
        txtAngka2 = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        labelSd = new javax.swing.JLabel();
        labelHasil = new javax.swing.JLabel();
        btnModulo = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 151));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Kalkulator");

        txtAngka1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtAngka2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        labelSd.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelSd.setText("=");

        labelHasil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnModulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModulo.setText("%");
        btnModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloActionPerformed(evt);
            }
        });

        btnKurang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnBagi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnKali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKali.setText("x");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(labelSd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHasil, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelSd))
                    .addComponent(labelHasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

        try {
            double hasil = Double.parseDouble(txtAngka1.getText())+Double.parseDouble(txtAngka2.getText());        
            labelHasil.setText(Double.toString(hasil));
        } catch (NumberFormatException e){
            labelHasil.setText("Error!");
        }
        
    }//GEN-LAST:event_btnTambahActionPerformed
    
    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        try {
            double hasil = Double.parseDouble(txtAngka1.getText())-Double.parseDouble(txtAngka2.getText());        
            labelHasil.setText(Double.toString(hasil));
        } catch (NumberFormatException e){
            labelHasil.setText("Error!");
        }
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        try {
            double hasil = Double.parseDouble(txtAngka1.getText())*Double.parseDouble(txtAngka2.getText());        
            labelHasil.setText(Double.toString(hasil));
        } catch (NumberFormatException e){
            labelHasil.setText("Error!");
        }
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        if(Double.parseDouble(txtAngka2.getText())==0)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Tidak dapat dibagi dengan 0!", "Error!",JOptionPane.ERROR_MESSAGE);
            labelHasil.setText("Error!");
        } else
        {
            try {
                double hasil = Double.parseDouble(txtAngka1.getText())/Double.parseDouble(txtAngka2.getText());        
                labelHasil.setText(Double.toString(hasil));
            }catch (NumberFormatException e){
                labelHasil.setText("Error!");
            }
        }
        
        
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloActionPerformed
        if(Double.parseDouble(txtAngka2.getText())==0)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Tidak dapat dibagi dengan 0!", "Error!",JOptionPane.ERROR_MESSAGE);
            labelHasil.setText("Error!");
        } else
        {
            try {
                double hasil = Double.parseDouble(txtAngka1.getText())%Double.parseDouble(txtAngka2.getText());        
                labelHasil.setText(Double.toString(hasil));
            }catch (NumberFormatException e){
                labelHasil.setText("Error!");
            }
        }
    }//GEN-LAST:event_btnModuloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtAngka1.setText("");
        txtAngka2.setText("");
        labelHasil.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnModulo;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JLabel labelSd;
    private javax.swing.JTextField txtAngka1;
    private javax.swing.JTextField txtAngka2;
    // End of variables declaration//GEN-END:variables
}