/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongmach;
import DAO.*;
import java.util.*;
import entities.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duong Python
 */
public class pnlKhamBenh extends javax.swing.JPanel {

    /**
     * Creates new form pnlKhamBenh
     */
    public static int kt = 0;
    static PhieuKhamBenhDao pkbDAO = new PhieuKhamBenhDao();
    static ThuocDAO  dskDAO= new ThuocDAO();
    DefaultTableModel tblModel = new DefaultTableModel();
    public pnlKhamBenh() {
        initComponents();
        LoadData1();
    }
    void LoadData1(){
       
        
        
      
        tblModel.addColumn("Tên thuốc");
        tblModel.addColumn("Số lượng");
        tblModel.addColumn("Đơn vị");
        tblModel.addColumn("Cách dùng");
        int i = 0;
        for (Thuoc dsk: dskDAO.findAll())
        {
            i++;
            tblModel.addRow(new Object[]{ dsk.getLoaiThuoc(), dsk.getSoLuong(), dsk.getDonVi(), dsk.getCachDung()});
        }
        jTblThuoc.setModel(tblModel);
        jTblThuoc.repaint();
        jTblThuoc.revalidate();
    }
        
      

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSTT = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgayKham = new javax.swing.JTextField();
        jpnl1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtTrieuChung = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbxLoaiBenh = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxLoaiThuoc = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cbxCachDung = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblThuoc = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        cbxDonVi = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ViewInfo.png"))); // NOI18N
        jButton1.setText("Lấy thông tin bệnh nhân tiếp theo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("STT");

        jLabel3.setText("Họ Tên");

        jLabel7.setText("Ngày");

        txtSTT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSTT.setEnabled(false);

        txtHoTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoTen.setEnabled(false);

        txtNgayKham.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayKham.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("PHIẾU KHÁM BỆNH");

        jLabel9.setText("Tên: ");

        jLabel10.setText("Ngày Khám");

        jLabel11.setText("Triệu chứng");

        cbxLoaiBenh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại 1", "Loại 2", "Loại 3", "Loại 4", "Loại 5" }));

        jLabel12.setText("Loại bệnh");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("THUỐC");

        jLabel14.setText("Loại thuốc");

        cbxLoaiThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vắc xin", "Thuốc đau bụng", "Thuốc hạ sốt", "Thuốc cầm máu", "Tiêu hóa", "Bổ thận", "Lọc máu" }));

        jLabel16.setText("Cách dùng");

        cbxCachDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uống sau khi ăn", "Tiêm", "Truyền vào máu", "Đắp" }));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Check.png"))); // NOI18N
        jButton3.setText("Lưu");

        jTblThuoc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTblThuoc);

        jLabel4.setText("Số lượng");

        jLabel5.setText("Đơn vị");

        cbxDonVi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viên", "Chai" }));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-icon.png"))); // NOI18N
        jButton2.setText("Thêm thuốc");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Check.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnl1Layout = new javax.swing.GroupLayout(jpnl1);
        jpnl1.setLayout(jpnl1Layout);
        jpnl1Layout.setHorizontalGroup(
            jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jpnl1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnl1Layout.createSequentialGroup()
                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnl1Layout.createSequentialGroup()
                                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnl1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxLoaiThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnl1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxCachDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(99, 99, 99)
                                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnl1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnl1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, 53)
                                .addComponent(jButton2))
                            .addGroup(jpnl1Layout.createSequentialGroup()
                                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpnl1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(53, 53, 53)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnl1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTrieuChung, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(28, 28, 28)
                                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxLoaiBenh, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addComponent(btnLuu))))
                    .addGroup(jpnl1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnl1Layout.setVerticalGroup(
            jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl1Layout.createSequentialGroup()
                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTrieuChung)
                            .addComponent(jLabel11)
                            .addComponent(cbxLoaiBenh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jpnl1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnl1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cbxLoaiThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCachDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel5)
                            .addComponent(cbxDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main.SoPhieuKham++;
        Dskhambenh ds = pnlLapDanhSach.dskDAO.find(Main.SoPhieuKham);
        if (ds == null)
        {
            JOptionPane.showMessageDialog(null, "Không có bệnh nhân nào");
            Main.SoPhieuKham--;
            return;
            
        }

        String s = Main.SoPhieuKham + "";
        txtSTT.setText(s);
        
        txtHoTen.setText(ds.getDsbenhnhan().getHoTen());
        txtName.setText(txtHoTen.getText());
        txtNgayKham.setText(pnlLapDanhSach.tblDanhSachKham.getValueAt(Main.SoPhieuKham-1, 2).toString());
        txtDate.setText(txtNgayKham.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txtSoLuong.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Điền số lượng thuốc");
            return;
        }
        tblModel.addRow(new Object[]{cbxLoaiThuoc.getSelectedItem().toString(), txtSoLuong.getText(), 
            cbxDonVi.getSelectedItem().toString(), cbxCachDung.getSelectedItem().toString()});
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        PhieuKhamBenhDao pkbDAO = new PhieuKhamBenhDao();
        Phieukhambenh pkb = new Phieukhambenh();
        kt++;
        pkb.setStt(kt);
        pkb.setDsbenhnhan(pnlTraCuuHoSo.bnd.find(txtHoTen.getText()));
        pkb.setLoaiBenh(cbxLoaiBenh.getSelectedIndex());
       
        pkb.setTrieuChung(txtTrieuChung.getText());
        if (pkbDAO.save(pkb))
        {
            JOptionPane.showMessageDialog(null, "Lập phiếu khám bệnh xong !");
           Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + "Lập phiếu khám bệnh xong");
        }
        else
             {
            JOptionPane.showMessageDialog(null, "Lập phiếu khám bệnh lỗi !");
           Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + "Lập phiếu khám bệnh lỗi");
        }
        
    }//GEN-LAST:event_btnLuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbxCachDung;
    private javax.swing.JComboBox<String> cbxDonVi;
    private javax.swing.JComboBox<String> cbxLoaiBenh;
    private javax.swing.JComboBox<String> cbxLoaiThuoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblThuoc;
    private javax.swing.JPanel jpnl1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgayKham;
    private javax.swing.JTextField txtSTT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTrieuChung;
    // End of variables declaration//GEN-END:variables
}
