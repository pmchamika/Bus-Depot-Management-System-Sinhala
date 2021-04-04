package SLTB_Bimsara.Oparation;

import SLTB_Bimsara.DBCon;
import SLTB_Bimsara.Panel.BusRegistation.*;
import SLTB_sachin.Temp;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Edu
 */
public class EditOparation extends javax.swing.JPanel {

    private static EditOparation eo;

    DefaultComboBoxModel dm = new DefaultComboBoxModel();
    DefaultComboBoxModel dr = new DefaultComboBoxModel();

    private EditOparation() {
        initComponents();
        //setvalues();

    }

    public void setvalues() {

        try {
            int x = OparationMain.getobj().viweBusListTable.getSelectedRow();
            //get values
            String Oid = OparationMain.getobj().viweBusListTable.getValueAt(x, 0).toString();
            int NOJ = Integer.parseInt(OparationMain.getobj().viweBusListTable.getValueAt(x, 1).toString());
            String BN = OparationMain.getobj().viweBusListTable.getValueAt(x, 2).toString();
            String St = OparationMain.getobj().viweBusListTable.getValueAt(x, 3).toString();
            String Et = OparationMain.getobj().viweBusListTable.getValueAt(x, 4).toString();
            String RI = OparationMain.getobj().viweBusListTable.getValueAt(x, 5).toString();
            String Di = OparationMain.getobj().viweBusListTable.getValueAt(x, 6).toString();
            String Stype = OparationMain.getobj().viweBusListTable.getValueAt(x, 7).toString();
            //System.out.println(Rid);
            //setValues
            jLabelOparationId.setText(Oid);//setOparationId

            //karya Anka therima
            jRadioButton1.setActionCommand("1");
            jRadioButton2.setActionCommand("2");

            //System.out.println(NOJ);
            //jRadioButton1.setSelected(true);
            if (NOJ == 1) {
                jRadioButton1.setSelected(true);
            } else if (NOJ == 2) {
                jRadioButton2.setSelected(true);
            } else {
                System.out.println("Somthing went wrong in RadioButton");
            }

            //setBusNumbersjComboBoxBusNumbers.setSelectedItem(BN);
            ResultSet rs = DBCon.combobox("busdetailes", "BusNumber", "oparations", "BusNumber");
            try {
                while (rs.next()) {
                    dm.addElement(rs.getString(1));
                    jComboBoxBusNumbers.setModel(dm);

                }
            } catch (SQLException ex) {
                Logger.getLogger(AddNewOparation.class.getName()).log(Level.SEVERE, null, ex);
            }
            jComboBoxBusNumbers.addItem(BN);
            jComboBoxBusNumbers.setModel(dm);
            jComboBoxBusNumbers.setSelectedItem(BN);

            //convert String To time
            Date sst = new SimpleDateFormat("HH:mm:ss").parse(St);
            jSpinnerStartTime.setValue(sst);
            Date set = new SimpleDateFormat("HH:mm:ss").parse(Et);
            jSpinnerEndTime.setValue(set);

            //SetRouteId---------------------------------------
            ResultSet rsb = DBCon.displayTable("RoutID", "rout");
            try {
                while (rsb.next()) {
                    dr.addElement(rsb.getString(1));
                    jComboBoxRI.setModel(dr);

                }
            } catch (SQLException ex) {
                Logger.getLogger(AddNewOparation.class.getName()).log(Level.SEVERE, null, ex);
            }
            jComboBoxRI.setModel(dr);
            jComboBoxRI.setSelectedItem(RI);
            //---------------------------------------------------

            jTextFieldDistance.setText(Di);
            jComboBoxSeT.setSelectedItem(Stype);

        } catch (ParseException ex) {
            Logger.getLogger(EditOparation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static EditOparation getobj() {
        if (eo == null) {
            eo = new EditOparation();
        }
        return eo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupJobId = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDistance = new javax.swing.JTextField();
        busSPNote = new javax.swing.JLabel();
        busNo = new javax.swing.JLabel();
        busModel = new javax.swing.JLabel();
        busBrand = new javax.swing.JLabel();
        busManYear = new javax.swing.JLabel();
        busType = new javax.swing.JLabel();
        busSeats = new javax.swing.JLabel();
        busFuelCapacity = new javax.swing.JLabel();
        jComboBoxBusNumbers = new javax.swing.JComboBox<>();
        jComboBoxSeT = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelOparationId = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBoxRI = new javax.swing.JComboBox<>();
        Date date =new Date();
        SpinnerDateModel sm=
        new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        jSpinnerStartTime = new javax.swing.JSpinner(sm);
        Date date2 =new Date();
        SpinnerDateModel sm2=
        new SpinnerDateModel(date2,null,null,Calendar.HOUR_OF_DAY);
        jSpinnerEndTime = new javax.swing.JSpinner(sm2);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel1.setText("Odjk wxl úia;r fjkia lsßï ");

        jTextFieldDistance.setText("150");
        jTextFieldDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDistanceActionPerformed(evt);
            }
        });
        jTextFieldDistance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDistanceKeyTyped(evt);
            }
        });

        busSPNote.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busSPNote.setText("fiajd j¾.h");

        busNo.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busNo.setText("Odjk wxlh ");

        busModel.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busModel.setText("ld¾h wxl .Kk ");

        busBrand.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busBrand.setText("nia r: wxlh  ");

        busManYear.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busManYear.setText("wdrïNl fj,dj");

        busType.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busType.setText("wjika fj,dj");

        busSeats.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busSeats.setText("ud¾. wxl ,hsia;=j ");

        busFuelCapacity.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busFuelCapacity.setText("Odjkh lrk Vqr m%ukh ");

        jComboBoxBusNumbers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NC-1714" }));

        jComboBoxSeT.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        jComboBoxSeT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "idudkH", "k.rdka;r ", ".eñ  ießh ", "ksis ißh ", "isiq ißh " }));

        jLabel2.setText("Km");

        jButtonCancel.setBackground(new java.awt.Color(246, 73, 73));
        jButtonCancel.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        jButtonCancel.setText("wj,x.= lrkak ");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 204, 0));
        jButtonUpdate.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        jButtonUpdate.setText("hdj;ald,sk lrkak ");
        jButtonUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpdateMouseClicked(evt);
            }
        });
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelOparationId.setText("jLabel3");

        buttonGroupJobId.add(jRadioButton1);
        jRadioButton1.setText("1");

        buttonGroupJobId.add(jRadioButton2);
        jRadioButton2.setText("2");

        jComboBoxRI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JSpinner.DateEditor de=new JSpinner.DateEditor(jSpinnerStartTime,"HH:mm:ss");
        jSpinnerStartTime.setEditor(de);

        JSpinner.DateEditor de2=new JSpinner.DateEditor(jSpinnerEndTime,"HH:mm:ss");
        jSpinnerEndTime.setEditor(de2);

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("*");

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("*");

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("*");

        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("*");

        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(busNo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busFuelCapacity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busManYear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busSPNote)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(busBrand)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(busSeats)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxRI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(78, 78, 78)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabelOparationId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxSeT, 0, 251, Short.MAX_VALUE)
                            .addComponent(jComboBoxBusNumbers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jSpinnerStartTime)
                            .addComponent(jSpinnerEndTime))
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(236, 236, 236))))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jButtonCancel)
                .addGap(218, 218, 218)
                .addComponent(jButtonUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busNo)
                    .addComponent(jLabelOparationId))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busModel)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busBrand)
                    .addComponent(jComboBoxBusNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busManYear)
                    .addComponent(jSpinnerStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busType)
                    .addComponent(jSpinnerEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busSeats)
                    .addComponent(jComboBoxRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busFuelCapacity)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busSPNote, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonUpdate))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDistanceActionPerformed

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        OparationSide os = OparationSide.getobj();
        OparationTop ot = OparationTop.getobj();
        OparationMain om = OparationMain.getobj();
        EditOparation eo = EditOparation.getobj();

        ot.setVisible(true);
        om.setVisible(true);
        os.setVisible(true);
        eo.setVisible(false);
        Temp t = Temp.temp1;
        t.upsetpanel.add(ot, t.cup);
        t.mainsetpanel.add(om, t.cmain);
        t.sidesetpanel.add(os, t.cside);
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateMouseClicked
        //convert Time
        //formT FULL DATE TO TIME
        try {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date d = (Date) jSpinnerStartTime.getValue();
            String time = dateFormat.format(d);
            //System.out.println(time);

            DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
            Date d1 = (Date) jSpinnerEndTime.getValue();
            String time1 = dateFormat.format(d1);
            //System.out.println(time1);

            String bn = "OparationId = '" + jLabelOparationId.getText() + "'";
            String set = "dutyNo=" + buttonGroupJobId.getSelection().getActionCommand() + ",BusNumber='" + jComboBoxBusNumbers.getSelectedItem() + "',StartTime='" + time + "',EndTime='" + time1 + "',RoutIdList='" + jComboBoxRI.getSelectedItem() + "',Distrance='" + jTextFieldDistance.getText() + "',Otype='" + jComboBoxSeT.getSelectedItem() + "'";
            //System.out.println(set);
            int x = DBCon.UpdateTable("oparations", set, bn);
            if (x == 99) {
                JLabel label = new JLabel(";re i,l=Kq iys; fldgia mqrjkak ");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.setMessage(label);

                jOptionPane.setMessage(label);
                jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = jOptionPane.createDialog(null, "Error");
                dialog.setVisible(true);

                OparationSide os = OparationSide.getobj();
                OparationTop ot = OparationTop.getobj();
                OparationMain om = OparationMain.getobj();
                EditOparation addNewOparation = EditOparation.getobj();
                ot.setVisible(false);
                om.setVisible(false);
                os.setVisible(false);
                addNewOparation.setVisible(true);
                Temp t = Temp.temp1;
                t.upsetpanel.add(ot, t.cup);
                t.mainsetpanel.add(om, t.cmain);
                t.sidesetpanel.add(os, t.cside);
            } else {
                OparationSide os = OparationSide.getobj();
                OparationTop ot = OparationTop.getobj();
                OparationMain om = OparationMain.getobj();
                EditOparation eo = EditOparation.getobj();

                ot.setVisible(true);
                om.setVisible(true);
                os.setVisible(true);
                eo.setVisible(false);
                Temp t = Temp.temp1;
                t.upsetpanel.add(ot, t.cup);
                t.mainsetpanel.add(om, t.cmain);
                t.sidesetpanel.add(os, t.cside);

                //reloads table
                om.loadTable();
            }
        } catch (Exception a) {
            JLabel label = new JLabel(";re i,l=Kq iys; fldgia mqrjkak ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane jOptionPane = new JOptionPane();
            jOptionPane.setMessage(label);

            jOptionPane.setMessage(label);
            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = jOptionPane.createDialog(null, "Error");
            dialog.setVisible(true);

            OparationSide os = OparationSide.getobj();
            OparationTop ot = OparationTop.getobj();
            OparationMain om = OparationMain.getobj();
            EditOparation addNewOparation = EditOparation.getobj();
            ot.setVisible(false);
            om.setVisible(false);
            os.setVisible(false);
            addNewOparation.setVisible(true);
            Temp t = Temp.temp1;
            t.upsetpanel.add(ot, t.cup);
            t.mainsetpanel.add(om, t.cmain);
            t.sidesetpanel.add(os, t.cside);
        }
    }//GEN-LAST:event_jButtonUpdateMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldDistanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDistanceKeyTyped

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
        String len = jTextFieldDistance.getText();
        int x = len.length();
        if (x > 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDistanceKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel busBrand;
    private javax.swing.JLabel busFuelCapacity;
    private javax.swing.JLabel busManYear;
    private javax.swing.JLabel busModel;
    private javax.swing.JLabel busNo;
    private javax.swing.JLabel busSPNote;
    private javax.swing.JLabel busSeats;
    private javax.swing.JLabel busType;
    private javax.swing.ButtonGroup buttonGroupJobId;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxBusNumbers;
    private javax.swing.JComboBox<String> jComboBoxRI;
    private javax.swing.JComboBox<String> jComboBoxSeT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelOparationId;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinnerEndTime;
    private javax.swing.JSpinner jSpinnerStartTime;
    private javax.swing.JTextField jTextFieldDistance;
    // End of variables declaration//GEN-END:variables

}
