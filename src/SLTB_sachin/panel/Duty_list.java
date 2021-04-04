/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Class.Duty;
import SLTB_sachin.Class.Toast;
import SLTB_sachin.Temp;
import static SLTB_sachin.panel.Duty_list_side.repo;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sachin kumara
 */
public class Duty_list extends javax.swing.JPanel {

    private static Duty_list duty_list = null;

    private ResultSet re = null;

    private int pduno = -95;
    private String psst;
    private String psm;
    private String pse;
    private double pd;
    private String pbust;
    private Duty_list_up du = null;
    private Duty_list_side ds = null;

    /**
     * Creates new form Duty_list
     */
    private Duty_list() {

        initComponents();
        //for change table header front style
        dis_table.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
        setcolfront();

        loadtable();

        du = Duty_list_up.getobj();
        SLTB_sachin.Temp te = Temp.temp1;
        du.setVisible(true);
        te.upsetpanel.add(du, te.cup);
        ds = Duty_list_side.getobj();
        ds.setVisible(true);

        te.sidesetpanel.add(ds, te.cside);

    }

    public void setnew() {
        dis_table.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
        setcolfront();

        loadtable();

        du = Duty_list_up.getobj();
        SLTB_sachin.Temp te = Temp.temp1;
        du.setVisible(true);
        te.upsetpanel.add(du, te.cup);
        ds = Duty_list_side.getobj();
        ds.setVisible(true);
        ds.repo.setBackground(new java.awt.Color(102, 153, 255));
        ds.repo.setText("Report");
        te.sidesetpanel.add(ds, te.cside);
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
        dis_table.getColumnModel().getColumn(1).setCellRenderer(r);
        dis_table.getColumnModel().getColumn(5).setCellRenderer(r);
    }

    public static Duty_list getobj() {
        if (duty_list == null) {
            duty_list = new Duty_list();
        }

        return duty_list;
    }

    public void loadtable() {
        Duty du = new Duty();
        re = du.getAllDutylist();
        /* try {
            re.next();
            System.out.println(re.getString(2));
        } catch (Exception e) {
        }*/
        setTable();

    }

    public void setTable() {
        //System.out.println("l");
        dis_table.setModel(DbUtils.resultSetToTableModel(re));
        settableheder();
        TFclean();
    }

    public void setRe(ResultSet re) {
        this.re = re;
    }

    public void settableheder() {

        Object he[] = {"ld¾h wxlh", "n¡j ", "fiajd wd¡ia", "fiajd ue¡ia", "fiajd wj¡ia", "f,a¡. ÿr "};

        DefaultTableModel tableModel = new DefaultTableModel(getTableData(dis_table), he) {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        dis_table.setModel(tableModel);
        setcolfront();
        dis_table.getColumnModel().getColumn(0).setResizable(false);

        dis_table.getColumnModel().getColumn(1).setResizable(false);
        dis_table.getColumnModel().getColumn(2).setResizable(false);
        dis_table.getColumnModel().getColumn(3).setResizable(false);
        dis_table.getColumnModel().getColumn(4).setResizable(false);
        dis_table.getColumnModel().getColumn(1).setResizable(false);
        dis_table.getColumnModel().getColumn(0).setPreferredWidth(45);
        dis_table.getColumnModel().getColumn(1).setPreferredWidth(6);
        dis_table.getColumnModel().getColumn(2).setPreferredWidth(50);
        dis_table.getColumnModel().getColumn(3).setPreferredWidth(50);
        dis_table.getColumnModel().getColumn(4).setPreferredWidth(50);
        dis_table.getColumnModel().getColumn(5).setPreferredWidth(10);

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

    public boolean TFcheck() {
        String duty_no, service_st, service_mid, service_end, distance;
        int duno;
        double dista;
        duty_no = dutyno_tf.getText();
        service_st = service_s_tf.getText();
        service_mid = service_m_tf.getText();
        service_end = service_e_tf.getText();
        distance = distance_tf.getText();
        if (duty_no.equalsIgnoreCase("") || duty_no == null) {
            dis_error.setText("ld¾h wxlh ysiaj ;eìh fkdyel");
            return false;
        } else if (service_st.equalsIgnoreCase("") || service_st == null) {
            dis_error.setText("fiajd wdrïNh ia:dkh ysiaj ;eìh fkdyel");
            return false;
        } else if (service_end.equalsIgnoreCase("") || service_end == null) {
            dis_error.setText("fiajd wjidk ia:dkh ysiaj ;eìh fkdyel");
            return false;
        } else if (distance.equalsIgnoreCase("") || distance == null) {
            dis_error.setText("f,aLk .; ÿr ysiaj ;eìh fkdyel");
            return false;
        } else {
            dis_error.setText("");
            dis_error2.setText("");
            return true;
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

        dutyno_l = new javax.swing.JLabel();
        service_s_l = new javax.swing.JLabel();
        service_m_l = new javax.swing.JLabel();
        service_e_l = new javax.swing.JLabel();
        distance_l = new javax.swing.JLabel();
        dutyno_tf = new javax.swing.JTextField();
        service_s_tf = new javax.swing.JTextField();
        service_m_tf = new javax.swing.JTextField();
        service_e_tf = new javax.swing.JTextField();
        distance_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dis_table = new javax.swing.JTable();
        Add_b = new javax.swing.JButton();
        Del_b = new javax.swing.JButton();
        Edit_b = new javax.swing.JButton();
        dis_error = new javax.swing.JLabel();
        dis_error2 = new javax.swing.JLabel();
        bustype_l = new javax.swing.JLabel();
        bustype_s = new javax.swing.JComboBox<>();
        Demo_but = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1149, 710));

        dutyno_l.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        dutyno_l.setText("ld¾h wxlh ");

        service_s_l.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        service_s_l.setText("fiajd wdrïNh ia:dkh  ");

        service_m_l.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        service_m_l.setText("fiajdfõ ueo ia:dkh  ");

        service_e_l.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        service_e_l.setText("fiajd wjidk ia:dkh  ");

        distance_l.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        distance_l.setText("f,aLk .; ÿr");

        dutyno_tf.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        dutyno_tf.setPreferredSize(new java.awt.Dimension(200, 30));
        dutyno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dutyno_tfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dutyno_tfKeyTyped(evt);
            }
        });

        service_s_tf.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        service_s_tf.setPreferredSize(new java.awt.Dimension(200, 30));

        service_m_tf.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        service_m_tf.setPreferredSize(new java.awt.Dimension(200, 30));

        service_e_tf.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        service_e_tf.setPreferredSize(new java.awt.Dimension(200, 30));

        distance_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        distance_tf.setPreferredSize(new java.awt.Dimension(200, 30));
        distance_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                distance_tfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                distance_tfKeyTyped(evt);
            }
        });

        jScrollPane1.setOpaque(false);

        dis_table.setFont(new java.awt.Font("FMBindumathi", 0, 14)); // NOI18N
        dis_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ld¾h wxlh ", "n¡j ", "fiajd wd¡ia", "fiajd ue¡ia", "fiajd wj¡ia", "f,a¡. ÿr "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dis_table.setToolTipText("");
        dis_table.setOpaque(false);
        dis_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dis_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dis_table);
        if (dis_table.getColumnModel().getColumnCount() > 0) {
            dis_table.getColumnModel().getColumn(0).setResizable(false);
            dis_table.getColumnModel().getColumn(0).setPreferredWidth(45);
            dis_table.getColumnModel().getColumn(1).setResizable(false);
            dis_table.getColumnModel().getColumn(2).setResizable(false);
            dis_table.getColumnModel().getColumn(3).setResizable(false);
            dis_table.getColumnModel().getColumn(4).setResizable(false);
            dis_table.getColumnModel().getColumn(4).setPreferredWidth(6);
        }

        Add_b.setBackground(new java.awt.Color(153, 255, 102));
        Add_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eadd.png"))); // NOI18N
        Add_b.setText("ADD");
        Add_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Add_b.setVerifyInputWhenFocusTarget(false);
        Add_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_bMouseClicked(evt);
            }
        });

        Del_b.setBackground(new java.awt.Color(255, 102, 102));
        Del_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        Del_b.setText("DELETE");
        Del_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Del_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Del_bMouseClicked(evt);
            }
        });

        Edit_b.setBackground(new java.awt.Color(255, 255, 102));
        Edit_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        Edit_b.setText("EDIT");
        Edit_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Edit_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_bMouseClicked(evt);
            }
        });

        dis_error.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        dis_error.setForeground(new java.awt.Color(255, 51, 51));
        dis_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dis_error.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dis_error2.setForeground(new java.awt.Color(255, 51, 51));
        dis_error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dis_error2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bustype_l.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        bustype_l.setText("nia r: j¾.h");

        bustype_s.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bustype_s.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B", "C", "D" }));
        bustype_s.setMaximumSize(new java.awt.Dimension(84, 34));

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(Demo_but, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dis_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Del_b, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dis_error2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dutyno_l)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(dutyno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(distance_l)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(distance_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(service_e_l)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(service_e_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(service_m_l)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(service_m_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(service_s_l)
                                        .addComponent(bustype_l))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(service_s_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                        .addComponent(bustype_s, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dutyno_l)
                    .addComponent(dutyno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bustype_l)
                    .addComponent(bustype_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service_s_l)
                    .addComponent(service_s_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service_m_l)
                    .addComponent(service_m_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service_e_l)
                    .addComponent(service_e_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distance_l)
                    .addComponent(distance_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Del_b, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Demo_but, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dis_error, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dis_error2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Add_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_bMouseClicked
        String duty_no, service_st, service_mid, service_end, distance, bustype;
        int duno;
        double dista;
        duty_no = dutyno_tf.getText();
        service_st = service_s_tf.getText();
        service_mid = service_m_tf.getText();
        service_end = service_e_tf.getText();
        distance = distance_tf.getText();
        bustype = bustype_s.getSelectedItem().toString();
        if (TFcheck()) {
            duno = Integer.valueOf(duty_no);
            dista = Double.valueOf(distance);
            Duty du = new Duty();
            du.setDuty_no(duno);
            du.setDistance(dista);
            du.setBus_type(bustype);
            du.setService_st(service_st);
            du.setService_mid(service_mid);
            du.setService_end(service_end);
            String a = du.AddDuty(du);

            if (!(a.equalsIgnoreCase("ok"))) {
                int len = a.length();
                int ch = 0;
                for (int i = 0; i < len; i++) {
                    if (a.charAt(i) == '@') {
                        ch++;
                    }
                }

                if (ch == 0) {
                    dis_error.setText(a);
                } else {
                    String d[] = a.split("@");
                    dis_error.setText(d[0]);
                    dis_error2.setText(d[1]);
                }
            } else {
                loadtable();
            }
        }
    }//GEN-LAST:event_Add_bMouseClicked

    private void dutyno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dutyno_tfKeyTyped
        checkDutyno(1);
    }//GEN-LAST:event_dutyno_tfKeyTyped

    private void dutyno_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dutyno_tfKeyReleased
        checkDutyno(0);
    }//GEN-LAST:event_dutyno_tfKeyReleased

    private void distance_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distance_tfKeyReleased
        checkDistance(0);
    }//GEN-LAST:event_distance_tfKeyReleased

    private void distance_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distance_tfKeyTyped
        checkDistance(1);
    }//GEN-LAST:event_distance_tfKeyTyped

    private void dis_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dis_tableMouseClicked
        int r = dis_table.getSelectedRow();
        this.pduno = Integer.valueOf(dis_table.getValueAt(r, 0).toString());
        this.pbust = dis_table.getValueAt(r, 1).toString();
        this.psst = dis_table.getValueAt(r, 2).toString();
        this.psm = dis_table.getValueAt(r, 3).toString();
        this.pse = dis_table.getValueAt(r, 4).toString();
        this.pd = Double.valueOf(dis_table.getValueAt(r, 5).toString());
        dutyno_tf.setText(dis_table.getValueAt(r, 0).toString());
        bustype_s.setSelectedItem(dis_table.getValueAt(r, 1));
        service_s_tf.setText(dis_table.getValueAt(r, 2).toString());
        service_m_tf.setText(dis_table.getValueAt(r, 3).toString());
        service_e_tf.setText(dis_table.getValueAt(r, 4).toString());
        distance_tf.setText(dis_table.getValueAt(r, 5).toString());

    }//GEN-LAST:event_dis_tableMouseClicked

    public void TFclean() {
        dutyno_tf.setText("");
        bustype_s.setSelectedIndex(0);
        service_s_tf.setText("");
        service_m_tf.setText("");
        service_e_tf.setText("");
        distance_tf.setText("");
        this.pduno = -99;
    }
    private void Edit_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_bMouseClicked
        String duty_no, service_st, service_mid, service_end, distance, bustype;
        int duno;
        double dista;
        duty_no = dutyno_tf.getText();
        service_st = service_s_tf.getText();
        service_mid = service_m_tf.getText();
        service_end = service_e_tf.getText();
        distance = distance_tf.getText();
        bustype = bustype_s.getSelectedItem().toString();
        if (TFcheck()) {
            duno = Integer.valueOf(duty_no);
            dista = Double.valueOf(distance);
            Duty newdu = new Duty();
            newdu.setDuty_no(duno);
            newdu.setDistance(dista);
            newdu.setBus_type(bustype);
            newdu.setService_st(service_st);
            newdu.setService_mid(service_mid);
            newdu.setService_end(service_end);

            Duty olddu = new Duty();
            olddu.setDuty_no(this.pduno);
            olddu.setDistance(this.pd);
            olddu.setBus_type(this.pbust);
            olddu.setService_st(this.psst);
            olddu.setService_mid(this.psm);
            olddu.setService_end(this.pse);
            String a = newdu.EditDuty(newdu, olddu);

            if (!(a.equalsIgnoreCase("ok"))) {
                int len = a.length();
                int ch = 0;
                for (int i = 0; i < len; i++) {
                    if (a.charAt(i) == '@') {
                        ch++;
                    }
                }

                if (ch == 0) {
                    dis_error.setText(a);
                } else {
                    String d[] = a.split("@");
                    dis_error.setText(d[0]);
                    dis_error2.setText(d[1]);
                }
            } else {
                loadtable();
            }
        }

    }//GEN-LAST:event_Edit_bMouseClicked


    private void Del_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Del_bMouseClicked
        Duty du = new Duty();
        String a = du.RemoveDuty(this.pduno);

        if (!(a.equalsIgnoreCase("ok"))) {
            int len = a.length();
            int ch = 0;
            for (int i = 0; i < len; i++) {
                if (a.charAt(i) == '@') {
                    ch++;
                }
            }

            if (ch == 0) {
                dis_error.setText(a);
            } else {
                String d[] = a.split("@");
                dis_error.setText(d[0]);
                dis_error2.setText(d[1]);
            }
        } else {
            loadtable();

        }
    }//GEN-LAST:event_Del_bMouseClicked

    private void Demo_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Demo_butActionPerformed
        // TODO add your handling code here:
        dutyno_tf.setText("63");
        bustype_s.setSelectedIndex(2);
        service_s_tf.setText("fydfrdõm;dk");
        service_m_tf.setText("l=reKE.,");
        service_e_tf.setText("mdkÿr");
        distance_tf.setText("350.0");
    }//GEN-LAST:event_Demo_butActionPerformed

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
        String val = dutyno_tf.getText();
        int len = val.length();
        if (!isINT(val)) {
            if (len == 1 || len == 0) {
                dutyno_tf.setText("");
                
            } else {
                dutyno_tf.setText(val.substring(0, len - 1));
                
            }
            if(tf==0){
                
                Window w[]=Temp.getWindows();
                 Toast.showtoast("mQ¾K ixLHd muKla ndú;d lrkak",w[0]);
            }
           
        }

    }

    public void checkDistance(int tf) {
        //only INT numbes for duty number
        String val = distance_tf.getText();
        int len = val.length();
        if (!isDOUBLE(val)) {
            if (len == 1 || len == 0) {
                distance_tf.setText("");
            } else {
                distance_tf.setText(val.substring(0, len - 1));
            }
            if(tf==0){
                
                Window w[]=Temp.getWindows();
                 Toast.showtoast("ixLHd muKla ndú;d lrkak",w[0]);
            }
        }
        val = distance_tf.getText();
        len = val.length();
        if (len != 0) {
            if (val.charAt(len - 1) == 'f' || val.charAt(len - 1) == 'F' || val.charAt(len - 1) == 'D' || val.charAt(len - 1) == 'd') {
                distance_tf.setText(val.substring(0, len - 1));
                if(tf==0){
                System.out.println(Temp.getWindows().length);
                Window w[]=Temp.getWindows();
                 Toast.showtoast("ixLHd muKla ndú;d lrkak",w[0]);
                }
            }

        }

    }

    public boolean isDOUBLE(String strNum) {
        boolean ret = true;
        try {

            Double.parseDouble(strNum);

        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_b;
    private javax.swing.JButton Del_b;
    private javax.swing.JButton Demo_but;
    private javax.swing.JButton Edit_b;
    private javax.swing.JLabel bustype_l;
    private javax.swing.JComboBox<String> bustype_s;
    private javax.swing.JLabel dis_error;
    private javax.swing.JLabel dis_error2;
    private javax.swing.JTable dis_table;
    private javax.swing.JLabel distance_l;
    private javax.swing.JTextField distance_tf;
    private javax.swing.JLabel dutyno_l;
    private javax.swing.JTextField dutyno_tf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel service_e_l;
    private javax.swing.JTextField service_e_tf;
    private javax.swing.JLabel service_m_l;
    private javax.swing.JTextField service_m_tf;
    private javax.swing.JLabel service_s_l;
    private javax.swing.JTextField service_s_tf;
    // End of variables declaration//GEN-END:variables
}
