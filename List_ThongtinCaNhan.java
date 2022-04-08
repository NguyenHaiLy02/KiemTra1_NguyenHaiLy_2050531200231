/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongTin;

/**
 *
 * @author win
 */
public class List_ThongtinCaNhan extends javax.swing.JFrame {

    private List<ThongTin> list = new ArrayList<>();
    private DefaultTableModel model;
    private String[] columHeaders = new String[]{"Họ và tên", "Mã SV", "Ngày sinh", "Quê quán", "Chúc vụ"};

    public List_ThongtinCaNhan() {
        initComponents();
        setLocationRelativeTo(null);
        initData();
        initTable();
    }

    private void initData() {
        list.add(new ThongTin("Nguyễn Hải Ly", "2050531200231", "23/05/2002", "Quảng Nam", "Khác"));
    }

    private void initTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columHeaders);

        list.forEach(item -> {
            model.addRow(new Object[]{item.getHoTen31(), item.getMaSV31(),
                 item.getNgaySinh31(), item.getQueQuan31(), item.getChucVu31()});
        });
        Table31.setModel(model);
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
        Labelttin31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table31 = new javax.swing.JTable();
        btndelete31 = new javax.swing.JButton();
        btnnew31 = new javax.swing.JButton();
        btnsave31 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname31 = new javax.swing.JTextField();
        txtma31 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cbbchucvu31 = new javax.swing.JComboBox<>();
        txtquequan31 = new javax.swing.JTextField();
        txtngay31 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelttin31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Labelttin31.setForeground(new java.awt.Color(102, 204, 255));
        Labelttin31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelttin31.setText("THÔNG TIN CÁ NHÂN");

        Table31.setModel(new javax.swing.table.DefaultTableModel(
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
        Table31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Table31MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table31);

        btndelete31.setText("Xóa ");
        btndelete31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete31ActionPerformed(evt);
            }
        });

        btnnew31.setText("Làm mới ");
        btnnew31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnew31ActionPerformed(evt);
            }
        });

        btnsave31.setText("Lưu");
        btnsave31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave31ActionPerformed(evt);
            }
        });

        jLabel2.setText("Họ và tên:");

        jLabel3.setText("Mã SV:");

        jLabel5.setText("Ngày sinh:");

        jLabel6.setText("Quê quán:");

        jLabel7.setText("Chức vụ:");

        cbbchucvu31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lớp trưởng ", "Lớp phó", "Bí thư", "Phó bí thư", "Khác" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtname31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtma31)
                                    .addComponent(cbbchucvu31, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtquequan31, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(txtngay31)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(Labelttin31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btndelete31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnew31)
                .addGap(74, 74, 74)
                .addComponent(btnsave31)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Labelttin31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtma31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtngay31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtquequan31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbchucvu31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete31)
                    .addComponent(btnnew31)
                    .addComponent(btnsave31))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnew31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnew31ActionPerformed

        txtname31.setText("");
        txtma31.setText("");
        txtngay31.setText("");
        txtquequan31.setText("");
    }//GEN-LAST:event_btnnew31ActionPerformed

    private void btndelete31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete31ActionPerformed
        try {
            if (txtma31.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mã SV phải được chọn trước khi xóa");
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa? "
                    + txtma31.getText(), "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;

            }
            boolean isDeleted = false;
            for (int i = 0; i < list.size(); i++) {
                ThongTin item = list.get(i);
                if (item.getMaSV31().equals(txtma31.getText())) {
                    list.remove(i);
                    isDeleted = true;
                    break;
                }
            }
            if (isDeleted) {
                model.setRowCount(0);
                list.forEach(item -> {
                    model.addRow(new Object[]{item.getHoTen31(), item.getMaSV31(),
                         item.getNgaySinh31(), item.getQueQuan31(), item.getChucVu31()});
                });
                model.fireTableDataChanged();
                JOptionPane.showMessageDialog(this, "Xóa thông tin");
                btnnew31ActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Thông tin chưa được chọn");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btndelete31ActionPerformed

    private void Table31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table31MousePressed
        int selectedRow = Table31.getSelectedRow();
        if (selectedRow >= 0) {

            ThongTin tt = list.get(selectedRow);
            txtname31.setText(tt.getHoTen31());
            txtma31.setText(tt.getMaSV31());
            txtngay31.setText(tt.getNgaySinh31());
            txtquequan31.setText(tt.getQueQuan31());
            cbbchucvu31.setSelectedItem(tt.getChucVu31());
        }
    }//GEN-LAST:event_Table31MousePressed

    private void btnsave31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave31ActionPerformed
        StringBuilder errors = new StringBuilder();
        try {
            if (txtname31.getText().equals("")) {
                errors.append("Họ tên phải được nhập");
                txtname31.setBackground(Color.red);
            } else {
                txtname31.setBackground(Color.white);
            }
            if (txtma31.getText().equals("")) {
                errors.append("Mã SV phải được nhập");
            }
            if (txtngay31.getText().equals("")) {
                errors.append("Ngày sinh phải được nhập");
            }
            if (txtquequan31.getText().equals("")) {
                errors.append("Quê quán phải được nhập");
            }
           
           
            
            if (!errors.isEmpty()) {
                JOptionPane.showMessageDialog(this, errors.toString());
                return;
            }
            ThongTin tt = new ThongTin();
            tt.setHoTen31(txtname31.getText());
            tt.setMaSV31(txtma31.getText());
            tt.setNgaySinh31(txtngay31.getText());
            tt.setQueQuan31(txtquequan31.getText());
            tt.setChucVu31(cbbchucvu31.getSelectedItem().toString());

            boolean isExisted = false;
            for (int i = 0; i < list.size(); i++) {
                ThongTin ttin = list.get(i);
                if (ttin.getMaSV31().equals(ttin.getMaSV31())) {
                    list.set(i, ttin);
                    isExisted = true;
                    break;
                }
            }
            if (!isExisted) {
                list.add(tt);
            }
            model.setRowCount(0);
            list.forEach(item -> {
                model.addRow(new Object[]{item.getHoTen31(), item.getMaSV31(),
                     item.getNgaySinh31(), item.getQueQuan31(), item.getChucVu31()});
            });
            model.fireTableDataChanged();
            JOptionPane.showMessageDialog(this, "Thông tin mới đã được lưu hoặc cập nhật");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnsave31ActionPerformed

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
            java.util.logging.Logger.getLogger(List_ThongtinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_ThongtinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_ThongtinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_ThongtinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_ThongtinCaNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labelttin31;
    private javax.swing.JTable Table31;
    private javax.swing.JButton btndelete31;
    private javax.swing.JButton btnnew31;
    private javax.swing.JButton btnsave31;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbchucvu31;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtma31;
    private javax.swing.JTextField txtname31;
    private javax.swing.JTextField txtngay31;
    private javax.swing.JTextField txtquequan31;
    // End of variables declaration//GEN-END:variables
}
