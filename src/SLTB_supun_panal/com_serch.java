/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_supun_panal;

import com.ConnectionMysql.MysqlConnect;
import com.mysql.jdbc.Connection;
import com.sun.glass.events.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SUPUN
 */
public class com_serch extends javax.swing.JPanel {

    private static com_serch serch = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    //chooce_comp comp =null;

    /**
     * Creates new form com_serch
     */
    private com_serch() {
        initComponents();
        con = MysqlConnect.getDbCon();
        
       
    }

    public static com_serch getobj() {
        if (serch == null) {
            serch = new com_serch();
        }
        return serch;
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
        cserch_date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cserch_cid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cserch_type = new javax.swing.JTextField();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel1.setText("oskh ");

        cserch_date.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        cserch_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cserch_dateActionPerformed(evt);
            }
        });
        cserch_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cserch_dateKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel2.setText("wdh;k wx  ");

        cserch_cid.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        cserch_cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cserch_cidActionPerformed(evt);
            }
        });
        cserch_cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cserch_cidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cserch_cidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cserch_cidKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel3.setText("j¾.h ");

        cserch_type.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        cserch_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cserch_typeActionPerformed(evt);
            }
        });
        cserch_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cserch_typeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cserch_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cserch_type, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cserch_date, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cserch_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cserch_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cserch_type, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cserch_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cserch_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cserch_dateActionPerformed

    private void cserch_cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cserch_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cserch_cidActionPerformed

    private void cserch_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cserch_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cserch_typeActionPerformed

    private void cserch_cidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cserch_cidKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_cserch_cidKeyPressed

    private void cserch_cidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cserch_cidKeyReleased
        // TODO add your handling code here:
        chooce_comp s = chooce_comp.getobj();

        String id = cserch_cid.getText();
        String ty = cserch_type.getText();
        String da = cserch_date.getText();

        String sq = "SELECT cid as 'wxlh ',c_name as 'ku ',typeo as 'j¾.h ',validate_year as 'j ld,h ',phone_number as 'ÿ wx ',address as ',smskh ' ,e_maill as 'B fï,a ',validate_start_date as 'j wd osk' FROM supplier where cid LIKE '%" + id + "%' AND typeo LIKE '%" + ty + "%' AND validate_start_date LIKE '%" + da + "%'";
        s.setcolfront();
        try {
            pst = con.prepareStatement(sq);
            
            rs = pst.executeQuery();
           

            s.c_table.setModel(DbUtils.resultSetToTableModel(rs));
            s.setcolfront();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_cserch_cidKeyReleased

    private void cserch_typeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cserch_typeKeyReleased
        // TODO add your handling code here:
        chooce_comp s = chooce_comp.getobj();

        String id = cserch_cid.getText();
        String ty = cserch_type.getText();
        String da = cserch_date.getText();

        String sq = "SELECT cid as 'wxlh ',c_name as 'ku ',typeo as 'j¾.h ',validate_year as 'j ld,h ',phone_number as 'ÿ wx ',address as ',smskh ' ,e_maill as 'B fï,a ',validate_start_date as 'j wd osk' FROM supplier where cid LIKE '%" + id + "%' AND typeo LIKE '%" + ty + "%' AND validate_start_date LIKE '%" + da + "%'";

        try {
            pst = con.prepareStatement(sq);
            
            rs = pst.executeQuery();
            

            s.c_table.setModel(DbUtils.resultSetToTableModel(rs));
            s.setcolfront();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cserch_typeKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void cserch_cidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cserch_cidKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        String a = cserch_cid.getText();

        int i = a.length();
        if (i >= 5) {

            cserch_cid.setText(a.substring(0, i - 1));

        }

    }//GEN-LAST:event_cserch_cidKeyTyped

    private void cserch_dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cserch_dateKeyReleased
        // TODO add your handling code here:
        chooce_comp s = chooce_comp.getobj();

        String id = cserch_cid.getText();
        String ty = cserch_type.getText();
        String da = cserch_date.getText();

        String sq = "SELECT cid as 'wxlh ',c_name as 'ku ',typeo as 'j¾.h ',validate_year as 'j ld,h ',phone_number as 'ÿ wx ',address as ',smskh ' ,e_maill as 'B fï,a ',validate_start_date as 'j wd osk' FROM supplier where cid LIKE '%" + id + "%' AND typeo LIKE '%" + ty + "%' AND validate_start_date LIKE '%" + da + "%'";
        
        try {
            pst = con.prepareStatement(sq);
           
            rs = pst.executeQuery();
            

            s.c_table.setModel(DbUtils.resultSetToTableModel(rs));
            s.setcolfront();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cserch_dateKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cserch_cid;
    private javax.swing.JTextField cserch_date;
    private javax.swing.JTextField cserch_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
