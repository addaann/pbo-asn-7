/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import dao.MobilDao;
import model.Mobil;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author adehe
 */
public class MainView extends javax.swing.JFrame {
    DefaultTableModel model;
    private MobilDao mobil_dao = new MobilDao();
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        model = (DefaultTableModel)tbl_mobil.getModel();
        tbl_mobil.setModel(model);
        
        showData();
    }
    
    private void showData() {
        model.setRowCount(0);
        int no = 1;
        for(Mobil mobil: this.mobil_dao.findAll()) {
            Object[] data = {
                no++,
                mobil.getNama(),
                mobil.getBahanBakar(),
                mobil.getJumlahSilinder(),
                mobil.getKapasitasSilinder(),
                mobil.getJumlahKursi()
            };
            model.addRow(data);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        label_nama = new javax.swing.JLabel();
        label_bahan_bakar = new javax.swing.JLabel();
        label_jumlah_silinder = new javax.swing.JLabel();
        label_kapasitas_silinder = new javax.swing.JLabel();
        label_jumlah_kursi = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        input_bahan_bakar = new javax.swing.JTextField();
        input_jumlah_silinder = new javax.swing.JTextField();
        input_kapasitas_silinder = new javax.swing.JTextField();
        input_jumlah_kursi = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        tbl_wrapper = new javax.swing.JScrollPane();
        tbl_mobil = new javax.swing.JTable();
        end_label_kursi = new javax.swing.JLabel();
        end_label_cc = new javax.swing.JLabel();
        end_label_silinder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CRUD MOBIL");

        label_nama.setText("Nama");

        label_bahan_bakar.setText("Bahan Bakar");

        label_jumlah_silinder.setText("Jumlah Silinder");

        label_kapasitas_silinder.setText("Kapasitas Silinder");

        label_jumlah_kursi.setText("Jumlah Kursi");

        input_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaActionPerformed(evt);
            }
        });

        input_bahan_bakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_bahan_bakarActionPerformed(evt);
            }
        });

        input_jumlah_silinder.setText("0");
        input_jumlah_silinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_jumlah_silinderActionPerformed(evt);
            }
        });

        input_kapasitas_silinder.setText("0");
        input_kapasitas_silinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_kapasitas_silinderActionPerformed(evt);
            }
        });

        input_jumlah_kursi.setText("0");
        input_jumlah_kursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_jumlah_kursiActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        tbl_mobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Bahan Bakar", "Jumlah Silinder", "Kapasitas Silinder", "Kapasitas Kursi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_wrapper.setViewportView(tbl_mobil);
        if (tbl_mobil.getColumnModel().getColumnCount() > 0) {
            tbl_mobil.getColumnModel().getColumn(0).setResizable(false);
            tbl_mobil.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        end_label_kursi.setText("Kursi");

        end_label_cc.setText("CC");

        end_label_silinder.setText("Silinder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_kapasitas_silinder)
                            .addComponent(label_jumlah_kursi)
                            .addComponent(label_jumlah_silinder)
                            .addComponent(label_bahan_bakar)
                            .addComponent(label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_nama)
                            .addComponent(input_bahan_bakar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(input_jumlah_silinder, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(input_kapasitas_silinder)
                                    .addComponent(input_jumlah_kursi))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(end_label_kursi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(end_label_cc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(end_label_silinder, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(tbl_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_save)
                        .addGap(34, 34, 34)
                        .addComponent(btn_refresh)
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nama)
                    .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bahan_bakar)
                    .addComponent(input_bahan_bakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_jumlah_silinder)
                    .addComponent(input_jumlah_silinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(end_label_silinder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_kapasitas_silinder)
                    .addComponent(input_kapasitas_silinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(end_label_cc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_jumlah_kursi)
                    .addComponent(input_jumlah_kursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(end_label_kursi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_refresh))
                .addGap(28, 28, 28)
                .addComponent(tbl_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_kapasitas_silinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_kapasitas_silinderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_kapasitas_silinderActionPerformed

    private void input_jumlah_kursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jumlah_kursiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jumlah_kursiActionPerformed

    private void input_jumlah_silinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_jumlah_silinderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_jumlah_silinderActionPerformed

    private void input_bahan_bakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_bahan_bakarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_bahan_bakarActionPerformed

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        String nama = input_nama.getText();
        String bahan_bakar = input_bahan_bakar.getText();
        int jumlah_silinder = Integer.parseInt(input_jumlah_silinder.getText());
        int kapasitas_silinder = Integer.parseInt(input_kapasitas_silinder.getText());
        int jumlah_kursi = Integer.parseInt(input_jumlah_kursi.getText());
        
        Mobil mobil = new Mobil(nama, bahan_bakar, jumlah_silinder, kapasitas_silinder, jumlah_kursi);
        boolean save_mobil = this.mobil_dao.save(mobil);
        
        if(save_mobil) {
            input_nama.setText("");
            input_bahan_bakar.setText("");
            input_jumlah_silinder.setText("0");
            input_kapasitas_silinder.setText("0");
            input_jumlah_kursi.setText("0");
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan.");
            showData();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        showData();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui.");
    }//GEN-LAST:event_btn_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel end_label_cc;
    private javax.swing.JLabel end_label_kursi;
    private javax.swing.JLabel end_label_silinder;
    private javax.swing.JTextField input_bahan_bakar;
    private javax.swing.JTextField input_jumlah_kursi;
    private javax.swing.JTextField input_jumlah_silinder;
    private javax.swing.JTextField input_kapasitas_silinder;
    private javax.swing.JTextField input_nama;
    private javax.swing.JLabel label_bahan_bakar;
    private javax.swing.JLabel label_jumlah_kursi;
    private javax.swing.JLabel label_jumlah_silinder;
    private javax.swing.JLabel label_kapasitas_silinder;
    private javax.swing.JLabel label_nama;
    private javax.swing.JTable tbl_mobil;
    private javax.swing.JScrollPane tbl_wrapper;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}