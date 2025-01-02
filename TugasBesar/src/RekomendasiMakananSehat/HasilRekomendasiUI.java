
package RekomendasiMakananSehat;
//@author Izma Syabrian x Rizqi Dwi Saputra x Rhojay Alfirdaus

import java.sql.*;
import javax.swing.JOptionPane;


public class HasilRekomendasiUI extends javax.swing.JFrame {

    public HasilRekomendasiUI(User user) {
        initComponents();
        tampilRekomendasi(user);
    }
    
    private void tampilRekomendasi(User user){
        String nama = user.getNama();
        int umur = user.getUmur();
        double bb = user.getBb();
        double tb = user.getTb();
        String aktivitas = user.getAktivitas();
        String preferensi = user.getPreferensi();
        
        double bmi = bb / Math.pow(tb / 100, 2);
        
        String statusBB;
        if (bmi < 18.5) {
            statusBB = "Kekurangan berat badan";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            statusBB = "Berat badan Anda normal";
        } else {
            statusBB = "Berat badan Anda berlebihan";
        }
        
        String rekomendasi = "Rekomendasi Makanan untuk " + nama + ":\n"
                + "Status Berat Badan : " + statusBB + "\n"
                + "Preferensi Makanan : " + preferensi + "\n\n";
        
        try {
            Connection con = SQL_Conn.getConnection();
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM makanan";

            if(bmi < 18.5 && preferensi.equalsIgnoreCase("Vegetarian")){
                query += " WHERE nama_makanan LIKE '%Smoothie Pisang dan Alpukat%'";
            }else if (bmi < 18.5 && preferensi.equalsIgnoreCase("Non-Vegetarian")){
                query += " WHERE nama_makanan LIKE '%Salmon Panggang dengan Sayuran Kukus%'";
            }else if(bmi >= 18.5 && bmi < 24.9 && preferensi.equalsIgnoreCase("Vegetarian")){
                query += " WHERE nama_makanan LIKE '%Sup Brokoli dan Bayam%'";
            }else if(bmi >= 18.5 && bmi < 24.9 && preferensi.equalsIgnoreCase("Non-Vegetarian")){
                query += " WHERE nama_makanan LIKE '%Ikan Kukus dengan Bumbu Rempah%'";
            }else if(preferensi.equalsIgnoreCase("Vegetarian")){
                query += " WHERE nama_makanan LIKE '%Tempe Panggang dengan Sambal Kacang%'";
            }else{
                query += " WHERE nama_makanan LIKE '%Ikan Tuna dengan Lemon dan Lada Hitam%'";
            }

            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String makanan = rs.getString("nama_makanan");
                String deskripsi = rs.getString("deskripsi_makanan");
                rekomendasi += makanan + " - " + deskripsi + "\n";
            }
            
            txtArea.setText(rekomendasi);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_lagi = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setText("Ini Rekomendasi Makanan Kamu!");

        btn_lagi.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btn_lagi.setText("Tulis Data Diri Lainnya");
        btn_lagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lagiActionPerformed(evt);
            }
        });

        btn_keluar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_lagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_lagi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lagiActionPerformed
        
        new InputDataUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_lagiActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btn_keluarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_lagi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

}
