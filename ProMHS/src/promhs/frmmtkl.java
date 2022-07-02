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
public class frmmtkl extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    static ResultSet rs;
    static Statement stmt;
    dbKoneksi cnn = new dbKoneksi();
    loadIMG img = new loadIMG();
    /**
     * Creates new form frmmtkl
     */
    public frmmtkl() {
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

        jLabel1 = new javax.swing.JLabel();
        cmdtambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        klm = new javax.swing.JTable();
        lbCRUDmt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txcode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        txJur = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txPengampu = new javax.swing.JTextField();
        cmdSimpan = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdbatal = new javax.swing.JButton();
        cmdtutup = new javax.swing.JButton();
        imgphoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("List Data Matakuliah");

        cmdtambah.setText("Tambah Data");
        cmdtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdtambahActionPerformed(evt);
            }
        });

        klm.setModel(new javax.swing.table.DefaultTableModel(
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
        klm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(klm);

        lbCRUDmt.setText("DETAIL");

        jLabel3.setText("KODE");

        jLabel4.setText("Nama Matakuliah");

        txJur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pili Jurusan", "MDI", "DGM", "KAB" }));

        jLabel5.setText("Jurusan");

        jLabel6.setText("Pengampu");

        cmdSimpan.setText("Simpan");
        cmdSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSimpanActionPerformed(evt);
            }
        });

        cmdUpdate.setText("Update");
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
        cmdtutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdtutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmdtambah))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCRUDmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdDelete)
                                .addGap(186, 186, 186)
                                .addComponent(cmdbatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdtutup)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txJur, javax.swing.GroupLayout.Alignment.LEADING, 0, 103, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txcode, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(txPengampu, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(txNama))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdtambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCRUDmt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txJur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPengampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imgphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSimpan)
                    .addComponent(cmdUpdate)
                    .addComponent(cmdDelete)
                    .addComponent(cmdbatal)
                    .addComponent(cmdtutup))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdtutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdtutupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdtutupActionPerformed

    private void cmdtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdtambahActionPerformed
      this.cmdtambah.setEnabled(false);
      this.cmdUpdate.setEnabled(false);
      this.cmdDelete.setEnabled(false);
      this.cmdSimpan.setEnabled(true);
      this.cmdbatal.setVisible(true);
      
      this.txcode.setText("");
      this.txNama.setText("");
      this.txJur.setSelectedIndex(0);
      this.txPengampu.setText("");
      
      this.lbCRUDmt.setText("Tambah Data Mata Kuliah");
    }//GEN-LAST:event_cmdtambahActionPerformed

    private void klmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klmMouseClicked
        
        String urlGambarNull = "src/img/gambar.jpg";
        this.txcode.setText(model.getValueAt(klm.getSelectedRow(),0).toString());
        this.txNama.setText(model.getValueAt(klm.getSelectedRow(),1).toString());
        this.txJur.setSelectedItem(model.getValueAt(klm.getSelectedRow(),2).toString());
        this.txPengampu.setText(model.getValueAt(klm. getSelectedRow(),3).toString());
        String urlGambar = "src/img/"+this.txcode.getText()+".jpg";
        BufferedImage loadImg = img.loadImage(urlGambar);
        if(loadImg == null){
            loadImg = img.loadImage(urlGambarNull);
        }
        ImageIcon imageIcon = new ImageIcon (loadImg);
        this.imgphoto.setIcon(imageIcon);
        
        this.lbCRUDmt.setText("Edit Data"+this.txcode.getText());
        this.cmdtambah.setEnabled(false);
        this.cmdUpdate.setEnabled(true);
        this.cmdDelete.setEnabled(true);
    }//GEN-LAST:event_klmMouseClicked

    private void cmdtutupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdtutupMouseClicked
        this.dispose();
    }//GEN-LAST:event_cmdtutupMouseClicked

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        String KODE = this.txcode.getText();
        String NAMA = this.txNama.getText();
        String JURUSAN = this.txJur.getSelectedItem().toString();
        String PENGAMPU = this.txPengampu.getText();
        String SQLUpdate = "UPDATE datamatkul SET NAMA_MATKUL='"+NAMA+"', JURUSAN='"+JURUSAN+"',PENGAMPU='"+PENGAMPU+"' WHERE KODE='"+KODE+"';";
        if(this.UpdateData(SQLUpdate)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data Terupdate");
        }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        String KODE=this.txcode.getText();
        String NAMA = this.txNama.getText();
        int opsi = JOptionPane.showConfirmDialog(null,"yakin Akan Menghapus "+NAMA+"("+KODE+")?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(opsi == JOptionPane.YES_OPTION){
            String SQLDelete="DELETE FROM datamatkul WHERE KODE='"+KODE+"';";
            if(this.UpdateData(SQLDelete)){
                this.getdata();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            }
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        this.cmdtutup.setEnabled(true);
        this.cmdtambah.setEnabled(true);
        this.cmdSimpan.setEnabled(false);
        this.cmdbatal.setVisible(false);
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void cmdSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSimpanActionPerformed
       
       String KODE = this.txcode.getText();
       String NAMA = this.txNama.getText();
       String JURUSAN = this.txJur.getSelectedItem().toString();
       String PENGAMPU=this.txPengampu.getText();
       String SQLInsert = "INSERT INTO datamatkul (KODE,NAMA_MATKUL,JURUSAN,PENGAMPU) VALUES('"+KODE+"','"+NAMA+"','"+JURUSAN+"','"+PENGAMPU+"');";
       if(this.UpdateData(SQLInsert)){
           this.getdata();
           JOptionPane.showMessageDialog(null, "Data Telah Di Tambahkan ");
       } 
       this.cmdSimpan.setEnabled(false);
       this.cmdbatal.setVisible(false);
       this.cmdtutup.setEnabled(true);
       this.cmdtambah.setEnabled(true);
    }//GEN-LAST:event_cmdSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(frmmtkl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmtkl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmtkl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmtkl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmtkl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdSimpan;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdtambah;
    private javax.swing.JButton cmdtutup;
    private javax.swing.JLabel imgphoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable klm;
    private javax.swing.JLabel lbCRUDmt;
    private javax.swing.JComboBox<String> txJur;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txPengampu;
    private javax.swing.JTextField txcode;
    // End of variables declaration//GEN-END:variables

    private void getdata() {
    String sql = "Select KODE, NAMA_MATKUL, JURUSAN, PENGAMPU FROM datamatkul;";
    model.getDataVector().removeAllElements();
    model.fireTableDataChanged();
    try{
        this.tampildata(sql);
        while(this.rs.next()){
            Object[] obj = new Object[5];
            obj[0]= this.rs.getString("KODE");
            obj[1]= this.rs.getString("NAMA_MATKUL");
            obj[2]= this.rs.getString("JURUSAN");
            obj[3]= this.rs.getString("PENGAMPU");
        model.addRow(obj);
        }
    }catch(Exception e){
    }
    } 
    

    private void initTable() {
        model = new DefaultTableModel();
        klm.setModel(model);
        model.addColumn("KODE");
        model.addColumn("NAMA");
        model.addColumn("JURUSAN");
        model.addColumn("PENGAMPU");
    }
}