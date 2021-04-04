/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_Bimsara.Panel.BusRegistation;

import SLTB_Bimsara.DBCon;
import SLTB_sachin.Temp;
import com.sun.glass.events.KeyEvent;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Edu
 */
public class EditBus extends javax.swing.JPanel {

    private static EditBus editBus;

    private EditBus() {
        initComponents();

        /// setvalues();
    }

    public void setvalues() {

        int x = BusRegistationMain.getobj().viweBusListTable.getSelectedRow();

        //getvalues from main page
        String BusNo = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 0).toString();
        String BModel = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 1).toString();
        String BBrand = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 2).toString();
        String BMYear = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 3).toString();
        String BType = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 4).toString();
        String BSeat = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 5).toString();
        String BFCapacity = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 6).toString();
        String BSNotes = BusRegistationMain.getobj().viweBusListTable.getValueAt(x, 7).toString();

        //set values for textfield
        jLabelBNo.setText(BusNo);
        jLabelBModel.setText(BModel);
        jLabelBBrand.setText(BBrand);
        jLabelBusMYear.setText(BMYear);
        jLabelBType.setText(BType);
        jTextFieldBSeats.setText(BSeat);
        jTextFieldBusFuelCapacity.setText(BFCapacity);
        jTextAreaBSpNote.setText(BSNotes);

    }

    public static EditBus getobj() {
        if (editBus == null) {
            editBus = new EditBus();
        }
        return editBus;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        busNo = new javax.swing.JLabel();
        busModel = new javax.swing.JLabel();
        busBrand = new javax.swing.JLabel();
        busManYear = new javax.swing.JLabel();
        busType = new javax.swing.JLabel();
        busSeats = new javax.swing.JLabel();
        busFuelCapacity = new javax.swing.JLabel();
        busSPNote = new javax.swing.JLabel();
        jLabelBModel = new javax.swing.JLabel();
        jLabelBBrand = new javax.swing.JLabel();
        jLabelBusMYear = new javax.swing.JLabel();
        jLabelBType = new javax.swing.JLabel();
        jTextFieldBSeats = new javax.swing.JTextField();
        jTextFieldBusFuelCapacity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBSpNote = new javax.swing.JTextArea();
        jButtonCancelButton = new javax.swing.JButton();
        jButtonUpdateButton = new javax.swing.JButton();
        jLabelBNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1149, 710));

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel1.setText("nia r: úia;r fjkia lsßï ");

        busNo.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busNo.setText("nia  r: wxlh ");

        busModel.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busModel.setText("fudv,h ");

        busBrand.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busBrand.setText("ikakuh ");

        busManYear.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busManYear.setText("ksYamos; j¾Yh ");

        busType.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busType.setText("nia r:h wh;a  LdKavh  ");

        busSeats.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busSeats.setText("wdik ixLHdj");

        busFuelCapacity.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busFuelCapacity.setText("bkaok Gdß;dj ");

        busSPNote.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busSPNote.setText("úfYaI igyka ");

        jLabelBModel.setText("XXXXXX");

        jLabelBBrand.setText("xxxxxxx");

        jLabelBusMYear.setText("2017");

        jLabelBType.setText("B");

        jTextFieldBSeats.setText("65");
        jTextFieldBSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBSeatsActionPerformed(evt);
            }
        });
        jTextFieldBSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBSeatsKeyTyped(evt);
            }
        });

        jTextFieldBusFuelCapacity.setText("150");
        jTextFieldBusFuelCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusFuelCapacityActionPerformed(evt);
            }
        });
        jTextFieldBusFuelCapacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBusFuelCapacityKeyTyped(evt);
            }
        });

        jTextAreaBSpNote.setColumns(20);
        jTextAreaBSpNote.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        jTextAreaBSpNote.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBSpNote);

        jButtonCancelButton.setBackground(new java.awt.Color(255, 255, 102));
        jButtonCancelButton.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        jButtonCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButtonCancelButton.setText("wj,x.= lrkak ");
        jButtonCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelButtonMouseClicked(evt);
            }
        });
        jButtonCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelButtonActionPerformed(evt);
            }
        });

        jButtonUpdateButton.setBackground(new java.awt.Color(0, 204, 0));
        jButtonUpdateButton.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        jButtonUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        jButtonUpdateButton.setText("hdj;ald,sk lrkak ");
        jButtonUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpdateButtonMouseClicked(evt);
            }
        });

        jLabelBNo.setText("XXXXXX");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jButtonDelete.setBackground(new java.awt.Color(255, 102, 102));
        jButtonDelete.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        jButtonDelete.setText("bj;a lrkak");
        jButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseClicked(evt);
            }
        });
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(busType)
                                    .addComponent(busSPNote)
                                    .addComponent(busManYear)
                                    .addComponent(busModel)
                                    .addComponent(busNo)
                                    .addComponent(busBrand)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(busSeats)
                                            .addComponent(busFuelCapacity))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBusMYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelBModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelBBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                        .addComponent(jTextFieldBSeats)
                                        .addComponent(jTextFieldBusFuelCapacity)
                                        .addComponent(jLabelBNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelBType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCancelButton)
                                .addGap(76, 76, 76)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonUpdateButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(258, 258, 258))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(316, 316, 316))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busNo)
                    .addComponent(jLabelBNo))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busModel)
                    .addComponent(jLabelBModel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busBrand)
                    .addComponent(jLabelBBrand))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busManYear)
                    .addComponent(jLabelBusMYear))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busType)
                    .addComponent(jLabelBType))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busSeats)
                    .addComponent(jTextFieldBSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busFuelCapacity)
                    .addComponent(jTextFieldBusFuelCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busSPNote, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCancelButton)
                        .addComponent(jButtonUpdateButton)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBSeatsActionPerformed

    private void jTextFieldBusFuelCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusFuelCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusFuelCapacityActionPerformed

    private void jButtonCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelButtonMouseClicked
        BusRegistationSide brs = BusRegistationSide.getobj();
        BusRegistationTop brt = BusRegistationTop.getobj();
        BusRegistationMain brm = BusRegistationMain.getobj();
        EditBus editBusBus = EditBus.getobj();

        brt.setVisible(true);
        brm.setVisible(true);
        brs.setVisible(true);
        editBusBus.setVisible(false);
        Temp t = Temp.temp1;
        t.upsetpanel.add(brt, t.cup);
        t.mainsetpanel.add(brm, t.cmain);
        t.sidesetpanel.add(brs, t.cside);
    }//GEN-LAST:event_jButtonCancelButtonMouseClicked

    private void jButtonCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelButtonActionPerformed

    private void jButtonUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateButtonMouseClicked
        try {
            String bn = "BusNumber = '" + jLabelBNo.getText() + "'";
            String set = "Seat=" + jTextFieldBSeats.getText() + ",FuelCapacity=" + jTextFieldBusFuelCapacity.getText() + ",SpNote='" + jTextAreaBSpNote.getText() + "'";
            int x = DBCon.UpdateTable("busdetailes", set, bn);

            BusRegistationSide brs = BusRegistationSide.getobj();
            BusRegistationTop brt = BusRegistationTop.getobj();
            BusRegistationMain brm = BusRegistationMain.getobj();
            EditBus editBusBus = EditBus.getobj();

            if (x == 99) {
                JLabel label = new JLabel(";re i,l=Kq iys; fldgia mqrjkak ");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.setMessage(label);

                jOptionPane.setMessage(label);
                jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = jOptionPane.createDialog(null, "Error");
                dialog.setVisible(true);

                brt.setVisible(false);
                brm.setVisible(false);
                brs.setVisible(false);
                editBus.setVisible(true);
                Temp t = Temp.temp1;

                t.mainsetpanel.add(editBus, t.cmain);
            } else {
                brt.setVisible(true);
                brm.setVisible(true);
                brs.setVisible(true);
                editBus.setVisible(false);
                Temp t = Temp.temp1;
                t.upsetpanel.add(brt, t.cup);
                t.mainsetpanel.add(brm, t.cmain);
                t.sidesetpanel.add(brs, t.cside);

                brm.loadTable();
            }
        } catch (Exception e) {
            JLabel label = new JLabel(";re i,l=Kq iys; fldgia mqrjkak ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.setMessage(label);

            jOptionPane.setMessage(label);
            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = jOptionPane.createDialog(null, "Error");
            dialog.setVisible(true);

            BusRegistationSide brs = BusRegistationSide.getobj();
            BusRegistationTop brt = BusRegistationTop.getobj();
            BusRegistationMain brm = BusRegistationMain.getobj();
            EditBus editBusBus = EditBus.getobj();

            brt.setVisible(false);
            brm.setVisible(false);
            brs.setVisible(false);
            editBus.setVisible(true);
            Temp t = Temp.temp1;

            t.mainsetpanel.add(editBus, t.cmain);

        }
    }//GEN-LAST:event_jButtonUpdateButtonMouseClicked

    private void jTextFieldBusFuelCapacityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusFuelCapacityKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
            JLabel label = new JLabel("wkal muKla w;=,alrkak ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.setMessage(label);

            jOptionPane.setMessage(label);
            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = jOptionPane.createDialog(null, "Error");
            dialog.setVisible(true);
        }
        String len = jTextFieldBusFuelCapacity.getText();
        int x = len.length();
        if (x >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldBusFuelCapacityKeyTyped

    private void jTextFieldBSeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBSeatsKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
            JLabel label = new JLabel("wkal muKla w;=,alrkak ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.setMessage(label);

            jOptionPane.setMessage("Select Row");
            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = jOptionPane.createDialog(null, "Error");
            dialog.setVisible(true);
        }
        String len = jTextFieldBSeats.getText();
        int x = len.length();
        if (x >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldBSeatsKeyTyped

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseClicked
        JLabel labal = new JLabel("nia r:h bj;a lsßu ikd: lrkak ");
        labal.setFont(new Font("FMBindumathi", Font.BOLD, 18));

        int p = JOptionPane.showConfirmDialog(null, labal, "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {

                String bn = "BusNumber = '" + jLabelBNo.getText() + "'";
                String val = "BusStatus=1";
                int x = DBCon.UpdateTable("busdetailes", val, bn);

                BusRegistationSide brs = BusRegistationSide.getobj();
                BusRegistationTop brt = BusRegistationTop.getobj();
                BusRegistationMain brm = BusRegistationMain.getobj();
                EditBus editBusBus = EditBus.getobj();
                brt.setVisible(true);
                brm.setVisible(true);
                brs.setVisible(true);
                editBus.setVisible(false);
                Temp t = Temp.temp1;
                t.upsetpanel.add(brt, t.cup);
                t.mainsetpanel.add(brm, t.cmain);
                t.sidesetpanel.add(brs, t.cside);

                brm.loadTable();
            } catch (Exception e) {
                JLabel label = new JLabel(";re i,l=Kq iys; fldgia mqrjkak ");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.setMessage(label);

                jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = jOptionPane.createDialog(null, "Error");
                dialog.setVisible(true);

                BusRegistationSide brs = BusRegistationSide.getobj();
                BusRegistationTop brt = BusRegistationTop.getobj();
                BusRegistationMain brm = BusRegistationMain.getobj();
                EditBus editBusBus = EditBus.getobj();
                brt.setVisible(false);
                brm.setVisible(false);
                brs.setVisible(false);
                editBus.setVisible(true);
                Temp t = Temp.temp1;

                t.mainsetpanel.add(editBus, t.cmain);
            }
        }
    }//GEN-LAST:event_jButtonDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel busBrand;
    private javax.swing.JLabel busFuelCapacity;
    private javax.swing.JLabel busManYear;
    private javax.swing.JLabel busModel;
    private javax.swing.JLabel busNo;
    private javax.swing.JLabel busSPNote;
    private javax.swing.JLabel busSeats;
    private javax.swing.JLabel busType;
    private javax.swing.JButton jButtonCancelButton;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBBrand;
    private javax.swing.JLabel jLabelBModel;
    private javax.swing.JLabel jLabelBNo;
    private javax.swing.JLabel jLabelBType;
    private javax.swing.JLabel jLabelBusMYear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaBSpNote;
    private javax.swing.JTextField jTextFieldBSeats;
    private javax.swing.JTextField jTextFieldBusFuelCapacity;
    // End of variables declaration//GEN-END:variables

}
