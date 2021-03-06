/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.Interface.IService;
import com.edusys.DAO.ChuyenDeDAO;
import com.edusys.helper.DialogHelper;
import com.edusys.helper.ShareHelper;
import com.edusys.model.ChuyenDe;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Dell
 */
public class QuanLyChuyenDeJInternalFrame extends javax.swing.JInternalFrame implements IService {

    /**
     * Creates new form QuanLyChuyenDeJInternalFrame
     */
    DefaultTableModel tblModel = new DefaultTableModel(new String[]{"MÃ CD", "TÊN CD", "HỌC PHÍ", "THỜI LƯỢNG", "HÌNH"}, 0);
    ChuyenDeDAO chuyenDeDAO = new ChuyenDeDAO();
    List<ChuyenDe> lst_chuyenDe = new ArrayList<>();
    int rowIndex = 0;

    public QuanLyChuyenDeJInternalFrame() {
        initComponents();
        init();
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
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_hinh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_maCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tenCD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_thoiLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_hocPhi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_moTa = new javax.swing.JTextArea();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_danhSachChuyenDe = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        jLabel2.setText("Hình logo");

        lbl_hinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        lbl_hinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hinhMouseClicked(evt);
            }
        });

        jLabel4.setText("Mã chuyên đề");

        jLabel5.setText("Tên chuyên đề");

        jLabel6.setText("Thời lượng");

        jLabel7.setText("Học phí");

        jLabel8.setText("Mô tả chuyên đề");

        txt_moTa.setColumns(20);
        txt_moTa.setRows(5);
        jScrollPane1.setViewportView(txt_moTa);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_moi.setText("Mới");
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });

        btn_first.setText("|<");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        btn_prev.setText("<<");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        btn_next.setText(">>");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_last.setText(">|");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_them)
                        .addGap(10, 10, 10)
                        .addComponent(btn_sua)
                        .addGap(10, 10, 10)
                        .addComponent(btn_xoa)
                        .addGap(10, 10, 10)
                        .addComponent(btn_moi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_first)
                        .addGap(6, 6, 6)
                        .addComponent(btn_prev)
                        .addGap(6, 6, 6)
                        .addComponent(btn_next)
                        .addGap(6, 6, 6)
                        .addComponent(btn_last))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_maCD, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_tenCD, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_hocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_maCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(txt_tenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(txt_thoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_hocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(btn_moi)
                    .addComponent(btn_first)
                    .addComponent(btn_prev)
                    .addComponent(btn_next)
                    .addComponent(btn_last))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", jPanel2);

        tbl_danhSachChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_danhSachChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_danhSachChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_danhSachChuyenDe);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_hinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hinhMouseClicked
        try {
            selectImage();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_lbl_hinhMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        insert();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        update();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        delete();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        clear();
    }//GEN-LAST:event_btn_moiActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        rowIndex = 0;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        rowIndex--;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        rowIndex++;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        rowIndex = tbl_danhSachChuyenDe.getRowCount() - 1;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_lastActionPerformed

    private void tbl_danhSachChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_danhSachChuyenDeMouseClicked
        rowIndex = tbl_danhSachChuyenDe.getSelectedRow();
        setModel(lst_chuyenDe.get(rowIndex));
        tabs.setSelectedIndex(0);
        setBtnEnabled(true);
    }//GEN-LAST:event_tbl_danhSachChuyenDeMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        ShareHelper.OPENING = false;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_hinh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_danhSachChuyenDe;
    private javax.swing.JTextField txt_hocPhi;
    private javax.swing.JTextField txt_maCD;
    private javax.swing.JTextArea txt_moTa;
    private javax.swing.JTextField txt_tenCD;
    private javax.swing.JTextField txt_thoiLuong;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setTitle("QUẢN LÝ CHUYÊN ĐỀ");
        this.setSize(800, 400);
        tbl_danhSachChuyenDe.setModel(tblModel);
        loadTable();
        setBtnEnabled(false);
        tabs.setSelectedIndex(1);
    }

    @Override
    public void loadTable() {
        try {
            lst_chuyenDe = chuyenDeDAO.selectAll();
            tblModel.setRowCount(0);
            for (ChuyenDe x : lst_chuyenDe) {
                tblModel.addRow(new Object[]{x.getMaCD(), x.getTenCD(), x.getHocPhi(), x.getThoiLuong(), x.getHinh()});
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    @Override
    public void setBtnEnabled(boolean maTonTai) {
        txt_maCD.setEnabled(!maTonTai);
        btn_them.setEnabled(!maTonTai);
        btn_sua.setEnabled(maTonTai);
        btn_xoa.setEnabled(maTonTai);

        boolean first = rowIndex > 0;
        boolean last = rowIndex < tbl_danhSachChuyenDe.getRowCount() - 1;
        btn_first.setEnabled(first && maTonTai);
        btn_last.setEnabled(last && maTonTai);
        btn_prev.setEnabled(first && maTonTai);
        btn_next.setEnabled(last && maTonTai);
    }

    @Override
    public StringBuilder checkField() {
        StringBuilder sb = new StringBuilder();
        String maCD = txt_maCD.getText();
        String tenCD = txt_tenCD.getText();
        String thoiLuong = txt_thoiLuong.getText();
        String hocPhi = txt_hocPhi.getText();
        if (maCD.isBlank() || tenCD.isBlank() || thoiLuong.isBlank() || hocPhi.isBlank()) {
            sb.append("Phải nhập đủ dữ liệu\n");
        }
        try {
            int tl = Integer.parseInt(thoiLuong);
            if (tl <= 0) {
                sb.append("Thời lượng phải > 0\n");
            }
        } catch (Exception e) {
            sb.append("Thời lượng phải là số nguyên\n");
        }
        try {
            double hp = Double.parseDouble(hocPhi);
            if (hp <= 0) {
                sb.append("Học phí phải > 0\n");
            }
        } catch (Exception e) {
            sb.append("Học phí phải là số\n");
        }
        return sb;
    }

    @Override
    public void insert() {
        if (getModel() != null) {
            try {
                chuyenDeDAO.insert(getModel());
                loadTable();
                clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
        }
    }

    @Override
    public void update() {
        if (getModel() != null) {
            try {
                chuyenDeDAO.update(getModel());
                loadTable();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    @Override
    public void delete() {
        if (ShareHelper.USER.isVaiTro()) {
            if (rowIndex >= 0) {
                if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
                    String manv = txt_maCD.getText();
                    try {
                        chuyenDeDAO.delete(manv);
                        loadTable();
                        clear();
                        DialogHelper.alert(this, "Xóa thành công!");
                    } catch (Exception e) {
                        DialogHelper.alert(this, "Xóa thất bại!");
                    }
                }
            }
        } else {
            DialogHelper.alert(this, "Chỉ trưởng phòng mới có quyền xóa!");
        }

    }

    @Override
    public void clear() {
        setModel(new ChuyenDe());
        txt_hocPhi.setText("");
        txt_thoiLuong.setText("");
        lbl_hinh.setIcon(null);
        setBtnEnabled(false);
    }

    private void selectImage() throws IOException {
        JFileChooser fc = new JFileChooser("logos\\");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            if (ShareHelper.saveLogo(file)) {
                lbl_hinh.setIcon(ShareHelper.readLogo(file.getName()));
                lbl_hinh.setToolTipText(file.getName());
            }
        }
    }

    void setModel(ChuyenDe model) {
        txt_maCD.setText(model.getMaCD());
        txt_tenCD.setText(model.getTenCD());
        txt_thoiLuong.setText(model.getThoiLuong() + "");
        txt_hocPhi.setText(model.getHocPhi() + "");
        txt_moTa.setText(model.getMoTa());
        lbl_hinh.setToolTipText(model.getHinh());
        if (model.getHinh() != null) {
            lbl_hinh.setIcon(ShareHelper.readLogo(model.getHinh()));
        }
        setBtnEnabled(true);
    }

    ChuyenDe getModel() {
        if (checkField().length() > 0) {
            DialogHelper.alert(this, checkField().toString());
            return null;
        }
        return new ChuyenDe(txt_maCD.getText(), txt_tenCD.getText(), Double.parseDouble(txt_hocPhi.getText()),
                Integer.parseInt(txt_thoiLuong.getText()), lbl_hinh.getToolTipText(), txt_moTa.getText());
    }
}
