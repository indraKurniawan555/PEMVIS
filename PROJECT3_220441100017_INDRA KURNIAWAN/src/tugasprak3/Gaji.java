/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasprak3;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO SLIM 3 R3
 */
public class Gaji extends javax.swing.JFrame {
    int intPajak;

    /**
     * Creates new form Gaji
     */
    public Gaji() {
        initComponents();
        init();
    }
    public void init(){
        setImage("ayo pajak.png", lIcon);
        setImage("logo pajak.png", lIcon1);
        
        lPajak.setVisible(false);
        lJumlah.setVisible(false);
        lJumlah.setVisible(false);
        lKendaraan.setVisible(false);
        bHitung.setVisible(false);
        fKendaraan.setVisible(false);
        fPajak.setVisible(false);
        fPendapatan.setVisible(false);
        bSimpan.setVisible(false);
        
        
    }
    public void setImage(String Gambar, JLabel Label){
        ImageIcon Cover1 = new ImageIcon(getClass().getResource(Gambar));
        
                Image cover1 = Cover1.getImage().getScaledInstance(Label.getWidth(), Label.getHeight(), Image.SCALE_SMOOTH ); 
                
                 Label.setIcon(new ImageIcon(cover1));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lIcon = new javax.swing.JLabel();
        bMulai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lJumlah = new javax.swing.JLabel();
        fPendapatan = new javax.swing.JTextField();
        lKendaraan = new javax.swing.JLabel();
        bHitung = new javax.swing.JButton();
        lPajak = new javax.swing.JLabel();
        fPajak = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        fKendaraan = new javax.swing.JComboBox<>();
        lIcon1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 48, 98));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 219, 195));

        lIcon.setText("jLabel7");

        bMulai.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bMulai.setText("MULAI");
        bMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMulaiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("KLIK TOMBOL MULAI");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("UNTUK MENJALANKAN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(bMulai))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel5)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMulai)
                .addGap(55, 55, 55))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(300, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(122, 122, 122)))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(92, 75, 153));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(158, 221, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(249, 148, 23));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PAJAK");
        jPanel4.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2, java.awt.BorderLayout.CENTER);
        jPanel4.add(jLabel6, java.awt.BorderLayout.LINE_START);

        jLabel1.setText("    ");
        jPanel4.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(159, 145, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lJumlah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lJumlah.setText("Jumlah Pendapatan :");
        jPanel6.add(lJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, -1, -1));

        fPendapatan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        fPendapatan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fPendapatanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fPendapatanFocusLost(evt);
            }
        });
        fPendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPendapatanActionPerformed(evt);
            }
        });
        jPanel6.add(fPendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 69, 304, 40));

        lKendaraan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lKendaraan.setText("Jumlah Kendaraan :");
        jPanel6.add(lKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 115, -1, -1));

        bHitung.setBackground(new java.awt.Color(255, 219, 195));
        bHitung.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });
        jPanel6.add(bHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 191, 304, 43));

        lPajak.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lPajak.setText("Jumlah Pajak :");
        jPanel6.add(lPajak, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 252, -1, -1));

        fPajak.setEditable(false);
        fPajak.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        fPajak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPajakActionPerformed(evt);
            }
        });
        jPanel6.add(fPajak, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 283, 304, 45));

        bSimpan.setBackground(new java.awt.Color(255, 219, 195));
        bSimpan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });
        jPanel6.add(bSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 334, 304, -1));

        fKendaraan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        fKendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jumlah Kendaraan", "Belum Punya", "1 Kendaraan", "2 Kendaraan", ">=3 Kendaraan", " " }));
        jPanel6.add(fKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 144, 304, 41));

        lIcon1.setText("jLabel2");
        jPanel6.add(lIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, 290, 230));

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fPendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPendapatanActionPerformed
        
    }//GEN-LAST:event_fPendapatanActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        // TODO add your handling code here:
        String Pendapatan = fPendapatan.getText();
        String Kendaraan = fKendaraan.getSelectedItem().toString();
        
        if (Integer.parseInt(Pendapatan) >= 10000000 && Kendaraan.equals(">=3 Kendaraan")){
            double Pajak = Integer.parseInt(Pendapatan) * 0.15;
            intPajak = (int)Math.floor(Pajak);
            fPajak.setText("Rp. "+Integer.toString(intPajak));
        } else if(Integer.parseInt(Pendapatan) >= 5000000 && (Kendaraan.equals("2 Kendaraan") || Kendaraan.equals(">=3 Kendaraan"))){
            double Pajak = Integer.parseInt(Pendapatan) * 0.1;
            intPajak = (int)Math.floor(Pajak);
            fPajak.setText("Rp. "+Integer.toString(intPajak));
        } else if(Integer.parseInt(Pendapatan) >= 5000000 && Kendaraan.equals("1 Kendaraan")){
            double Pajak = Integer.parseInt(Pendapatan) * 0.07;
            intPajak = (int)Math.floor(Pajak);
            fPajak.setText("Rp. "+Integer.toString(intPajak));
        } else if(Integer.parseInt(Pendapatan) < 5000000 && Kendaraan.equals("1 Kendaraan")  ){
            double Pajak = Integer.parseInt(Pendapatan) * 0.05;
            intPajak = (int)Math.floor(Pajak);
            fPajak.setText("Rp. "+Integer.toString(intPajak));
        }  else if(Integer.parseInt(Pendapatan) < 5000000 && Kendaraan.equals("Belum Punya")){
            double Pajak = Integer.parseInt(Pendapatan) * 0.025;
            intPajak = (int)Math.floor(Pajak);
            fPajak.setText("Rp. "+Integer.toString(intPajak));
        }
    }//GEN-LAST:event_bHitungActionPerformed

    private void fPajakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPajakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fPajakActionPerformed

    private void bMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMulaiActionPerformed
        // TODO add your handling code here:
        lPajak.setVisible(true);
        lJumlah.setVisible(true);
        lJumlah.setVisible(true);
        lKendaraan.setVisible(true);
        bHitung.setVisible(true);
        fKendaraan.setVisible(true);
        fPajak.setVisible(true);
        fPendapatan.setVisible(true);
        bSimpan.setVisible(true);
        lIcon1.setVisible(false);
    }//GEN-LAST:event_bMulaiActionPerformed

    private void fPendapatanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fPendapatanFocusGained
        // TODO add your handling code here:
        if (fPendapatan.getText().equals("Masukkan Jam Kerja")) {
        fPendapatan.setText("");
        fPendapatan.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_fPendapatanFocusGained

    private void fPendapatanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fPendapatanFocusLost
        // TODO add your handling code here:
        if (fPendapatan.getText().equals("")) {
        fPendapatan.setText("Masukkan Jam Kerja");
        fPendapatan.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_fPendapatanFocusLost

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Jumlah Pajak yang harus anda bayarkan sebesar Rp."+ intPajak);
        fKendaraan.setSelectedItem("Pilih Jumlah Kendaraan");
        fPajak.setText("");
        fPendapatan.setText("");
    }//GEN-LAST:event_bSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bMulai;
    private javax.swing.JButton bSimpan;
    private javax.swing.JComboBox<String> fKendaraan;
    private javax.swing.JTextField fPajak;
    private javax.swing.JTextField fPendapatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lIcon;
    private javax.swing.JLabel lIcon1;
    private javax.swing.JLabel lJumlah;
    private javax.swing.JLabel lKendaraan;
    private javax.swing.JLabel lPajak;
    // End of variables declaration//GEN-END:variables
}
