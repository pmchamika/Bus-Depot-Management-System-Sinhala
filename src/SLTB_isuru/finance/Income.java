/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_isuru.finance;

//import SLTB_chamika.employee.*;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

public class Income extends javax.swing.JPanel {

    private static Income routeR = null;

    public Income() {
        initComponents();
        TableLoad1();
    }

    public static Income getobj() {
        if (routeR == null) {
            routeR = new Income();
        }
        return routeR;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        unitprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        item = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        IncomeTable = new javax.swing.JTable();
        unit = new javax.swing.JLabel();
        unitcnt = new javax.swing.JLabel();
        incm = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1149, 710));

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel2.setText("tallhl ??, ");

        label.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        label.setText("tall .Kk");

        unitprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitpriceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel3.setText("??jH=");

        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        item.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "l??f;,a", "ner,a " }));
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        IncomeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(IncomeTable);

        unit.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        unit.setForeground(new java.awt.Color(255, 0, 51));

        unitcnt.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        unitcnt.setForeground(new java.awt.Color(255, 0, 51));

        incm.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        incm.setForeground(new java.awt.Color(255, 0, 51));

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
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unitprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(qty)
                    .addComponent(item, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unitcnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incm, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(item))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitprice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitcnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(incm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void unitpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitpriceActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        unitprice.setText("1000");
        qty.setText("5");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void TableLoad1() {
        try {
            String se = IncomeUp.getobj().search.getText();
            IncomeTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
            

            Connection conn = MysqlConnect.getDbCon();

            String query = "select Date,Item,Qty,UnitPrice,Total,ID from otherincomes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            IncomeTable.setModel(DbUtils.resultSetToTableModel(rs));

            
            IncomeTable.getColumn("Date").setHeaderValue("oskh ");
            IncomeTable.getColumn("Item").setHeaderValue("NdKavh ");
            IncomeTable.getColumn("Qty").setHeaderValue(".Kk ");
            IncomeTable.getColumn("UnitPrice").setHeaderValue("tall ??,  ");
            IncomeTable.getColumn("Total").setHeaderValue("tl;=j ");
            IncomeTable.getColumn("ID").setHeaderValue("wxlh ");
            IncomeTable.repaint();
           setcolfront();

        } catch (Exception e) {

        }
    }

    public void setcolfront() {
        DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
            Font font = new Font("FMBindumathi", Font.BOLD, 14);

            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setFont(font);
                return this;
            }

        };
        IncomeTable.getColumnModel().getColumn(1).setCellRenderer(r);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable IncomeTable;
    public javax.swing.JLabel incm;
    public javax.swing.JComboBox<String> item;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    public javax.swing.JTextField qty;
    public javax.swing.JLabel unit;
    public javax.swing.JLabel unitcnt;
    public javax.swing.JTextField unitprice;
    // End of variables declaration//GEN-END:variables
}
