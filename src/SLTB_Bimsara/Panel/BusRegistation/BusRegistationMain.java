/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_Bimsara.Panel.BusRegistation;

import SLTB_Bimsara.DBCon;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Edu
 */
public class BusRegistationMain extends javax.swing.JPanel {

    private static BusRegistationMain brm;

    private BusRegistationMain() {
        initComponents();
        loadTable();
           
    }
    public void loadTable(){
        String col = "BusNumber,Model,Brand,ModelYear,BusType,Seat,FuelCapacity,SpNote";
        String TName = "busdetailes";

        viweBusListTable.setModel(DbUtils.resultSetToTableModel(DBCon.busdisplayTable(col, TName)));
        
        viweBusListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
        
        
        viweBusListTable.getColumnModel().getColumn(0).setHeaderValue("nia r: wxlh ");
        viweBusListTable.getColumnModel().getColumn(1).setHeaderValue("fudv,h");
        viweBusListTable.getColumnModel().getColumn(2).setHeaderValue("ikakuh ");
        viweBusListTable.getColumnModel().getColumn(3).setHeaderValue("ksYamos; j¾Yh");
        viweBusListTable.getColumnModel().getColumn(4).setHeaderValue("nia LdKavh");
        viweBusListTable.getColumnModel().getColumn(5).setHeaderValue("wdik ixLHdj");
        viweBusListTable.getColumnModel().getColumn(6).setHeaderValue("bkaok Gdß;dj");
        viweBusListTable.getColumnModel().getColumn(7).setHeaderValue("úfYaI igyka");
 }

    public static BusRegistationMain getobj() {
        if (brm == null) {
            brm = new BusRegistationMain();
        }
        return brm;
    }
    
     public void setcolfront() {
        DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
            Font font = new Font("FMBindumathi", Font.BOLD, 14);

            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                        row, column);
                setFont(font);
                return this;
            }

        };
        viweBusListTable.getColumnModel().getColumn(7).setCellRenderer(r);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viweBusListTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);

        viweBusListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nia r: wxlh ", "fudv,h ", "ikakuh ", "ksYamos; j¾Yh ", "nia r:h wh;a LdKavh", "wdik ixLHdj", "bkaok Gdß;dj ", "úfYaI igyka "
            }
        ));
        viweBusListTable.setMinimumSize(new java.awt.Dimension(1149, 710));
        viweBusListTable.setPreferredSize(new java.awt.Dimension(1149, 710));
        viweBusListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viweBusListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viweBusListTable);
        if (viweBusListTable.getColumnModel().getColumnCount() > 0) {
            viweBusListTable.getColumnModel().getColumn(0).setPreferredWidth(148);
            viweBusListTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            viweBusListTable.getColumnModel().getColumn(2).setPreferredWidth(111);
            viweBusListTable.getColumnModel().getColumn(3).setPreferredWidth(148);
            viweBusListTable.getColumnModel().getColumn(4).setPreferredWidth(202);
            viweBusListTable.getColumnModel().getColumn(5).setPreferredWidth(135);
            viweBusListTable.getColumnModel().getColumn(6).setPreferredWidth(148);
            viweBusListTable.getColumnModel().getColumn(7).setPreferredWidth(148);
        }

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel1.setText("nia ,ehsia;=j ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(420, 420, 420))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viweBusListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viweBusListTableMouseClicked
        //int x=viweBusListTable.getSelectedRow();

        /* String BusNo=viweBusListTable.getValueAt(x, 0).toString();
        String BModel=viweBusListTable.getValueAt(x, 1).toString();
        String BBrand=viweBusListTable.getValueAt(x, 2).toString();
        String BMYear=viweBusListTable.getValueAt(x, 3).toString();
        String BType=viweBusListTable.getValueAt(x, 4).toString();
        String BSeat=viweBusListTable.getValueAt(x, 5).toString();
        String BFCapacity=viweBusListTable.getValueAt(x, 6).toString();
        String BSNotes=viweBusListTable.getValueAt(x, 7).toString();
         */

    }//GEN-LAST:event_viweBusListTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable viweBusListTable;
    // End of variables declaration//GEN-END:variables
}
