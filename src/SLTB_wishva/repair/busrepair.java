/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_wishva.repair;

import SLTB_chamika.employee.ManageEmployee;
import SLTB_chamika.employee.ManageEmployeeUp;
import SLTB_sachin.Temp;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class busrepair extends javax.swing.JPanel {

    public static JRViewer viewer = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private Pattern regexPattern;
    private Matcher regMatcher;
    /**
     * Creates new form busrepair
     */
    private static busrepair busre = null;

    busrepair() {
        initComponents();
        // connect to db//
        bus.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 15));

        con = MysqlConnect.getDbCon();
        tableload();

    }

    public static busrepair getobj() {
        if (busre == null) {
            busre = new busrepair();
        }
        return busre;
    }

    public String Validateticket_bus() {

        String bn1 = bno.getText();
        String plac = placeofacc.getText();
        String dplac = detailofacc.getText();
        String antbus = anotherbus.getText();
        String Dtn = Dutyno.getText();
        String hov = hovt.getText();
        String afh = fhovt.getText();
        String rm1 = rm.getText();

        if (bn1.equals("")) {
            a1.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";

        } else {
            regexPattern = Pattern.compile("^[A-Z-0-9]{3,7}$");
            regMatcher = regexPattern.matcher(bn1);
            if (regMatcher.matches()) {
                a1.setText("");
            } else {
                a1.setText("nia r: wxlh jeros");
                return "fail";
            }

        }
        if (plac.equals("")) {
            a2.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";
        } else {
            a2.setText("");

        }

        if (dplac.equals("")) {
            a3.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";

        } else {
            a3.setText("");

        }

        if (antbus.equals("")) {
            a4.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";

        } else {
            regexPattern = Pattern.compile("^[A-Z-0-9]{6,8}$");
            regMatcher = regexPattern.matcher(antbus);
            if (regMatcher.matches()) {
                a4.setText("");
            } else {
                a4.setText("nia r: wxlh jeros");
                return "fail";
            }

        }
        if (Dtn.equals("")) {
            a5.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";

        } else {
            regexPattern = Pattern.compile("^[0-9]{2,10}");
            regMatcher = regexPattern.matcher(Dtn);
            if (regMatcher.matches()) {
                a5.setText("");
            } else {
                a5.setText("lrhh wxlh jeros ");
                return "fail";
            }

        }
        if (hov.equals("")) {
            a6.setText("l¾hh wxlh jeros ");
            return "fail";

        } else {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
                Date parsedDate = dateFormat.parse(hov);
                Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                Date date = new Date();
                Timestamp ts = new Timestamp(date.getTime());
                if (ts.after(timestamp)) {
                    a6.setText("");
                } else {
                    a6.setText("oskh fyd fõ,j jeros ");
                    return "fail";
                }
            } catch (Exception e) { //this generic but you can control nother types of exception
                a6.setText("oskh fyd fõ,j jeros ");
                return "fail";
            }

        }
        if (afh.equals("")) {
            a7.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";

        } else {
            /*regexPattern = Pattern.compile("[0-9]{1,4}/[0-9]{1,2}/[0-9]{1,2} [0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}");
            regMatcher = regexPattern.matcher(afh);
            if (regMatcher.matches()) {
                a7.setText("");
            } else {
                a7.setText("cd;sl yeÿkqïm;a  wxlh ksje/os fkdfõ ");
                return "fail";
            }*/

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
                Date parsedDate = dateFormat.parse(afh);
                Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                Date date = new Date();
                Timestamp ts = new Timestamp(date.getTime());
                if (ts.after(timestamp)) {
                    a7.setText("");
                } else {
                    a7.setText("oskh fyd fõ,j jeros ");
                    return "fail";
                }
            } catch (Exception e) { //this generic but you can control nother types of exception
                a7.setText("oskh fyd fõ,j jeros ");
                return "fail";
            }
        }

        if (rm1.equals("")) {
            a8.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
            return "fail";

        } else {
            regexPattern = Pattern.compile("^[0-9]{3}");
            regMatcher = regexPattern.matcher(rm1);
            if (regMatcher.matches()) {
                a8.setText("");
            } else {
                a8.setText(" ÿr m%udkh jeros  ");
                return "fail";
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
        bus.getColumnModel().getColumn(1).setCellRenderer(r);
        bus.getColumnModel().getColumn(3).setCellRenderer(r);
        bus.getColumnModel().getColumn(5).setCellRenderer(r);
        bus.getColumnModel().getColumn(6).setCellRenderer(r);

    }

    public void tableload() {

        try {
            String sql = "SELECT repreqno, busno, placeofacc, busesinof, dno, hovt, hovft, remaingDestance FROM busrepair";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            bus.setModel(DbUtils.resultSetToTableModel(rs));
            setcolfront();
            bus.getColumnModel().getColumn(0).setHeaderValue("wxlh ");
            bus.getColumnModel().getColumn(1).setHeaderValue("n' wx'");
            bus.getColumnModel().getColumn(2).setHeaderValue("w'is'jq ");
            bus.getColumnModel().getColumn(3).setHeaderValue(" fjkq'ni ");
            bus.getColumnModel().getColumn(4).setHeaderValue(" l'w ");
            bus.getColumnModel().getColumn(5).setHeaderValue(",f'j,d	");
            bus.getColumnModel().getColumn(6).setHeaderValue("w', ÿka ");
            bus.getColumnModel().getColumn(7).setHeaderValue("b'ÿ' ");
            // bus.setValueAt("", ERROR, WIDTH);

        } catch (Exception e) {

        }

    }

    private void clear() {

        id.setText(null);
        bno.setText(null);

        placeofacc.setText(null);
        detailofacc.setText(null);
        anotherbus.setText(null);
        Dutyno.setText(null);
        hovt.setText(null);
        fhovt.setText(null);
        rm.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        placeofacc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hovt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        anotherbus = new javax.swing.JTextField();
        Dutyno = new javax.swing.JTextField();
        fhovt = new javax.swing.JTextField();
        rm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bus = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailofacc = new javax.swing.JTextArea();
        id = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        report = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1149, 710));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bn.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        bn.setText("niar: wxlh");
        add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 107, 110, 24));

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 0, 48)); // NOI18N
        jLabel2.setText("niar: w¨;a jeähdj  ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 13, -1, 63));

        bno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnoActionPerformed(evt);
            }
        });
        bno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bnoKeyReleased(evt);
            }
        });
        add(bno, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 108, 267, -1));

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        jLabel3.setText("wk;=r isÿjQ ia:dkh ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 171, -1, 24));

        placeofacc.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        placeofacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeofaccActionPerformed(evt);
            }
        });
        add(placeofacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 172, 267, -1));

        jLabel4.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        jLabel4.setText("wk;=f¾ úia;r ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 242, 153, -1));

        jLabel5.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        jLabel5.setText("fjkqjg fhÿkq nih ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 165, -1));

        hovt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hovtActionPerformed(evt);
            }
        });
        add(hovt, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 440, 267, -1));

        jLabel6.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        jLabel6.setText("ld¾hh wxlh ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 376, 139, 34));

        anotherbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anotherbusActionPerformed(evt);
            }
        });
        add(anotherbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 313, 267, -1));
        add(Dutyno, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 382, 267, -1));

        fhovt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fhovtActionPerformed(evt);
            }
        });
        add(fhovt, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 503, 267, -1));

        rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmActionPerformed(evt);
            }
        });
        add(rm, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 566, 267, -1));

        jLabel7.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        jLabel7.setText(",nd.;a fj,dj ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 441, 131, -1));

        jLabel8.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        jLabel8.setText("wmiq  ÿka fj,dj");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 503, 139, 22));

        jLabel9.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        jLabel9.setText("b;sß ÿr ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 566, 139, 22));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eadd.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 630, 160, 48));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 629, -1, 51));

        bus.setFont(new java.awt.Font("FMBindumathi", 0, 14)); // NOI18N
        bus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                " wxlh ", "n' wx'", "w'is'jq ", " fjkq'ni ", " l'w", ",f'j,d", "w', ÿka ", "b;s'ÿ "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bus);
        if (bus.getColumnModel().getColumnCount() > 0) {
            bus.getColumnModel().getColumn(1).setPreferredWidth(150);
            bus.getColumnModel().getColumn(2).setPreferredWidth(150);
            bus.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 125, 590, 500));

        detailofacc.setColumns(20);
        detailofacc.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        detailofacc.setRows(5);
        jScrollPane2.setViewportView(detailofacc);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 225, 267, 58));
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 77, 21, 17));

        a1.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 138, 110, 10));

        a2.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 202, 140, 10));

        a3.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 290, 150, 10));

        a4.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 342, 160, 10));

        a5.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 417, 170, 10));

        a6.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 470, 150, 20));

        a7.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 543, 169, 10));

        a8.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 595, 191, 10));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 629, -1, 51));

        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/request-report.png"))); // NOI18N
        report.setText("Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 640, 130, 50));

        jButton3.setText("Demo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 120, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void bnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnoActionPerformed

    private void bnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bnoKeyReleased


    }//GEN-LAST:event_bnoKeyReleased

    private void placeofaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeofaccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeofaccActionPerformed

    private void anotherbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotherbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anotherbusActionPerformed

    private void hovtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hovtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hovtActionPerformed

    private void fhovtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fhovtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fhovtActionPerformed

    private void rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String bn1 = bno.getText();
        String plac = placeofacc.getText();
        String dplac = detailofacc.getText();
        String antbus = anotherbus.getText();
        String Dtn = Dutyno.getText();
        String hov = hovt.getText();
        String afh = fhovt.getText();
        String rm1 = rm.getText();

        try {
            String valid = Validateticket_bus();
            if (valid.equals("success")) {
                String q = "INSERT INTO busrepair (busno,placeofacc,detailacc,busesinof,dno,hovt,hovft,remaingDestance) values( '" + bn1 + "','" + plac + "','" + dplac + "','" + antbus + "','" + Dtn + "','" + hov + "','" + afh + "','" + rm1 + "')";
                pst = con.prepareStatement(q);
                pst.execute();

                tableload();
                JOptionPane.showMessageDialog(null, "succefully Entered");
                clear();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do You really want to update");
        if (x == 0) {
            String sid = id.getText();
            String sbno = bno.getText();
            String splaceofacc = placeofacc.getText();
            String sdetailofacc = detailofacc.getText();
            String sanotherbus = anotherbus.getText();
            String sDutyno = Dutyno.getText();
            String shovt = hovt.getText();
            String sfhovt = fhovt.getText();
            String srm = rm.getText();
            try {
                String valid = Validateticket_bus();
                if (valid.equals("success")) {
                    String sql = "UPDATE busrepair SET   busno='" + sbno + "', placeofacc ='" + splaceofacc + "',detailacc ='" + sdetailofacc + "',busesinof='" + sanotherbus + "' ,dno='" + sDutyno + "',hovt='" + shovt + "',hovft='" + sfhovt + "',remaingDestance='" + srm + "' where repreqno ='" + sid + "' ";

                    pst = con.prepareStatement(sql);
                    pst.execute();

                    tableload();

                    JOptionPane.showMessageDialog(null, "succefully Updated");
                    clear();
                }
            } catch (Exception e) {
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void busMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busMouseClicked
        try {
            int r = bus.getSelectedRow();

            String sid = bus.getValueAt(r, 0).toString();
            String sbno = bus.getValueAt(r, 1).toString();
            String splaceofacc = bus.getValueAt(r, 2).toString();

            String sanotherbus = bus.getValueAt(r, 3).toString();
            String sDutyno = bus.getValueAt(r, 4).toString();
            String shovt = bus.getValueAt(r, 5).toString();
            String sfhovt = bus.getValueAt(r, 6).toString();
            String srm = bus.getValueAt(r, 7).toString();

            String sql2 = "SELECT detailacc from busrepair WHERE repreqno ='" + sid + "' ";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();

            while (rs.next()) {

                String busesinof = rs.getString("detailacc");
                detailofacc.setText(busesinof);

            }

            id.setText(sid);
            bno.setText(sbno);
            placeofacc.setText(splaceofacc);

            anotherbus.setText(sanotherbus);
            Dutyno.setText(sDutyno);
            hovt.setText(shovt);
            fhovt.setText(sfhovt);
            rm.setText(srm);
        } catch (Exception e) {

        }


    }//GEN-LAST:event_busMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do You really want to Delete");

        if (x == 0) {

            String sid = id.getText();

            String sql = "DELETE from busrepair where repreqno ='" + sid + "' ";
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:

        busrepair busre = busrepair.getobj();
        rep_up rep = rep_up.getobj();

        if (report.getText().equalsIgnoreCase("Report")) {
            report.setBackground(new java.awt.Color(255, 51, 51));
            report.setText("Cancel");

            busre.setVisible(false);
            rep.setVisible(false);
            report("src\\SLTB_wishva\\report\\busrep.jasper");

        } else if (report.getText().equalsIgnoreCase("Cancel")) {
            report.setBackground(new java.awt.Color(102, 153, 255));
            report.setText("Report");
            busre.setVisible(true);
            viewer.setVisible(false);
            rep.setVisible(true);

        }
    }//GEN-LAST:event_reportActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          bno.setText("NA-4258");
            placeofacc.setText("wkqromqr ");
            detailofacc.setText(".il .eàula ");
            anotherbus.setText("NW-5569");
            Dutyno.setText("4567");
            hovt.setText("2015-02-16 07:10:00.0");
            fhovt.setText("2016-02-16 07:10:00.0");
            rm.setText("40");
    }//GEN-LAST:event_jButton3ActionPerformed

    public void report(String reportPath) {

        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;
        Map par = new HashMap();
        par.put("de", 100);

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
    private javax.swing.JTextField Dutyno;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JTextField anotherbus;
    private javax.swing.JLabel bn;
    private javax.swing.JTextField bno;
    public javax.swing.JTable bus;
    private javax.swing.JTextArea detailofacc;
    private javax.swing.JTextField fhovt;
    private javax.swing.JTextField hovt;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField placeofacc;
    private javax.swing.JButton report;
    private javax.swing.JTextField rm;
    // End of variables declaration//GEN-END:variables
}
