/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_chamika.employee;

import SLTB_chamika.Class.Employee;
import com.ConnectionMysql.MysqlConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamika Prabath
 */
public class ManageLeaveUp extends javax.swing.JPanel {
private static ManageLeaveUp manageLup=null;
    /**
     * Creates new form ManageLeaveUp
     */
    public ManageLeaveUp() {
        initComponents();
    }
 public static ManageLeaveUp getobj(){
        if(manageLup==null){
            manageLup=new ManageLeaveUp();
        }
        return manageLup;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 255, 51));
        setMaximumSize(new java.awt.Dimension(1200, 60));
        setMinimumSize(new java.awt.Dimension(1200, 60));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 60));

        insert.setBackground(new java.awt.Color(51, 255, 51));
        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eadd.png"))); // NOI18N
        insert.setText("Insert");
        insert.setToolTipText("Insert Record");
        insert.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        insert.setOpaque(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 51));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        update.setText("Update");
        update.setToolTipText("Update Record");
        update.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        update.setOpaque(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edelete.png"))); // NOI18N
        delete.setText("Delete");
        delete.setToolTipText("");
        delete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        delete.setOpaque(false);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esearch.png"))); // NOI18N
        jLabel1.setToolTipText("Search for a Record");

        search.setToolTipText("Search for a Record");
        search.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                searchInputMethodTextChanged(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                searchPropertyChange(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insert)
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
         ManageLeave manageL=ManageLeave.getobj();
          
            String SName=manageL.sname.getText();
            String saln=manageL.salno.getText();
            String rea=manageL.reason.getText();
            
             Employee e1=new Employee();
            
             
            e1.setSName(SName);
            e1.setReason(rea);
            
            String valid= e1.ValidateLeave();
             if(valid.equals("success")){
               int sn= Integer.parseInt(saln);
                 e1.setSalNo(sn);
                  e1.InsertLeave();
                     }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_deleteActionPerformed

    private void searchInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_searchInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_searchInputMethodTextChanged

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_searchPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_searchPropertyChange

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchKeyPressed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            ManageLeave manageL=ManageLeave.getobj();
            String se=search.getText();

            String query2="select count(SalaryNo),SalaryNo,E_SName,E_Grade from Employee where E_Name='"+se+"' or E_NIC='"+se+"' or SalaryNo='"+se+"' " ;
            Statement stmt2= conn.createStatement();
            ResultSet rs=stmt2.executeQuery(query2);
            while(rs.next()){
                int count=rs.getInt("count(SalaryNo)");
                
                if(count==1){
                    
                    Date date = new Date();
                    String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
                    
                    
                    String[] DateParts = date1.split("-");
                    String year = DateParts[0];
                     System.out.println(year);        
                   
                    String snam=rs.getString("E_SName");
                    manageL.sname.setText(snam);
                    String saln=rs.getString("SalaryNo");
                    manageL.salno.setText(saln);
                    
                   
                    
                     System.out.println(date1);
                     
                      String lea="1";
                                String query5="select count(A_ID) from DCAttendance where E_Leave='"+lea+"' and SalaryNo='"+saln+"' and A_Date LIKE '%"+year+"%'" ;
                                Statement stmt5= conn.createStatement();
                                ResultSet rs5=stmt5.executeQuery(query5);
                                
                                while(rs5.next()){
                        
                                    int count5=rs5.getInt("count(A_ID)");
                                    System.out.println(count5);
                                    if(count5>0){
                                        String leacoun=Integer.toString(count5);
                                        manageL.leaveCount.setText(leacoun);
                                    }else{
                                         String query6="select count(A_ID) from OfficerAttendance where E_Leave='"+lea+"' and SalaryNo='"+saln+"' and A_Date LIKE '%"+year+"%'" ;
                                Statement stmt6= conn.createStatement();
                                ResultSet rs6=stmt6.executeQuery(query6);
                                
                              while(rs6.next()){
                        
                                    int count6=rs6.getInt("count(A_ID)");
                                    System.out.println(count6);
                                    if(count6>0){
                                        String leacoun=Integer.toString(count6);
                                        manageL.leaveCount.setText(leacoun);
                                    }else{
                                        String leacoun="0";
                                        manageL.leaveCount.setText(leacoun);
                                    }
                                }                                         
                               }                                                       
                              }
                    
                    String query3="select count(A_ID),SalaryNo,Reason from DCAttendance where SalaryNo='"+saln+"' and A_Date LIKE '%"+date1+"%'" ;
                    Statement stmt3= conn.createStatement();
                    ResultSet rs3=stmt3.executeQuery(query3);
                    while(rs3.next()){
                        
                            int count3=rs3.getInt("count(A_ID)");
                              
                            if(count3==1){

                                String re=rs3.getString("Reason");
                                manageL.reason.setText(re);
                              
                            }else{
                            String query4="select count(A_ID),SalaryNo,Reason from OfficerAttendance where SalaryNo='"+saln+"' and A_Date LIKE '%"+date1+"%'" ;
                            Statement stmt4= conn.createStatement();
                            ResultSet rs4=stmt4.executeQuery(query4);
                            while(rs4.next()){

                            int count4=rs4.getInt("count(A_ID)");
                                                        
                            if(count4==1){

                                String re=rs4.getString("Reason");
                                manageL.reason.setText(re);
                                                          
                            }else{
                                String re="";
                                manageL.reason.setText(re);
                            } 
                         }
                      }
            
                    }
                   
                }else{
                    
                    String snam="";
                    manageL.sname.setText(snam);
                    String saln="";
                    manageL.salno.setText(saln);
                    String re="";
                    manageL.reason.setText(re);
                    String leacoun="0";
                    manageL.leaveCount.setText(leacoun);
                    
                   
                }
            }
           
            

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_searchKeyTyped

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
       ManageLeave manageL=ManageLeave.getobj();
            String SName=manageL.sname.getText();
            String saln=manageL.salno.getText();
            String rea=manageL.reason.getText();
            
            Employee e1=new Employee();
            
             
            e1.setSName(SName);
            e1.setReason(rea);
           
            String valid= e1.ValidateLeave();
             
             if(valid.equals("success")){
                 int sn= Integer.parseInt(saln);
                 e1.setSalNo(sn);
                 e1.UpdateLeave();
             }
            
        
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
      ManageLeave manageL=ManageLeave.getobj();
            String SName=manageL.sname.getText();
            String saln=manageL.salno.getText();
            String rea=manageL.reason.getText();
            
            Employee e1=new Employee();
            int sn= Integer.parseInt(saln);
             
            e1.setSName(SName);
            e1.setReason(rea);
            e1.setSalNo(sn);
            e1.DeleteLeave();
        
    }//GEN-LAST:event_deleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
