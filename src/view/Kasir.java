/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author lotso
 */
public class Kasir extends javax.swing.JFrame {

    /**
     * Creates new form Kasir
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public Kasir() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnkeluar = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnkembalian = new javax.swing.JButton();
        txtkembalian = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnjml = new javax.swing.JButton();
        txtjml = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbkeju = new javax.swing.JCheckBox();
        cbsosis = new javax.swing.JCheckBox();
        cbdaging = new javax.swing.JCheckBox();
        txtharga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbnm = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kasir Pizza");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        btnkeluar.setBackground(new java.awt.Color(255, 51, 51));
        btnkeluar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnkeluar.setText("Keluar");

        btnbatal.setBackground(new java.awt.Color(255, 255, 51));
        btnbatal.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnbatal.setText("Batal");

        btnhapus.setBackground(new java.awt.Color(102, 255, 102));
        btnhapus.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnhapus.setText("Hapus");

        btnubah.setBackground(new java.awt.Color(153, 153, 255));
        btnubah.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnubah.setText("Ubah");

        btnsimpan.setBackground(new java.awt.Color(255, 204, 51));
        btnsimpan.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnsimpan.setText("Simpan");

        btnkembalian.setBackground(new java.awt.Color(204, 255, 51));
        btnkembalian.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnkembalian.setText("Hitung Kembalian");
        btnkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembalianActionPerformed(evt);
            }
        });

        jLabel7.setText("Kembalian");

        jLabel6.setText("Total Bayar");

        btnjml.setBackground(new java.awt.Color(0, 255, 204));
        btnjml.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnjml.setText("Hitung Jumlah Harga");
        btnjml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjmlActionPerformed(evt);
            }
        });

        jLabel5.setText("Jumlah Harga");

        jLabel4.setText("Topping");

        cbkeju.setText("Mozarella Cheese (5K)");

        cbsosis.setText("Sausage (8K)");

        cbdaging.setText("Smoked Beef (10K)");

        jLabel3.setText("Harga Pizza");

        jLabel2.setText("Nama Pizza");

        cmbnm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH MENU PIZZA", "MEAT LOVERS", "SUPER SUPREME", "TUNA MELT", "AMERICAN FAVOURITE" }));
        cmbnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkeluar))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnkembalian))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbkeju)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbsosis))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbnm, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbdaging))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtjml, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnjml))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbkeju)
                    .addComponent(cbsosis)
                    .addComponent(cbdaging))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtjml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnjml))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkembalian))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(btnhapus)
                    .addComponent(btnbatal)
                    .addComponent(btnkeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnmActionPerformed
        switch (cmbnm.getSelectedIndex()) {
            case 1: {
                txtharga.setText(nf.format(100000));
            }
            break;
            case 2: {
                txtharga.setText(nf.format(100000));
            }
            break;
            case 3: {
                txtharga.setText(nf.format(100000));
            }
            break;
            case 4: {
                txtharga.setText(nf.format(100000));
            }
            break;
            default:
                txtharga.setText(nf.format(0));

        }

    }//GEN-LAST:event_cmbnmActionPerformed

    private void btnjmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjmlActionPerformed
        int hasil = 0;
        hasil = Integer.parseInt(txtharga.getText().replace(".", ""));
        if (cbkeju.isSelected()) {
            hasil = Integer.parseInt(txtharga.getText().replace(".", "")) + 5000;
        }
        if (cbsosis.isSelected()) {
            hasil = Integer.parseInt(txtharga.getText().replace(".", "")) + 8000;
        }
        if (cbdaging.isSelected()) {
            hasil = Integer.parseInt(txtharga.getText().replace(".", "")) + 10000;
        }
        if (cbkeju.isSelected() && cbsosis.isSelected()) {
            hasil = Integer.parseInt(txtharga.getText().replace(".", "")) + 13000;
        }
        if (cbkeju.isSelected() && cbdaging.isSelected()) {
            hasil = Integer.parseInt(txtharga.getText().replace(".", "")) + 15000;
        }
        if (cbsosis.isSelected() && cbdaging.isSelected()) {
            hasil = Integer.parseInt(txtharga.getText().replace(".", "")) + 18000;
        }
        if (cbkeju.isSelected() && cbdaging.isSelected() && cbsosis.isSelected()) {
            hasil = Integer.parseInt(txtharga.getText().replace(".", "")) + 23000;
        }
        txtjml.setText(nf.format(hasil));

    }//GEN-LAST:event_btnjmlActionPerformed

    private void btnkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembalianActionPerformed
        int jharga, bayar, hasil = 0;
        jharga = Integer.parseInt(txtjml.getText().replace(".", ""));
        bayar = Integer.parseInt(txttotal.getText().replace(".", ""));
        if (jharga > bayar) {
            JOptionPane.showMessageDialog(null, "Uang anda tidak cukup");
            txtkembalian.setText("");
        } else if (jharga == bayar) {
            JOptionPane.showMessageDialog(null, "Uang anda pas");
            txtkembalian.setText(nf.format(hasil));;
        } //       hasil = bayar - jharga;
        else {
            hasil = bayar - jharga;
            JOptionPane.showMessageDialog(null, "Uang kembali " + hasil);
            txtkembalian.setText(nf.format(hasil));

        }

    }//GEN-LAST:event_btnkembalianActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnjml;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnkembalian;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JCheckBox cbdaging;
    private javax.swing.JCheckBox cbkeju;
    private javax.swing.JCheckBox cbsosis;
    public javax.swing.JComboBox<String> cmbnm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl;
    public javax.swing.JTextField txtharga;
    public javax.swing.JTextField txtjml;
    public javax.swing.JTextField txtkembalian;
    public javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
