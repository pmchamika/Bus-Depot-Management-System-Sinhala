/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_Bimsara.Oparation;

import SLTB_Bimsara.DBCon;
import SLTB_Bimsara.Panel.BusRegistation.*;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Edu
 */
public class OparationTop extends javax.swing.JPanel {

    OparationMain opm = OparationMain.getobj();

    private static OparationTop ot;

    /**
     * Creates new form BusRegistationTop
     */
    private OparationTop() {
        initComponents();
    }

    public static OparationTop getobj() {
        if (ot == null) {
            ot = new OparationTop();
        }
        return ot;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchOparations = new javax.swing.JTextField();
        SearchBoxBusRegistation = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setMinimumSize(new java.awt.Dimension(1200, 60));
        setOpaque(false);

        SearchOparations.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        SearchOparations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOparationsActionPerformed(evt);
            }
        });
        SearchOparations.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchOparationsKeyPressed(evt);
            }
        });

        SearchBoxBusRegistation.setBackground(new java.awt.Color(0, 153, 255));
        SearchBoxBusRegistation.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        SearchBoxBusRegistation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esearch.png"))); // NOI18N
        SearchBoxBusRegistation.setText("fidhkak");
        SearchBoxBusRegistation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxBusRegistationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(SearchOparations, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(SearchBoxBusRegistation)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(SearchOparations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addComponent(SearchBoxBusRegistation, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchOparationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOparationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchOparationsActionPerformed

    private void SearchBoxBusRegistationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxBusRegistationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxBusRegistationActionPerformed

    private void SearchOparationsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchOparationsKeyPressed
        String x = SearchOparations.getText();
        if (x == null) {
            opm.loadTable();
        } else {
            String col = "select OparationId,dutyNo,BusNumber,StartTime,EndTime,RoutIdList,Distrance,Otype from oparations where OparationId like '" + x + "%' or dutyNo like '" + x + "%' or BusNumber like '%" + x + "%' or StartTime like '" + x + "%' or EndTime like '" + x + "%' or RoutIdList like '" + x + "%' or Distrance like '" + x + "%' or Otype like '" + x + "%';";
           // System.err.println(col);
            opm.viweBusListTable.setModel(DbUtils.resultSetToTableModel(DBCon.Search(col)));

            opm.viweBusListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));

            opm.viweBusListTable.getColumnModel().getColumn(0).setHeaderValue("Odjk wxlh");
            opm.viweBusListTable.getColumnModel().getColumn(1).setHeaderValue("ld??h wxl");
            opm.viweBusListTable.getColumnModel().getColumn(2).setHeaderValue("nia r: wxlh");
            opm.viweBusListTable.getColumnModel().getColumn(3).setHeaderValue("wdr??Nl fj,dj");
            opm.viweBusListTable.getColumnModel().getColumn(4).setHeaderValue("wjika fj,dj");
            opm.viweBusListTable.getColumnModel().getColumn(5).setHeaderValue("ud??. wxl");
            opm.viweBusListTable.getColumnModel().getColumn(6).setHeaderValue("??r");
            opm.viweBusListTable.getColumnModel().getColumn(7).setHeaderValue("fiajd j??.h");
            opm.setcolfront();
        }
    }//GEN-LAST:event_SearchOparationsKeyPressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBoxBusRegistation;
    private javax.swing.JTextField SearchOparations;
    // End of variables declaration//GEN-END:variables
}
