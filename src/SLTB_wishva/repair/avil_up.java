/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_wishva.repair;

import com.ConnectionMysql.MysqlConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


public class avil_up extends javax.swing.JPanel {

    private static avil_up av=null;
     Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private avil_up() {
        initComponents();
    }

    public static avil_up getobj() {
        if (av == null) {
            av = new avil_up();
        }
        return  av;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        avil1 = new javax.swing.JTextField();
        year1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esearch.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        avil1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        avil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avil1ActionPerformed(evt);
            }
        });
        avil1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                avil1KeyReleased(evt);
            }
        });

        year1.setFont(new java.awt.Font("FMBindumathi", 1, 24)); // NOI18N
        year1.setForeground(new java.awt.Color(255, 255, 255));
        year1.setText("Odjk wxlh ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(avil1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jButton1)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avil1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(year1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void avil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avil1ActionPerformed

    private void avil1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avil1KeyReleased
     
  
    con = MysqlConnect.getDbCon();
      avil v = avil.getobj();
        try {
           
            //busrepair b=busrepair.getobj();
            String sql = "SELECT avno, ridno, activityno, sestar, pority, busno FROM avil where ridno LIKE '%" + avil1.getText() +  "%'";
            System.out.println(sql);
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
             
            
         
            v.avl.setModel(DbUtils.resultSetToTableModel(rs));

            

            v.avl.getColumnModel().getColumn(0).setHeaderValue("wxlh  ");
            v.avl.getColumnModel().getColumn(1).setHeaderValue("O w");
            v.avl.getColumnModel().getColumn(2).setHeaderValue("l' w'");
            v.avl.getColumnModel().getColumn(3).setHeaderValue("fia' wd'");
            v.avl.getColumnModel().getColumn(4).setHeaderValue("m%uq'");
            v.avl.getColumnModel().getColumn(5).setHeaderValue("mj ' nia ");
            // b.bus.setValueAt("", ERROR, WIDTH);
        } catch (Exception e) {
        }
        
        
        
        
        
    }//GEN-LAST:event_avil1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avil1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel year1;
    // End of variables declaration//GEN-END:variables

}