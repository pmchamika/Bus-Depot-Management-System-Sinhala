/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_Bimsara.Report;

import SLTB_Bimsara.DBCon;
import SLTB_Bimsara.Oparation.OparationMain;
import SLTB_Bimsara.Oparation.OparationSide;
import SLTB_Bimsara.Oparation.OparationTop;
import SLTB_sachin.Temp;
import com.mysql.jdbc.Connection;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author Edu
 */
public class OparationReport extends javax.swing.JPanel {

    private static OparationReport oparationReport = null;
    DefaultComboBoxModel dr = new DefaultComboBoxModel();

    private OparationReport() {
        initComponents();

        //setvalues for route number combo box
       
    }

    public static OparationReport getobj() {
        if (oparationReport == null) {
            oparationReport = new OparationReport();
        }
        return oparationReport;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonall = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonse = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setMinimumSize(new java.awt.Dimension(1149, 710));

        jButtonall.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jButtonall.setText("jd??;dj");
        jButtonall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonallMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel1.setText("ud??. wkalh ");

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel2.setText("wkqj ");

        jButtonRout.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jButtonRout.setText("jd??;dj");
        jButtonRout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRoutMouseClicked(evt);
            }
        });
        jButtonRout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel3.setText("fiajh");

        jLabel4.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel4.setText("wkqj ");

        jButtonse.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jButtonse.setText("jd??;dj");
        jButtonse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonseMouseClicked(evt);
            }
        });
        jButtonse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonseActionPerformed(evt);
            }
        });

        jButtonBack.setFont(new java.awt.Font("FMBindumathi", 1, 24)); // NOI18N
        jButtonBack.setText("wdmiq ");
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel5.setText("i??mQ??K ");

        jLabel6.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel6.setText("Odjk jd??;d");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonse, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRout, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonall, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBack)
                        .addGap(196, 196, 196)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(86, 86, 86)
                        .addComponent(jButtonBack)
                        .addGap(154, 154, 154))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButtonall)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonRout)
                        .addGap(71, 71, 71)
                        .addComponent(jButtonse)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRoutActionPerformed

    private void jButtonseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonseActionPerformed

    private void jButtonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseClicked
        try {
            OparationSide os = OparationSide.getobj();
            OparationTop ot = OparationTop.getobj();
            OparationMain om = OparationMain.getobj();
            OparationReport oparationReport = OparationReport.getobj();

            ot.setVisible(true);
            om.setVisible(true);
            os.setVisible(true);
            oparationReport.setVisible(false);

            Temp t = Temp.temp1;
            t.mainsetpanel.add(om, t.cmain);
            t.sidesetpanel.add(os, t.cside);
            t.upsetpanel.add(ot, t.upsetpanel);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonBackMouseClicked

    private void jButtonallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonallMouseClicked
       
         try {
            String rep = "src\\SLTB_Bimsara\\Report\\FullOparationReport.jasper";

            Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
            Map par = new HashMap();

            par.put("st", 0);
            JasperPrint jasP = JasperFillManager.fillReport(rep, par, conn);

            JFrame report = new JFrame("All Oparation Report");
            report.getContentPane().add(new JRViewer(jasP));
            report.pack();
            report.setVisible(true);
            report.setMinimumSize(getMaximumSize());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonallMouseClicked

    private void jButtonRoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRoutMouseClicked
          try {
            String rep = "src\\SLTB_Bimsara\\Report\\reportByRout.jasper";

            Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
            Map par = new HashMap();
            par.put("st",0);
            JasperPrint jasP = JasperFillManager.fillReport(rep, par, conn);

            JFrame report = new JFrame("All Oparation Report");
            report.getContentPane().add(new JRViewer(jasP));
            report.pack();
            report.setVisible(true);
            report.setMinimumSize(getMaximumSize());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRoutMouseClicked

    private void jButtonseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonseMouseClicked
       try {
            String rep = "src\\SLTB_Bimsara\\Report\\reportByservice.jasper";

            Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
            Map par = new HashMap();
            par.put("st",0);
            JasperPrint jasP = JasperFillManager.fillReport(rep, par, conn);

            JFrame report = new JFrame("All Oparation Report");
            report.getContentPane().add(new JRViewer(jasP));
            report.pack();
            report.setVisible(true);
            report.setMinimumSize(getMaximumSize());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRout;
    private javax.swing.JButton jButtonall;
    private javax.swing.JButton jButtonse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
