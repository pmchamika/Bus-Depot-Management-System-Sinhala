/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_supun_panal;

import SLTB_sachin.Class.EmailController;
import SLTB_sachin.Temp;
import com.ConnectionMysql.MysqlConnect;
import com.mysql.jdbc.Connection;
import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author SUPUN
 */
public class Service extends javax.swing.JPanel {

    private static Service ser = null;
    public static JRViewer viewer = null;
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Service
     */
    private Service() {
        initComponents();

        con = MysqlConnect.getDbCon();
    }

    public static Service getobj() {
        if (ser == null) {
            ser = new Service();
        }
        return ser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        se_ea = new javax.swing.JLabel();
        se_st = new javax.swing.JLabel();
        se_i = new javax.swing.JLabel();
        se_ma = new javax.swing.JLabel();
        se_si = new javax.swing.JLabel();
        se_pr = new javax.swing.JLabel();
        se_reset = new javax.swing.JButton();
        se_sub = new javax.swing.JButton();
        se_i1 = new javax.swing.JLabel();
        ser_item = new javax.swing.JTextField();
        ser_cid = new javax.swing.JTextField();
        ser_qty = new javax.swing.JTextField();
        ser_price = new javax.swing.JTextField();
        ser_manufac = new javax.swing.JTextField();
        ser_woranty = new javax.swing.JTextField();
        ser_status = new javax.swing.JComboBox<>();
        show = new javax.swing.JLabel();
        sh = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        se_ea.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        se_ea.setText("j.lS?? ld,h ");

        se_st.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        se_st.setText(";;ajh ");

        se_i.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        se_i.setText("wdh;k wxlh ");

        se_ma.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        se_ma.setText("ksYamokh ");

        se_si.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        se_si.setText("m%udkh ");

        se_pr.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        se_pr.setText("tll ??, ");

        se_reset.setBackground(new java.awt.Color(255, 153, 153));
        se_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arefresh.png"))); // NOI18N
        se_reset.setText("Reset");
        se_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                se_resetMouseClicked(evt);
            }
        });
        se_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se_resetActionPerformed(evt);
            }
        });

        se_sub.setBackground(new java.awt.Color(239, 219, 88));
        se_sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ecorre.png"))); // NOI18N
        se_sub.setText("Submit");
        se_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                se_subMouseClicked(evt);
            }
        });
        se_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se_subActionPerformed(evt);
            }
        });

        se_i1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        se_i1.setText("Ndkavh ");

        ser_item.setEditable(false);
        ser_item.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N

        ser_cid.setEditable(false);
        ser_cid.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        ser_cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ser_cidKeyTyped(evt);
            }
        });

        ser_qty.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        ser_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ser_qtyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ser_qtyKeyTyped(evt);
            }
        });

        ser_price.setEditable(false);
        ser_price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ser_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ser_priceKeyTyped(evt);
            }
        });

        ser_manufac.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N

        ser_woranty.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        ser_woranty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ser_worantyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ser_worantyKeyTyped(evt);
            }
        });

        ser_status.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        ser_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "w??;a ", "Nd??;d lrk,o ", "m%;sixialrKh l, " }));

        show.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(204, 0, 0));

        sh.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        sh.setForeground(new java.awt.Color(204, 0, 0));

        jButton1.setText("Demo");
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
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(se_i1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(se_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(se_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(se_ea, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(se_st, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(se_si, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(se_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(se_i, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sh, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                        .addComponent(ser_qty)
                        .addComponent(ser_price)
                        .addComponent(ser_cid)
                        .addComponent(ser_manufac)
                        .addComponent(ser_woranty)
                        .addComponent(ser_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ser_item, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                        .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(se_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(347, 347, 347)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(se_i, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ser_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ser_item, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se_i1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(se_si, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ser_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ser_manufac, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ser_woranty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se_ea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ser_status, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se_st, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(se_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(se_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void se_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_se_resetActionPerformed

    private void se_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_se_subActionPerformed

    private void se_subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_se_subMouseClicked
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("FMBindumathi", Font.BOLD, 25)));
        if (ser_cid.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "wdh;kfha wxlh mqrjd ke;  ");
            this.setVisible(true);

        } else if (ser_item.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Ndkavfha ku we;=,;a lr ke; ");
            this.setVisible(true);

        } else if (ser_qty.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "m%udkh we;=,;a lr ke; ");
            this.setVisible(true);

        } else if (ser_price.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "uqo, we;=,;a lr ke; ");
            this.setVisible(true);

        } else if (ser_manufac.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "ksYamolhd we;=,;a lr ke; ");
            this.setVisible(true);

        } else if (ser_woranty.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "j.lS?? ld,h we;=,;a lr ke; ");
            this.setVisible(true);

        } else if (ser_status.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, ";;ajh f;dard ke; ");
            this.setVisible(true);

        } else {
            String cid = ser_cid.getText();
            String nam = ser_item.getText();
            int qty = Integer.valueOf(ser_qty.getText());
            double pri = Double.valueOf(ser_price.getText());
            String manu = ser_manufac.getText();
            int wor = Integer.valueOf(ser_woranty.getText());
            String sta = ser_status.getSelectedItem().toString();

            String sd = "INSERT INTO sup_service (cid,item,qty,price,manufacch,woranty,status) values ('" + cid + "','" + nam + "','" + qty + "','" + pri + "','" + manu + "','" + wor + "','" + sta + "')";

            try {
                pst = con.prepareStatement(sd);
                pst.execute();
            } catch (Exception e) {
            }
            
            
            double pr = qty * pri;
            
            String k = "INSERT INTO all_de (cid,iname,qty,price,manu,woran,stat) values ('" + cid + "','" + nam + "','" + qty + "','" + pr + "','" + manu + "','" + wor + "','" + sta + "')";
            try {
                pst = con.prepareStatement(k);
                pst.execute();
            } catch (SQLException ex) {
                
            }

            JOptionPane.showMessageDialog(null, "id??;lhs ");
            
            Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
            Map par = new HashMap();
            par.put(null, null);

            this.viewer = null;
            String fpath = null;
            String fname = null;
            try {

                fname = "re.pdf";
                fpath = "C:/Users/Public/" + fname;
                JasperPrint print = JasperFillManager.fillReport("src\\SLTB_supun_report\\servicereport.jasper", par, conn);
                JasperExportManager.exportReportToPdfFile(print, fpath);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sub = "subject";
            String masage = "  gjhfjgjkgkkg ";
            EmailController em = new EmailController();
            String to[] = new String[1];
            to[0] = chooce_comp.mail;
            em.sentemail(to, sub, masage, fpath, fname);

            JLabel label = new JLabel("Bf??,a mks??vh he??u id??;hs ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_se_subMouseClicked

    private void se_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_se_resetMouseClicked
        // TODO add your handling code here:

        ser_woranty.setText("");
        ser_qty.setText("");
        //ser_price.setText("");
        ser_manufac.setText("");
        //ser_item.setText("");

        //ser_cid.setText("");
        ser_status.setSelectedItem("w??;a ");

    }//GEN-LAST:event_se_resetMouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        //se_exit.setVisible(false);
    }//GEN-LAST:event_formPropertyChange

    private void ser_cidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_cidKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        String a = ser_cid.getText();

        int i = a.length();
        if (i >= 5) {

            ser_cid.setText(a.substring(0, i - 1));

        }
    }//GEN-LAST:event_ser_cidKeyTyped

    private void ser_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_qtyKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_ser_qtyKeyTyped

    private void ser_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_priceKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_ser_priceKeyTyped

    private void ser_worantyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_worantyKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        String a = ser_woranty.getText();

        int i = a.length();
        if (i >= 1) {

            ser_woranty.setText(a.substring(0, i-1));

        }
    }//GEN-LAST:event_ser_worantyKeyTyped

    private void ser_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_qtyKeyPressed
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("FMBindumathi", Font.BOLD, 25)));

        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {

            show.setText("Ndkav m%udkhg wl=re we;=,;a l, fkdyel ");
        } else {

            show.setText("");
        }
    }//GEN-LAST:event_ser_qtyKeyPressed

    private void ser_worantyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_worantyKeyPressed
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("FMBindumathi", Font.BOLD, 25)));

        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {

            sh.setText("j.lS?? ld,hg we;=,;a l, fkdyel ");
        } else {

            sh.setText("");
        }
    }//GEN-LAST:event_ser_worantyKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ser_woranty.setText("3");
        ser_qty.setText("11");
        ser_manufac.setText("is;=?? l=,;=ka. ");
        ser_status.setSelectedItem("w??;a ");

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel se_ea;
    private javax.swing.JLabel se_i;
    private javax.swing.JLabel se_i1;
    private javax.swing.JLabel se_ma;
    private javax.swing.JLabel se_pr;
    private javax.swing.JButton se_reset;
    private javax.swing.JLabel se_si;
    private javax.swing.JLabel se_st;
    private javax.swing.JButton se_sub;
    public javax.swing.JTextField ser_cid;
    public javax.swing.JTextField ser_item;
    private javax.swing.JTextField ser_manufac;
    public javax.swing.JTextField ser_price;
    private javax.swing.JTextField ser_qty;
    private javax.swing.JComboBox<String> ser_status;
    private javax.swing.JTextField ser_woranty;
    private javax.swing.JLabel sh;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
