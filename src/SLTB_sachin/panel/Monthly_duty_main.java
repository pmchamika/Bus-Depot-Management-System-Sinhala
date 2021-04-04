/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Class.Monthly_duty;
import SLTB_sachin.Temp;
import java.awt.Font;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sachin kumara
 */
public class Monthly_duty_main extends javax.swing.JPanel {

    private ResultSet re = null;
    public String id = null;
    private static Monthly_duty_main mdm = null;

    /**
     * Creates new form monthly_duty_main
     */
    private Monthly_duty_main() {
        initComponents();
    }

    public static Monthly_duty_main getobj() {
        if (mdm == null) {
            mdm = new Monthly_duty_main();
        }
        return mdm;
    }

    public void setnew() {
        dis_ta.getTableHeader().setFont(new Font("FMBindumathi", Font.PLAIN, 18));
        Monthly_duty_up du = Monthly_duty_up.getobj();
        SLTB_sachin.Temp te = Temp.temp1;
        du.setVisible(true);
        LocalDate todaydat = LocalDate.now();
        int mo = todaydat.getMonthValue();
        int year = todaydat.getYear();
        du.year_s.setSelectedItem(String.valueOf(year));
        du.mon_s.setSelectedItem(String.valueOf(mo));
        te.upsetpanel.add(du, te.cup);

        Monthly_duty_side ds = Monthly_duty_side.getobj();
        ds.setVisible(true);
        te.sidesetpanel.add(ds, te.cside);

        Monthly_duty_side_up dsu = Monthly_duty_side_up.getobj();
        dsu.setVisible(true);

        te.sidesetpanelup.add(dsu, te.csideup);

        Monthly_duty_side.getobj().setnew();
        loadtable(mo, year);
    }

    public void loadtable(int m, int ye) {
        String mon = String.valueOf(m);
        switch (mon) {
            case "1":
                mon = "ckjdß";
                break;
            case "2":
                mon = "fmnrjdß";
                break;
            case "3":
                mon = "ud¾;=";
                break;
            case "4":
                mon = "wfm%a,a";
                break;
            case "5":
                mon = "uehs";
                break;
            case "6":
                mon = "cQks";
                break;
            case "7":
                mon = "cQ,s";
                break;
            case "8":
                mon = "wf.daia;=";
                break;
            case "9":
                mon = "iema;eïn¾";
                break;
            case "10":
                mon = "Tlaf;dan¾";
                break;
            case "11":
                mon = "fkdjeïn¾";
                break;
            case "12":
                mon = "foieïn¾";
                break;

        }
        Monthly_duty du = new Monthly_duty();
        re = du.getAll(mon, ye);
        dis_ta.setModel(DbUtils.resultSetToTableModel(re));
        settableheder();
        /* try {
            re.next();
            System.out.println(re.getString(2));
        } catch (Exception e) {
        }*/
        //setTable();

    }

    public void serch(ResultSet res) {
        dis_ta.setModel(DbUtils.resultSetToTableModel(res));
        settableheder();
    }

    public void settableheder() {

        Object he[] = {"nia wx", "fÉ wx", "á ue wx", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

        DefaultTableModel tableModel = new DefaultTableModel(getTableData(dis_ta), he) {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        dis_ta.setModel(tableModel);
        dis_ta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //setcolfront();
        dis_ta.getColumnModel().getColumn(0).setResizable(false);
        dis_ta.getColumnModel().getColumn(0).setPreferredWidth(80);
        dis_ta.getColumnModel().getColumn(1).setResizable(false);
        dis_ta.getColumnModel().getColumn(1).setPreferredWidth(80);
        dis_ta.getColumnModel().getColumn(2).setResizable(false);
        dis_ta.getColumnModel().getColumn(2).setPreferredWidth(80);
        for (int i = 3; i < 34; i++) {
            dis_ta.getColumnModel().getColumn(i).setResizable(false);
            dis_ta.getColumnModel().getColumn(i).setPreferredWidth(50);
        }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dis_ta = new javax.swing.JTable();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        dis_ta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nia wx", "fÉ wx", "á ue wx ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
            }
        ));
        dis_ta.setMinimumSize(new java.awt.Dimension(800, 64));
        dis_ta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dis_taMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dis_ta);
        if (dis_ta.getColumnModel().getColumnCount() > 0) {
            dis_ta.getColumnModel().getColumn(0).setMinWidth(52);
            dis_ta.getColumnModel().getColumn(0).setPreferredWidth(10);
            dis_ta.getColumnModel().getColumn(1).setMinWidth(25);
            dis_ta.getColumnModel().getColumn(2).setMinWidth(25);
            dis_ta.getColumnModel().getColumn(3).setMinWidth(55);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dis_taMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dis_taMouseClicked
        int r = dis_ta.getSelectedRow();
        this.id = dis_ta.getValueAt(r, 1).toString();
        String mon = Monthly_duty_up.getobj().mon_s.getSelectedItem().toString();
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

        this.id += "_" + Monthly_duty_up.getobj().year_s.getSelectedItem().toString() + "_" + mon;
    }//GEN-LAST:event_dis_taMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable dis_ta;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
