/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sandu.fuel;

import static SLTB_Bimsara.Route.RouteIdSide.viewer;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import static org.slf4j.helpers.Util.report;


public class waste extends javax.swing.JPanel {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static JRViewer viewer = null;
    private static waste wast = null;

    public waste() {
        initComponents();

        jTable2.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 15));
        con = MysqlConnect.getDbCon();
        tableLoad();
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
        jTable1.getColumnModel().getColumn(2).setCellRenderer(r);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(r);

    }

    public static waste getobj() {
        if (wast == null) {
            wast = new waste();
        }
        return wast;
    }

    public void tableLoad() {

        try {
            String sql = "Select itemno,item,qunt,price from wastemat";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            setcolfront();
            jTable2.getColumnModel().getColumn(0).setHeaderValue("j??. wxlh");
            jTable2.getColumnModel().getColumn(1).setHeaderValue("j??.h");
            jTable2.getColumnModel().getColumn(2).setHeaderValue("m%udKh");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("??<");
        } catch (Exception e) {
        }
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        typ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pri = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        qn = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1149, 710));

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 36)); // NOI18N
        jLabel1.setText("         bj; ouk ??jH ,hsia;=j ");

        typ.setFont(new java.awt.Font("FMBindumathi", 0, 11)); // NOI18N
        typ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel3.setText("j??.h ");

        jTextField3.setFont(new java.awt.Font("FMBindumathi", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel4.setText("m%udKh ");

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        jButton1.setText("EDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel6.setText("j??.h ");

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eadd.png"))); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel7.setText("??<");

        jTable2.setFont(new java.awt.Font("FMBindumathi", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "j??.h wxlh ", "j??.h ", "m%udKh ", "??< "
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esearch.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel2.setText("j??. wxlh ");

        report.setBackground(new java.awt.Color(0, 153, 153));
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/request-report.png"))); // NOI18N
        report.setText("Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        jButton5.setText("Demo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typ, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(qn)
                            .addComponent(pri)
                            .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pri, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(report))
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do You Want To Delete This?");
        if (x == 0) {
            String item = typ.getText();
            String sq = "DELETE FROM wastemat where item='" + item + "'";

            try {
                pst = con.prepareStatement(sq);
                pst.execute();
                //load table
                tableLoad();
                clear();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String type = typ.getText();
        String qnt = qn.getText();
        String price = pri.getText();

        if (type.equals("") || qnt.equals("") || price.equals("")) {
            JLabel label = new JLabel("ish??  o;a; we;=,;a lrkak ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 15));
            JOptionPane.showMessageDialog(waste.getobj(), label, "infoBox=", JOptionPane.INFORMATION_MESSAGE);
        } else {

            try {
                double qn = Double.parseDouble(qnt);
                double pr = Double.parseDouble(price);

                String sq = "INSERT INTO wastemat (item,qunt,price)values ('" + type + "','" + qnt + "','" + price + "')";
                pst = con.prepareStatement(sq);
                //System.out.println(pst);
                pst.executeUpdate();
                //load table
                tableLoad();
                 clear();
            } catch (Exception e) {
                e.printStackTrace();
                JLabel label = new JLabel("ixLHd muKla we;=,;a lrkak ");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 15));
                JOptionPane.showMessageDialog(waste.getobj(), label, "infoBox=", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you expect to edit?");
        if (x == 0) {
            String typeno = type.getText();
            String type = typ.getText();
            String qnt = qn.getText();
            String price = pri.getText();

            String sq = "UPDATE wastemat SET item='" + type + "' ,qunt= '" + qnt + "', price='" + price + "' where itemno='" + typeno + "' ";

            try {
                 double qn = Double.parseDouble(qnt);
                double pr = Double.parseDouble(price);
                pst = con.prepareStatement(sq);
                pst.execute();

                //load table
                tableLoad();
                 clear();
            } catch (Exception e) {
                 e.printStackTrace();
                JLabel label = new JLabel("ixLHd muKla we;=,;a lrkak ");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 15));
                JOptionPane.showMessageDialog(waste.getobj(), label, "infoBox=", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void typActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typActionPerformed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        String type = jTextField3.getText();
        //String typeno = jTextField4.getText();
        String sq = "SELECT itemno,item,qunt,price FROM wastemat where item LIKE '%" + type + "%'";

        try {
            pst = con.prepareStatement(sq);
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            setcolfront();
            jTable2.getColumnModel().getColumn(0).setHeaderValue("j??. wxlh");
            jTable2.getColumnModel().getColumn(1).setHeaderValue("j??.h");
            jTable2.getColumnModel().getColumn(2).setHeaderValue("m%udKh");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("??<");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4MouseReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();

        String itemno = jTable2.getValueAt(row, 0).toString();
        String item = jTable2.getValueAt(row, 1).toString();
        String qunt = jTable2.getValueAt(row, 2).toString();
        String price = jTable2.getValueAt(row, 3).toString();

        typ.setText(item);
        qn.setText(qunt);
        pri.setText(price);
        type.setText(itemno);
    }//GEN-LAST:event_jTable2MouseClicked

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        waste wast=  waste.getobj();
       

        if(report.getText().equalsIgnoreCase("Report")){
            report.setBackground(new java.awt.Color(255, 51, 51));
            report.setText("Cancel");

            wast.setVisible(false);
           
            report("src\\SLTB_sandu\\reports\\waste.jasper");

        }
        else if(report.getText().equalsIgnoreCase("Cancel")){
            report.setBackground(new java.awt.Color(102, 153, 255));
            report.setText("Report");
            wast.setVisible(true);
            viewer.setVisible(false);
            

        }

    }  
        
                                         
      public void report(String reportPath){
     
        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        SLTB_sachin.Temp te=SLTB_sachin.Temp.temp1;
        Map par = new HashMap();
        par.put("ps", 20);
        
       
        viewer=null;
        
        //Generating reports inside jpanel
         try{
          
            JasperPrint print = JasperFillManager.fillReport(reportPath,par,conn);
            viewer = new JRViewer(print);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            viewer.setPreferredSize(new Dimension(1149, 710));
        }catch (Exception e){
            e.printStackTrace();
        }
         
        te.mainsetpanel.add(viewer,te.cmain);
        
      
       
        

    

    }//GEN-LAST:event_reportActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        typ.setText("ner,a ");
        qn.setText("50");
        pri.setText("5000");
    }//GEN-LAST:event_jButton5ActionPerformed
private void clear() {
        
        typ.setText(null);
        qn.setText(null);
        pri.setText(null);
        type.setText(null);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField pri;
    private javax.swing.JTextField qn;
    private javax.swing.JButton report;
    private javax.swing.JTextField typ;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

}
