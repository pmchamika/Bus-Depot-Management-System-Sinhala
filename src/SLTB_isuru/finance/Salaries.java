/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_isuru.finance;

import SLTB_isuru.Class.Finance;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class Salaries extends javax.swing.JPanel {

    private static Salaries Sal = null;

    public Salaries() {
        initComponents();
    }

    public static Salaries getobj() {
        if (Sal == null) {
            Sal = new Salaries();
        }
        return Sal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gen10 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        gen1 = new javax.swing.JLabel();
        bonus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        gen9 = new javax.swing.JLabel();
        basic = new javax.swing.JTextField();
        loans = new javax.swing.JTextField();
        ot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalariesTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1149, 710));

        gen10.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        gen10.setText("Kh ");

        label.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        label.setText("w;sld,");

        gen1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        gen1.setText("w;sf¾l oSukd ");

        bonus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel3.setText("mä rys; ksjdvq osk .Kk");

        days.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysActionPerformed(evt);
            }
        });

        gen9.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        gen9.setText("uq,sl fõ;kh ");

        basic.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicActionPerformed(evt);
            }
        });

        loans.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        loans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansActionPerformed(evt);
            }
        });

        ot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel4.setText("fõ;k wxlh ");

        date.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));

        SalariesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(SalariesTable);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("DEMO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen10)
                            .addComponent(gen1)
                            .addComponent(label)
                            .addComponent(jLabel3)
                            .addComponent(gen9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bonus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(basic)
                                    .addComponent(loans, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ot)
                                    .addComponent(date))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loans, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen10)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonusActionPerformed

    private void daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysActionPerformed

    private void loansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loansActionPerformed

    private void otActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ID = "44";
        date.setText(ID);
        String BONUS = "1000";
        bonus.setText(BONUS);
        String OT = "2100";
        ot.setText(OT);
        String DATE = "44";
        date.setText(DATE);
        String LD = "3";
        days.setText(LD);
        String BS = "25000";
        basic.setText(BS);
        String LNS = "2000";
        loans.setText(LNS);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void TableLoad1() {
        try {
            //String se = IncomeUp.getobj().search.getText();
            SalariesTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));

            Connection conn = MysqlConnect.getDbCon();

            String query = "select SalaryID,LeaveDays,BookingOT,OtherBonus,Loans,BasicSal,Total from monthlysalary";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            SalariesTable.setModel(DbUtils.resultSetToTableModel(rs));

            SalariesTable.getColumn("SalaryID").setHeaderValue("fõ;k wxlh  ");
            SalariesTable.getColumn("LeaveDays").setHeaderValue("ksjdvq osk ");
            SalariesTable.getColumn("BookingOT").setHeaderValue("w;sld,");
            SalariesTable.getColumn("OtherBonus").setHeaderValue("uq,sl fõ;kh ");
            SalariesTable.getColumn("Loans").setHeaderValue("w;sf¾l oSukd ");
            SalariesTable.getColumn("BasicSal").setHeaderValue("Kh  ");
            SalariesTable.getColumn("Total").setHeaderValue("fõ;kh  ");
            SalariesTable.repaint();

        } catch (Exception e) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SalariesTable;
    public javax.swing.JTextField basic;
    public javax.swing.JTextField bonus;
    public javax.swing.JTextField date;
    public javax.swing.JTextField days;
    private javax.swing.JLabel gen1;
    private javax.swing.JLabel gen10;
    private javax.swing.JLabel gen9;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    public javax.swing.JTextField loans;
    public javax.swing.JTextField ot;
    // End of variables declaration//GEN-END:variables
}
