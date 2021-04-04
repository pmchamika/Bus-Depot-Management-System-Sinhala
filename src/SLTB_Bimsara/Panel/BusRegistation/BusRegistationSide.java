/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_Bimsara.Panel.BusRegistation;

import SLTB_Bimsara.Report.BusReport;
import SLTB_sachin.Temp;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class BusRegistationSide extends javax.swing.JPanel {

    private static BusRegistationSide brs;

    private BusRegistationSide() {
        initComponents();
    }

    public static BusRegistationSide getobj() {
        if (brs == null) {
            brs = new BusRegistationSide();
        }
        return brs;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddNewBusButton = new javax.swing.JButton();
        EditBusButton = new javax.swing.JButton();
        jButtonRoutIdReport = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(220, 280));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(220, 280));

        AddNewBusButton.setBackground(new java.awt.Color(0, 204, 0));
        AddNewBusButton.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        AddNewBusButton.setText("kj nia r; tl;= lsßu");
        AddNewBusButton.setMaximumSize(new java.awt.Dimension(182, 30));
        AddNewBusButton.setMinimumSize(new java.awt.Dimension(182, 30));
        AddNewBusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewBusButtonMouseClicked(evt);
            }
        });

        EditBusButton.setBackground(new java.awt.Color(204, 204, 0));
        EditBusButton.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        EditBusButton.setText("fjkia lsßï ");
        EditBusButton.setMaximumSize(new java.awt.Dimension(182, 30));
        EditBusButton.setMinimumSize(new java.awt.Dimension(182, 30));
        EditBusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBusButtonMouseClicked(evt);
            }
        });
        EditBusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBusButtonActionPerformed(evt);
            }
        });

        jButtonRoutIdReport.setBackground(new java.awt.Color(0, 0, 255));
        jButtonRoutIdReport.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        jButtonRoutIdReport.setText("jd¾;d");
        jButtonRoutIdReport.setMaximumSize(new java.awt.Dimension(182, 30));
        jButtonRoutIdReport.setMinimumSize(new java.awt.Dimension(182, 30));
        jButtonRoutIdReport.setPreferredSize(new java.awt.Dimension(182, 30));
        jButtonRoutIdReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRoutIdReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRoutIdReportMouseEntered(evt);
            }
        });
        jButtonRoutIdReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRoutIdReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRoutIdReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AddNewBusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditBusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(AddNewBusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(EditBusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonRoutIdReport, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewBusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBusButtonMouseClicked
        BusRegistationSide brs = BusRegistationSide.getobj();
        BusRegistationTop brt = BusRegistationTop.getobj();
        BusRegistationMain brm = BusRegistationMain.getobj();
        AddNewBus addNewBus = AddNewBus.getobj();

        brt.setVisible(false);
        brm.setVisible(false);
        brs.setVisible(false);
        addNewBus.setVisible(true);
        Temp t = Temp.temp1;
        t.mainsetpanel.add(addNewBus, t.cmain);

        //int x=BusRegistationMain.getobj().viweBusListTable.getSelectedRow();

    }//GEN-LAST:event_AddNewBusButtonMouseClicked

    private void EditBusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBusButtonActionPerformed

    }//GEN-LAST:event_EditBusButtonActionPerformed

    private void EditBusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBusButtonMouseClicked
        try {

            BusRegistationSide brs = BusRegistationSide.getobj();
            BusRegistationTop brt = BusRegistationTop.getobj();
            BusRegistationMain brm = BusRegistationMain.getobj();
            EditBus eb = EditBus.getobj();
            eb.setvalues();

            brt.setVisible(false);
            brm.setVisible(false);
            brs.setVisible(false);
            eb.setVisible(true);
            Temp t = Temp.temp1;
            t.mainsetpanel.add(eb, t.cmain);
        } catch (Exception e) {

            JLabel label = new JLabel("m<uqj ;Srejla f;darkak");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.setMessage(label);

            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = jOptionPane.createDialog(null, "Error");
            dialog.setVisible(true);
        }

    }//GEN-LAST:event_EditBusButtonMouseClicked

    private void jButtonRoutIdReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRoutIdReportMouseClicked
        try {

            BusRegistationSide brs = BusRegistationSide.getobj();
            BusRegistationTop brt = BusRegistationTop.getobj();
            BusRegistationMain brm = BusRegistationMain.getobj();
            BusReport br = BusReport.geobj();

            brt.setVisible(false);
            brm.setVisible(false);
            brs.setVisible(false);
            br.setVisible(true);
            Temp t = Temp.temp1;
            t.mainsetpanel.add(br, t.cmain);

        } catch (Exception e) {

            JLabel label = new JLabel("m<uqj ;Srejla f;darkak");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.setMessage(label);

            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = jOptionPane.createDialog(null, "Error");
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jButtonRoutIdReportMouseClicked

    private void jButtonRoutIdReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRoutIdReportActionPerformed

    }//GEN-LAST:event_jButtonRoutIdReportActionPerformed

    private void jButtonRoutIdReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRoutIdReportMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRoutIdReportMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewBusButton;
    private javax.swing.JButton EditBusButton;
    private javax.swing.JButton jButtonRoutIdReport;
    // End of variables declaration//GEN-END:variables
}
