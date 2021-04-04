/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Class.Daily_duty;
import SLTB_sachin.Class.Duty;
import SLTB_sachin.Class.Toast;
import SLTB_sachin.Temp;
import java.awt.Font;
import java.awt.Window;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sachin kumara
 */
public class Daily_duty_main extends javax.swing.JPanel {

    public static int ch = 0;
    private ResultSet re = null;
    private boolean ano, dno;
    private static Daily_duty_main ddm = null;
    public int dut = 0;
    public int asi = 0;
    public int abs = 0;

    /**
     * Creates new form Daily_duty_main
     */
    private Daily_duty_main() {
        initComponents();
    }

    public static Daily_duty_main getobj() {
        if (ddm == null) {
            ddm = new Daily_duty_main();
        }
        return ddm;
    }

    public void setnew() {
        ch = 0;
        dis_ta.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 16));
        Daily_duty_up du = Daily_duty_up.getobj();
        SLTB_sachin.Temp te = Temp.temp1;
        du.setVisible(true);
        te.upsetpanel.add(du, te.cup);

        Daily_duty_side dds = Daily_duty_side.getobj();
        dds.setVisible(true);
        te.sidesetpanel.add(dds, te.cside);

        LocalDate todaydat = LocalDate.now();
        int mo = todaydat.getMonthValue();
        int year = todaydat.getYear();
        int day = todaydat.getDayOfMonth();
        String mon = String.valueOf(mo);
        switch (mon) {
            case "1":
                mon = "01";
                break;
            case "2":
                mon = "02";
                break;
            case "3":
                mon = "03";
                break;
            case "4":
                mon = "04";
                break;
            case "5":
                mon = "05";
                break;
            case "6":
                mon = "06";
                break;
            case "7":
                mon = "07";
                break;
            case "8":
                mon = "08";
                break;
            case "9":
                mon = "09";
                break;

        }
        String ddd = String.valueOf(day);
        switch (ddd) {
            case "1":
                ddd = "01";
                break;
            case "2":
                ddd = "02";
                break;
            case "3":
                ddd = "03";
                break;
            case "4":
                ddd = "04";
                break;
            case "5":
                ddd = "05";
                break;
            case "6":
                ddd = "06";
                break;
            case "7":
                ddd = "07";
                break;
            case "8":
                ddd = "08";
                break;
            case "9":
                ddd = "09";
                break;

        }
        String date = year + "-" + mon + "-" + ddd;
        try {
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            du.date_c.setDate(date1);
            loadtable();
        } catch (Exception e) {
        }

        tfclean();
        ano = false;
        dno = false;
        /*Monthly_duty_side_up dsu=Monthly_duty_side_up.getobj();
         dsu.setVisible(true);
         te.sidesetpanelup.add(dsu,te.csideup);*/
        ch = 1;
        dut = 0;
        asi = 0;
        abs = 0;
        Daily_duty_side.getobj().setnew();
    }

    public void loadtable() {
        Daily_duty du = new Daily_duty();
        if (!Daily_duty_up.getobj().date_c.getDate().toString().equalsIgnoreCase("")) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String reportDate = df.format(Daily_duty_up.getobj().date_c.getDate());
            re = du.getall(reportDate);
            /* try {
            re.next();
            System.out.println(re.getString(2));
        } catch (Exception e) {
        }*/
            setTable(re);
        }

    }

    public void setTable(ResultSet r) {
        //System.out.println("l");
        dis_ta.setModel(DbUtils.resultSetToTableModel(r));
        settableheder();
        tfclean();
    }

    public void settableheder() {

        Object he[] = {"ld wx", "fkd fia wx", "w fia wx "};

        DefaultTableModel tableModel = new DefaultTableModel(getTableData(dis_ta), he) {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        dis_ta.setModel(tableModel);

        dis_ta.getColumnModel().getColumn(0).setResizable(false);

        dis_ta.getColumnModel().getColumn(1).setResizable(false);
        dis_ta.getColumnModel().getColumn(2).setResizable(false);

    }

    public Object[][] getTableData(JTable table) {
        TableModel dtm = table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tableData[i][j] = dtm.getValueAt(i, j);
            }
        }
        return tableData;
    }

    public void checkassno(int tf) {
        //only INT numbes for duty number
        String val = assno.getText();
        int len = val.length();
        if (!isINT(val, tf)) {
            if (len == 1 || len == 0) {
                assno.setText("");

            } else {
                assno.setText(val.substring(0, len - 1));
            }
        }

        LocalDate todaydat = LocalDate.now();
        int mo = todaydat.getMonthValue();
        int year = todaydat.getYear();
        int day = todaydat.getDayOfMonth();
        System.out.println("mont : " + mo + " year : " + year + " day : " + day);

        if (!assno.getText().equalsIgnoreCase("")) {
            Daily_duty ddu = new Daily_duty();
            boolean a = ddu.chassno(year, mo, day, Integer.valueOf(assno.getText()));
            if (a) {
                as_ch_c.setVisible(true);
                as_ch_r.setVisible(false);
                ano = true;
            } else {
                as_ch_r.setVisible(true);
                as_ch_c.setVisible(false);
                ano = false;
            }
        } else {
            as_ch_r.setVisible(false);
            as_ch_c.setVisible(false);
            ano = false;
        }

    }

    public void checkabsno(int tf) {
        //only INT numbes for duty number
        String val = absno.getText();
        int len = val.length();
        if (!isINT(val, tf)) {
            if (len == 1 || len == 0) {
                absno.setText("");

            } else {
                absno.setText(val.substring(0, len - 1));
            }
        }

    }

    public void checkDutyno(int tf) {
        //only INT numbes for duty number
        String val = duno.getText();
        int len = val.length();
        if (!isINT(val, tf)) {
            if (len == 1 || len == 0) {
                duno.setText("");

            } else {
                duno.setText(val.substring(0, len - 1));
            }
        }
        if (duno.getText().equalsIgnoreCase("")) {
            du_ch_r.setVisible(false);
            du_ch_c.setVisible(false);
            dno = false;
            absno.setText("");
        } else {
            Duty du = new Duty();
            int did = Integer.valueOf(duno.getText());
            boolean a = du.chdutyin(did);
            if (a) {
                du_ch_c.setVisible(true);
                du_ch_r.setVisible(false);
                dno = true;

            } else {
                du_ch_r.setVisible(true);
                du_ch_c.setVisible(false);
                dno = false;
                absno.setText("");
            }
        }
    }

    public void tfclean() {
        duno.setText("");
        absno.setText("");
        assno.setText("");
        as_ch_c.setVisible(false);
        as_ch_r.setVisible(false);
        du_ch_c.setVisible(false);
        du_ch_r.setVisible(false);
    }

    public boolean isINT(String strNum, int tf) {
        boolean ret = true;
        try {

            Integer.valueOf(strNum);

        } catch (NumberFormatException e) {
            if (tf == 0) {

                Window w[] = Temp.getWindows();
                Toast.showtoast("mQ¾K ixLHd muKla ndú;d lrkak", w[0]);
            }
            ret = false;
        }
        return ret;
    }

    public boolean tfcheck() {
        boolean a = true;

        if (duno.getText().equalsIgnoreCase("")) {
            a = false;
        }
        if (absno.getText().equalsIgnoreCase("")) {
            a = false;
        }
        if (assno.getText().equalsIgnoreCase("")) {
            a = false;
        }

        return a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jCalendar3 = new com.toedter.calendar.JCalendar();
        jCalendar4 = new com.toedter.calendar.JCalendar();
        jCalendar5 = new com.toedter.calendar.JCalendar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        dis_ta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        duno = new javax.swing.JTextField();
        assno = new javax.swing.JTextField();
        absno = new javax.swing.JTextField();
        edit_b = new javax.swing.JButton();
        del_b = new javax.swing.JButton();
        add_b = new javax.swing.JButton();
        du_ch_c = new javax.swing.JLabel();
        du_ch_r = new javax.swing.JLabel();
        as_ch_c = new javax.swing.JLabel();
        as_ch_r = new javax.swing.JLabel();
        Demo_but = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setOpaque(false);

        dis_ta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ld wx", "fkd fia wx", "w fia wx "
            }
        ));
        dis_ta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dis_taMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dis_ta);

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel1.setText("ld¾h wxlh ");

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel2.setText("fkdmeñKs fia wx ");

        jLabel5.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel5.setText("wkqhqla; fia wx ");

        duno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        duno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dunoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dunoKeyTyped(evt);
            }
        });

        assno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        assno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                assnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                assnoKeyTyped(evt);
            }
        });

        absno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        absno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                absnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                absnoKeyTyped(evt);
            }
        });

        edit_b.setBackground(new java.awt.Color(255, 255, 153));
        edit_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        edit_b.setText("EDIT");
        edit_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        edit_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_bActionPerformed(evt);
            }
        });

        del_b.setBackground(new java.awt.Color(255, 102, 102));
        del_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        del_b.setText("DELETE");
        del_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        del_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_bActionPerformed(evt);
            }
        });

        add_b.setBackground(new java.awt.Color(153, 255, 153));
        add_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eadd.png"))); // NOI18N
        add_b.setText("ADD");
        add_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });

        du_ch_c.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        du_ch_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cor.png"))); // NOI18N

        du_ch_r.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        du_ch_r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wro.png"))); // NOI18N

        as_ch_c.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        as_ch_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cor.png"))); // NOI18N

        as_ch_r.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        as_ch_r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wro.png"))); // NOI18N

        Demo_but.setText("DEMO Test");
        Demo_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Demo_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(del_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(assno))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(absno))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(duno, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(du_ch_c)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(du_ch_r))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(as_ch_c)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(as_ch_r)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(Demo_but, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(duno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(du_ch_c)
                            .addComponent(du_ch_r))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(absno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(assno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(as_ch_c)))
                            .addComponent(as_ch_r))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(del_b, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Demo_but, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dunoKeyReleased
        checkDutyno(0);
    }//GEN-LAST:event_dunoKeyReleased

    private void dunoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dunoKeyTyped
        checkDutyno(1);
    }//GEN-LAST:event_dunoKeyTyped

    private void assnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_assnoKeyReleased
        checkassno(0);
    }//GEN-LAST:event_assnoKeyReleased

    private void assnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_assnoKeyTyped
        checkassno(1);
    }//GEN-LAST:event_assnoKeyTyped

    private void absnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_absnoKeyReleased
        checkabsno(0);
    }//GEN-LAST:event_absnoKeyReleased

    private void absnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_absnoKeyTyped
        checkabsno(1);
    }//GEN-LAST:event_absnoKeyTyped

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
        if (tfcheck()) {
            if (dno) {
                if (ano) {
                    int aid, abid, did;
                    aid = Integer.valueOf(assno.getText());
                    abid = Integer.valueOf(absno.getText());
                    did = Integer.valueOf(duno.getText());

                    Daily_duty ddu = new Daily_duty();

                    ddu.addtable(did, abid, aid);

                    setnew();
                } else {
                    JLabel label = new JLabel(assno.getText() + "fÉ;k wxlh o;a; .nvfõ fkdue;sj fyda fjk;a ld¾hhla ioyd fhduq lr we;");
                    label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                    JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JLabel label = new JLabel(duno.getText() + " f,i ld¾hh wxlhla fkdue;");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JLabel label = new JLabel("ish¨ o;a;hka mqrjd isákak ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_add_bActionPerformed

    private void dis_taMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dis_taMouseClicked
        int r = dis_ta.getSelectedRow();
        duno.setText(dis_ta.getValueAt(r, 0).toString());
        absno.setText(dis_ta.getValueAt(r, 1).toString());
        assno.setText(dis_ta.getValueAt(r, 2).toString());
        dut = Integer.valueOf(dis_ta.getValueAt(r, 0).toString());
        asi = Integer.valueOf(dis_ta.getValueAt(r, 2).toString());
        abs = Integer.valueOf(dis_ta.getValueAt(r, 1).toString());
    }//GEN-LAST:event_dis_taMouseClicked

    private void edit_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_bActionPerformed
        if (daycheck()) {
            if (vercheck()) {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String reportDate = df.format(Daily_duty_up.getobj().date_c.getDate());

                if (tfcheck()) {
                    if (dno || Integer.valueOf(duno.getText()) == dut) {
                        if (ano || Integer.valueOf(assno.getText()) == asi) {
                            int aid, abid, did;
                            aid = Integer.valueOf(assno.getText());
                            abid = Integer.valueOf(absno.getText());
                            did = Integer.valueOf(duno.getText());

                            Daily_duty ddu = new Daily_duty();

                            ddu.edittabale(did, abid, aid, reportDate, dut, abs, asi);

                            setnew();
                        } else {
                            JLabel label = new JLabel(assno.getText() + "fÉ;k wxlh o;a; .nvfõ fkdue;sj fyda fjk;a ld¾hhla ioyd fhduq lr we;");
                            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                            JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JLabel label = new JLabel(duno.getText() + " f,i ld¾hh wxlhla fkdue;");
                        label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                        JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JLabel label = new JLabel("ish¨ o;a;hka mqrjd isákak ");
                    label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                    JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);

                }
            } else {
                JLabel label = new JLabel("fjkia lsÍug wjYH ;Srej f;dard isákak");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_edit_bActionPerformed

    private void del_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_bActionPerformed
        if (daycheck()) {
            if (vercheck()) {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String reportDate = df.format(Daily_duty_up.getobj().date_c.getDate());

                Daily_duty ddu = new Daily_duty();

                ddu.deltabale(dut, abs, asi, reportDate);

                setnew();
            } else {
                JLabel label = new JLabel("fjkia lsÍug wjYH ;Srej f;dard isákak");
                label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_del_bActionPerformed

    private void Demo_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Demo_butActionPerformed
       duno.setText("11");
        absno.setText("2");
        assno.setText("5");
    }//GEN-LAST:event_Demo_butActionPerformed

    public boolean daycheck() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate = df.format(Daily_duty_up.getobj().date_c.getDate());
        LocalDate todaydat = LocalDate.now();
        int mo = todaydat.getMonthValue();
        int year = todaydat.getYear();
        int day = todaydat.getDayOfMonth();
        String mon = String.valueOf(mo);
        switch (mon) {
            case "1":
                mon = "01";
                break;
            case "2":
                mon = "02";
                break;
            case "3":
                mon = "03";
                break;
            case "4":
                mon = "04";
                break;
            case "5":
                mon = "05";
                break;
            case "6":
                mon = "06";
                break;
            case "7":
                mon = "07";
                break;
            case "8":
                mon = "08";
                break;
            case "9":
                mon = "09";
                break;

        }
        String ddd = String.valueOf(day);
        switch (ddd) {
            case "1":
                ddd = "01";
                break;
            case "2":
                ddd = "02";
                break;
            case "3":
                ddd = "03";
                break;
            case "4":
                ddd = "04";
                break;
            case "5":
                ddd = "05";
                break;
            case "6":
                ddd = "06";
                break;
            case "7":
                ddd = "07";
                break;
            case "8":
                ddd = "08";
                break;
            case "9":
                ddd = "09";
                break;

        }
        String date = year + "-" + mon + "-" + ddd;

        if (reportDate.equalsIgnoreCase(date)) {
            return true;
        } else {
            JLabel label = new JLabel("fjkia lï isÿ l, yelafla wo oji ioyd mukhs");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            return false;

        }
    }

    public boolean vercheck() {
        if (dut == 0) {
            return false;
        } else if (asi == 0) {
            return false;
        } else if (abs == 0) {
            return false;
        }

        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Demo_but;
    private javax.swing.JTextField absno;
    private javax.swing.JButton add_b;
    private javax.swing.JLabel as_ch_c;
    private javax.swing.JLabel as_ch_r;
    private javax.swing.JTextField assno;
    private javax.swing.JButton del_b;
    private javax.swing.JTable dis_ta;
    private javax.swing.JLabel du_ch_c;
    private javax.swing.JLabel du_ch_r;
    private javax.swing.JTextField duno;
    private javax.swing.JButton edit_b;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JCalendar jCalendar3;
    private com.toedter.calendar.JCalendar jCalendar4;
    private com.toedter.calendar.JCalendar jCalendar5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
