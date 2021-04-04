/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_wishva.repair;

import SLTB_sachin.Temp;
import static SLTB_wishva.repair.busrepair.viewer;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Wishva
 */
public class avil extends javax.swing.JPanel {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private Pattern regexPattern;
    private Matcher regMatcher;
    public static JRViewer viewer = null;
    public static avil avi = null;

    public avil() {
        initComponents();
        avl.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 15));

        con = MysqlConnect.getDbCon();
        tableload();
    }

    public static avil getobj() {
        if (avi == null) {
            avi = new avil();
        }
        return avi;
    }

    public String Validateticket_avl() {

        String dda = da.getText();
        String kka = ka.getText();
        String ssa = sa.getText();

        String snm = nm.getText();

        if (dda.equals("")) {
            a1.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";

        } else {
            regexPattern = Pattern.compile("^[0-9]{1,5}");
            regMatcher = regexPattern.matcher(dda);
            if (regMatcher.matches()) {
                a1.setText("");
            } else {
                a1.setText(" Ojk wxlh jeros  ");
                return "fail";
            }

            if (kka.equals("")) {
                a2.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
                return "fail";

            } else {
                regexPattern = Pattern.compile("^[0-9]{1,10}");
                regMatcher = regexPattern.matcher(kka);
                if (regMatcher.matches()) {
                    a2.setText("");
                } else {
                    a2.setText(" lrhh  wxlh jeros  ");
                    return "fail";
                }

                if (ssa.equals("")) {
                    a3.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
                    return "fail";

                } else {
                    a3.setText("");

                }

            }
            if (snm.equals("")) {
                a4.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
                return "fail";

            } else {
                regexPattern = Pattern.compile("^[A-Z-0-9]{6,8}$");
                regMatcher = regexPattern.matcher(snm);
                if (regMatcher.matches()) {
                    a4.setText("");
                } else {
                    a4.setText("nia r: wxlh jeros");
                    return "fail";
                }

            }

        }

        return "success";

    }

    public void setcolfront() {
        DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
            Font font = new Font("Calibri", Font.PLAIN, 14);

            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                        row, column);
                setFont(font);
                return this;
            }

        };

        avl.getColumnModel().getColumn(5).setCellRenderer(r);
         avl.getColumnModel().getColumn(3).setCellRenderer(r);
        //parts.getColumnModel().getColumn(4).setCellRenderer(r);
    }

    public void tableload() {

        try {
            String sql = "SELECT  avno, ridno, activityno, sestar, pority, busno FROM avil";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            avl.setModel(DbUtils.resultSetToTableModel(rs));

            setcolfront();

            avl.getColumnModel().getColumn(0).setHeaderValue("wxlh  ");
            avl.getColumnModel().getColumn(1).setHeaderValue("O w");
            avl.getColumnModel().getColumn(2).setHeaderValue("l' w'");
            avl.getColumnModel().getColumn(3).setHeaderValue("fia' wd'");
            avl.getColumnModel().getColumn(4).setHeaderValue("m%uq'");
            avl.getColumnModel().getColumn(5).setHeaderValue("mj ' nia ");

        } catch (Exception e) {

        }

    }

    private void clear() {

        id.setText(null);
        da.setText(null);
        ka.setText(null);
        sa.setText(null);
        po.setSelectedItem(null);
        nm.setText(null);

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
        jLabel2 = new javax.swing.JLabel();
        da = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ka = new javax.swing.JTextField();
        sa = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        avl = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        po = new javax.swing.JComboBox<>();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel1.setText("wo osk mj;sk nia r:  .Kk ");

        da.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel3.setText("Odjk wxlh ");

        jLabel4.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel4.setText("lrhh wxlh ");

        jLabel5.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel5.setText("fiajd wdrïNh ");

        jLabel6.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel6.setText("m%uqL;ajh");

        jLabel7.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        jLabel7.setText("s");

        jLabel8.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel8.setText("mj;sk nia r:");

        sa.setToolTipText("00:00");

        avl.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        avl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "wxlh ", "O w ", "l' w' ", "fia' wd' ", "m%uq' ", "mj ' nia "
            }
        ));
        avl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avlMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(avl);

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 255, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eadd.png"))); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        po.setBackground(new java.awt.Color(102, 255, 51));
        po.setForeground(new java.awt.Color(255, 51, 0));
        po.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        a1.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N

        a2.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N

        a3.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N

        a4.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N

        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/request-report.png"))); // NOI18N
        report.setText("Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        jButton1.setText("Demo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nm, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(sa, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(ka, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(po, 0, 232, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7))
                                    .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(da, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton6)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(507, 507, 507))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void daActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do You really want to Delete");

        if (x == 0) {

            String sid = id.getText();

            String sql = "DELETE from avil where avno   ='" + sid + "'";
            try {

                pst = con.prepareStatement(sql);
                pst.execute();
                tableload();
                       JOptionPane.showMessageDialog(null, "succefully Deleted");
                clear();
            } catch (Exception e) {

                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String dda = da.getText();
        String kka = ka.getText();
        String ssa = sa.getText();
        String spo = po.getSelectedItem().toString();
        String snm = nm.getText();

        try {
            String valid = Validateticket_avl();
            if (valid.equals("success")) {
                String q = "INSERT INTO avil (ridno, activityno, sestar,pority,busno) values( '" + dda + "','" + kka + "','" + ssa + "','" + spo + "','" + snm + "')";
                pst = con.prepareCall(q);
                pst.execute();

                tableload();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do You really want to update");
        if (x == 0) {

            String sid = id.getText();
            String dda = da.getText();
            String kka = ka.getText();
            String ssa = sa.getText();
            String spo = po.getSelectedItem().toString();
            String snm = nm.getText();

            try {
                String valid = Validateticket_avl();
                if (valid.equals("success")) {
                    String sql = "UPDATE  avil SET   ridno ='" + dda + "',busno ='" + snm + "', activityno ='" + kka + "',sestar ='" + ssa + "', pority='" + spo + "' where avno ='" + sid + "' ";

                    pst = con.prepareStatement(sql);
                    pst.execute();

                    tableload();
                    JOptionPane.showMessageDialog(null, "succefully Updated");
                    clear();
                }
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void avlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avlMouseClicked

        int r = avl.getSelectedRow();

        String sid = avl.getValueAt(r, 0).toString();
        String dda = avl.getValueAt(r, 1).toString();
        String kka = avl.getValueAt(r, 2).toString();
        String ssa = avl.getValueAt(r, 3).toString();
        String spo = avl.getValueAt(r, 4).toString();
        String snm = avl.getValueAt(r, 5).toString();

        id.setText(sid);
        da.setText(dda);
        ka.setText(kka);
        sa.setText(ssa);
        po.setSelectedItem(spo);
        nm.setText(snm);


    }//GEN-LAST:event_avlMouseClicked

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:

        avil av = avil.getobj();
        avil_up avi = avil_up.getobj();

        if (report.getText().equalsIgnoreCase("Report")) {
            report.setBackground(new java.awt.Color(255, 51, 51));
            report.setText("Cancel");

            av.setVisible(false);
            avi.setVisible(false);
            report("src\\SLTB_wishva\\report\\avil.jasper");

        } else if (report.getText().equalsIgnoreCase("Cancel")) {
            report.setBackground(new java.awt.Color(102, 153, 255));
            report.setText("Report");
            av.setVisible(true);
            viewer.setVisible(false);
            avi.setVisible(true);

        }
    }//GEN-LAST:event_reportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                da.setText("12345");
         	ka.setText("45678");
         	sa.setText("10.30");
         	po.setSelectedItem(1);
         	nm.setText("NB-4567");    
    }//GEN-LAST:event_jButton1ActionPerformed

    public void report(String reportPath) {

        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;
        Map par = new HashMap();
        //par.put("de", 1234);

        viewer = null;

        //Generating reports inside jpanel
        try {

            JasperPrint print = JasperFillManager.fillReport(reportPath, par, conn);
            viewer = new JRViewer(print);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            viewer.setPreferredSize(new Dimension(1149, 710));
        } catch (Exception e) {
            e.printStackTrace();
        }

        te.mainsetpanel.add(viewer, te.cmain);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    public javax.swing.JTable avl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField da;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ka;
    private javax.swing.JTextField nm;
    private javax.swing.JComboBox<String> po;
    private javax.swing.JButton report;
    private javax.swing.JTextField sa;
    // End of variables declaration//GEN-END:variables
}
