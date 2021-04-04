/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_chamika.Class;

import SLTB_chamika.employee.ManageAttendance;
import SLTB_chamika.employee.ManageEmployee;
import SLTB_chamika.employee.ManageEmployeeSide;
import SLTB_chamika.employee.ManageEmployeeUp;
import SLTB_chamika.employee.ManageLeave;
import SLTB_chamika.employee.ManageLeaveUp;
import SLTB_sachin.Temp;
import com.ConnectionMysql.MysqlConnect;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Chamika Prabath
 */
public class Employee {

    public static JRViewer viewer=null;
    private Pattern regexPattern;
    private Matcher regMatcher;
    private ResultSet re=null;
    private String SName;
    private String Name;
    private String gen;
    private String email;
    private String addr;
    private String Nic;
    private String Grade;
    private String Dob;
    private int SalNo;
    private String sal;
    private String acc;
    private String password;
    private String contact;
    private String status;
    private String emer;
    private String se;
    private String du;
    private String Atten;
    private String Avail;
    private String reason;
    private String lea;

    
    public void setLea(String lea) {
        this.lea = lea;
    }    

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public void setDu(String du) {
        this.du = du;
    }

    public void setAtten(String Atten) {
        this.Atten = Atten;
    }

    public void setAvail(String Avail) {
        this.Avail = Avail;
    }

    public void setSe(String se) {
        this.se = se;
    }
   
     public void setSName(String SName) {
        this.SName = SName;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public void setSalNo(int SalNo) {
        this.SalNo = SalNo;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }
   
    public void setEmail(String email) {
        this.email = email;
    }
     
    public String getLea() {
        return lea;
    }

    public String getEmail() {
        return email;
    }

    public String getAvail() {
        return Avail;
    }
        
    public String getDu() {
        return du;
    }
    
    public String getAtten() {
        return Atten;
    }
    public String getSName() {
        return SName;
    }

    public String getName() {
        return Name;
    }

    public String getGen() {
        return gen;
    }

    public String getAddr() {
        return addr;
    }

    public String getNic() {
        return Nic;
    }

    public String getGrade() {
        return Grade;
    }

    public String getDob() {
        return Dob;
    }

    public int getSalNo() {
        return SalNo;
    }

    public String getSal() {
        return sal;
    }

    public String getAcc() {
        return acc;
    }

    public String getPassword() {
        return password;
    }

    public String getContact() {
        return contact;
    }

    public String getStatus() {
        return status;
    }

    public String getEmer() {
        return emer;
    }
    
    public String getSe() {
        return se;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void InsertEmployee(){
        
         try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
          
            String query15="select count(SalaryNo),SalaryNo from Employee where E_Name='"+Name+"' or E_NIC='"+Nic+"' or E_AccountNo='"+acc+"' ";
            Statement stmt15= conn.createStatement();
            ResultSet rs15=stmt15.executeQuery(query15);
            while(rs15.next()){
               int i=rs15.getInt("count(SalaryNo)");
               
               if(i==0){
                    String query1="insert into Employee(E_SName,E_Name,E_Email,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone,E_MedicalStatus,E_EmergencyContact) values ('"+SName+"','"+Name+"','"+email+"','"+gen+"','"+addr+"','"+Nic+"','"+Grade+"','"+Dob+"','"+sal+"','"+acc+"','"+password+"','"+contact+"','"+status+"','"+emer+"')";
            Statement stmt1= conn.createStatement();
            stmt1.executeUpdate(query1);
         
            //Generate QR
            String query16="select SalaryNo from Employee where E_Name='"+Name+"' or E_NIC='"+Nic+"' or E_AccountNo='"+acc+"' ";
            Statement stmt16= conn.createStatement();
            ResultSet rs16=stmt16.executeQuery(query16);
            while(rs16.next()){
            int i1=rs16.getInt("SalaryNo");
            
            String qrCodeText = Integer.toString(i1);
		String filePath = "D:\\QR.png";        //location where png file will generate
		int size = 125;
		String fileType = "png";
		File qrFile = new File(filePath);
		createQRImage(qrFile, qrCodeText, size, fileType);
		System.out.println("QR code generated");
                
            ManageEmployeeSide manageEside=ManageEmployeeSide.getobj(); 
            manageEside.setVisible(true);
            Temp tmp=Temp.temp1;
            tmp.sidesetpanel.add(manageEside,tmp.cside);
            } 
               }else{
                   
                   
                   showMessage("Employee is not Valid, Please Try Again ");
                   System.out.println("Invalid ID");
               }
               }

            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
public void UpdateEmployee(){
    int x=JOptionPane.showConfirmDialog(null, "Do you relly want to Update?");
    if(x==0){
     try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            
           
            String query4="select count(SalaryNo)from Employee where E_Name='"+se+"'" ;
            Statement stmt4= conn.createStatement();
            ResultSet rs4=stmt4.executeQuery(query4);
            while(rs4.next()){
               int i=rs4.getInt("count(SalaryNo)");
               if(i==1){
                    String query3 = "UPDATE Employee SET E_SName='"+SName+"',E_Name='"+Name+"',E_Email='"+email+"',E_Gender='"+gen+"',E_Grade='"+Grade+"', E_NIC='"+Nic+"',E_Address='"+addr+"',E_Phone='"+contact+"',E_Password='"+password+"',E_DOB='"+Dob+"',E_BasicSalary='"+sal+"',E_AccountNo='"+acc+"',E_MedicalStatus='"+status+"',E_EmergencyContact='"+emer+"'  WHERE E_Name='"+se+"'";
                    Statement stmt3= conn.createStatement();
                    stmt3.executeUpdate(query3);
                    
               }else{
                   
            String query7="select count(SalaryNo)from Employee where E_NIC='"+se+"'" ;
            Statement stmt7= conn.createStatement();
            ResultSet rs7=stmt7.executeQuery(query7);
            while(rs7.next()){
               int i2=rs7.getInt("count(SalaryNo)");
               if(i2==1){
                    String query8 = "UPDATE Employee SET E_SName='"+SName+"',E_Email='"+email+"',E_Name='"+Name+"',E_Gender='"+gen+"',E_Grade='"+Grade+"', E_NIC='"+Nic+"',E_Address='"+addr+"',E_Phone='"+contact+"',E_Password='"+password+"',E_DOB='"+Dob+"',E_BasicSalary='"+sal+"',E_AccountNo='"+acc+"',E_MedicalStatus='"+status+"',E_EmergencyContact='"+emer+"'  WHERE E_NIC='"+se+"'";
                    Statement stmt8= conn.createStatement();
                    stmt8.executeUpdate(query8);
                   
               }else{
                   
                    String query9="select count(SalaryNo)from Employee where SalaryNo='"+se+"'" ;
            Statement stmt9= conn.createStatement();
            ResultSet rs9=stmt9.executeQuery(query9);
            while(rs9.next()){
               int i3=rs9.getInt("count(SalaryNo)");
               if(i3==1){
                    String query10 = "UPDATE Employee SET E_SName='"+SName+"',E_Name='"+Name+"',E_Email='"+email+"',E_Gender='"+gen+"',E_Grade='"+Grade+"', E_NIC='"+Nic+"',E_Address='"+addr+"',E_Phone='"+contact+"',E_Password='"+password+"',E_DOB='"+Dob+"',E_BasicSalary='"+sal+"',E_AccountNo='"+acc+"',E_MedicalStatus='"+status+"',E_EmergencyContact='"+emer+"'  WHERE SalaryNo='"+se+"'";
                    Statement stmt10= conn.createStatement();
                    stmt10.executeUpdate(query10);
                    
    
                    
                    
               }else{
                   
                   
                   showMessage("Employee is not Valid, Please Try Again ");
                   System.out.println("Invalid ID");
               }
               }
               }
               }}}
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}   
public void DeleteEmployee(){
    int x=JOptionPane.showConfirmDialog(null, "Do you relly want to Delete?");
    if(x==0){
           try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            ManageEmployee manageE=ManageEmployee.getobj();
            
               
          String query5="select count(SalaryNo)from Employee where E_Name='"+se+"'" ;
            Statement stmt5= conn.createStatement();
            ResultSet rs5=stmt5.executeQuery(query5);
            while(rs5.next()){
               int i=rs5.getInt("count(SalaryNo)");
               if(i==1){
                    String query6 = "delete from Employee WHERE E_Name='"+se+"'";
                    Statement stmt6= conn.createStatement();
                    stmt6.executeUpdate(query6);
      
             String ni="";
               manageE.nic.setText(ni); 
               String emai="";
               manageE.email.setText(emai);
               String snam="";
               manageE.sname.setText(snam);
               String nam="";
               manageE.name.setText(nam);
               String ge="Male";
               manageE.gender.setSelectedItem(ge);
               String gra="Driver";
               manageE.grade.setSelectedItem(gra);
               String Addr="";
               manageE.address.setText(Addr);
               String Dob="";
               manageE.dob.setText(Dob);
               String bs="";
               manageE.bsalary.setText(bs);
               String ac="";
               manageE.accNo.setText(ac);
               String pwd="";
               manageE.pass.setText(pwd);
               String contact="";
               manageE.phone.setText(contact);
               String med="";
               manageE.mStatus.setText(med);
               String emer="";
               manageE.emergency.setText(emer);
            
               }else{
                   
            String query11="select count(SalaryNo)from Employee where E_NIC='"+se+"'" ;
            Statement stmt11= conn.createStatement();
            ResultSet rs11=stmt11.executeQuery(query11);
            while(rs11.next()){
               int i2=rs11.getInt("count(SalaryNo)");
               if(i2==1){
                    String query12 = "delete from Employee WHERE E_NIC='"+se+"'";
                    Statement stmt12= conn.createStatement();
                    stmt12.executeUpdate(query12);
                    
                     String ni="";
               manageE.nic.setText(ni); 
               String emai="";
               manageE.email.setText(emai);
               String snam="";
               manageE.sname.setText(snam);
               String nam="";
               manageE.name.setText(nam);
               String ge="Male";
               manageE.gender.setSelectedItem(ge);
               String gra="Driver";
               manageE.grade.setSelectedItem(gra);
               String Addr="";
               manageE.address.setText(Addr);
               String Dob="";
               manageE.dob.setText(Dob);
               String bs="";
               manageE.bsalary.setText(bs);
               String ac="";
               manageE.accNo.setText(ac);
               String pwd="";
               manageE.pass.setText(pwd);
               String contact="";
               manageE.phone.setText(contact);
               String med="";
               manageE.mStatus.setText(med);
               String emer="";
               manageE.emergency.setText(emer);
                   
               }else{
                   
            String query13="select count(SalaryNo)from Employee where SalaryNo='"+se+"'" ;
            Statement stmt13= conn.createStatement();
            ResultSet rs13=stmt13.executeQuery(query13);
            while(rs13.next()){
               int i3=rs13.getInt("count(SalaryNo)");
               if(i3==1){
                    String query14 = "delete from Employee WHERE SalaryNo='"+se+"'";
                    Statement stmt14= conn.createStatement();
                    stmt14.executeUpdate(query14);
                    
                     String ni="";
               manageE.nic.setText(ni); 
               String emai="";
               manageE.email.setText(emai);
               String snam="";
               manageE.sname.setText(snam);
               String nam="";
               manageE.name.setText(nam);
               String ge="Male";
               manageE.gender.setSelectedItem(ge);
               String gra="Driver";
               manageE.grade.setSelectedItem(gra);
               String Addr="";
               manageE.address.setText(Addr);
               String Dob="";
               manageE.dob.setText(Dob);
               String bs="";
               manageE.bsalary.setText(bs);
               String ac="";
               manageE.accNo.setText(ac);
               String pwd="";
               manageE.pass.setText(pwd);
               String contact="";
               manageE.phone.setText(contact);
               String med="";
               manageE.mStatus.setText(med);
               String emer="";
               manageE.emergency.setText(emer);
               
               }else{
                   
                   
                   showMessage("Employee is not Valid, Please Try Again ");
                   System.out.println("Invalid ID");
               }
               }
               }
               }}}
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}    

public void Search() throws WriterException, IOException{
    String qrCodeText = Integer.toString(SalNo);
		String filePath = "D:\\QR.png";        //location where png file will generate
		int size = 125;
		String fileType = "png";
		File qrFile = new File(filePath);
		createQRImage(qrFile, qrCodeText, size, fileType);
		System.out.println("QR code generated");
}

public void InsertAttendance(){
    
                                          try {
                                                 ManageAttendance manageA=ManageAttendance.getobj();
                                                 
                                                           Connection conn=MysqlConnect.getDbCon();
                                                            
                                                           String query4="select count(SalaryNo) from Employee where SalaryNo='"+se+"'";
                                                            Statement stmt4= conn.createStatement();
                                                            ResultSet r4=stmt4.executeQuery(query4);
                                                          while(r4.next()){
				       
                                                            int count=r4.getInt("count(SalaryNo)");
                                                        
                                                            if(count==1){
                                                                
                                                             String query0="select E_Grade from Employee where SalaryNo='"+se+"'";
                                                            Statement stmt0= conn.createStatement();
                                                            ResultSet r0=stmt0.executeQuery(query0);
                                                          while(r0.next()){
				       
                                                            String grad=r0.getString("E_Grade");
                                                            if(("Conductor".equals(grad))||("Driver".equals(grad))){
                                                            
                                                            du=SearchDutyNo(se);
                                                            Atten="1";
                                                            Avail="1";
                                                            String query="select Count(A_ID),A_Date from DCAttendance where SalaryNo='"+se+"' and OnTime=OffTime and Availability='"+Avail+"'";
                                                            Statement stmt= conn.createStatement();
                                                            ResultSet r=stmt.executeQuery(query);
                                                            
                                                          while(r.next()){
				       
                                                            int i=r.getInt("Count(A_ID)");
                                                            String da=r.getString("A_Date");
                                                            if(i==0){
                                                            
                                                            String query1="select E_Grade,SalaryNo from Employee where SalaryNo='"+se+"'";
                                                            Statement stmt1= conn.createStatement();
                                                            ResultSet r1=stmt1.executeQuery(query1);
                                                          while(r1.next()){
				       
                                                            String gra=r1.getString("E_Grade");
                                                            String Salno=r1.getString("SalaryNo");
                                                            
                                                

                                                String query2="insert into DCAttendance(SalaryNo,Grade,Duty,Attendance,Availability) values ('"+Salno+"','"+gra+"','"+du+"','"+Atten+"','"+Avail+"')";
                                                Statement stmt2= conn.createStatement();
                                                stmt2.executeUpdate(query2);
                                                System.out.println(Salno);
        
                                                          } } else{
                                                               showMessage("Employee Attendence is already marked. ");
                                                                System.out.println("Invalid Attendence");
                                                            } } }else{
                                                            
                                                                                Atten="1";
                                                                                Avail="1";
                                                                                String query="select Count(A_ID),A_Date from OfficerAttendance where SalaryNo='"+se+"' and OnTime=OffTime and Availability='"+Avail+"'";
                                                                                Statement stmt= conn.createStatement();
                                                                                ResultSet r=stmt.executeQuery(query);

                                                                              while(r.next()){

                                                                                int i=r.getInt("Count(A_ID)");
                                                                                String da=r.getString("A_Date");
                                                                                if(i==0){

                                                                                String query1="select E_Grade,SalaryNo from Employee where SalaryNo='"+se+"'";
                                                                                Statement stmt1= conn.createStatement();
                                                                                ResultSet r1=stmt1.executeQuery(query1);
                                                                              while(r1.next()){

                                                                                String gra=r1.getString("E_Grade");
                                                                                String Salno=r1.getString("SalaryNo");


                                                                                String query2="insert into OfficerAttendance(SalaryNo,Grade,Attendance,Availability) values ('"+Salno+"','"+gra+"','"+Atten+"','"+Avail+"')";
                                                                                Statement stmt2= conn.createStatement();
                                                                                stmt2.executeUpdate(query2);
                                                                                System.out.println(Salno);

                                                                              } } else{
                                                                                   showMessage("Employee Attendence is already marked. ");
                                                                System.out.println("Invalid Attendence");
                                                                                } }
                                                            }}}else{
                                                                showMessage("Employee is not Valid, Please Try Again ");
                                                                System.out.println("Invalid ID");
                                                            }}
                                                          manageA.TableLoad1();
                                                          manageA.TableLoad2();
                                                          } catch (Exception e) {
            System.err.println(e);
        }
}
public void UpdateAttendance(){
                  try {
                               ManageAttendance manageA=ManageAttendance.getobj();
                                                           Connection conn=MysqlConnect.getDbCon();
                                                            
                                                           String query4="select count(SalaryNo) from Employee where SalaryNo='"+se+"'";
                                                            Statement stmt4= conn.createStatement();
                                                            ResultSet r4=stmt4.executeQuery(query4);
                                                          while(r4.next()){
				       
                                                            int count=r4.getInt("count(SalaryNo)");
                                                        
                                                            if(count==1){
                                                             String query0="select E_Grade from Employee where SalaryNo='"+se+"'";
                                                            Statement stmt0= conn.createStatement();
                                                            ResultSet r0=stmt0.executeQuery(query0);
                                                          while(r0.next()){
				       
                                                            String grad=r0.getString("E_Grade");
                                                            if(("Conductor".equals(grad))||("Driver".equals(grad))){
                                                            
                                                            String du=SearchDutyNo(se);;
                                                            String Atten="1";
                                                            String Avail="1";
                                                            String query="select Count(A_ID),A_Date from DCAttendance where SalaryNo='"+se+"' and OnTime=OffTime and Availability='"+Avail+"'";
                                                            Statement stmt= conn.createStatement();
                                                            ResultSet r=stmt.executeQuery(query);
                                                            
                                                          while(r.next()){
				       
                                                            int i=r.getInt("Count(A_ID)");
                                                            String da=r.getString("A_Date");
                                                            if(i==0){
                                                             showMessage("Employee Leave is already marked. ");
                                                             System.out.println("Invalid Leave");
                                                                
                                                                
                                                       } else{
                                                               Avail="0";
                                                                String Av="1";
                                                                String query3=  "UPDATE DCAttendance SET Availability='"+Avail+"' WHERE SalaryNo='"+se+"' and OnTime=OffTime and Availability='"+Av+"'";
                                                                Statement stmt3= conn.createStatement();
                                                                stmt3.executeUpdate(query3);
                                                            } } }else{
                                                            
                                                                                String Atten="1";
                                                                                String Avail="1";
                                                                                String query="select Count(A_ID),A_Date from OfficerAttendance where SalaryNo='"+se+"' and OnTime=OffTime and Availability='"+Avail+"'";
                                                                                Statement stmt= conn.createStatement();
                                                                                ResultSet r=stmt.executeQuery(query);

                                                                              while(r.next()){

                                                                                int i=r.getInt("Count(A_ID)");
                                                                                String da=r.getString("A_Date");
                                                                                if(i==0){
                                                                                    
                                                                                    showMessage("Employee Leave is already marked. ");
                                                                                    System.out.println("Invalid Leave");
                                                                                    

                                                                                 } else{
                                                                                   Avail="0";
                                                                                   String Av="1";
                                                                                    String query3=  "UPDATE OfficerAttendance SET Availability='"+Avail+"' WHERE SalaryNo='"+se+"' and OnTime=OffTime and Availability='"+Av+"'";
                                                                                    Statement stmt3= conn.createStatement();
                                                                                    stmt3.executeUpdate(query3);
                                                                                } }
                                                            }}}else{
                                                                showMessage("Employee is not Valid, Please Try Again ");
                                                                System.out.println("Invalid ID");
                                                            }}
                                                          manageA.TableLoad1();
                                                          manageA.TableLoad2();
                                                          } catch (Exception e) {
            System.err.println(e);
        }
}

public void InsertLeave(){
    
     try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            ManageLeave manageL=ManageLeave.getobj();
           
            Date date = new Date();
            String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
                    String saln=Integer.toString(SalNo);
                     System.out.println(date1);
                    
                     String query7="select count(SalaryNo),E_Grade from Employee where SalaryNo='"+SalNo+"' and E_SName='"+SName+"'" ;
                    Statement stmt7= conn.createStatement();
                    ResultSet rs7=stmt7.executeQuery(query7);
                    while(rs7.next()){
                        
                     int i=rs7.getInt("count(SalaryNo)");
                     String grad=rs7.getString("E_Grade");
                     if(i==1){
                      if(("Conductor".equals(grad))||("Driver".equals(grad))){
                     
                    String query5="select count(A_ID),SalaryNo,Grade from DCAttendance where SalaryNo='"+SalNo+"' and A_Date LIKE '%"+date1+"%'" ;
                    Statement stmt5= conn.createStatement();
                    ResultSet rs5=stmt5.executeQuery(query5);
                    while(rs5.next()){
                        
                            int count=rs5.getInt("count(A_ID)");
                            String gra=rs5.getString("Grade");
                            
                            if(count==0){
                                Avail="0";
                                du=SearchDutyNo(saln);
                                lea="1";
                                Atten="1";
                                String query6="insert into DCAttendance(SalaryNo,Grade,Duty,Attendance,Availability,E_Leave,Reason) values ('"+SalNo+"','"+grad+"','"+du+"','"+Atten+"','"+Avail+"','"+lea+"','"+reason+"')";
                                Statement stmt6= conn.createStatement();
                                stmt6.executeUpdate(query6);  
                                
                                String snam="";
                                manageL.sname.setText(snam);
                                String sln="";
                                manageL.salno.setText(sln);
                                String re="";
                                manageL.reason.setText(re);
                                String leacoun="0";
                                manageL.leaveCount.setText(leacoun);
                            }else{
                   
                   
                   showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave");
               }
                    }
                      }
                      else{
                    String query8="select count(A_ID),SalaryNo,Grade from OfficerAttendance where SalaryNo='"+SalNo+"' and A_Date LIKE '%"+date1+"%'" ;
                    Statement stmt8= conn.createStatement();
                    ResultSet rs8=stmt8.executeQuery(query8);
                    while(rs8.next()){
                        
                            int count=rs8.getInt("count(A_ID)");
                            String gra=rs8.getString("Grade");
                            
                            if(count==0){
                                Avail="0";
                                
                                lea="1";
                                Atten="1";
                                String query9="insert into OfficerAttendance(SalaryNo,Grade,Attendance,Availability,E_Leave,Reason) values ('"+SalNo+"','"+grad+"','"+Atten+"','"+Avail+"','"+lea+"','"+reason+"')";
                                Statement stmt9= conn.createStatement();
                                stmt9.executeUpdate(query9);  
                                
                                String snam="";
                                manageL.sname.setText(snam);
                                String sln="";
                                manageL.salno.setText(sln);
                                String re="";
                                manageL.reason.setText(re);
                                String leacoun="0";
                                manageL.leaveCount.setText(leacoun);
                            }else{
                   
                   
                   showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave");
               }
                    }
                      }
                     }else{
                        showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave"); 
                     }
                    }
            manageL.TableLoad1();
            manageL.TableLoad2();
        } catch (Exception e) {
            System.err.println(e);
        }
}

public void UpdateLeave(){
    int x=JOptionPane.showConfirmDialog(null, "Do you relly want to Update?");
    if(x==0){
     try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            ManageLeave manageL=ManageLeave.getobj();
            
            lea="1";
            
            Date date = new Date();
            String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
                    
                     System.out.println(date1);
                    
                     String query10="select count(SalaryNo),E_Grade from Employee where SalaryNo='"+SalNo+"' and E_SName='"+SName+"'" ;
                    Statement stmt10= conn.createStatement();
                    ResultSet rs10=stmt10.executeQuery(query10);
                    while(rs10.next()){
                        
                     int i=rs10.getInt("count(SalaryNo)");
                     String grad=rs10.getString("E_Grade");
                     if(i==1){
                      if(("Conductor".equals(grad))||("Driver".equals(grad))){
                     
                    String query11="select count(A_ID),A_ID,SalaryNo,Grade from DCAttendance where SalaryNo='"+SalNo+"' and A_Date LIKE '%"+date1+"%' and E_Leave='"+lea+"'" ;
                    Statement stmt11= conn.createStatement();
                    ResultSet rs11=stmt11.executeQuery(query11);
                    while(rs11.next()){
                        
                            int count=rs11.getInt("count(A_ID)");
                            String gra=rs11.getString("Grade");
                            int aid=rs11.getInt("A_ID");
                            if(count==1){
                                
                                String query12="update DCAttendance set Reason='"+reason+"' where SalaryNo='"+SalNo+"' and A_ID='"+aid+"' and E_Leave='"+lea+"'";
                                Statement stmt12= conn.createStatement();
                                stmt12.executeUpdate(query12); 
                                
                                String snam="";
                                manageL.sname.setText(snam);
                                String sln="";
                                manageL.salno.setText(sln);
                                String re="";
                                manageL.reason.setText(re);
                                String leacoun="0";
                                manageL.leaveCount.setText(leacoun);
                            }else{
                   
                   
                   showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave");
               }
                    }
                      }
                      else{
                    String query13="select count(A_ID),A_ID,SalaryNo,Grade from OfficerAttendance where SalaryNo='"+SalNo+"' and A_Date LIKE '%"+date1+"%' and E_Leave='"+lea+"'" ;
                    Statement stmt13= conn.createStatement();
                    ResultSet rs13=stmt13.executeQuery(query13);
                    while(rs13.next()){
                        
                            int count=rs13.getInt("count(A_ID)");
                            String gra=rs13.getString("Grade");
                            int aid=rs13.getInt("A_ID");
                            
                            if(count==1){
                               
                                String query14="update OfficerAttendance set Reason='"+reason+"' where SalaryNo='"+SalNo+"' and A_ID='"+aid+"' and E_Leave='"+lea+"'";
                                Statement stmt14= conn.createStatement();
                                stmt14.executeUpdate(query14); 
                                
                                String snam="";
                                manageL.sname.setText(snam);
                                String sln="";
                                manageL.salno.setText(sln);
                                String re="";
                                manageL.reason.setText(re);
                                String leacoun="0";
                                manageL.leaveCount.setText(leacoun);
                            }else{
                   
                   
                   showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave");
               }
                    }
                      }
                     }else{
                        showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave"); 
                     }
                    }
            manageL.TableLoad1();
            manageL.TableLoad2();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

public void DeleteLeave(){
    int x=JOptionPane.showConfirmDialog(null, "Do you relly want to Delete?");
    if(x==0){
     try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            ManageLeave manageL=ManageLeave.getobj();
            
            lea="1";
            
            Date date = new Date();
            String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
                    
                     System.out.println(date1);
                    
                     String query10="select count(SalaryNo),E_Grade from Employee where SalaryNo='"+SalNo+"' and E_SName='"+SName+"'" ;
                    Statement stmt10= conn.createStatement();
                    ResultSet rs10=stmt10.executeQuery(query10);
                    while(rs10.next()){
                        
                     int i=rs10.getInt("count(SalaryNo)");
                     String grad=rs10.getString("E_Grade");
                     if(i==1){
                      if(("Conductor".equals(grad))||("Driver".equals(grad))){
                     
                    String query11="select count(A_ID),A_ID,SalaryNo,Grade from DCAttendance where SalaryNo='"+SalNo+"' and A_Date LIKE '%"+date1+"%' and E_Leave='"+lea+"'" ;
                    Statement stmt11= conn.createStatement();
                    ResultSet rs11=stmt11.executeQuery(query11);
                    while(rs11.next()){
                        
                            int count=rs11.getInt("count(A_ID)");
                            String gra=rs11.getString("Grade");
                            int aid=rs11.getInt("A_ID");
                            if(count==1){
                                
                                String query12="delete from DCAttendance where SalaryNo='"+SalNo+"' and A_ID='"+aid+"' and E_Leave='"+lea+"'";
                                Statement stmt12= conn.createStatement();
                                stmt12.executeUpdate(query12);
                                
                                String snam="";
                                manageL.sname.setText(snam);
                                String sln="";
                                manageL.salno.setText(sln);
                                String re="";
                                manageL.reason.setText(re);
                                String leacoun="0";
                                manageL.leaveCount.setText(leacoun);
                            }else{
                   
                   
                   showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave");
               }
                    }
                      }
                      else{
                    String query13="select count(A_ID),A_ID,SalaryNo,Grade from OfficerAttendance where SalaryNo='"+SalNo+"' and A_Date LIKE '%"+date1+"%' and E_Leave='"+lea+"'" ;
                    Statement stmt13= conn.createStatement();
                    ResultSet rs13=stmt13.executeQuery(query13);
                    while(rs13.next()){
                        
                            int count=rs13.getInt("count(A_ID)");
                            String gra=rs13.getString("Grade");
                            int aid=rs13.getInt("A_ID");
                            
                            if(count==1){
                               
                                String query14="delete from  OfficerAttendance where SalaryNo='"+SalNo+"' and A_ID='"+aid+"' and E_Leave='"+lea+"'";
                                Statement stmt14= conn.createStatement();
                                stmt14.executeUpdate(query14); 
                                
                                String snam="";
                                manageL.sname.setText(snam);
                                String sln="";
                                manageL.salno.setText(sln);
                                String re="";
                                manageL.reason.setText(re);
                                String leacoun="0";
                                manageL.leaveCount.setText(leacoun);
                            }else{
                   
                   
                   showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave");
               }
                    }
                      }
                     }else{
                        showMessage("Leave is not Valid for the Employee, Please Try Again ");
                   System.out.println("Invalid Leave"); 
                     }
                    }
            manageL.TableLoad1();
            manageL.TableLoad2();      
        } catch (Exception e) {
            System.err.println(e);
        }
    }
         
}
    
 private void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
 
 
 private static void createQRImage(File qrFile, String qrCodeText, int size,
			String fileType) throws WriterException, IOException {

		
		Hashtable hintMap = new Hashtable();
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		//Specifies the exact version of QR code to be encoded.
		
		//System.out.println(hintMap); prints {ERROR_CORRECTION=L}
		
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix byteMatrix = qrCodeWriter.encode(qrCodeText,
				BarcodeFormat.QR_CODE, size, size, hintMap);

// qr codewriter encodes the string in bitmatrix
		
		int matrixWidth = byteMatrix.getWidth();
		
		//like bufferedwriter
		BufferedImage image = new BufferedImage(matrixWidth, matrixWidth,
				BufferedImage.TYPE_INT_RGB);
		image.createGraphics();

		Graphics2D graphics = (Graphics2D) image.getGraphics();
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, matrixWidth, matrixWidth);
		// Paint and save the image using the ByteMatrix
		graphics.setColor(Color.BLACK);

		for (int i = 0; i < matrixWidth; i++) {
			for (int j = 0; j < matrixWidth; j++) {
				if (byteMatrix.get(i, j)) {
					graphics.fillRect(i, j, 1, 1);
				}
			}
		}
		ImageIO.write(image, fileType, qrFile);
	}
 
 public String ValidateEmployee(){
     ManageEmployee manageE=ManageEmployee.getobj();
     
     if(SName.equals("")){
         manageE.vsname.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
       manageE.vsname.setText("");
     }
     if(Name.equals("")){
         manageE.vename.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
        regexPattern = Pattern.compile("^[a-zA-Z ]+");
        regMatcher   = regexPattern.matcher(Name);
        if(regMatcher.matches()) {
            manageE.vename.setText("");
        } else {
            manageE.vename.setText("ku i|yd fhosh yelafla wl=re muKs");
            return "fail";
        }
     }
      if(email.equals("")){
         manageE.vemail.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
             regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(email);
        if(regMatcher.matches()) {
            manageE.vemail.setText("");
        } else {
            manageE.vemail.setText("B fï,a ,smskh ksje/os fkdfõ ");
            return "fail";
        }
         
     }
      if(addr.equals("")){
         manageE.vaddress.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
         manageE.vaddress.setText("");
     }
      
      if(Nic.equals("")){
         manageE.vnic.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
         
     }else{
            regexPattern = Pattern.compile("^[0-9]{9}+V$");
        regMatcher   = regexPattern.matcher(Nic);
        if(regMatcher.matches()) {
            manageE.vnic.setText("");
        } else {
            manageE.vnic.setText("cd;sl yeÿkqïm;a  wxlh ksje/os fkdfõ ");
            return "fail";
        }
         
     }
     if(Dob.equals("")){
         manageE.vdob.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
         regexPattern = Pattern.compile("^[0-9]{4}+-[0-9]{2}+-[0-9]{2}$");
        regMatcher   = regexPattern.matcher(Dob);
        if(regMatcher.matches()) {
            manageE.vdob.setText("");
        } else {
            manageE.vdob.setText("Wmka oskh 1999-08-08 wdldrhg ;sìh hq;=h");
            return "fail";
        }
     }
     if(sal.equals("")){
         manageE.vbsal.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
        regexPattern = Pattern.compile("^[0-9]{3,7}$");
        regMatcher   = regexPattern.matcher(sal);
        if(regMatcher.matches()) {
            manageE.vbsal.setText("");
        } else {
            manageE.vbsal.setText("jegqm i|yd fhosh yelafla wxl muKs");
            return "fail";
        }
     }
     if(acc.equals("")){
         manageE.vacc.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
         regexPattern = Pattern.compile("^[0-9]{11}$");
        regMatcher   = regexPattern.matcher(acc);
        if(regMatcher.matches()) {
            manageE.vacc.setText("");
        } else {
            manageE.vacc.setText(".skqï wxlh ksje/os fkdfõ ");
            return "fail";
        }
     }
     if(password.equals("")){
       if((Grade.equals("A.M Engineering"))||(Grade.equals("A.M Operaion"))||(Grade.equals("A.M Security"))||(Grade.equals("A.M Financial"))||(Grade.equals("HR Clerk"))||(Grade.equals("Inventory Clerk"))||(Grade.equals("Manager"))){
         manageE.vpass.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         
       }
     }else{
         regexPattern = Pattern.compile("^[a-zA-Z-0-9]{8,16}$");
        regMatcher   = regexPattern.matcher(password);
        if(regMatcher.matches()) {
            manageE.vpass.setText("");
        } else {
            manageE.vpass.setText("mdiaj¾â ioyd wxl fyda wl=re 8-16 ;sìh hq;=h ");
            return "fail";
        }
     }
      if(contact.equals("")){
         manageE.vphone.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
           regexPattern = Pattern.compile("^[0-9]{10}$");
        regMatcher   = regexPattern.matcher(contact);
        if(regMatcher.matches()) {
            manageE.vphone.setText("");
        } else {
            manageE.vphone.setText("ÿrl;k wxlh ksje/os fkdfõ ");
            return "fail";
        }
         
     }
      if(status.equals("")){
         manageE.vstatus.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
         regexPattern = Pattern.compile("^[a-zA-Z]+");
        regMatcher   = regexPattern.matcher(status);
        if(regMatcher.matches()) {
            manageE.vstatus.setText("");
        } else {
            manageE.vstatus.setText("fi!LHh ;;aajh i|yd fhosh yelafla wl=re muKs");
            return "fail";
        }
     }
     if(emer.equals("")){
         manageE.vemer.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
           regexPattern = Pattern.compile("^[0-9]{10}$");
        regMatcher   = regexPattern.matcher(emer);
        if(regMatcher.matches()) {
            manageE.vemer.setText("");
        } else {
            manageE.vemer.setText("yosis weu;=ï wxlh ksje/os fkdfõ ");
            return "fail";
        }
     } 
     return "success";
 }
  
 public String ValidateLeave(){
     
     ManageLeave manageL=ManageLeave.getobj();
    String salno= manageL.salno.getText();
    
 if(salno.equals("")){
         manageL.vsalno.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
         regexPattern = Pattern.compile("^[0-9]{1,6}$");
        regMatcher   = regexPattern.matcher(salno);
        if(regMatcher.matches()) {
            manageL.vsalno.setText("");
        } else {
            manageL.vsalno.setText("fõ;k wxlhg wxl muKla we;=,;a úh hq;=h");
            return "fail";
        }
     }
 if(SName.equals("")){
         manageL.vsname.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
            manageL.vsname.setText("");
     }
 
  if(reason.equals("")){
         manageL.vreason.setText("fuu ;Srej ysiaj ;eìh fkdyelsh");
         return "fail";
     }else{
            manageL.vreason.setText("");
     }
  return "success";
 
 }
 public String SearchDutyNo(String salno){
     String query15;
      try {	/*calling the mysql connection class*/
            Connection conn=MysqlConnect.getDbCon();
            
            Date date = new Date();
            String date1= new SimpleDateFormat("yyyy-MM-dd").format(date);
            
            String[] DateParts = date1.split("-");
            String day = DateParts[2];
            String year =DateParts[0];
            String Month=DateParts[1]; 
            String mon=DecideMonth(Month);
            
             //System.out.println(year);
             //System.out.println(Month);
             //System.out.println(day);
             
             
            if(null!=day)switch (day) {
             case "01":{
                 query15="select d1 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d1");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "02":{
                 query15="select d2 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d2");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "03":{
                 query15="select d3 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d3");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "04":{
                 query15="select d4 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d4");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "05":{
                 query15="select d5 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d5");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "06":{
                 query15="select d6 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d6");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "07":{
                 query15="select d7 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d7");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "08":{
                 query15="select d8 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d8");
                     du=Integer.toString(dut);
                   
                 }        break;
                 }
             case "09":{
                 query15="select d9 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d9");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "10":{
                 query15="select d10 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d10");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "11":{
                 query15="select d11 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d11");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "12":{
                 query15="select d12 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d12");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "13":{
                 query15="select d13 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d13");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "14":{
                 query15="select d14 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d14");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "15":{
                 query15="select d15 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d15");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "16":{
                 query15="select d16 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d16");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "17":{
                 query15="select d17 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d17");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "18":{
                 query15="select d18 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d18");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "19":{
                 query15="select d19 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d19");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "20":{
                 query15="select d20 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d20");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "21":{
                 query15="select d21 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d21");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "22":{
                 query15="select d22 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d22");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "23":{
                 query15="select d23 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d23");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "24":{
                 query15="select d24 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d24");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "25":{
                 query15="select d25 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d25");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "26":{
                 query15="select d26 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d26");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "27":{
                 query15="select d27 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d27");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "28":{
                 query15="select d28 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d28");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "29":{
                 query15="select d29 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d29");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "30":{
                 query15="select d30 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d30");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             case "31":{
                 query15="select d31 from monthly_duty where Sno='"+salno+"' and Year='"+year+"' and month='"+mon+"'" ;
                 Statement stmt15= conn.createStatement();
                 ResultSet rs15=stmt15.executeQuery(query15);
                 while(rs15.next()){
                     int dut=rs15.getInt("d31");
                     du=Integer.toString(dut);
                     
                 }        break;
                 }
             default:
                 break;
         }
            
                System.out.println(du);
             
            } catch (Exception e) {
            System.err.println(e);
        }
      return du;  
 }
 
 public void report(String reportPath){
     
        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        SLTB_sachin.Temp te=SLTB_sachin.Temp.temp1;
        Map par = new HashMap();
        par.put(null, null);
        
        //objects for full employee report 
        ManageEmployee manageE=ManageEmployee.getobj();
        ManageEmployeeUp manageEup=ManageEmployeeUp.getobj();
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
        
        //make existing jpanels invisible
        manageE.getobj().setVisible(false);
        manageEup.getobj().setVisible(false);
       
        
    }
 
 public void ParameterizedReport(String reportPath, HashMap par){
     
   SLTB_sachin.Temp te=SLTB_sachin.Temp.temp1;
   Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
   viewer=null;
   
    //objects for Leave report 
   ManageLeave manageL=ManageLeave.getobj();
   ManageLeaveUp manageLup=ManageLeaveUp.getobj();
   
     
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
        
        //make existing jpanels invisible
        manageL.getobj().setVisible(false);
        manageLup.getobj().setVisible(false);
 }
 
  public ResultSet SearchAbsent(String ADate){
      try {
     Connection conn=MysqlConnect.getDbCon();
     Atten="1";
                                                                    
    String query="select SalaryNo  from DCAttendance,OfficerAttendance,Employee where Attendance='"+Atten+"' A_Date LIKE '%"+ADate+"%' and (select * ";
     Statement stmt= conn.createStatement();
     re=stmt.executeQuery(query);    
     
 }catch (Exception e) {
            System.err.println(e);
        }
 return re;
 }
  
  public String DecideMonth(String mon){
        String month = null;
            if(null!=mon)switch (mon) {
            case "01":
                month="ckjdß";
                break;
            case "02":
                month="fmnrjdß";
                break;
            case "03":
                month="ud¾;=";
                break;
            case "04":
                month="wm%sfh,a";
                break;
            case "05":
                month="uehs";
                break;
            case "06":
                month="cQks";
                break;
            case "07":
                month="cQ,s";
                break;
            case "08":
                month="wf.daia;=";
                break;
            case "09":
                month="iema;eïn¾";
                break;
            case "10":
                month="Tlaf;dan¾";
                break;
            case "11":
                month="fkdfjïn¾";
                break;
            case "12":
                month="foieïn¾";
                break;
            default:
                break;
        }
            //System.out.println(month);
            return month;
  }
          
 
}
