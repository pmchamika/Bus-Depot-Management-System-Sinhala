/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author sachin kumara
 */
public class Duty {

    protected ResultSet re = null;
    protected PreparedStatement pst = null;
    protected Connection con = com.ConnectionMysql.MysqlConnect.getDbCon();
    protected SqlQueryCreater sql = new SqlQueryCreater();
    protected int duty_no;
    protected String bus_type;
    protected String service_st;
    protected String service_mid;
    protected String service_end;
    protected double distance;

    public Duty(int duty_no) {
        this.duty_no = duty_no;
        String para[] = {"duty_no"};
        try {
            pst = con.prepareStatement(sql.CreateSelect("duty", null, para));
            pst.setInt(1, duty_no);
            re = pst.executeQuery();
            if (re.next()) {
                this.bus_type = re.getString("bus_type");
                this.service_st = re.getString("service_st");
                this.service_mid = re.getString("service_mid");
                this.service_end = re.getString("service_end");
                this.distance = re.getDouble("distance");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Duty() {
    }

    public boolean chdutyin(int id) {

        try {
            String para[] = {"duty_no"};
            pst = con.prepareStatement(sql.CreateSelect("duty", null, para));
            pst.setInt(1, id);
            re = pst.executeQuery();
            if (re.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public int getDuty_no() {
        return duty_no;
    }

    public void setDuty_no(int duty_no) {
        this.duty_no = duty_no;
    }

    public String getBus_type() {
        return bus_type;
    }

    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
    }

    public String getService_st() {
        return service_st;
    }

    public void setService_st(String service_st) {
        this.service_st = service_st;
    }

    public String getService_mid() {
        return service_mid;
    }

    public void setService_mid(String service_mid) {
        this.service_mid = service_mid;
    }

    public String getService_end() {
        return service_end;
    }

    public void setService_end(String service_end) {
        this.service_end = service_end;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public ResultSet getAllDutylist() {
        try {

            pst = con.prepareStatement(sql.CreateSelect("duty", null, null) + " ORDER BY duty_no ASC");
            re = pst.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(Duty.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return re;
    }

    public String AddDuty(Duty duty) {
        try {
            String para[] = {"duty_no"};
            pst = con.prepareStatement(sql.CreateSelect("duty", null, para));
            pst.setInt(1, duty.getDuty_no());
            re = pst.executeQuery();
            if (re.next()) {
                return "fuu ld¾h wxlh Ndú;d lr we; fjk;a wxlhla W;aiy lrkak ";
            }
            String col[] = {"duty_no", "bus_type", "service_st", "service_mid", "service_end", "distance"};
            System.out.println(sql.CreateInsert("duty", col));
            pst = con.prepareStatement(sql.CreateInsert("duty", col));
            pst.setInt(1, duty.getDuty_no());
            pst.setString(2, duty.bus_type);
            pst.setString(3, duty.getService_st());
            pst.setString(4, duty.getService_mid());
            pst.setString(5, duty.getService_end());
            pst.setDouble(6, duty.getDistance());
            pst.executeUpdate();
            return "ok";
        } catch (SQLException e) {
            return "fuu wjia:dfõ isÿ l, fkdyel kej; W;aiy lrkav @" + e.toString();
        }
    }

    public String EditDuty(Duty newdu, Duty olddu) {
        try {
            String para[] = {"duty_no"};
            int ch = 0;
            pst = con.prepareStatement(sql.CreateSelect("duty", null, para));
            pst.setInt(1, olddu.getDuty_no());
            re = pst.executeQuery();
            if (!re.next()) {
                return "uu o;a;h kj we;=,;a lsßula isÿ lrkak ";
            }
            String col[] = {"duty_no", "bus_type", "service_st", "service_mid", "service_end", "distance"};
            System.out.println(sql.CreateUpdate("duty", col, col));
            pst = con.prepareStatement(sql.CreateUpdate("duty", col, col));
            pst.setInt(1, newdu.getDuty_no());
            pst.setString(2, newdu.getBus_type());
            pst.setString(3, newdu.getService_st());
            pst.setString(4, newdu.getService_mid());
            pst.setString(5, newdu.getService_end());
            pst.setDouble(6, newdu.getDistance());
            pst.setInt(7, olddu.getDuty_no());
            pst.setString(8, olddu.getBus_type());
            pst.setString(9, olddu.getService_st());
            pst.setString(10, olddu.getService_mid());
            pst.setString(11, olddu.getService_end());
            pst.setDouble(12, olddu.getDistance());
            pst.executeUpdate();

            return "ok";
        } catch (Exception e) {
            return "fuu wjia:dfõ isÿ l, fkdyel kej; W;aiy lrkav @" + e.toString();
        }
    }

    public String RemoveDuty(int duno) {
        try {
            String para[] = {"duty_no"};
            int ch = 0;
            pst = con.prepareStatement(sql.CreateSelect("duty", null, para));
            pst.setInt(1, duno);
            re = pst.executeQuery();
            if (!re.next()) {
                return "ld¾h wxlh " + duno + " o;a; .nvdfõ fkdu;";
            }
            //String para[]={"duty_no"};
            System.out.println(sql.CreateDelete("duty", para));
            pst = con.prepareStatement(sql.CreateDelete("duty", para));
            pst.setInt(1, duno);
            pst.executeUpdate();

            return "ok";
        } catch (Exception e) {
            return "fuu wjia:dfõ isÿ l, fkdyel kej; W;aiy lrkav @" + e.toString();
        }
    }

    public ResultSet SearchDutyno(int duno) {
        try {
            String para[] = {"duty_no"};
            pst = con.prepareStatement(sql.CreateSelect("duty", null, para) + " ORDER BY duty_no ASC");
            pst.setInt(1, duno);
            re = pst.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(Duty.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return re;
    }

    public ResultSet Search(String ss, String sm, String se) {

        if (sm.equalsIgnoreCase("") && se.equalsIgnoreCase("")) {
            //System.out.println("1");
            try {
                String parati[] = {"service_st"};
                String para[] = {ss};
                pst = con.prepareStatement(sql.CreateSearch("duty", null, parati, para));
                re = pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ss.equalsIgnoreCase("") && se.equalsIgnoreCase("")) {
            //System.out.println("2");
            try {

                String parati[] = {"service_mid"};
                String para[] = {sm};
                pst = con.prepareStatement(sql.CreateSearch("duty", null, parati, para));
                re = pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ss.equalsIgnoreCase("") && sm.equalsIgnoreCase("")) {
            try {
                // System.out.println("3");
                String parati[] = {"service_end"};
                String para[] = {se};
                pst = con.prepareStatement(sql.CreateSearch("duty", null, parati, para));
                re = pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ss.equalsIgnoreCase("")) {
            //System.out.println("4");
            try {
                String parati[] = {"service_mid", "service_end"};
                String para[] = {sm, se};
                pst = con.prepareStatement(sql.CreateSearch("duty", null, parati, para));
                re = pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (sm.equalsIgnoreCase("")) {
            //System.out.println("5");
            try {
                String parati[] = {"service_st", "service_end"};
                String para[] = {ss, se};
                pst = con.prepareStatement(sql.CreateSearch("duty", null, parati, para));
                re = pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (se.equalsIgnoreCase("")) {
            // System.out.println("6");
            try {
                String parati[] = {"service_st", "service_mid"};
                String para[] = {ss, sm};
                pst = con.prepareStatement(sql.CreateSearch("duty", null, parati, para));
                re = pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            //System.out.println("7");
            try {
                String parati[] = {"service_st", "service_mid", "service_end"};
                String para[] = {ss, sm, se};
                pst = con.prepareStatement(sql.CreateSearch("duty", null, parati, para));
                re = pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return re;
    }

    public void report() {
        SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;
        //Duty_list dul=Duty_list.getobj();
        // dul.setVisible(true);
        // te.mainsetpanel.add(dul,te.cmain);
        //this.setVisible(false);
        File rf;
        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        Map par = new HashMap();
        par.put(null, null);

        SLTB_sachin.panel.Duty_list_side.viewer = null;

        try {

            JasperPrint print = JasperFillManager.fillReport("src\\SLTB_sachin\\report\\Dutylist_re.jasper", par, conn);
            SLTB_sachin.panel.Duty_list_side.viewer = new JRViewer(print);
            SLTB_sachin.panel.Duty_list_side.viewer.setOpaque(true);
            SLTB_sachin.panel.Duty_list_side.viewer.setVisible(true);
            SLTB_sachin.panel.Duty_list_side.viewer.setPreferredSize(new Dimension(1149, 710));
        } catch (Exception e) {
            e.printStackTrace();
        }
        te.mainsetpanel.add(SLTB_sachin.panel.Duty_list_side.viewer, te.cmain);

//        SLTB_sachin.panel.Menu.getobj().setVisible(false);
        //te.mainsetpanel.setPreferredSize(new Dimension(1149, 710));

    }

}
