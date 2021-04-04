/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author sachin kumara
 */
public class Daily_duty extends Duty {

    private String asin_did;
    private Timestamp d_date;
    private int asinSno;
    private int abSno;

    public String getAsin_did() {
        return asin_did;
    }

    public void setAsin_did(String asin_did) {
        this.asin_did = asin_did;
    }

    public Timestamp getD_date() {
        return d_date;
    }

    public void setD_date(Timestamp d_date) {
        this.d_date = d_date;
    }

    public int getAsinSno() {
        return asinSno;
    }

    public void setAsinSno(int asinSno) {
        this.asinSno = asinSno;
    }

    public int getAbSno() {
        return abSno;
    }

    public void setAbSno(int abSno) {
        this.abSno = abSno;
    }

    public boolean chassno(int y, int m, int d, int id) {

        String mon = String.valueOf(m);
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
        String ddd = String.valueOf(d);
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
        String date = "'" + y + "-" + mon + "-" + ddd + "%'";
        String monthid = id + "_" + y + "_" + mon;
        try {
            String pa[] = {"mon_did"};
            super.pst = super.con.prepareStatement(super.sql.CreateSelect("monthly_duty", null, pa));
            super.pst.setString(1, monthid);
            super.re = super.pst.executeQuery();
            if (super.re.next()) {
                String dcol = "d" + d;
                int du = super.re.getInt(dcol);
                if (du == 200) {
                    String para[] = {"asinSno", "d_date"};
                    super.pst = super.con.prepareStatement("select * from daily_duty where asinSno=? and d_date like " + date);
                    super.pst.setInt(1, id);
                    super.re = super.pst.executeQuery();
                    if (super.re.next()) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public ResultSet getall(String date) {
        date = "'" + date + "%'";
        try {
            super.pst = super.con.prepareStatement("select duty_no,abSno,asinSno from daily_duty where d_date like " + date);
            System.out.println(super.pst);
            super.re = super.pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return super.re;
    }

    public void addtable(int did, int abid, int aid) {
        try {
            String col[] = {"duty_no", "asinSno", "abSno"};
            super.pst = super.con.prepareStatement(super.sql.CreateInsert("daily_duty", col));
            super.pst.setInt(1, did);
            super.pst.setInt(2, aid);
            super.pst.setInt(3, abid);
            super.pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void edittabale(int du, int ab, int as, String day, int pdu, int pab, int pas) {
        try {
            super.pst = super.con.prepareStatement("UPDATE daily_duty SET duty_no=? , asinSno=? , abSno=? where duty_no=? AND asinSno=? AND abSno=? and d_date like '" + day + "%'");
            super.pst.setInt(1, du);
            super.pst.setInt(2, as);
            super.pst.setInt(3, ab);
            super.pst.setInt(4, pdu);
            super.pst.setInt(5, pas);
            super.pst.setInt(6, pab);
            super.pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deltabale(int du, int ab, int as, String day) {
        try {
            super.pst = super.con.prepareStatement("DELETE FROM daily_duty where duty_no=? AND asinSno=? AND abSno=? and d_date like '" + day + "%'");
            super.pst.setInt(1, du);
            super.pst.setInt(2, as);
            super.pst.setInt(3, ab);
            super.pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet searchta(int du, int salno, String day) {
        if (du == 0 && salno == 0) {
            return getall(day);
        } else if (du == 0) {
            try {
                day = "'" + day + "%'";
                super.pst = super.con.prepareStatement("select duty_no,abSno,asinSno from daily_duty where d_date like " + day + "and (asinSno=? or abSno=?)");
                super.pst.setInt(1, salno);
                super.pst.setInt(2, salno);
                super.re = super.pst.executeQuery();
                System.out.println("int " + pst);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.re;
        } else if (salno == 0) {
            try {
                day = "'" + day + "%'";
                super.pst = super.con.prepareStatement("select duty_no,abSno,asinSno from daily_duty where d_date like " + day + "and duty_no=?");
                super.pst.setInt(1, du);

                super.re = super.pst.executeQuery();
                System.out.println("int " + pst);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.re;
        } else {
            try {
                day = "'" + day + "%'";
                super.pst = super.con.prepareStatement("select duty_no,abSno,asinSno from daily_duty where d_date like " + day + "and duty_no=? and (asinSno=? or abSno=?)");
                super.pst.setInt(1, du);
                super.pst.setInt(2, salno);
                super.pst.setInt(3, salno);
                super.re = super.pst.executeQuery();
                System.out.println("int " + pst);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.re;
        }
    }

    public void reportd(String d) {
        d = d + "%";
        SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;
        //Duty_list dul=Duty_list.getobj();
        // dul.setVisible(true);
        // te.mainsetpanel.add(dul,te.cmain);
        //this.setVisible(false);
        File rf;
        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        Map par = new HashMap();
        par.put("date", d);

        SLTB_sachin.panel.Daily_duty_side.viewer = null;

        try {

            JasperPrint print = JasperFillManager.fillReport("src\\SLTB_sachin\\report\\daily_re.jasper", par, conn);
            SLTB_sachin.panel.Daily_duty_side.viewer = new JRViewer(print);
            SLTB_sachin.panel.Daily_duty_side.viewer.setOpaque(true);
            SLTB_sachin.panel.Daily_duty_side.viewer.setVisible(true);
            SLTB_sachin.panel.Daily_duty_side.viewer.setPreferredSize(new Dimension(1149, 710));
        } catch (Exception e) {
            e.printStackTrace();
        }
        te.mainsetpanel.add(SLTB_sachin.panel.Daily_duty_side.viewer, te.cmain);

        //SLTB_sachin.panel.Menu.getobj().setVisible(false);
        //te.mainsetpanel.setPreferredSize(new Dimension(1149, 710));

    }
}
