/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_supun_panal;

import SLTB_sachin.Temp;
import com.ConnectionMysql.MysqlConnect;
import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SUPUN
 */
public class company_item extends javax.swing.JPanel {

    private static company_item comi = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form company_item
     */
    private company_item() {
        initComponents();
        con = MysqlConnect.getDbCon();

        tablelord();
    }

    public static company_item getobj() {
        if (comi == null) {
            comi = new company_item();
        }
        return comi;
    }

    public void tablelord() {

        String sql = "SELECT cid as 'wxlh ',c_type as 'j¾.h ',item as 'Ndkavh ',price as 'uqo, ' FROM company_item";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            item_table.setModel(DbUtils.resultSetToTableModel(rs));
            setcolfront();
        } catch (Exception e) {
        }

    }

    public void setnew() {

        item_table.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 16));

        item_serch it = item_serch.getobj();
        SLTB_sachin.Temp te = Temp.temp1;
        it.setVisible(true);
        te.upsetpanel.add(it, te.cup);
    }

    public void setcolfront() {
        DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
            Font font = new Font("Calibri", Font.BOLD, 14);

            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                        row, column);
                setFont(font);
                return this;
            }

        };

        item_table.getColumnModel().getColumn(3).setCellRenderer(r);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        item_table = new javax.swing.JTable();
        co_back = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);

        item_table.setFont(new java.awt.Font("FMBindumathi", 0, 14)); // NOI18N
        item_table.setModel(new javax.swing.table.DefaultTableModel(
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
        item_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(item_table);

        co_back.setBackground(new java.awt.Color(255, 153, 153));
        co_back.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        co_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arefresh.png"))); // NOI18N
        co_back.setText("kej; wdh;k f;aÍug ");
        co_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                co_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(co_back)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(co_back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void co_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_co_backMouseClicked
        // TODO add your handling code here:

        SLTB_sachin.Temp te = Temp.temp1;
        chooce_comp com = chooce_comp.getobj();
        com.setVisible(true);
        item_serch.getobj().setVisible(false);
        te.mainsetpanel.add(com, te.cmain);
        com_serch.getobj().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_co_backMouseClicked

    private void item_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_tableMouseClicked
        // TODO add your handling code here:

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("FMBindumathi", Font.BOLD, 25)));
        int r = item_table.getSelectedRow();

        String cid = item_table.getValueAt(r, 0).toString();
        String type = item_table.getValueAt(r, 1).toString();
        String item = item_table.getValueAt(r, 2).toString();
        String price = item_table.getValueAt(r, 3).toString();

        //System.out.println(type);
        if (type.equalsIgnoreCase("ld¾hd,Sh Ndxv ")) {
            //System.out.println("karyala"); 
            JOptionPane.showMessageDialog(null, "id¾;lhs ");

            if (item.equalsIgnoreCase("álÜ ueYska 1") || item.equalsIgnoreCase("álÜ ueYska 2") || item.equalsIgnoreCase("álÜ ueYska 3")) {
                SLTB_sachin.Temp te = Temp.temp1;
                tikcet_maching tik = tikcet_maching.getobj();
                tik.ticet_price.setText(price);
                tik.ticet_cid.setText(cid);
                tik.setVisible(true);
                te.mainsetpanel.add(tik, te.cmain);
                item_serch.getobj().setVisible(false);
                this.setVisible(false);

            } else {

                SLTB_sachin.Temp te = Temp.temp1;
                Offce_item of = Offce_item.getobj();
                of.o_item_price.setText(price);
                of.o_item_cid.setText(cid);
                of.o_item_no.setText(item);
                of.setVisible(true);
                te.mainsetpanel.add(of, te.cmain);
                item_serch.getobj().setVisible(false);
                this.setVisible(false);

            }

        } else if (type.equalsIgnoreCase("bkaOk ")) {
            //System.out.println("fuel"); 
            JOptionPane.showMessageDialog(null, "id¾;lhs ");
            SLTB_sachin.Temp te = Temp.temp1;
            fuel_order fu = fuel_order.getobj();
            fu.fuel_comp.setText(cid);
            fu.fuel_pr.setText(price);
            fu.fuel_typ.setSelectedItem(item);
            fu.setVisible(true);
            te.mainsetpanel.add(fu, te.cmain);
            item_serch.getobj().setVisible(false);
            this.setVisible(false);

        } else if (type.equalsIgnoreCase("fiajd Ndkav ")) {
            // System.out.println("service");
            JOptionPane.showMessageDialog(null, "id¾;lhs ");
            SLTB_sachin.Temp te = Temp.temp1;
            Service se = Service.getobj();
            se.ser_cid.setText(cid);
            se.ser_item.setText(item);
            se.ser_price.setText(price);
            se.setVisible(true);
            te.mainsetpanel.add(se, te.cmain);
            item_serch.getobj().setVisible(false);
            this.setVisible(false);

        }

    }//GEN-LAST:event_item_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton co_back;
    public javax.swing.JTable item_table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}