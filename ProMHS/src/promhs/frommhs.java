package promhs;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
/**
 *
 * @author AnakAgng Bintang Purnama Dewi_20103019
 */
public class frommhs extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    static ResultSet rs;
    static Statement stmt;
    dbKoneksi cnn = new dbKoneksi();
    loadIMG img = new loadIMG();
    /**
     * Creates new form frommhs
     */
    public frommhs() {
        initComponents();
         this.initTable();
         this.getdata();
        this.cmdbatal.setVisible(false);
    }
    private void tampildata(String sql){
        try{
            Statement stmt = cnn.koneksi().createStatement();
            this.rs = stmt.executeQuery(sql);
        }catch(Exception e){
            System.out.println("kendala pada query");
        }
    }
    private boolean UpdateData(String SQL){
        boolean hsl = false;
        try{
            Statement stmt= cnn.koneksi().createStatement();
            stmt.executeUpdate(SQL);
            hsl = true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Masalah pada intruksi SQL");
        }
        return hsl;
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cmdtambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl = new javax.swing.JTable();
        lbCRUD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txNIM = new javax.swing.JTextField();
        imgphoto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txTGL = new javax.swing.JTextField();
        txJUR = new javax.swing.JComboBox<>();
        txJKL = new javax.swing.JRadioButton();
        txJKP = new javax.swing.JRadioButton();
        cmdsimpan = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdbatal = new javax.swing.JButton();
        cmdtutup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("List Data Mahasiswa");

        cmdtambah.setText("Tambah Data");
        cmdtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdtambahActionPerformed(evt);
            }
        });

        Tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl);

        lbCRUD.setText("Detail");

        jLabel3.setText("NIM");

        jLabel5.setText("Nama");

        jLabel6.setText("Tanggal");

        txJUR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan", "MDI", "DGM", "KAB" }));

        buttonGroup1.add(txJKL);
        txJKL.setText("Laki - Laki");

        buttonGroup1.add(txJKP);
        txJKP.setText("Perempuan");

        cmdsimpan.setText("Simpan");
        cmdsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsimpanActionPerformed(evt);
            }
        });

        cmdUpdate.setText("Update");
        cmdUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdUpdateMouseClicked(evt);
            }
        });
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdDelete.setText("Hapus");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdbatal.setText("Batal");
        cmdbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbatalActionPerformed(evt);
            }
        });

        cmdtutup.setText("Tutup Form");
        cmdtutup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdtutupMouseClicked(evt);
            }
        });

        jLabel7.setText("Jenis Kelamin");

        jLabel8.setText("Jurusan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdbatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdtutup))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txJKL)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txJKP)
                                            .addGap(42, 42, 42)
                                            .addComponent(txJUR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(164, 164, 164)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txTGL)
                                                        .addGap(46, 46, 46)))))))
                                .addGap(0, 28, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbCRUD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addComponent(cmdtambah))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmdtambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbCRUD)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTGL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txJKP)
                            .addComponent(txJKL)
                            .addComponent(txJUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdUpdate)
                    .addComponent(cmdsimpan)
                    .addComponent(cmdDelete)
                    .addComponent(cmdbatal)
                    .addComponent(cmdtutup))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdtambahActionPerformed
      this.cmdtambah.setEnabled(false);
      this.cmdUpdate.setEnabled(false);
      this.cmdDelete.setEnabled(false);
      this.cmdsimpan.setEnabled(true);
      this.cmdbatal.setVisible(true);
      
      this.txNIM.setText("");
      this.txnama.setText("");
      this.txJUR.setSelectedIndex(0);
      this.txTGL.setText("");
      
      this.lbCRUD.setText("Tambah Data Mahasiswa");
    }//GEN-LAST:event_cmdtambahActionPerformed

    private void TblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblMouseClicked
        String urlGambarNull = "src/img/gambar.jpg";
        this.txNIM.setText(model.getValueAt(Tbl.getSelectedRow(),0).toString());
        this.txnama.setText(model.getValueAt(Tbl.getSelectedRow(),1).toString());
        this.txJUR.setSelectedItem(model.getValueAt(Tbl.getSelectedRow(),2).toString());
        String txJK = model.getValueAt(Tbl.getSelectedRow(),3).toString();
        if(txJK.equals("Perempuan")){
            this.txJKP.setSelected(true);
        }else{
            this.txJKP.setSelected(true);
        }
        this.txTGL.setText(model.getValueAt(Tbl.getSelectedRow(),4).toString());
        String urlGambar = "src/img/"+this.txNIM.getText()+".jpg";
        BufferedImage loadImg = img.loadImage(urlGambar);
        if(loadImg == null){
            loadImg = img.loadImage(urlGambarNull);
        }
        ImageIcon imageIcon = new ImageIcon (loadImg);
        this.imgphoto.setIcon(imageIcon);
        
        this.lbCRUD.setText("Edit Data"+this.txNIM.getText());
        this.cmdtambah.setEnabled(false);
        this.cmdUpdate.setEnabled(true);
        this.cmdDelete.setEnabled(true);
        this.cmdsimpan.setEnabled(false);
    }//GEN-LAST:event_TblMouseClicked

    private void cmdtutupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdtutupMouseClicked
        this.dispose();
    }//GEN-LAST:event_cmdtutupMouseClicked

    private void cmdUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdUpdateMouseClicked
 
    }//GEN-LAST:event_cmdUpdateMouseClicked

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        String NIM = this.txNIM.getText();
        String NAMA = this.txnama.getText();
        String JURUSAN = this.txJUR.getSelectedItem().toString();
        String JNS_KL = "L";
        if(this.txJKP.isSelected()){
            JNS_KL="P";
        }
        String TGL = this.txTGL.getText();
        String SQLUpdate = "UPDATE mahasiswa SET NAMA='"+NAMA+"', JURUSAN='"+JURUSAN+"',JK='"+JNS_KL+"',TGLLAHIR='"+TGL +"' WHERE NIM='"+NIM+"';";
        if(this.UpdateData(SQLUpdate)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data Terupdate");
        }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        String NIM=this.txNIM.getText();
        String NAMA = this.txnama.getText();
        int opsi = JOptionPane.showConfirmDialog(null,"yakin Akan Menghapus "+NAMA+"("+NIM+")?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(opsi == JOptionPane.YES_OPTION){
            String SQLDelete="DELETE FROM mahasiswa WHERE NIM='"+NIM+"';";
            if(this.UpdateData(SQLDelete)){
                this.getdata();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            }
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        this.cmdtutup.setEnabled(true);
        this.cmdtambah.setEnabled(true);
        this.cmdsimpan.setEnabled(false);
        this.cmdbatal.setVisible(false);
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
       String NIM = this.txNIM.getText();
       String NAMA = this.txnama.getText();
       String JURUSAN = this.txJUR.getSelectedItem().toString();
       String JNS_KL = "L";
       if(this.txJKP.isSelected()){
           JNS_KL="p";
       }
       String TGL=this.txTGL.getText();
       String SQLInsert = "INSERT INTO mahasiswa (NIM,NAMA,JURUSAN,JK,TGLLAHIR) VALUES('"+NIM+"','"+NAMA+"','"+JURUSAN+"','"+JNS_KL+"','"+TGL+"');";
       if(this.UpdateData(SQLInsert)){
           this.getdata();
           JOptionPane.showMessageDialog(null, "Data Telah Di Tambahkan ");
       } 
       this.cmdsimpan.setEnabled(false);
       this.cmdbatal.setVisible(false);
       this.cmdtutup.setEnabled(true);
       this.cmdtambah.setEnabled(true);
    }//GEN-LAST:event_cmdsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(frommhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frommhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frommhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frommhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frommhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JButton cmdtambah;
    private javax.swing.JButton cmdtutup;
    private javax.swing.JLabel imgphoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCRUD;
    private javax.swing.JRadioButton txJKL;
    private javax.swing.JRadioButton txJKP;
    private javax.swing.JComboBox<String> txJUR;
    private javax.swing.JTextField txNIM;
    private javax.swing.JTextField txTGL;
    private javax.swing.JTextField txnama;
    // End of variables declaration//GEN-END:variables

    private void getdata() {
        String sql = "Select NIM, NAMA, JURUSAN, JK, TGLLAHIR FROM mahasiswa;";
    model.getDataVector().removeAllElements();
    model.fireTableDataChanged();
    try{
        this.tampildata(sql);
        while(this.rs.next()){
            Object[] obj = new Object[5];
            obj[0]= this.rs.getString("NIM");
            obj[1]= this.rs.getString("NAMA");
            obj[2]= this.rs.getString("JURUSAN");
            String txJK = this.rs.getString("JK");
            if(txJK.equals("L")){
                obj[3]="Laki-Laki";
            }else{
                obj[3]="Perempuan";
            }
            obj[4]= this.rs.getString("TGLLAHIR");
        model.addRow(obj);
        }
    }catch(Exception e){
    }
    } 

    private void initTable() {
        model = new DefaultTableModel();
        Tbl.setModel(model);
        model.addColumn("NIM");
        model.addColumn("NAMA");
        model.addColumn("JURUSAN");
        model.addColumn("JK");
        model.addColumn("TGL LAHIR");
    }
    }