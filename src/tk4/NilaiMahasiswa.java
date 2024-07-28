
package tk4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NilaiMahasiswa extends javax.swing.JFrame {

    public NilaiMahasiswa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        TextFieldNIM = new javax.swing.JTextField();
        TextFieldNilaiTugas = new javax.swing.JTextField();
        TextFieldNilaiKuis = new javax.swing.JTextField();
        TextFieldNilaiUTS = new javax.swing.JTextField();
        TextFieldNilaiUAS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        LabelNIM = new javax.swing.JLabel();
        LabelRerata = new javax.swing.JLabel();
        LabelGrade = new javax.swing.JLabel();
        LabelKeterangan = new javax.swing.JLabel();
        ButtonHitung = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        ButtonSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("NIM");

        jLabel3.setText("Nilai Tugas");

        jLabel4.setText("Nilai Kuis");

        jLabel5.setText("Nilai UTS");

        jLabel6.setText("Nilas UAS");

        TextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameActionPerformed(evt);
            }
        });

        TextFieldNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNIMActionPerformed(evt);
            }
        });

        jLabel7.setText("Nama            :");

        jLabel8.setText("NIM               :");

        jLabel9.setText("Rerata           :");

        jLabel10.setText("Grade            :");

        jLabel11.setText("Keterangan   :");

        LabelName.setText(" ");

        LabelNIM.setText(" ");

        LabelRerata.setText(" ");

        LabelGrade.setText(" ");

        LabelKeterangan.setText(" ");

        ButtonHitung.setText("HITUNG");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });

        ButtonReset.setText("RESET");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        ButtonSimpan.setText("SIMPAN");
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldName)
                            .addComponent(TextFieldNIM)
                            .addComponent(TextFieldNilaiTugas)
                            .addComponent(TextFieldNilaiKuis)
                            .addComponent(TextFieldNilaiUTS)
                            .addComponent(TextFieldNilaiUAS, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonHitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSimpan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelName, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(LabelNIM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelRerata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(LabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(LabelNIM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldNilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(LabelRerata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNilaiKuis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(LabelGrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldNilaiUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(LabelKeterangan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextFieldNilaiUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonHitung)
                    .addComponent(ButtonReset)
                    .addComponent(ButtonSimpan))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed
        String nama = TextFieldName.getText();
        String nim = TextFieldNIM.getText();
        double nilaiTugas = Double.parseDouble(TextFieldNilaiTugas.getText());
        double nilaiKuis = Double.parseDouble(TextFieldNilaiKuis.getText());
        double nilaiUTS = Double.parseDouble(TextFieldNilaiUTS.getText());
        double nilaiUAS = Double.parseDouble(TextFieldNilaiUAS.getText());

        double rerata = (nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS) / 4;

        String grade;
        String keterangan;

        if (rerata >= 85) {
            grade = "A";
            keterangan = "Lulus";
        } else if (rerata >= 70) {
            grade = "B";
            keterangan = "Lulus";
        } else if (rerata >= 60) {
            grade = "C";
            keterangan = "Lulus";
        } else if (rerata >= 50) {
            grade = "D";
            keterangan = "Tidak Lulus";
        } else {
            grade = "E";
            keterangan = "Tidak Lulus";
        }

        LabelName.setText(nama);
        LabelNIM.setText(nim);
        LabelRerata.setText(String.valueOf(rerata));
        LabelGrade.setText(grade);
        LabelKeterangan.setText(keterangan);
    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        TextFieldName.setText("");
        TextFieldNIM.setText("");
        TextFieldNilaiTugas.setText("");
        TextFieldNilaiKuis.setText("");
        TextFieldNilaiUTS.setText("");
        TextFieldNilaiUAS.setText("");
        LabelName.setText(" ");
        LabelNIM.setText(" ");
        LabelRerata.setText(" ");
        LabelGrade.setText(" ");
        LabelKeterangan.setText(" ");
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
        try {                                             
            Connection connection = null;
            try {
                connection = ConnectionJava.getConnection();
            } catch (java.sql.SQLException ex) {
                Logger.getLogger(NilaiMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO mahasiswa (nama, nim, nilai_tugas, nilai_kuis, nilai_uts, nilai_uas, rerata, grade, keterangan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, TextFieldName.getText());
            statement.setString(2, TextFieldNIM.getText());
            statement.setDouble(3, Double.parseDouble(TextFieldNilaiTugas.getText()));
            statement.setDouble(4, Double.parseDouble(TextFieldNilaiKuis.getText()));
            statement.setDouble(5, Double.parseDouble(TextFieldNilaiUTS.getText()));
            statement.setDouble(6, Double.parseDouble(TextFieldNilaiUAS.getText()));
            double rerata = (Double.parseDouble(TextFieldNilaiTugas.getText()) + Double.parseDouble(TextFieldNilaiKuis.getText()) + Double.parseDouble(TextFieldNilaiUTS.getText()) + Double.parseDouble(TextFieldNilaiUAS.getText())) / 4;
            statement.setDouble(7, rerata);
            String grade;
            String keterangan;
            if (rerata >= 80) {
                grade = "A";
                keterangan = "Lulus";
            } else if (rerata >= 70) {
                grade = "B";
                keterangan = "Lulus";
            } else if (rerata >= 60) {
                grade = "C";
                keterangan = "Lulus";
            } else if (rerata >= 50) {
                grade = "D";
                keterangan = "Tidak Lulus";
            } else {
                grade = "E";
                keterangan = "Tidak Lulus";
            }
            statement.setString(8, grade);
            statement.setString(9, keterangan);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
            try {
                connection.close();
            } catch (java.sql.SQLException ex) {
                Logger.getLogger(NilaiMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(NilaiMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ButtonSimpanActionPerformed

    private void TextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNameActionPerformed

    private void TextFieldNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNIMActionPerformed

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
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NilaiMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JLabel LabelGrade;
    private javax.swing.JLabel LabelKeterangan;
    private javax.swing.JLabel LabelNIM;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelRerata;
    private javax.swing.JTextField TextFieldNIM;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldNilaiKuis;
    private javax.swing.JTextField TextFieldNilaiTugas;
    private javax.swing.JTextField TextFieldNilaiUAS;
    private javax.swing.JTextField TextFieldNilaiUTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
