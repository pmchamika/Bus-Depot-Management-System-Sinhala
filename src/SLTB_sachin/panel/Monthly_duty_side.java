/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Class.Monthly_duty;
import SLTB_sachin.Class.sentmailThread;
import SLTB_sachin.Temp;
import java.awt.Font;
import java.time.LocalDate;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author sachin kumara
 */
public class Monthly_duty_side extends javax.swing.JPanel {

    public static JRViewer viewer = null;
    private static Monthly_duty_side mdside = null;

    /**
     * Creates new form monthly_duty_side
     */
    private Monthly_duty_side() {
        initComponents();
    }

    public static Monthly_duty_side getobj() {
        if (mdside == null) {
            mdside = new Monthly_duty_side();
        }
        return mdside;
    }

    public void setnew() {
        report_b.setBackground(new java.awt.Color(102, 153, 255));
        report_b.setText("Report");
        edit_b.setVisible(true);
        send_b.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        report_b = new javax.swing.JButton();
        edit_b = new javax.swing.JButton();
        send_b = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(220, 280));
        setOpaque(false);

        report_b.setBackground(new java.awt.Color(102, 102, 255));
        report_b.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        report_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/re.png"))); // NOI18N
        report_b.setText("Report");
        report_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_bActionPerformed(evt);
            }
        });

        edit_b.setBackground(new java.awt.Color(255, 255, 102));
        edit_b.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        edit_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        edit_b.setText("EDIT");
        edit_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        edit_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_bMouseClicked(evt);
            }
        });

        send_b.setBackground(new java.awt.Color(153, 255, 153));
        send_b.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        send_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/email-send-icon.png"))); // NOI18N
        send_b.setText("SEND");
        send_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        send_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send_b, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(report_b, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(send_b, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(report_b, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void edit_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_bMouseClicked
        //Monthly_duty_side.getobj().setVisible(false);
        LocalDate todaydat = LocalDate.now();
        int mo = todaydat.getMonthValue();
        int year = todaydat.getYear();
        if (mo == 12) {
            year++;
            mo = 0;
        }

        System.out.println("month : " + mo + "year : " + year);
        if (Monthly_duty_main.getobj().id == null) {
            JLabel label = new JLabel("m%:ufhka f;drd isákak ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(Monthly_duty_main.getobj(), label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);

        } else {

            if (Integer.valueOf(Monthly_duty_up.getobj().mon_s.getSelectedItem().toString()) == mo + 1 && Integer.valueOf(Monthly_duty_up.getobj().year_s.getSelectedItem().toString()) == year) {
                Monthly_duty_up.getobj().setVisible(false);
                Monthly_duty_side_up.getobj().setVisible(false);
                Monthly_duty_main.getobj().setVisible(false);
                SLTB_sachin.Temp te = Temp.temp1;
                Monthly_duty_edit_main mdem = Monthly_duty_edit_main.getobj();
                mdem.setVisible(true);
                te.mainsetpanel.add(mdem, te.cmain);
                this.setVisible(false);

                Monthly_duty_edit_main.getobj().setnew();
            } else {
                JLabel label = new JLabel("fjkia lï isÿ l, yelafla B,. udih i|yd muKhs");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane.showMessageDialog(Monthly_duty_main.getobj(), label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }//GEN-LAST:event_edit_bMouseClicked

    private void report_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_bActionPerformed
        SLTB_sachin.Class.Monthly_duty d = new Monthly_duty();
        SLTB_sachin.Temp te = Temp.temp1;

        if (report_b.getText().equalsIgnoreCase("Report")) {
            report_b.setBackground(new java.awt.Color(255, 51, 51));
            report_b.setText("Cancel");
            Monthly_duty_up.getobj().setVisible(false);
            Monthly_duty_side_up.getobj().setVisible(false);
            edit_b.setVisible(false);
            send_b.setVisible(false);
            d.reportm(Integer.valueOf(Monthly_duty_up.getobj().year_s.getSelectedItem().toString()), Integer.valueOf(Monthly_duty_up.getobj().mon_s.getSelectedItem().toString()));
            Monthly_duty_main.getobj().setVisible(false);
        } else if (report_b.getText().equalsIgnoreCase("Cancel")) {
            report_b.setBackground(new java.awt.Color(102, 153, 255));
            report_b.setText("Report");
            Monthly_duty_up.getobj().setVisible(true);
            viewer.setVisible(false);
            Monthly_duty_main.getobj().setVisible(true);
            Monthly_duty_side_up.getobj().setVisible(true);
            edit_b.setVisible(true);
            send_b.setVisible(true);
            te.mainsetpanel.add(Monthly_duty_main.getobj(), te.cmain);
        }
    }//GEN-LAST:event_report_bActionPerformed

    private void send_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_bActionPerformed
        JLabel label = new JLabel("úoHq;a ;eme,a m;a fhduq lrñka mj;S ");
        label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
        JOptionPane jp = new JOptionPane();
        Monthly_duty md = new Monthly_duty();
        //jp.showMessageDialog(Monthly_duty_main.getobj(), label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        SLTB_sachin.Temp te = Temp.temp1;
        Monthly_duty_main.getobj().setVisible(false);
        sendingemail.getobj().setVisible(true);
        sendingemail.getobj().dis.setText("úoHq;a ;eme,a m;a fhduq lrñka mj;S /oS isákak ");
        te.mainsetpanel.add(sendingemail.getobj(), te.cmain);
        sentmailThread sa = new sentmailThread();
        //md.send();


    }//GEN-LAST:event_send_bActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit_b;
    private javax.swing.JButton report_b;
    private javax.swing.JButton send_b;
    // End of variables declaration//GEN-END:variables
}