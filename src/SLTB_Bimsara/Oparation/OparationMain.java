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
public class OparationMain extends javax.swing.JPanel {

   private static OparationMain om;
   
    private OparationMain() {
        initComponents();
        viweBusListTable.getTableHeader().setFont(new Font("FMBindumathi",Font.BOLD,18));
   
        //loadTable
        /*String col="OparationId,dutyNo,BusNumber,StartTime,EndTime,RoutIdList,Distrance,Otype";
        String TName="oparations";
        
        viweBusListTable.setModel(DbUtils.resultSetToTableModel(DBCon.displayTable(col, TName)));
       
        viweBusListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
    */
        loadTable();
    
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
    
        public void loadTable(){
         String col="OparationId,dutyNo,BusNumber,StartTime,EndTime,RoutIdList,Distrance,Otype";
        String TName="oparations";

        viweBusListTable.setModel(DbUtils.resultSetToTableModel(DBCon.displayTable(col, TName)));
       
        viweBusListTable.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
    
        
        viweBusListTable.getColumnModel().getColumn(0).setHeaderValue("Odjk wxlh");
        viweBusListTable.getColumnModel().getColumn(1).setHeaderValue("ld¾h wxl");
        viweBusListTable.getColumnModel().getColumn(2).setHeaderValue("nia r: wxlh");
        viweBusListTable.getColumnModel().getColumn(3).setHeaderValue("wdrïNl fj,dj");
        viweBusListTable.getColumnModel().getColumn(4).setHeaderValue("wjika fj,dj");
        viweBusListTable.getColumnModel().getColumn(5).setHeaderValue("ud¾. wxl");
        viweBusListTable.getColumnModel().getColumn(6).setHeaderValue("ÿr");
        viweBusListTable.getColumnModel().getColumn(7).setHeaderValue("fiajd j¾.h");
        
        setcolfront();
 }
    
    public static OparationMain getobj(){
        if(om==null){
            om=new OparationMain();
        }
        return om;
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
                "Odjk wxlh ", "ld¾h wxl  ", "nia r: wxlh  ", "wdrïNl fj,dj", "wjika fj,dj", "ud¾. wxl", "ÿr", "fiajd j¾.h"
            }
        ));
        viweBusListTable.setMinimumSize(new java.awt.Dimension(1149, 710));
        viweBusListTable.setPreferredSize(new java.awt.Dimension(1149, 710));
        viweBusListTable.getTableHeader().setReorderingAllowed(false);
        viweBusListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viweBusListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viweBusListTable);
        if (viweBusListTable.getColumnModel().getColumnCount() > 0) {
            viweBusListTable.getColumnModel().getColumn(0).setPreferredWidth(160);
            viweBusListTable.getColumnModel().getColumn(1).setPreferredWidth(128);
            viweBusListTable.getColumnModel().getColumn(2).setPreferredWidth(172);
            viweBusListTable.getColumnModel().getColumn(3).setMinWidth(172);
            viweBusListTable.getColumnModel().getColumn(3).setPreferredWidth(172);
            viweBusListTable.getColumnModel().getColumn(4).setPreferredWidth(144);
            viweBusListTable.getColumnModel().getColumn(5).setPreferredWidth(128);
            viweBusListTable.getColumnModel().getColumn(6).setPreferredWidth(48);
            viweBusListTable.getColumnModel().getColumn(7).setPreferredWidth(144);
        }

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel1.setText("Odjk wxl ,ehsia;=j ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viweBusListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viweBusListTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viweBusListTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable viweBusListTable;
    // End of variables declaration//GEN-END:variables
}
