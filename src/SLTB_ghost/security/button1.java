/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_ghost.security;


import SLTB_chamika.Class.Employee;
import static SLTB_chamika.Class.Employee.viewer;
import SLTB_chamika.employee.ManageAttendance;
import SLTB_chamika.employee.ManageAttendanceUp;
import SLTB_chamika.employee.ManageEmployee;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Dimension;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import static org.codehaus.groovy.runtime.ScriptBytecodeAdapter.regexPattern;
/**
 *
 * @author Chamika Prabath
 */
public class button1 extends javax.swing.JPanel {
private static button1 buttonG=null;
    public static JRViewer viewer=null;
 private Pattern regexPattern;
    private Matcher regMatcher;
    /**
     * Creates new form ManageEmployeeUp
     */
    private button1() {
        initComponents();
    }
   public static button1 getobj(){
        if(buttonG==null){
            buttonG=new button1();
        }
        return buttonG;
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
        search = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        monLabel = new javax.swing.JLabel();
        rMonth = new javax.swing.JComboBox<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 60));

        insert.setBackground(new java.awt.Color(0, 255, 0));
        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setText("INSERT");
        insert.setToolTipText("Insert Record");
        insert.setOpaque(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 0));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.setToolTipText("Update Record");
        update.setOpaque(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

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

        delete.setBackground(new java.awt.Color(255, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.setToolTipText("Delete Record");
        delete.setOpaque(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esearch.png"))); // NOI18N
        jLabel1.setToolTipText("Search for a Record");

        report.setBackground(new java.awt.Color(0, 0, 255));
        report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        report.setText("Report");
        report.setMaximumSize(new java.awt.Dimension(87, 25));
        report.setMinimumSize(new java.awt.Dimension(87, 25));
        report.setPreferredSize(new java.awt.Dimension(87, 25));
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        monLabel.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        monLabel.setForeground(new java.awt.Color(204, 204, 204));
        monLabel.setText("udih ");

        rMonth.setFont(new java.awt.Font("FMBindumathi", 1, 14)); // NOI18N
        rMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ckjd??", "fmnrjd??", "ud??;=", "wm%sfh,a", "uehs", "cQks", "cQ,s", "wf.daia;=", "iema;e??n??", "Tlaf;dan??", "fkdfj??n??", "foie??n??" }));
        rMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rMonth, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        insert.getAccessibleContext().setAccessibleName("190");
        update.getAccessibleContext().setAccessibleName("190");
        delete.getAccessibleContext().setAccessibleName("190");
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
      try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            guest guestS=guest.getobj();
            
            String name=guestS.name.getText();
            String nic=guestS.nic.getText();
            String reason=guestS.reason.getText();
            
             String valid= Validateguest();
                if(valid.equals("success")){
                String query1="insert into guest(g_Name,NIC,Reason) values ('"+name+"','"+nic+"','"+reason+"')";
                Statement stmt1= conn.createStatement();
                stmt1.executeUpdate(query1);

            guest.getobj().gtable();
            }    


           
        
      }    catch (Exception e) {
            System.err.println(e);
        }
              
        
      
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            guest guestS=guest.getobj();
            
            String se=search.getText();
            
            String name=guestS.name.getText();
            String nic=guestS.nic.getText();
            String reason=guestS.reason.getText();
            
            String query4="select count(ID)from guest where ID='"+se+"'" ;
            Statement stmt4= conn.createStatement();
            ResultSet rs4=stmt4.executeQuery(query4);
            while(rs4.next()){
               int i=rs4.getInt("count(ID)");
               if(i==1){
                   String valid= Validateguest();
                    if(valid.equals("success")){
                    String query3 = "UPDATE guest SET g_Name='"+name+"',NIC='"+nic+"',Reason='"+reason+"'WHERE ID='"+se+"'";
                    Statement stmt3= conn.createStatement();
                    stmt3.executeUpdate(query3);
               }}
            
            
            guest.getobj().gtable();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
 
    }//GEN-LAST:event_searchKeyTyped

    private void searchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_searchPropertyChange
        // TODO add your handling code here:
   
    }//GEN-LAST:event_searchPropertyChange

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_searchKeyPressed

    private void searchInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_searchInputMethodTextChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_searchInputMethodTextChanged

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
           try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            guest guestS=guest.getobj();
            String se=search.getText();
            
            
            String query2="select count(ID),g_Name,NIC,Reason from guest where ID='"+se+"' " ;
            Statement stmt2= conn.createStatement();
            ResultSet rs=stmt2.executeQuery(query2);
            while(rs.next()){
               int count=rs.getInt("count(ID)");
               if(count==1){
               String name=rs.getString("g_Name");
               guestS.name.setText(name);
               String NIC=rs.getString("NIC");
               guestS.nic.setText(NIC);               
               String Reason=rs.getString("Reason");
               guestS.reason.setText(Reason);
                 
               }
               else{
               String name="";
               guestS.name.setText(name); 
               String NIC="";
               guestS.nic.setText(NIC);
               String Reason="";
               guestS.reason.setText(Reason);

               }}
            
            
            guest.getobj().gtable();

                
            
             } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
           try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            guest guestS=guest.getobj();
            
            String se=search.getText();
            
            
          String query5="select count(ID)from guest where ID='"+se+"'" ;
            Statement stmt5= conn.createStatement();
            ResultSet rs5=stmt5.executeQuery(query5);
            while(rs5.next()){
               int i=rs5.getInt("count(ID)");
               if(i==1){
                   String valid= Validateguest();
                if(valid.equals("success")){
                    String query6 = "delete from guest WHERE ID='"+se+"'";
                    Statement stmt6= conn.createStatement();
                    stmt6.executeUpdate(query6);
               }else{
                                     
                   showMessage("Employee is not Valid, Please Try Again ");
                   System.out.println("Invalid ID");
               }
               }
               
           guest.getobj().gtable();    
        
            }
           
           
           } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
        guest guestS=guest.getobj();
        button1 buttonG=button1.getobj();
        String rPath;
        String month = null;
        String saln=buttonG.search.getText();
        String mon= (String) rMonth.getSelectedItem();
               if(mon=="ckjd??"){
                   month="01";
               }else if(mon=="fmnrjd??"){
                   month="02";
               }else if(mon=="ud??;="){
                   month="03";
               }else if(mon=="wm%sfh,a"){
                   month="04";
               }else if(mon=="uehs"){
                   month="05";
               }else if(mon=="cQks"){
                   month="06";
               }else if(mon=="cQ,s"){
                   month="07";
               }else if(mon=="wf.daia;="){
                   month="08";
               }else if(mon=="iema;e??n??"){
                   month="09";
               }else if(mon=="Tlaf;dan??"){
                   month="10";
               }else if(mon=="fkdfj??n??"){
                   month="11";
               }else if(mon==" foie??n??"){
                   month="12";
               }
                 
               Date date = new Date();
               String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
               
               String[] DateParts = date1.split("-");
               
                 String year = DateParts[0];
                 String dash="-";
                 String rym=year+dash+month;
                 System.out.println(rym);   
                
               rPath="src\\SLTB_ghost\\report\\guest.jasper";
                     
                HashMap par = new HashMap();
                            
                            par.put("salNo", saln);
                            par.put("re", rym);

                            if(report.getText().equalsIgnoreCase("Report")){
                                report.setBackground(new java.awt.Color(255, 51, 51));
                                report.setText("Cancel");
                                
                                buttonG.setVisible(true);
                                guestS.setVisible(false);
                               
                                ParameterizedReport(rPath,par);
                                

                            }
                            else if(report.getText().equalsIgnoreCase("Cancel")){
                                report.setBackground(new java.awt.Color(102, 153, 255));
                                report.setText("Report");

                                viewer.setVisible(false);
                                buttonG.setVisible(true);
                                guestS.setVisible(true);
                             }      
    }//GEN-LAST:event_reportActionPerformed

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reportMouseClicked

    private void rMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMonthActionPerformed
        // TODO add your handling code here:
        
        

        
    }//GEN-LAST:event_rMonthActionPerformed

 public void ParameterizedReport(String reportPath, HashMap par){
     
   SLTB_sachin.Temp te=SLTB_sachin.Temp.temp1;
   Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
   viewer=null;
   
     
     //Generating reports inside jpanel
     try{
     
        JasperPrint print = JasperFillManager.fillReport(reportPath,par,conn);
        viewer = new JRViewer(print);
        viewer.setOpaque(true);
        viewer.setVisible(true);
        viewer.setPreferredSize(new Dimension(1149, 710));
       
        
        }catch (Exception e){
           e.printStackTrace();
       }  
        te.mainsetpanel.add(viewer,te.cmain);
        
        
 }
    
    
 private void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
 
 public String Validateguest(){
            guest guestS=guest.getobj();
            
            
            String name=guestS.name.getText();
            String nic=guestS.nic.getText();
            String reason=guestS.reason.getText();
            
            
        if(name.equals("")){
                guestS.gname.setText("fuu ;Srej ysiaj ;e??h fkdyelsh");
                 return "fail";
                }else{
                regexPattern = Pattern.compile("^[a-zA-Z ]+");
        regMatcher   = regexPattern.matcher(name);
        if(regMatcher.matches()) {
            guestS.gname.setText("");
        } else {
            guestS.gname.setText("ku i|yd fhosh yelafla wl=re muKs");
            return "fail";
        }
     }
            
    if(nic.equals("")){
         guestS.gnic.setText("fuu ;Srej ysiaj ;e??h fkdyelsh");
         return "fail";
         
     }else{
            regexPattern = Pattern.compile("^[0-9]{9}+V$");
        regMatcher   = regexPattern.matcher(nic);
        if(regMatcher.matches()) {
            guestS.gnic.setText("");
        } else {
            guestS.gnic.setText("cd;sl ye??kq??m;a  wxlh ksje/os fkdf?? ");
            return "fail";
        }
         
     }
    if(reason.equals("")){
         guestS.greason.setText("fuu ;Srej ysiaj ;e??h fkdyelsh");
         return "fail";
     }else{
       guestS.greason.setText("");
     }
        return "success";
 }
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel monLabel;
    private javax.swing.JComboBox<String> rMonth;
    public javax.swing.JButton report;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
