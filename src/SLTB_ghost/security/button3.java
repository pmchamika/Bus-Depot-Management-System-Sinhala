/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_ghost.security;

import static SLTB_chamika.Class.Employee.viewer;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author GHOST
 */
public class button3 extends javax.swing.JPanel {
private static button3 button3D=null;
private Pattern regexPattern;
    private Matcher regMatcher;
    public static JRViewer viewer=null;
    /**
     * Creates new form button3
     */
    public button3() {
        initComponents();
    }
      public static button3 getobj(){
        if(button3D==null){
            button3D=new button3();
        }
        return button3D;
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

        setOpaque(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
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
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
                try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            depot_vehicle depot_vehicleS=depot_vehicle.getobj();
            
            String license_number=depot_vehicleS.license_number.getText();
            String v_come_leave=(String) depot_vehicleS.v_come_leave.getSelectedItem();

            
            String valid= Validatedepot_vehicle();
                if(valid.equals("success")){
            String query1="insert into depot_vehicle(license_number,v_come_leave) values ('"+license_number+"','"+v_come_leave+"')";
            Statement stmt1= conn.createStatement();
            stmt1.executeUpdate(query1);

            depot_vehicle.getobj().dtable();
        
                }
      }    catch (Exception e) {
            System.err.println(e);
        }
              
 
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            depot_vehicle depot_vehicleS=depot_vehicle.getobj();
            
            String se=search.getText();
            
            String license_number=depot_vehicleS.license_number.getText();
            String v_come_leave=(String) depot_vehicleS.v_come_leave.getSelectedItem();
            
            String query4="select count(ID)from depot_vehicle where ID='"+se+"'" ;
            Statement stmt4= conn.createStatement();
            ResultSet rs4=stmt4.executeQuery(query4);
            while(rs4.next()){
               int i=rs4.getInt("count(ID)");
               if(i==1){
                   String valid= Validatedepot_vehicle();
                if(valid.equals("success")){
                    String query3 = "UPDATE depot_vehicle SET license_number='"+license_number+"',v_come_leave='"+v_come_leave+"'WHERE ID='"+se+"'";
                    Statement stmt3= conn.createStatement();
                    stmt3.executeUpdate(query3);
               }}
            
            depot_vehicle.getobj().dtable();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

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
            depot_vehicle depot_vehicleS=depot_vehicle.getobj();
            String se=search.getText();
            
            String query2="select count(ID),license_number,v_come_leave from depot_vehicle where ID='"+se+"' " ;
            Statement stmt2= conn.createStatement();
            ResultSet rs=stmt2.executeQuery(query2);
            while(rs.next()){
               int count=rs.getInt("count(ID)");
               if(count==1){
               String license_number=rs.getString("license_number");
               depot_vehicleS.license_number.setText(license_number);
               String v_come_leave=rs.getString("v_come_leave");
               depot_vehicleS.v_come_leave.setSelectedItem(v_come_leave);               
                 
               }
               else{
               String name="";
               depot_vehicleS.license_number.setText(name); 
               String NIC="";
               depot_vehicleS.v_come_leave.setSelectedItem(NIC);

               }}
            
            
            depot_vehicle.getobj().dtable();

            
             } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyTyped

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            depot_vehicle depot_vehicleS=depot_vehicle.getobj();
            
            String se=search.getText();
            
            
          String query5="select count(ID)from depot_vehicle where ID='"+se+"'" ;
            Statement stmt5= conn.createStatement();
            ResultSet rs5=stmt5.executeQuery(query5);
            while(rs5.next()){
               int i=rs5.getInt("count(ID)");
               if(i==1){
                   String valid= Validatedepot_vehicle();
                if(valid.equals("success")){
                    String query6 = "delete from depot_vehicle WHERE ID='"+se+"'";
                    Statement stmt6= conn.createStatement();
                    stmt6.executeUpdate(query6);
               }else{
                                     
                   showMessage("Employee is not Valid, Please Try Again ");
                   System.out.println("Invalid ID");
               }
               }
               
            depot_vehicle.getobj().dtable();
        
            }
           
           } catch (Exception e) {
            System.err.println(e);
        }
     
    }//GEN-LAST:event_deleteActionPerformed

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        // TODO add your handling code here:
      
        depot_vehicle depot_vehicleS=depot_vehicle.getobj();
        button3 button3D=button3.getobj();
      
        if(report.getText().equalsIgnoreCase("Report")){
            report.setBackground(new java.awt.Color(255, 51, 51));
            report.setText("Cancel");
            
            button3D.setVisible(true);
            depot_vehicleS.setVisible(false);
            report("src\\SLTB_ghost\\report\\deptv.jasper");
            
        }
        else if(report.getText().equalsIgnoreCase("Cancel")){
            report.setBackground(new java.awt.Color(102, 153, 255));
            report.setText("Report");
            
            viewer.setVisible(false);
            depot_vehicleS.setVisible(true);
            button3D.setVisible(true);
        }
        
    }//GEN-LAST:event_reportMouseClicked

private void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
public String Validatedepot_vehicle(){
            depot_vehicle depot_vehicleS=depot_vehicle.getobj();
            
            String license_number=depot_vehicleS.license_number.getText();

    if(license_number.equals("")){
         depot_vehicleS.dlicense_number.setText("fuu ;Srej ysiaj ;e??h fkdyelsh");
         
       
     }else{
         regexPattern = Pattern.compile("^[a-zA-Z-0-9]{5,7}$");
        regMatcher   = regexPattern.matcher(license_number);
        if(regMatcher.matches()) {
            depot_vehicleS.dlicense_number.setText("");
        } else {
            depot_vehicleS.dlicense_number.setText("jdyk ,shdmosx?? wxlh jeros");
            return "fail";
        }
     }
                    return "success";

}

   public void report(String reportPath){
     
        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        SLTB_sachin.Temp te=SLTB_sachin.Temp.temp1;
        Map par = new HashMap();
        par.put(null, null);
        
        
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
       
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton report;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
