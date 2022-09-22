// PBO 2022/09/22

package tokobuku;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Buku extends javax.swing.JFrame {
    public Connection conn = null;
    public Statement cn;
    
    public void Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/toko_buku", "root", "");
            cn = conn. createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal..");
            System.out.println(e.getMessage());
        }
    }

    public Buku() {
        initComponents();
        jComboBoxKategori.addItem("Pilih kategori buku");
        jComboBoxKategori.addItem("Fiksi");
        jComboBoxKategori.addItem("Non fiksi");
        
        bersih();
        tampilData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ini_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jTextJudul = new javax.swing.JTextField();
        jTextHarga = new javax.swing.JTextField();
        jTextPenerbit = new javax.swing.JTextField();
        jTextPenulis = new javax.swing.JTextField();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jCheckBoxBaru = new javax.swing.JCheckBox();
        jInsert = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jRefresh = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jSearch = new javax.swing.JButton();
        jTextSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        ini_title.setBackground(new java.awt.Color(204, 255, 255));
        ini_title.setFont(new java.awt.Font("Courier New", 1, 25)); // NOI18N
        ini_title.setText("SISTEM INFORMASI TOKO BUKU");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel2.setText("ID Buku:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel3.setText("Judul Buku:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel4.setText("Penulis:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel5.setText("Penerbit:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel6.setText("Kategori:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel7.setText("Harga:");

        jCheckBoxBaru.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jCheckBoxBaru.setText("Buku Baru");

        jInsert.setBackground(new java.awt.Color(204, 204, 255));
        jInsert.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jInsert.setText("Insert");
        jInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertActionPerformed(evt);
            }
        });

        jUpdate.setBackground(new java.awt.Color(204, 204, 255));
        jUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(204, 204, 255));
        jDelete.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jRefresh.setBackground(new java.awt.Color(204, 204, 255));
        jRefresh.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jRefresh.setText("Refresh");
        jRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshActionPerformed(evt);
            }
        });

        jExit.setBackground(new java.awt.Color(204, 0, 0));
        jExit.setForeground(new java.awt.Color(255, 255, 255));
        jExit.setText("EXIT");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jSearch.setBackground(new java.awt.Color(204, 204, 255));
        jSearch.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jSearch.setText("Search");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Nama Buku", "Penulis", "Penerbit", "Kategori", "Harga", "Baru / Bekas"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxBaru)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextJudul, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextHarga, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPenerbit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPenulis, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxKategori, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(154, 154, 154))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jExit, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                        .addGap(154, 154, 154))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ini_title)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ini_title)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxBaru)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInsert)
                    .addComponent(jUpdate)
                    .addComponent(jDelete)
                    .addComponent(jRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearch)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
    }// </editor-fold>                        

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                        
    try{
        Koneksi();
        String sql = "Update buku set judul='" + jTextJudul.getText() + "',"
                + "penulis='" + jTextPenulis.getText() + "',"
                + "penerbit='" + jTextPenerbit.getText() + "',"
                + "kategori='" + jComboBoxKategori.getSelectedItem() + "',"
                + "harga='" + jTextHarga.getText() + "',"
                + "is_baru='" + jCheckBoxBaru.isSelected() + "'"
                + "where id='" + jTextId.getText() + "'";
        cn.executeUpdate(sql);
        conn.close();
        tampilData();
        JOptionPane.showMessageDialog(null, "Data berhasil diubah");
    }catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "Proses update gagal / koneksi gagal..");
        System.out.println(e.getMessage());
    }
    jTextId.setEnabled(true);
    jInsert.setEnabled(true);
    }                                       

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                        
    try{
        Koneksi();
        String sql = "delete from buku where id='" + jTextId.getText() + "'";
        cn.executeUpdate(sql);
        conn.close();
        tampilData();
        bersih();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
    }catch (SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, "Proses hapus gagal / koneksi gagal..");
        System.out.println(e.getMessage());
    }
    jTextId.setEnabled(true);
    jInsert.setEnabled(true);
    }                                       

    private void jRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                         
    bersih();
    jTextId.setEnabled(true);
    jTextId.requestFocus();
    jInsert.setEnabled(true);
    }                                        

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {                                      
    System.exit(0);
    }                                     

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try{
            Koneksi();
            String sql = "Insert into buku values('" + jTextId.getText() + "', '"
                    + jTextJudul.getText()
                    + "','" + jTextPenulis.getText() + "','"
                    + jTextPenerbit.getText() + "','" + jComboBoxKategori.getSelectedItem() + "','" + jTextHarga.getText()
                    + "','" + jCheckBoxBaru.isSelected() + "')";
        cn.executeUpdate(sql);
        conn.close();
        tampilData();
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        }catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal / koneksi gagal..");
            System.out.println(e.getMessage());
        }
        bersih();
    }                                       

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
    int table = jTable1.getSelectedRow();
    //Mengambil data dari table
    String id = jTable1.getValueAt(table, 0).toString();
    String judul = jTable1.getValueAt(table, 1).toString();
    String penulis = jTable1.getValueAt(table, 2).toString();
    String penerbit = jTable1.getValueAt(table, 3).toString();
    String kategori = jTable1.getValueAt(table, 4).toString();
    String harga = jTable1.getValueAt(table, 5).toString();
    String isBaru = jTable1.getValueAt(table, 6).toString();
    
    jTextId.setText(id);
    jTextJudul.setText(judul);
    jTextPenulis.setText(penulis);
    jTextPenerbit.setText(penerbit);
    jComboBoxKategori.setSelectedItem(kategori);
    jTextHarga.setText(harga);
    
    if (isBaru.equals("Baru")) {
        jCheckBoxBaru.setSelected(true);
    } else {
        jCheckBoxBaru.setSelected(false);
    }
    jTextId.setEnabled(false);
    jInsert.setEnabled(false);
    }                                    

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {                                        
        DefaultTableModel tblpgw = new DefaultTableModel();
        tblpgw.addColumn("ID Buku");
        tblpgw.addColumn("Judul Buku");
        tblpgw.addColumn("Penulis");
        tblpgw.addColumn("Penerbit");
        tblpgw.addColumn("Kategori");
        tblpgw.addColumn("Harga");
        tblpgw.addColumn("Baru / Bekas");
        
        
     try{
     Koneksi();
     String keyword = jTextSearch.getText();
     String sql = "Select * from  buku where judul like " + "'%" + keyword + "%'" + "or "
             + "penulis like " + "'%" + keyword + "%'" + "or "
             + "penerbit like " + "'%" + keyword + "%'" + "or "
             + "kategori like " + "'%" + keyword + "%'" + "or "
             + "harga like " + "'%" + keyword + "%'"
             + " order by id asc";
     ResultSet rs = cn .executeQuery(sql);
     
     while (rs.next()){
         boolean isBaru = rs.getBoolean(7);
         String keadaanBuku;
         if (isBaru) {
            keadaanBuku = "Baru";
         } else {
            keadaanBuku = "Bekas";
         }
         
         tblpgw.addRow(new Object[]{
         rs.getString(1),
         rs.getString(2),
         rs.getString(3),
         rs.getString(4),
         rs.getString(5),
         rs.getString(6),
         keadaanBuku});
     }
         jTable1.setModel(tblpgw);
     } catch(SQLException e) {
     JOptionPane.showMessageDialog(null, "Ada kesalahan..");
     System.out.println(e.getMessage());
     }
    }                                       

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
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ini_title;
    private javax.swing.JCheckBox jCheckBoxBaru;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jExit;
    private javax.swing.JButton jInsert;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextHarga;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextJudul;
    private javax.swing.JTextField jTextPenerbit;
    private javax.swing.JTextField jTextPenulis;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JButton jUpdate;
    // End of variables declaration                   

    private void bersih() {
       jTextId.setText("");
       jTextJudul.setText("");
       jTextPenulis.setText("");
       jTextPenerbit.setText("");
       jTextHarga.setText("");
       jComboBoxKategori.setSelectedIndex(0);
       jCheckBoxBaru.setSelected(false);
    }

    private void tampilData() {
        DefaultTableModel tblpgw =  new DefaultTableModel();
        tblpgw.addColumn("ID Buku");
        tblpgw.addColumn("Judul Buku");
        tblpgw.addColumn("Penulis");
        tblpgw.addColumn("Penerbit");
        tblpgw.addColumn("Kategori");
        tblpgw.addColumn("Harga");
        tblpgw.addColumn("Baru / Bekas");
        
        try{
            Koneksi();
            String sql = "Select * from buku order by id asc";
            ResultSet rs = cn.executeQuery(sql);
            
            while (rs.next()) {
                boolean isBaru = rs.getBoolean(7);
                String keadaanBuku;
                if (isBaru) {
                    keadaanBuku = "Baru";
                } else {
                    keadaanBuku = "Bekas";
                }
            
                tblpgw.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    keadaanBuku});
            }
            jTable1.setModel(tblpgw);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan..");
        }
    }
}
