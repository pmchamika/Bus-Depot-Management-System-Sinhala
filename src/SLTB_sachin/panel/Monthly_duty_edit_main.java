/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Class.Monthly_duty;
import SLTB_sachin.Class.Toast;
import SLTB_sachin.Temp;
import java.awt.Font;
import java.awt.Window;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sachin kumara
 */
public class Monthly_duty_edit_main extends javax.swing.JPanel {

    private Monthly_duty md = new Monthly_duty();
    private static Monthly_duty_edit_main mdem = null;

    /**
     * Creates new form Monthly_duty_edit_main
     */
    private Monthly_duty_edit_main() {
        initComponents();
    }

    public static Monthly_duty_edit_main getobj() {
        if (mdem == null) {
            mdem = new Monthly_duty_edit_main();
        }
        return mdem;
    }

    public void setnew() {
        er_2.setText("");
        er_1.setText("ojila f;darkak");
        md.setall(Monthly_duty_main.getobj().id);
        bno.setText(md.getBusNumber());
        sno.setText(String.valueOf(md.getSno()));
        dno.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jDayChooser2 = new com.toedter.calendar.JDayChooser();
        date = new com.toedter.calendar.JDayChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sno = new javax.swing.JTextField();
        bno = new javax.swing.JTextField();
        dno = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        er_1 = new javax.swing.JLabel();
        er_2 = new javax.swing.JLabel();

        setOpaque(false);

        date.setOpaque(false);
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });
        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel1.setText("f??;k wxlh");

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel2.setText("nia wxlh ");

        jLabel3.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel3.setText("oji ");

        jLabel4.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel4.setText("ld??h wxlh ");

        sno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sno.setEnabled(false);
        sno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snoActionPerformed(evt);
            }
        });

        bno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bno.setEnabled(false);
        bno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnoActionPerformed(evt);
            }
        });

        dno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnoActionPerformed(evt);
            }
        });
        dno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dnoKeyTyped(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 51, 51));
        cancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 255, 102));
        edit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        er_1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        er_1.setForeground(new java.awt.Color(255, 51, 0));
        er_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        er_2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        er_2.setForeground(new java.awt.Color(255, 51, 0));
        er_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bno, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel3))
                            .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dno, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(er_1, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(er_2, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(bno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(er_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(er_2)
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void snoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snoActionPerformed

    private void bnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnoActionPerformed

    private void dnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnoActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        SLTB_sachin.Temp te = Temp.temp1;
        Monthly_duty_main mdu = Monthly_duty_main.getobj();
        mdu.setVisible(true);
        te.mainsetpanel.add(mdu, te.cmain);
        this.setVisible(false);
        Monthly_duty_main.getobj().setnew();
    }//GEN-LAST:event_cancelActionPerformed

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        System.out.println(date.getDay());
    }//GEN-LAST:event_dateMouseClicked

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        System.out.println(date.getDay());
        er_1.setText("");
        er_2.setText("");
        int k[] = md.getDutyno();
        dno.setText(String.valueOf(k[date.getDay() - 1]));
    }//GEN-LAST:event_datePropertyChange
    public boolean isINT(String strNum) {
        boolean ret = true;
        try {

            Integer.valueOf(strNum);

        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }

    public void checkDutyno(int tf) {
        //only INT numbes for duty number
        String val = dno.getText();
        int len = val.length();
        if (!isINT(val)) {
            if (len == 1 || len == 0) {
                dno.setText("");

            } else {
                dno.setText(val.substring(0, len - 1));
            }
            if(tf==0){
                
                Window w[]=Temp.getWindows();
                 Toast.showtoast("mQ??K ixLHd muKla nd??;d lrkak",w[0]);
            }
        }

    }
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int k[] = md.getDutyno();
        int p = md.getchangesno(md, date.getDay(), Integer.valueOf(dno.getText()), k[date.getDay() - 1]);
        //System.out.println("ggg:"+p);
        if (p == 0) {
            JLabel le = new JLabel();
            le.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            le.setText(dno.getText() + " f,i ld??h wxlhla fkdue; ");
            JOptionPane.showMessageDialog(this, le, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JLabel le = new JLabel();
            le.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            le.setText("fuh;a iu. f??;k wxl " + p + " o fjkia f?? fuh is?? lrkako ");
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, le, "Confirm", dialogButton);
            if (dialogResult == 0) {
                md.edit(md, date.getDay(), Integer.valueOf(dno.getText()));
                SLTB_sachin.Temp te = Temp.temp1;
                Monthly_duty_main mdu = Monthly_duty_main.getobj();
                mdu.setVisible(true);
                te.mainsetpanel.add(mdu, te.cmain);
                this.setVisible(false);
                Monthly_duty_main.getobj().setnew();
            }
        }

    }//GEN-LAST:event_editActionPerformed

    private void dnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnoKeyReleased
        checkDutyno(0);
    }//GEN-LAST:event_dnoKeyReleased

    private void dnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnoKeyTyped
        checkDutyno(1);
    }//GEN-LAST:event_dnoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bno;
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDayChooser date;
    private javax.swing.JTextField dno;
    private javax.swing.JButton edit;
    private javax.swing.JLabel er_1;
    private javax.swing.JLabel er_2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField sno;
    // End of variables declaration//GEN-END:variables
}
