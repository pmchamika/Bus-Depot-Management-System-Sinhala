/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_Bimsara.Route;

import SLTB_Bimsara.DBCon;
import SLTB_Bimsara.Panel.BusRegistation.*;
import java.awt.Font;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Edu
 */
public class RouteIdTop extends javax.swing.JPanel {

    RouteIdMain routeIdMain = RouteIdMain.getobj();

    private static RouteIdTop rt;

    /**
     * Creates new form BusRegistationTop
     */
    private RouteIdTop() {
        initComponents();
    }

    public static RouteIdTop getobj() {
        if (rt == null) {
            rt = new RouteIdTop();
        }
        return rt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchRout = new javax.swing.JTextField();
        SearchBoxBusRegistation = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setMinimumSize(new java.awt.Dimension(1200, 60));
        setOpaque(false);

        SearchRout.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        SearchRout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchRoutActionPerformed(evt);
            }
        });
        SearchRout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchRoutKeyPressed(evt);
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
                .addComponent(SearchRout, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(SearchBoxBusRegistation)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchRout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBoxBusRegistation, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchRoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchRoutActionPerformed

    private void SearchBoxBusRegistationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxBusRegistationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxBusRegistationActionPerformed

    private void SearchRoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchRoutKeyPressed
        String x = SearchRout.getText();
        if (x == null) {
            routeIdMain.loadTable();
        } else {
            String col = "select RoutId,StartPoint,EndPoint,BusTypeList,Distance,SpNote from rout where RoutId like '" + x + "%' or StartPoint like '" + x + "%' or EndPoint like '%" + x + "%' or BusTypeList like '" + x + "%' or Distance like '" + x + "%' or SpNote like '" + x + "%';";
            // System.err.println(col);
            routeIdMain.RoutIdListTable.setModel(DbUtils.resultSetToTableModel(DBCon.Search(col)));

            routeIdMain.RoutIdListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));

            routeIdMain.RoutIdListTable.getColumnModel().getColumn(0).setHeaderValue("ud¾. wxlh");
            routeIdMain.RoutIdListTable.getColumnModel().getColumn(1).setHeaderValue("wdrïNl ia:dkh ");
            routeIdMain.RoutIdListTable.getColumnModel().getColumn(2).setHeaderValue("wjidk ia:dkh ");
            routeIdMain.RoutIdListTable.getColumnModel().getColumn(3).setHeaderValue("nia r: LdKaV");
            routeIdMain.RoutIdListTable.getColumnModel().getColumn(4).setHeaderValue("uq¨ ÿr");
            routeIdMain.RoutIdListTable.getColumnModel().getColumn(5).setHeaderValue("úfYaI igyka ");
            routeIdMain.setcolfront();
        }
    }//GEN-LAST:event_SearchRoutKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBoxBusRegistation;
    private javax.swing.JTextField SearchRout;
    // End of variables declaration//GEN-END:variables
}