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
public class AddNewBus extends javax.swing.JPanel {

    private static AddNewBus addNewBus = null;

    int i, j = 0;

    private AddNewBus() {
        initComponents();
    }

    public static AddNewBus getobj() {
        if (addNewBus == null) {
            addNewBus = new AddNewBus();
        }
        return addNewBus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        BusNo = new javax.swing.JTextField();
        Model = new javax.swing.JTextField();
        Brand = new javax.swing.JComboBox<>();
        ManYear = new javax.swing.JTextField();
        NoSeats = new javax.swing.JTextField();
        Type = new javax.swing.JComboBox<>();
        FuealCapacity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SpNotes = new javax.swing.JTextArea();
        CancelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jTextFieldBusNumberEn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 48)); // NOI18N
        jLabel1.setText("kj nia r: tl;= ls??u");

        busNo.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busNo.setText("nia  r: wxlh ");

        busModel.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busModel.setText("fudv,h ");

        busBrand.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busBrand.setText("ikakuh ");

        busManYear.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busManYear.setText("ksYamos; j??Yh ");

        busType.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busType.setText("nia r:h wh;a  LdKavh  ");

        busSeats.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busSeats.setText("wdik ixLHdj");

        busFuelCapacity.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busFuelCapacity.setText("bkaok Gd??;dj ");

        busSPNote.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        busSPNote.setText("??fYaI igyka ");

        BusNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusNoActionPerformed(evt);
            }
        });
        BusNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BusNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BusNoKeyTyped(evt);
            }
        });

        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });

        Brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TATA", "Leyland", "EICHER", "Audi", " " }));
        Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandActionPerformed(evt);
            }
        });

        ManYear.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        ManYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManYearActionPerformed(evt);
            }
        });
        ManYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ManYearKeyTyped(evt);
            }
        });

        NoSeats.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        NoSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NoSeatsKeyTyped(evt);
            }
        });

        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B", "C", "D" }));

        FuealCapacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FuealCapacityKeyTyped(evt);
            }
        });

        SpNotes.setColumns(20);
        SpNotes.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        SpNotes.setRows(5);
        jScrollPane1.setViewportView(SpNotes);

        CancelButton.setBackground(new java.awt.Color(255, 0, 0));
        CancelButton.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        CancelButton.setText("wj,x.= lrkak ");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(0, 204, 0));
        AddButton.setFont(new java.awt.Font("FMBindumathi", 1, 12)); // NOI18N
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eadd.png"))); // NOI18N
        AddButton.setText("tl;= lrkak");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jTextFieldBusNumberEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusNumberEnActionPerformed(evt);
            }
        });
        jTextFieldBusNumberEn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBusNumberEnKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("*");

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

        jButton1.setText("DEMO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(busNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(busModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(busBrand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(busManYear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busSPNote)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busSeats)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busFuelCapacity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(359, 359, 359)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(FuealCapacity)
                            .addComponent(NoSeats)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(busType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldBusNumberEn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Model)
                                    .addComponent(Brand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ManYear)
                                    .addComponent(Type, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(CancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddButton)))))
                .addGap(0, 285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busNo)
                    .addComponent(BusNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusNumberEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busModel)
                    .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busBrand)
                    .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busManYear)
                    .addComponent(ManYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busType)
                    .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busSeats)
                    .addComponent(NoSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busFuelCapacity)
                            .addComponent(jLabel8)
                            .addComponent(FuealCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(busSPNote, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CancelButton)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelActionPerformed

    private void BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandActionPerformed

    private void BusNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusNoActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        BusRegistationSide brs = BusRegistationSide.getobj();
        BusRegistationTop brt = BusRegistationTop.getobj();
        BusRegistationMain brm = BusRegistationMain.getobj();
        AddNewBus addNewBus = AddNewBus.getobj();

        brt.setVisible(true);
        brm.setVisible(true);
        brs.setVisible(true);
        addNewBus.setVisible(false);
        Temp t = Temp.temp1;
        t.upsetpanel.add(brt, t.cup);
        t.mainsetpanel.add(brm, t.cmain);
        t.sidesetpanel.add(brs, t.cside);

        BusNo.setText("");
        FuealCapacity.setText("");
        Brand.setSelectedItem("TATA");
        Type.setSelectedItem("A+");
        ManYear.setText("");
        Model.setText("");
        NoSeats.setText("");
        SpNotes.setText("");
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked

        try {

            //setbusNumber
            String fp = jTextFieldBusNumberEn.getText();
            String Lp = BusNo.getText();
            String Bn = fp + Lp;

            BusRegistationSide brs = BusRegistationSide.getobj();
            BusRegistationTop brt = BusRegistationTop.getobj();
            BusRegistationMain brm = BusRegistationMain.getobj();
            AddNewBus addNewBus = AddNewBus.getobj();

            Temp t = Temp.temp1;

            //t.mainsetpanel.repaint();
            String tbName = "busdetailes";
            String ColumnsList = "BusNumber,Model,Brand,ModelYear,BusType,Seat,FuelCapacity,SpNote";
            String c = "'" + Bn + "','" + Model.getText() + "','" + Brand.getSelectedItem() + "'," + ManYear.getText() + ",'" + Type.getSelectedItem() + "'," + NoSeats.getText() + "," + FuealCapacity.getText() + ",'" + SpNotes.getText() + "'";
            //System.out.println(c);
            int x = DBCon.InsertToDb(tbName, ColumnsList, c);

            if (x == 99) {
                JLabel label = new JLabel(";re i,l=Kq iys; fldgia mqrjkak ");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.setMessage(label);
                jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = jOptionPane.createDialog(null, "Error");
                dialog.setVisible(true);

                brt.setVisible(false);
                brm.setVisible(false);
                brs.setVisible(false);
                addNewBus.setVisible(true);

                //t.upsetpanel.add(brt, t.cup);
                t.mainsetpanel.add(addNewBus, t.cmain);
                // t.sidesetpanel.add(brs, t.cside);
                //t.mainsetpanel.repaint();

            } else {
                t.upsetpanel.add(brt, t.cup);
                t.mainsetpanel.add(brm, t.cmain);
                t.sidesetpanel.add(brs, t.cside);
                brt.setVisible(true);
                brm.setVisible(true);
                brs.setVisible(true);
                addNewBus.setVisible(false);
                BusNo.setText("");
                jTextFieldBusNumberEn.setText("");
                FuealCapacity.setText("");
                Brand.setSelectedItem("TATA");
                Type.setSelectedItem("A+");
                ManYear.setText("");
                Model.setText("");
                NoSeats.setText("");
                SpNotes.setText("");

                brm.loadTable();

            }
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
            AddNewBus addNewBus = AddNewBus.getobj();

            brt.setVisible(false);
            brm.setVisible(false);
            brs.setVisible(false);
            addNewBus.setVisible(true);
            Temp t = Temp.temp1;
            //t.upsetpanel.add(brt, t.cup);
            t.mainsetpanel.add(addNewBus, t.cmain);
            // t.sidesetpanel.add(brs, t.cside);
            //t.mainsetpanel.repaint();

        }

    }//GEN-LAST:event_AddButtonMouseClicked

    private void BusNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusNoKeyPressed

    private void BusNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusNoKeyTyped

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

        String len = BusNo.getText();
        int x = len.length();
        if (x > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_BusNoKeyTyped


    private void NoSeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoSeatsKeyTyped

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
        String len = NoSeats.getText();
        int x = len.length();
        if (x >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_NoSeatsKeyTyped

    private void ManYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ManYearKeyTyped
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
        String len = ManYear.getText();
        int x = len.length();
        if (x >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_ManYearKeyTyped

    private void ManYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManYearActionPerformed

    private void FuealCapacityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FuealCapacityKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
        String len = FuealCapacity.getText();
        int x = len.length();
        if (x >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_FuealCapacityKeyTyped

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jTextFieldBusNumberEnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusNumberEnKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
        String len = jTextFieldBusNumberEn.getText();
        int x = len.length();
        if (x >= 3) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextFieldBusNumberEnKeyTyped

    private void jTextFieldBusNumberEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusNumberEnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusNumberEnActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jTextFieldBusNumberEn.setText("EN");
        BusNo.setText("9999");
        FuealCapacity.setText("450");
        Brand.setSelectedItem("TATA");
        Type.setSelectedItem("B");
        ManYear.setText("2014");
        Model.setText("NM");
        NoSeats.setText("65");
        SpNotes.setText("");


    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JComboBox<String> Brand;
    private javax.swing.JTextField BusNo;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField FuealCapacity;
    private javax.swing.JTextField ManYear;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField NoSeats;
    private javax.swing.JTextArea SpNotes;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JLabel busBrand;
    private javax.swing.JLabel busFuelCapacity;
    private javax.swing.JLabel busManYear;
    private javax.swing.JLabel busModel;
    private javax.swing.JLabel busNo;
    private javax.swing.JLabel busSPNote;
    private javax.swing.JLabel busSeats;
    private javax.swing.JLabel busType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBusNumberEn;
    // End of variables declaration//GEN-END:variables
}
