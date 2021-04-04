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
import java.awt.Component;
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
public class fuel_order extends javax.swing.JPanel {

    private static fuel_order fuel = null;
    public static JRViewer viewer = null;
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form fuel_order
     */
    private fuel_order() {
        initComponents();
        con = MysqlConnect.getDbCon();
    }

    public static fuel_order getobj() {
        if (fuel == null) {
            fuel = new fuel_order();
        }
        return fuel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        f_type = new javax.swing.JLabel();
        f_leater = new javax.swing.JLabel();
        f_price = new javax.swing.JLabel();
        fuel_pr = new javax.swing.JTextField();
        fuel_comp = new javax.swing.JTextField();
        fuel_typ = new javax.swing.JComboBox<>();
        fuel_res = new javax.swing.JButton();
        fuel_sub = new javax.swing.JButton();
        fuel_size = new javax.swing.JTextField();
        f_co = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(710, 1149));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1149, 710));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        f_type.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        f_type.setText("f;,a j¾.h ");

        f_leater.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        f_leater.setText("f;,a  m%udkh ");

        f_price.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        f_price.setText("uqo, ");

        fuel_pr.setEditable(false);
        fuel_pr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fuel_pr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fuel_prKeyTyped(evt);
            }
        });

        fuel_comp.setEditable(false);
        fuel_comp.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        fuel_comp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fuel_compKeyTyped(evt);
            }
        });

        fuel_typ.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        fuel_typ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fmg%,a ", "iqm¾ Ths,a ", "ãi,a ", "fkdau,a Ths,a ","N+ñ f;,a ","l¨ Ths,a " }));

        fuel_res.setBackground(new java.awt.Color(255, 153, 153));
        fuel_res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arefresh.png"))); // NOI18N
        fuel_res.setText("Reset");
        fuel_res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fuel_resMouseClicked(evt);
            }
        });
        fuel_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuel_resActionPerformed(evt);
            }
        });

        fuel_sub.setBackground(new java.awt.Color(239, 219, 88));
        fuel_sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ecorre.png"))); // NOI18N
        fuel_sub.setText("Submit");
        fuel_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fuel_subMouseClicked(evt);
            }
        });
        fuel_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuel_subActionPerformed(evt);
            }
        });

        fuel_size.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        fuel_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuel_sizeActionPerformed(evt);
            }
        });
        fuel_size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fuel_sizeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fuel_sizeKeyTyped(evt);
            }
        });

        f_co.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        f_co.setText("wdh;kfha wxlh ");

        show.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        show.setForeground(new java.awt.Color(204, 0, 0));

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
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(f_leater, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_price, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_type, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuel_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_co, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(fuel_pr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(fuel_comp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(fuel_typ, 0, 425, Short.MAX_VALUE)
                            .addComponent(fuel_size))
                        .addContainerGap(149, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fuel_res, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_co, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuel_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuel_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_type, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuel_size, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_leater, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_price, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuel_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuel_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuel_res, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(485, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fuel_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuel_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuel_resActionPerformed

    private void fuel_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuel_subActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fuel_subActionPerformed

    private void fuel_subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuel_subMouseClicked
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("FMBindumathi", Font.BOLD, 25)));
        if (fuel_comp.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "wdh;kfha wxlh mqrjd ke;  ");
            this.setVisible(true);

        } else if (fuel_typ.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "j¾.h mqrjd ke; ");
            this.setVisible(true);

        } else if (fuel_size.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "m%udkh we;=,;a lr ke; ");
            this.setVisible(true);

        } else if (fuel_pr.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "uqo, we;=,;a lr ke; ");
            this.setVisible(true);

        } else {
            String cid = fuel_comp.getText();
            String type = fuel_typ.getSelectedItem().toString();
            int qty = Integer.valueOf(fuel_size.getText());
            double pr = Double.valueOf(fuel_pr.getText());

            String sd = "INSERT INTO sup_fuel (cid,oil_type,leter,price) values ('" + cid + "','" + type + "','" + qty + "','" + pr + "')";

            try {
                pst = con.prepareStatement(sd);
                pst.execute();
            } catch (Exception e) {
            }
            double pri = qty * pr;
            
            String k = "INSERT INTO all_de (cid,iname,qty,price) values ('" + cid + "','" + type + "','" + qty + "','" + pri + "')";
            try {
                pst = con.prepareStatement(k);
                pst.execute();
            } catch (SQLException ex) {
                
            }
            
            
            JOptionPane.showMessageDialog(null, "id¾;lhs ");

            SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;

            Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
            Map par = new HashMap();
            par.put(null, null);

            this.viewer = null;
            String fpath = null;
            String fname = null;
            try {

                fname = "re.pdf";
                fpath = "C:/Users/Public/" + fname;
                JasperPrint print = JasperFillManager.fillReport("src\\SLTB_supun_report\\fuel.jasper", par, conn);
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

            JLabel label = new JLabel("Bfï,a mksúvh heùu id¾;hs ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_fuel_subMouseClicked

    private void fuel_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuel_sizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuel_sizeActionPerformed

    private void fuel_resMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuel_resMouseClicked
        // TODO add your handling code here:

        fuel_sub.setText("");
        fuel_size.setText("");
        fuel_res.setText("");
        //fuel_pr.setText("");

        //fuel_comp.setText("");
        //fuel_typ.setSelectedItem("fmg%,a ");
    }//GEN-LAST:event_fuel_resMouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        //exit.setVisible(false);
    }//GEN-LAST:event_formPropertyChange

    private void fuel_compKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fuel_compKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        String a = fuel_comp.getText();

        int i = a.length();
        if (i >= 5) {

            fuel_comp.setText(a.substring(0, i - 1));

        }
    }//GEN-LAST:event_fuel_compKeyTyped

    private void fuel_sizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fuel_sizeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_fuel_sizeKeyTyped

    private void fuel_prKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fuel_prKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_fuel_prKeyTyped

    private void fuel_sizeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fuel_sizeKeyPressed
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("FMBindumathi", Font.BOLD, 25)));

        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {

            show.setText("Ndkav m%udkhg wl=re we;=,;a l, fkdyel ");
        } else {

            show.setText("");
        }
    }//GEN-LAST:event_fuel_sizeKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       fuel_size.setText("1000");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel f_co;
    private javax.swing.JLabel f_leater;
    private javax.swing.JLabel f_price;
    private javax.swing.JLabel f_type;
    public javax.swing.JTextField fuel_comp;
    public javax.swing.JTextField fuel_pr;
    private javax.swing.JButton fuel_res;
    private javax.swing.JTextField fuel_size;
    private javax.swing.JButton fuel_sub;
    public javax.swing.JComboBox<String> fuel_typ;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}