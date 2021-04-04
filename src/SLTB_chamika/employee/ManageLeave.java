/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_chamika.employee;

import com.ConnectionMysql.MysqlConnect;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Chamika Prabath
 */
public class ManageLeave extends javax.swing.JPanel {
private static ManageLeave manageL=null;
    /**
     * Creates new form ManageLeave
     */
    public ManageLeave() {
        initComponents();
  
        
    }
 public static ManageLeave getobj(){
        if(manageL==null){
            manageL=new ManageLeave();
        }
        return manageL;
    }
 
 public void TableLoad1(){
          try{
    leaveTable1.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
    setcolfront();
   
            String lea="1";
             Connection conn=MysqlConnect.getDbCon();
              Date date = new Date();
            String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
            
            String query="select SalaryNo,Grade from OfficerAttendance where E_Leave='"+lea+"' and A_Date LIKE '%"+date1+"%'" ;
                    Statement stmt= conn.createStatement();
                    ResultSet rs=stmt.executeQuery(query);
                    leaveTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    
leaveTable1.getColumn("SalaryNo").setHeaderValue("fõ;k wkalh ");
leaveTable1.getColumn("Grade").setHeaderValue("fY%aKsh ");
leaveTable1.repaint();

                  
        }catch(Exception e){
            
        }
 }
 public void TableLoad2(){
          try{
             leaveTable2.getTableHeader().setFont(new Font("FMBindumathi", Font.BOLD, 18));
             setcolfront();  
            String lea="1";
             Connection conn=MysqlConnect.getDbCon();
              Date date = new Date();
            String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
                            
             String query2="select SalaryNo,Grade,Duty from DCAttendance where E_Leave='"+lea+"' and A_Date LIKE '%"+date1+"%'" ;
                    Statement stmt2= conn.createStatement();
                    ResultSet rs2=stmt2.executeQuery(query2);
                    leaveTable2.setModel(DbUtils.resultSetToTableModel(rs2)); 
                    leaveTable2.getColumn("SalaryNo").setHeaderValue("fõ;k wkalh ");
leaveTable2.getColumn("Grade").setHeaderValue("fY%aKsh ");
leaveTable2.getColumn("Duty").setHeaderValue("ld¾hh wkalh ");
leaveTable2.repaint();
        }catch(Exception e){
            
        }
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
        sname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reason = new javax.swing.JTextArea();
        gfhfgh = new javax.swing.JLabel();
        salno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        leaveTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        leaveTable2 = new javax.swing.JTable();
        gfhfgh1 = new javax.swing.JLabel();
        gfhfgh2 = new javax.swing.JLabel();
        vsalno = new javax.swing.JLabel();
        vsname = new javax.swing.JLabel();
        vreason = new javax.swing.JLabel();
        leCo = new javax.swing.JLabel();
        leaveCount = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1149, 710));

        jLabel1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel1.setText("iïmQ¾K ku iskayf,ka ");
        jLabel1.setToolTipText("");

        sname.setFont(new java.awt.Font("FMBindumathi", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel2.setText("ksjdvq ,nd.ekSug fya;=j ");

        reason.setColumns(20);
        reason.setFont(new java.awt.Font("FMBindumathi", 0, 13)); // NOI18N
        reason.setRows(5);
        jScrollPane1.setViewportView(reason);

        gfhfgh.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        gfhfgh.setText("wo osk ksjvq ,nd we;s ld¾hd, fkdjk fiajlhska ");

        leaveTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Salary No", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        leaveTable1.setOpaque(false);
        leaveTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(leaveTable1);

        leaveTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(leaveTable2);

        gfhfgh1.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        gfhfgh1.setText("fõ;k wxlh ");

        gfhfgh2.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        gfhfgh2.setText("wo osk ksjvq ,nd we;s ld¾hd, fiajlhska ");

        vsalno.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        vsalno.setForeground(new java.awt.Color(204, 0, 0));

        vsname.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        vsname.setForeground(new java.awt.Color(204, 0, 0));

        vreason.setFont(new java.awt.Font("FMBindumathi", 0, 12)); // NOI18N
        vreason.setForeground(new java.awt.Color(204, 0, 0));

        leCo.setFont(new java.awt.Font("FMBindumathi", 1, 24)); // NOI18N
        leCo.setForeground(new java.awt.Color(102, 102, 102));
        leCo.setText("fuu jif¾ ,ndf.k we;s uq¨ ksjdvq .Kk ");

        leaveCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        leaveCount.setForeground(new java.awt.Color(255, 51, 51));
        leaveCount.setText("0");

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
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(gfhfgh1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vsalno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sname)
                            .addComponent(jScrollPane1)
                            .addComponent(salno)
                            .addComponent(vsname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vreason, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leCo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leaveCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(gfhfgh)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(gfhfgh2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(gfhfgh2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(leaveCount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gfhfgh1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vsalno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vsname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(vreason, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(gfhfgh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String snam="mS tia OkqYal";
        manageL.sname.setText(snam);
        String saln="10";
        manageL.salno.setText(saln);
        String re="wikSm ;;ajh fya;=fjka ";
        manageL.reason.setText(re);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gfhfgh;
    private javax.swing.JLabel gfhfgh1;
    private javax.swing.JLabel gfhfgh2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel leCo;
    public javax.swing.JLabel leaveCount;
    private javax.swing.JTable leaveTable1;
    private javax.swing.JTable leaveTable2;
    public javax.swing.JTextArea reason;
    public javax.swing.JTextField salno;
    public javax.swing.JTextField sname;
    public javax.swing.JLabel vreason;
    public javax.swing.JLabel vsalno;
    public javax.swing.JLabel vsname;
    // End of variables declaration//GEN-END:variables
}
