/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_isuru.Class;

import SLTB_isuru.finance.Income;
import SLTB_isuru.finance.RouteReportUp;
import com.ConnectionMysql.MysqlConnect;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author isuru
 */
public class Finance {

    public static JRViewer viewer = null;

    public String Sdate;
    public int Sdays;
    public int Sleaves;
    public int Sot;
    public int Sbasic;
    public int Sbonus;
    public int Sepf;
    public int Sloans;
    public int Stotsal;
    public String se;

    public String Idate;
    public String Iitem;
    public int Iunitprice;
    public int Iqty;
    public int Iincome;

    public String Rdeport;
    public String Rbusno;
    public String Rrouteno;
    public int Rtarget;
    public int Rsidd;
    public int Rsidc;
    public int Rseasoncount;
    public int Rseasonincome;
    public int Rticketcount;
    public int Rticketincome;
    public int Rpseasons;
    public int Rnseasons;
    public int Rmseasons;
    public int Rbonus;
    public int Rexpenses1;
    public int Rtotal;
    public int Rdbonus;
    public int Rcbonus;
    public int Rtotal1;

    public String getRdeport() {
        return Rdeport;
    }

    public void setRdeport(String Rdeport) {
        this.Rdeport = Rdeport;
    }

    public String getRbusno() {
        return Rbusno;
    }

    public void setRbusno(String Rbusno) {
        this.Rbusno = Rbusno;
    }

    public String getRrouteno() {
        return Rrouteno;
    }

    public void setRrouteno(String Rrouteno) {
        this.Rrouteno = Rrouteno;
    }

    public int getRtarget() {
        return Rtarget;
    }

    public void setRtarget(int Rtarget) {
        this.Rtarget = Rtarget;
    }

    public int getRsidd() {
        return Rsidd;
    }

    public void setRsidd(int Rsidd) {
        this.Rsidd = Rsidd;
    }

    public int getRsidc() {
        return Rsidc;
    }

    public void setRsidc(int Rsidc) {
        this.Rsidc = Rsidc;
    }

    public int getRseasoncount() {
        return Rseasoncount;
    }

    public void setRseasoncount(int Rseasoncount) {
        this.Rseasoncount = Rseasoncount;
    }

    public int getRseasonincome() {
        return Rseasonincome;
    }

    public void setRseasonincome(int Rseasonincome) {
        this.Rseasonincome = Rseasonincome;
    }

    public int getRticketcount() {
        return Rticketcount;
    }

    public void setRticketcount(int Rticketcount) {
        this.Rticketcount = Rticketcount;
    }

    public int getRticketincome() {
        return Rticketincome;
    }

    public void setRticketincome(int Rticketincome) {
        this.Rticketincome = Rticketincome;
    }

    public int getRpseasons() {
        return Rpseasons;
    }

    public void setRpseasons(int Rpseasons) {
        this.Rpseasons = Rpseasons;
    }

    public int getRnseasons() {
        return Rnseasons;
    }

    public void setRnseasons(int Rnseasons) {
        this.Rnseasons = Rnseasons;
    }

    public int getRmseasons() {
        return Rmseasons;
    }

    public void setRmseasons(int Rmseasons) {
        this.Rmseasons = Rmseasons;
    }

    public int getRbonus() {
        return Rbonus;
    }

    public void setRbonus(int Rbonus) {
        this.Rbonus = Rbonus;
    }

    public int getRexpenses1() {
        return Rexpenses1;
    }

    public void setRexpenses1(int Rexpenses1) {
        this.Rexpenses1 = Rexpenses1;
    }

    public int getRtotal() {
        return Rtotal;
    }

    public void setRtotal(int Rtotal) {
        this.Rtotal = Rtotal;
    }

    public int getRdbonus() {
        return Rdbonus;
    }

    public void setRdbonus(int Rdbonus) {
        this.Rdbonus = Rdbonus;
    }

    public int getRcbonus() {
        return Rcbonus;
    }

    public void setRcbonus(int Rcbonus) {
        this.Rcbonus = Rcbonus;
    }

    public int getRtotal1() {
        return Rtotal1;
    }

    public void setRtotal1(int Rtotal1) {
        this.Rtotal1 = Rtotal1;
    }

    public String getIdate() {
        return Idate;
    }

    public void setIdate(String Idate) {
        this.Idate = Idate;
    }

    public String getIitem() {
        return Iitem;
    }

    public void setIitem(String Iitem) {
        this.Iitem = Iitem;
    }

    public int getIunitprice() {
        return Iunitprice;
    }

    public void setIunitprice(int Iunitprice) {
        this.Iunitprice = Iunitprice;
    }

    public int getIqty() {
        return Iqty;
    }

    public void setIqty(int Iqty) {
        this.Iqty = Iqty;
    }

    public int getIincome() {
        return Iincome;
    }

    public void setIincome(int Iincome) {
        this.Iincome = Iincome;
    }

    public String getSdate() {
        return Sdate;
    }

    public void setSdate(String Sdate) {
        this.Sdate = Sdate;
    }

    public int getSdays() {
        return Sdays;
    }

    public void setSdays(int Sdays) {
        this.Sdays = Sdays;
    }

    public int getSleaves() {
        return Sleaves;
    }

    public void setSleaves(int Sleaves) {
        this.Sleaves = Sleaves;
    }

    public int getSot() {
        return Sot;
    }

    public void setSot(int Sot) {
        this.Sot = Sot;
    }

    public int getSbasic() {
        return Sbasic;
    }

    public void setSbasic(int Sbasic) {
        this.Sbasic = Sbasic;
    }

    public int getSbonus() {
        return Sbonus;
    }

    public void setSbonus(int Sbonus) {
        this.Sbonus = Sbonus;
    }

    public int getSepf() {
        return Sepf;
    }

    public void setSepf(int Sepf) {
        this.Sepf = Sepf;
    }

    public int getSloans() {
        return Sloans;
    }

    public void setSloans(int Sloans) {
        this.Sloans = Sloans;
    }

    public int getStotsal() {
        return Stotsal;
    }

    public void setStotsal(int Stotsal) {
        this.Stotsal = Stotsal;
    }

    public void setSe(String se) {
        this.se = se;
    }

    public String getSe() {
        return se;
    }

    public void insertSalary() {

        System.out.println("1");

        Date date = new Date();
        String date1 = new SimpleDateFormat("yyyy-MM").format(date);

        try {
            /*calling the mysql connection class*/
            Connection conn = MysqlConnect.getDbCon();

            System.out.println("1");

            String query15 = "select count(SalaryID),Date from monthlysalary where SalaryID='" + Sdate + "' and  Date='" + date1 + "'";
            Statement stmt15 = conn.createStatement();
            ResultSet rs15 = stmt15.executeQuery(query15);
            while (rs15.next()) {
                int i = rs15.getInt("count(SalaryID)");

                if (i == 0) {
                    System.out.println(Sdate);
                    System.out.println(Sbonus);
                    System.out.println(Sot);
                    System.out.println(Stotsal);
                    System.out.println(date1);
                    int SStotsal = Sbonus + Sbasic + Sot - Sloans;
                    String query1 = "insert into monthlysalary(SalaryID,Date,LeaveDays,BookingOT,OtherBonus,Loans,BasicSal,Total) values ('" + Sdate + "','" + date1 + "','" + Sdays + "','" + Sot + "','" + Sbonus + "','" + Sloans + "','" + Sbasic + "','" + SStotsal + "')";
                    Statement stmt1 = conn.createStatement();
                    stmt1.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null, "Added Successful!!!");
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void insertRouteReport() {

        System.out.println("1");

        Date date = new Date();
        String date1 = new SimpleDateFormat("yyyy-MM-dd").format(date);

        try {
            /*calling the mysql connection class*/
            Connection conn = MysqlConnect.getDbCon();

            System.out.println("RRI");

            String query15 = "select count(TID),Date from activitydetails where TID='" + Rrouteno + "' and  Date='" + date1 + "'";
            Statement stmt15 = conn.createStatement();
            ResultSet rs15 = stmt15.executeQuery(query15);
            while (rs15.next()) {
                int i = rs15.getInt("count(TID)");

                if (i == 0) {
                    System.out.println(Rrouteno);
                    System.out.println(Rsidd);
                    System.out.println(Rsidc);
                    System.out.println(Rbusno);
                    System.out.println(date1);

                    String query1 = "insert into activitydetails(TID,RideNumber,TargetIncome,BusNumber,Date,Income,Deport) values ('" + Rrouteno + "','" + Rrouteno + "','" + Rtarget + "','" + Rbusno + "','" + date1 + "','" + Rtotal1 + "','" + Rdeport + "')";
                    Statement stmt1 = conn.createStatement();

                    System.out.println("D1");

                    String query2 = "insert into dailybonus(CSalaryID,DSalaryID,Bounus,Date,TID) values ('" + Rsidc + "','" + Rsidd + "','" + Rbonus + "','" + date1 + "','" + Rrouteno + "')";
                    Statement stmt2 = conn.createStatement();

                    System.out.println(query2);

                    int total1 = Rbonus + Rexpenses1;

                    System.out.println("D3");

                    String query4 = "insert into dailyexpenses(TID,PaidBonus,ParkingEntryPayment,Total,Date) values ('" + Rrouteno + "','" + Rbonus + "','" + Rexpenses1 + "','" + total1 + "','" + date1 + "')";
                    Statement stmt4 = conn.createStatement();

                    int total2 = Rticketincome + Rseasonincome;

                    System.out.println("D4");

                    String query5 = "insert into seasonsincome(TID,TicketIncome,TicketQty,SeasonsQty,SeasonsIncome,PassengerSeasonsQty,NormalSeasonsQty,MonksSeasonsQty,TotalIncome,Date) values ('" + Rrouteno + "','" + Rticketincome + "','" + Rticketcount + "','" + Rseasoncount + "','" + Rseasonincome + "','" + Rpseasons + "','" + Rnseasons + "','" + Rmseasons + "','" + total2 + "','" + date1 + "')";
                    Statement stmt5 = conn.createStatement();
                    stmt1.executeUpdate(query1);
                    stmt2.executeUpdate(query2);
                    stmt4.executeUpdate(query4);
                    stmt5.executeUpdate(query5);

                    System.out.println("D5");
                    JOptionPane.showMessageDialog(null, "Added Successful!!!");
                } else {

                    JOptionPane.showMessageDialog(null, "This Route Report Already Avaible, Please Try Again ");
                    System.out.println("Invalid ID");
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void DeleteRouteReport() {

        Date date = new Date();
        String date1 = new SimpleDateFormat("yyyy-MM-dd").format(date);

        try {
            /*calling the mysql connection class*/
            Connection conn = MysqlConnect.getDbCon();
            RouteReportUp RR = RouteReportUp.getobj();
            String ss = RR.search.getText();
            System.out.println(ss);

            String query5 = "select count(TID) from activitydetails where TID='" + ss + "'";
            Statement stmt5 = conn.createStatement();
            ResultSet rs5 = stmt5.executeQuery(query5);
            while (rs5.next()) {
                int i = rs5.getInt("count(TID)");
                System.out.println(i);
                if (i == 1) {
                    String query6 = "DELETE  FROM activitydetails WHERE TID='" + ss + "'";
                    Statement stmt6 = conn.createStatement();
                    stmt6.executeUpdate(query6);
                    String query7 = "DELETE  FROM  dailybonus WHERE TID='" + ss + "'";
                    Statement stmt7 = conn.createStatement();
                    stmt7.executeUpdate(query7);
                    String query8 = "DELETE  FROM  dailyexpenses WHERE TID='" + ss + "'";
                    Statement stmt8 = conn.createStatement();
                    stmt8.executeUpdate(query8);
                    String query9 = "DELETE  FROM  seasonsincome WHERE TID='" + ss + "'";
                    Statement stmt9 = conn.createStatement();
                    stmt9.executeUpdate(query9);
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                } else {

                    JOptionPane.showMessageDialog(null, "Route Number is not Valid, Please Try Again ");
                    System.out.println("Invalid ID");
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void insertIncome() {

        System.out.println("1");

        Date date = new Date();
        String date1 = new SimpleDateFormat("yyyy-MM-dd").format(date);

        try {
            /*calling the mysql connection class*/
            Connection conn = MysqlConnect.getDbCon();

            System.out.println("1");

            System.out.println(Sdate);
            System.out.println(Sbonus);
            System.out.println(Sot);
            System.out.println(Stotsal);
            System.out.println(date1);
            int IIincome = Iqty * Iunitprice;
            String query1 = "insert into otherincomes(Item,Date,Qty,UnitPrice,Total) values ('" + Iitem + "','" + date1 + "','" + Iqty + "','" + Iunitprice + "','" + IIincome + "')";
            Statement stmt1 = conn.createStatement();
            stmt1.executeUpdate(query1);
            Income.getobj().TableLoad1();
            JOptionPane.showMessageDialog(null, "Added Successful!!!");

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void ParameterizedReport(String reportPath, HashMap par) {

        SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;
        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        viewer = null;

        //objects for Leave report 
        //Generating reports inside jpanel
        try {

            JasperPrint print = JasperFillManager.fillReport(reportPath, par, conn);
            viewer = new JRViewer(print);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            viewer.setPreferredSize(new Dimension(1149, 710));

        } catch (Exception e) {
            e.printStackTrace();
        }
        te.mainsetpanel.add(viewer, te.cmain);

        //make existing jpanels invisible
    }

    public void report(String reportPath) {

        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;
        Map par = new HashMap();
        par.put(null, null);

        

        viewer = null;

        //Generating reports inside jpanel
        try {

            JasperPrint print = JasperFillManager.fillReport(reportPath, par, conn);
            viewer = new JRViewer(print);
            viewer.setOpaque(true);
            viewer.setVisible(true);
            viewer.setPreferredSize(new Dimension(1149, 710));
        } catch (Exception e) {
            e.printStackTrace();
        }

        te.mainsetpanel.add(viewer, te.cmain);

        

    }

}
