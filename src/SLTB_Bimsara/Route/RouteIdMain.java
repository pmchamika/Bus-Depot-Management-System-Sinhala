/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_Bimsara.Route;

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
public class RouteIdMain extends javax.swing.JPanel {

    private static RouteIdMain rm;

    private RouteIdMain() {
        initComponents();
       RoutIdListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));

//prewive table
        /*String col = "RoutId,StartPoint,EndPoint,BusTypeList,Distance,SpNote";
        String TName = "rout";

        RoutIdListTable.setModel(DbUtils.resultSetToTableModel(DBCon.displayTable(col, TName)));
        RoutIdListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
*/
        loadTable();
    }
     public void loadTable(){
        String col = "RoutId,StartPoint,EndPoint,BusTypeList,Distance,SpNote";
        String TName = "rout";

        RoutIdListTable.setModel(DbUtils.resultSetToTableModel(DBCon.displayTable(col, TName)));
        RoutIdListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));

        
        RoutIdListTable.getColumnModel().getColumn(0).setHeaderValue("ud¾. wxlh");
        RoutIdListTable.getColumnModel().getColumn(1).setHeaderValue("wdrïNl ia:dkh ");
        RoutIdListTable.getColumnModel().getColumn(2).setHeaderValue("wjidk ia:dkh ");
        RoutIdListTable.getColumnModel().getColumn(3).setHeaderValue("nia r: LdKaV");
        RoutIdListTable.getColumnModel().getColumn(4).setHeaderValue("uq¨ ÿr");
        RoutIdListTable.getColumnModel().getColumn(5).setHeaderValue("úfYaI igyka ");
        
        //setcolumn font
        setcolfront();
        
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
        RoutIdListTable.getColumnModel().getColumn(1).setCellRenderer(r);
        RoutIdListTable.getColumnModel().getColumn(2).setCellRenderer(r);
    }
     
     
    public static RouteIdMain getobj() {
        if (rm == null) {
            rm = new RouteIdMain();
        }
        return rm;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        RoutIdListTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel1.setText("ud¾. wxl ,ehsia;=j");

        RoutIdListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ud¾. wxlh ", "wdrïNl ia:dkh ", "wjidk ia:dkh ", "nia r: LdKaV ", "uq¨ ÿr  ", "úfYaI igyka "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RoutIdListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoutIdListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoutIdListTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RoutIdListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoutIdListTableMouseClicked
        
    }//GEN-LAST:event_RoutIdListTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable RoutIdListTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
