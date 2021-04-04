/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

import SLTB_sachin.panel.Monthly_duty_main;
import static SLTB_sachin.panel.Monthly_duty_up.mon_s;
import static SLTB_sachin.panel.Monthly_duty_up.year_s;
import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author sachin kumara
 */
public class Monthly_duty extends Duty {

    private String mon_did;
    private int Sno;
    private int year;
    private String mon;
    private int ticketm_no;
    private String BusNumber;
    private int[] dutyno = new int[31];
    private int lastday;
    private String monnum;
    private int count;
    private static int csno;
    private static int cdno;
    private static String ccid;

    public Monthly_duty(int Sno, int year, String mon) {
        this.Sno = Sno;
        this.year = year;
        this.mon = mon;
    }

    public void setall(String id) {
        try {
            String para[] = {"mon_did"};
            super.pst = super.con.prepareStatement(super.sql.CreateSelect("monthly_duty", null, para));
            super.pst.setString(1, id);
            super.re = super.pst.executeQuery();
            if (re.next()) {

                this.mon_did = re.getString(1);
                this.Sno = re.getInt(2);
                this.year = re.getInt(3);
                this.mon = re.getString(4);
                this.ticketm_no = re.getInt(5);
                this.BusNumber = re.getString(6);
                int k[] = new int[31];
                for (int i = 0; i <= 30; i++) {
                    int j = re.getInt(i + 7);
                    k[i] = j;
                }
                this.dutyno = k;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Monthly_duty() {
    }

    public String getMon_did() {
        return mon_did;
    }

    public void setMon_did(String mon_did) {
        this.mon_did = mon_did;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int Sno) {
        this.Sno = Sno;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getTicketm_no() {
        return ticketm_no;
    }

    public void setTicketm_no(int ticketm_no) {
        this.ticketm_no = ticketm_no;
    }

    public String getBusNumber() {
        return BusNumber;
    }

    public void setBusNumber(String BusNumber) {
        this.BusNumber = BusNumber;
    }

    public int[] getDutyno() {
        return dutyno;
    }

    public void setDutyno(int[] dutyno) {
        this.dutyno = dutyno;
    }

    public void edit(Monthly_duty md, int day, int ddno) {
        try {
            String d = "d" + day;
            String col[] = {d};
            String para[] = {"mon_did"};
            super.pst = super.con.prepareStatement(super.sql.CreateUpdate("monthly_duty", col, para));
            super.pst.setInt(1, ddno);
            super.pst.setString(2, md.mon_did);
            super.pst.executeUpdate();
            super.pst.setInt(1, cdno);
            super.pst.setString(2, ccid);
            super.pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getchangesno(Monthly_duty md, int day, int ddno, int indno) {
        cdno = indno;
        try {
            String date = "d" + day;
            String col[] = {"Sno", "Sno", "mon_did"};
            String para[] = {"Year", "month", date};

            super.pst = super.con.prepareStatement(super.sql.CreateSelect("monthly_duty", col, para));

            super.pst.setInt(1, md.year);
            super.pst.setString(2, md.mon);
            super.pst.setInt(3, ddno);
            System.out.println(super.pst);
            super.re = super.pst.executeQuery();
            if (re.next()) {
                csno = re.getInt(1);
                ccid = re.getString(2);
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return csno;
    }

    public JLabel Addmonthlyduty() {
        String list[][] = genarate();
        JLabel l = new JLabel();
        l.setFont(new Font("FMBindumathi", Font.BOLD, 18));
        try {
            String col[] = {"mon_did", "Sno", "Year", "month", "ticketm_no", "BusNumber", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13", "d14", "d15", "d16", "d17", "d18", "d19", "d20", "d21", "d22", "d23", "d24", "d25", "d26", "d27", "d28", "d29", "d30", "d31"};
            super.pst = super.con.prepareStatement(super.sql.CreateInsert("monthly_duty", col));
            for (int i = 0; i < count; i++) {
                pst.setString(1, list[i][0]);
                pst.setInt(2, Integer.valueOf(list[i][1]));
                pst.setInt(3, Integer.valueOf(list[i][2]));
                pst.setString(4, list[i][3]);
                pst.setInt(5, Integer.valueOf(list[i][4]));
                pst.setString(6, list[i][5]);
                for (int j = 6; j < 37; j++) {
                    pst.setInt(j + 1, Integer.valueOf(list[i][j]));
                }

                pst.executeUpdate();

            }

            l.setText(",nk udih ioyd ld¾hhka we;=,;a lsÍu id¾;lhs");

        } catch (Exception e) {
            l.setText(",nk uih i|yd ld¾hh fmr we;=,;a lr we;");
            e.printStackTrace();
        }

        return l;

    }

    public String[][] genarate() {
        int dcun = 0, ccun = 0, ducou = 0, buscoun = 0, tcount = 0;
        String para[] = {"E_Grade"};
        try {
            super.pst = super.con.prepareStatement(super.sql.CreateSelect("employee", null, para));
            super.pst.setString(1, "Driver");
            super.re = super.pst.executeQuery();
            if (re.last()) {
                dcun = re.getRow();
                re.beforeFirst();
            }
            int dsno[] = new int[dcun];
            int k = 0;
            while (re.next()) {
                dsno[k] = re.getInt("SalaryNo");
                k++;
            }
            super.pst = super.con.prepareStatement(super.sql.CreateSelect("employee", null, para));
            super.pst.setString(1, "Conductor");
            super.re = super.pst.executeQuery();
            if (re.last()) {
                ccun = re.getRow();
                re.beforeFirst();
            }

            int csno[] = new int[ccun];
            k = 0;
            while (re.next()) {
                csno[k] = re.getInt("SalaryNo");
                k++;
            }

            super.pst = super.con.prepareStatement(super.sql.CreateSelect("duty", null, null));

            super.re = super.pst.executeQuery();
            if (re.last()) {
                ducou = re.getRow();
                re.beforeFirst();
            }

            int duno[] = new int[ducou];
            String bustd[] = new String[ducou];
            k = 0;
            while (re.next()) {
                duno[k] = re.getInt("duty_no");
                bustd[k] = re.getString("bus_type");
                k++;
            }

            super.pst = super.con.prepareStatement(super.sql.CreateSelect("busdetailes", null, null));

            super.re = super.pst.executeQuery();
            if (re.last()) {
                buscoun = re.getRow();
                buscoun--;
                re.beforeFirst();
            }

            String busno[] = new String[buscoun];
            String bust[] = new String[buscoun];
            k = 0;
            while (re.next()) {
                if ("0".equalsIgnoreCase(re.getString("BusNumber"))) {
                    continue;
                }
                busno[k] = re.getString("BusNumber");
                bust[k] = re.getString("BusType");
                k++;
            }

            super.pst = super.con.prepareStatement(super.sql.CreateSelect("ticketmachine", null, null));

            super.re = super.pst.executeQuery();
            if (re.last()) {
                tcount = re.getRow();
                re.beforeFirst();
            }

            int tmno[] = new int[tcount];
            k = 0;
            while (re.next()) {
                tmno[k] = re.getInt("M_No");
                k++;
            }
            //System.out.println("d :"+dcun);
            //System.out.println("c :"+ccun);
            Shuffle shu = new Shuffle();
            dsno = shu.shuffleint(dsno);
            csno = shu.shuffleint(csno);

            int numsun = getnextmon();

            int freeday = (dcun + ccun) * numsun;

            double numfree = Math.ceil(Double.valueOf(freeday) / Double.valueOf(lastday));

            if (numfree % 2 == 1) {
                numfree++;
            }

            String col[] = {"mon_did", "Sno", "Year", "month", "ticketm_no", "BusNumber", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13", "d14", "d15", "d16", "d17", "d18", "d19", "d20", "d21", "d22", "d23", "d24", "d25", "d26", "d27", "d28", "d29", "d30", "d31"};
            //System.out.println(col.length);
            //int mod=freeday%lastday;
            count = dcun + ccun;
            String seter[][] = new String[dcun + ccun][col.length];
            k = 0;
            //System.out.println(busno.length + "     " + tmno.length);
            for (int i = 0; i < dcun + ccun; i += 2) {
                seter[i][0] = dsno[k] + "_" + year + "_" + monnum;
                seter[i + 1][0] = csno[k] + "_" + year + "_" + monnum;
                seter[i][1] = String.valueOf(dsno[k]);
                seter[i + 1][1] = String.valueOf(csno[k]);
                seter[i][2] = String.valueOf(year);
                seter[i + 1][2] = String.valueOf(year);
                seter[i][3] = mon;
                seter[i + 1][3] = mon;
                if (i < tmno.length * 2 && i < busno.length * 2) {
                    seter[i][4] = String.valueOf(tmno[k]);
                    seter[i + 1][4] = String.valueOf(tmno[k]);
                    seter[i][5] = busno[k];
                    seter[i + 1][5] = busno[k];
                }

                k++;
            }
            k = 0;
            int q = 6;
            int j = 0;
            //for (int i=6;i<lastday+6;i+=numsun){

            for (int e = 0; e < dcun + ccun; e += numfree) {
                if (k + numfree > (dcun + ccun)) {
                    k = dcun + ccun - (int) numfree;
                }
                System.out.println(k);
                for (j = k; j < k + numfree; j++) {
                    if (q + numsun > lastday) {
                        q = lastday - numsun;
                    }
                    for (int o = q; o < q + numsun; o++) {
                        seter[j][o] = String.valueOf(500);
                    }

                }
                k += numfree;
                q += numsun;
            }

            //}
            System.out.println(dcun + ccun);
            for (int a = 6; a < lastday + 6; a++) {
                int b = 0;
                for (int c = 0; c < dcun + ccun; c += 2) {
                    if (seter[c][a] == null) {
                        if (b >= duno.length) {
                            seter[c][a] = "200";
                            seter[c + 1][a] = "200";
                        } else {
                            seter[c][a] = String.valueOf(duno[b]);
                            seter[c + 1][a] = String.valueOf(duno[b]);
                            b++;
                        }
                    } else {

                    }
                }
            }
            for (int a = 0; a < col.length; a++) {

                for (int c = 0; c < dcun + ccun; c++) {
                    if (seter[c][a] == null) {

                        seter[c][a] = "0";

                    }

                }
            }
            for (int y = 0; y < dcun + ccun; y++) {
                for (int w = 0; w < col.length; w++) {
                    System.out.print(" " + seter[y][w] + "  ,");
                }
                System.out.println("");
            }
            return seter;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public int getnextmon() {

        LocalDate todaydat = LocalDate.now();
        int mo = todaydat.getMonthValue();
        year = todaydat.getYear();
        if (mo == 12) {
            year++;
            mo = 0;
        }
        Calendar cal = Calendar.getInstance();
        //cal.set(Calendar.DATE, 25);
        cal.set(Calendar.MONTH, mo);
        System.out.println("iy" + mo);
        cal.set(Calendar.YEAR, year);

        lastday = Integer.valueOf(cal.getActualMaximum(Calendar.DAY_OF_MONTH));

        int suncount = 0;
        for (int i = 1; i <= lastday; i++) {
            cal.set(Calendar.DAY_OF_MONTH, i);
            Date firstDayOfMonth = cal.getTime();
            //System.out.println(firstDayOfMonth);
            DateFormat sdf = new SimpleDateFormat("EEE");
            DateFormat sdfm = new SimpleDateFormat("MM");
            mon = String.valueOf(sdfm.format(firstDayOfMonth));
            String fday = String.valueOf(sdf.format(firstDayOfMonth));
            if (fday.equalsIgnoreCase("Sun")) {
                suncount++;
            }
        }

        monnum = mon;
        switch (mon) {
            case "01":
                mon = "ckjdß";
                break;
            case "02":
                mon = "fmnrjdß";
                break;
            case "03":
                mon = "ud¾;=";
                break;
            case "04":
                mon = "wfm%a,a";
                break;
            case "05":
                mon = "uehs";
                break;
            case "06":
                mon = "cQks";
                break;
            case "07":
                mon = "cQ,s";
                break;
            case "08":
                mon = "wf.daia;=";
                break;
            case "09":
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
        System.out.println(suncount + "     " + lastday + "       " + mon + "          " + year);
        //Date date = java.sql.Date.valueOf(todaydat);
        //System.out.println(mo);
        //return mo+1;
        return suncount;
    }

    public ResultSet getAll(String m, int y) {
        try {
            String col[] = {"mon_did", "BusNumber", "Sno", "ticketm_no", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13", "d14", "d15", "d16", "d17", "d18", "d19", "d20", "d21", "d22", "d23", "d24", "d25", "d26", "d27", "d28", "d29", "d30", "d31"};
            String para[] = {"month", "Year"};
            pst = con.prepareStatement(sql.CreateSelect("monthly_duty", col, para) + " ORDER BY Sno ASC");
            pst.setInt(2, y);
            pst.setString(1, m);
            System.out.println(pst);
            re = pst.executeQuery();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }
        return re;
    }

    public ResultSet search(String monn, String ye, String buno, String snoo, String dnoo) {

        switch (monn) {
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
        if (buno.equalsIgnoreCase("") && snoo.equalsIgnoreCase("") && dnoo.equalsIgnoreCase("")) {
            Monthly_duty_main.getobj().loadtable(Integer.valueOf(monn), Integer.valueOf(ye));
        } else if (buno.equalsIgnoreCase("") && snoo.equalsIgnoreCase("")) {
            String col[] = {"d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13", "d14", "d15", "d16", "d17", "d18", "d19", "d20", "d21", "d22", "d23", "d24", "d25", "d26", "d27", "d28", "d29", "d30", "d31"};
            String sw = "select  BusNumber,Sno, ticketm_no, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31 from monthly_duty where Year=" + Integer.valueOf(ye) + " and month='" + mon + "' and ( ";
            for (int i = 0; i < 31; i++) {
                sw += col[i] + "=" + Integer.valueOf(dnoo);
                if (i != 31 - 1) {
                    sw += " or ";
                } else {
                    sw += ")";
                }
            }
            //System.out.println(sw);
            try {
                super.pst = super.con.prepareStatement(sw);
                super.re = super.pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (buno.equalsIgnoreCase("") && dnoo.equalsIgnoreCase("")) {
            String sw = "select  BusNumber,Sno, ticketm_no, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31 from monthly_duty where Year=" + Integer.valueOf(ye) + " and month='" + mon + "' and  Sno=" + Integer.valueOf(snoo);
            System.out.println(sw);
            try {
                super.pst = super.con.prepareStatement(sw);
                super.re = super.pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (snoo.equalsIgnoreCase("") && dnoo.equalsIgnoreCase("")) {
            String sw = "select  BusNumber,Sno, ticketm_no, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31 from monthly_duty where Year=" + Integer.valueOf(ye) + " and month='" + mon + "' and  BusNumber like '%" + buno + "%'";
            System.out.println(sw);
            try {
                super.pst = super.con.prepareStatement(sw);
                super.re = super.pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (buno.equalsIgnoreCase("")) {
            String col[] = {"d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13", "d14", "d15", "d16", "d17", "d18", "d19", "d20", "d21", "d22", "d23", "d24", "d25", "d26", "d27", "d28", "d29", "d30", "d31"};
            String sw = "select  BusNumber,Sno, ticketm_no, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31 from monthly_duty where Year=" + Integer.valueOf(ye) + " and month='" + mon + "' and  Sno=" + Integer.valueOf(snoo) + " and ( ";
            for (int i = 0; i < 31; i++) {
                sw += col[i] + "=" + Integer.valueOf(dnoo);
                if (i != 31 - 1) {
                    sw += " or ";
                } else {
                    sw += ")";
                }
            }
            //System.out.println(sw);
            try {
                super.pst = super.con.prepareStatement(sw);
                super.re = super.pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (snoo.equalsIgnoreCase("")) {
            String col[] = {"d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13", "d14", "d15", "d16", "d17", "d18", "d19", "d20", "d21", "d22", "d23", "d24", "d25", "d26", "d27", "d28", "d29", "d30", "d31"};
            String sw = "select  BusNumber,Sno, ticketm_no, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31 from monthly_duty where Year=" + Integer.valueOf(ye) + " and month='" + mon + "' and  BusNumber like '%" + buno + "%'" + " and ( ";
            for (int i = 0; i < 31; i++) {
                sw += col[i] + "=" + Integer.valueOf(dnoo);
                if (i != 31 - 1) {
                    sw += " or ";
                } else {
                    sw += ")";
                }
            }
            //System.out.println(sw);
            try {
                super.pst = super.con.prepareStatement(sw);
                super.re = super.pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (dnoo.equalsIgnoreCase("")) {
            String sw = "select  BusNumber,Sno, ticketm_no, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31 from monthly_duty where Year=" + Integer.valueOf(ye) + " and month='" + mon + "' and  Sno=" + Integer.valueOf(snoo) + " and  BusNumber like '%" + buno + "%'";
            System.out.println(sw);
            try {
                super.pst = super.con.prepareStatement(sw);
                super.re = super.pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String col[] = {"d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13", "d14", "d15", "d16", "d17", "d18", "d19", "d20", "d21", "d22", "d23", "d24", "d25", "d26", "d27", "d28", "d29", "d30", "d31"};
            String sw = "select  BusNumber,Sno, ticketm_no, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31 from monthly_duty where Year=" + Integer.valueOf(ye) + " and month='" + mon + "' and  Sno=" + Integer.valueOf(snoo) + " and  BusNumber like '%" + buno + "%'" + " and ( ";
            for (int i = 0; i < 31; i++) {
                sw += col[i] + "=" + Integer.valueOf(dnoo);
                if (i != 31 - 1) {
                    sw += " or ";
                } else {
                    sw += ")";
                }
            }
            //System.out.println(sw);
            try {
                super.pst = super.con.prepareStatement(sw);
                super.re = super.pst.executeQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.re;
    }

    /*public static void main(String[] args) {
        Monthly_duty md = new Monthly_duty();
        md.Addmonthlyduty();
    }*/

    public void reportm(int y, int m) {
        String monn = String.valueOf(m);
        switch (monn) {
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
        SLTB_sachin.Temp te = SLTB_sachin.Temp.temp1;
        //Duty_list dul=Duty_list.getobj();
        // dul.setVisible(true);
        // te.mainsetpanel.add(dul,te.cmain);
        //this.setVisible(false);
        File rf;
        Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
        Map par = new HashMap();
        par.put("year", y);
        par.put("mon", mon);

        SLTB_sachin.panel.Monthly_duty_side.viewer = null;

        try {

            JasperPrint print = JasperFillManager.fillReport("src\\SLTB_sachin\\report\\Monthly_re.jasper", par, conn);
            SLTB_sachin.panel.Monthly_duty_side.viewer = new JRViewer(print);
            SLTB_sachin.panel.Monthly_duty_side.viewer.setOpaque(true);
            SLTB_sachin.panel.Monthly_duty_side.viewer.setVisible(true);
            SLTB_sachin.panel.Monthly_duty_side.viewer.setPreferredSize(new Dimension(1149, 710));
        } catch (Exception e) {
            e.printStackTrace();
        }
        te.mainsetpanel.add(SLTB_sachin.panel.Monthly_duty_side.viewer, te.cmain);

//        SLTB_sachin.panel.Menu.getobj().setVisible(false);
        //te.mainsetpanel.setPreferredSize(new Dimension(1149, 710));

    }

    public boolean send() {
        System.out.println("sending come");
        String fpath = null;
        String fname = null;
        LocalDate todaydat = LocalDate.now();
        int mo = todaydat.getMonthValue();
        year = todaydat.getYear();

        if (mo == 12) {
            year++;
            mo = 0;
        }
        mo++;
        fname = "monthly_duty_report_for_" + year + "_" + mo + ".pdf";
        fpath = "C:/Users/Public/" + fname;
        switch (mo) {
            case 1:
                mon = "ckjdß";
                break;
            case 2:
                mon = "fmnrjdß";
                break;
            case 3:
                mon = "ud¾;=";
                break;
            case 4:
                mon = "wfm%a,a";
                break;
            case 5:
                mon = "uehs";
                break;
            case 6:
                mon = "cQks";
                break;
            case 7:
                mon = "cQ,s";
                break;
            case 8:
                mon = "wf.daia;=";
                break;
            case 9:
                mon = "iema;eïn¾";
                break;
            case 10:
                mon = "Tlaf;dan¾";
                break;
            case 11:
                mon = "fkdjeïn¾";
                break;
            case 12:
                mon = "foieïn¾";
                break;

        }

        System.out.println("report create");
        try {

            java.sql.Connection conn = com.ConnectionMysql.MysqlConnect.getDbCon();
            Map par = new HashMap();
            par.put("year", year);
            par.put("mon", mon);
            //JRViewer viewer = null;
            JasperPrint print = JasperFillManager.fillReport("src\\SLTB_sachin\\report\\Monthly_re.jasper", par, conn);

            JasperExportManager.exportReportToPdfFile(print, fpath);

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

        String sub = "Monthly duty report for " + year + "-" + mo;
        String masage = "   ";
        EmailController em = new EmailController();
        System.out.println("sending start");
        try {
            super.pst = super.con.prepareStatement(super.sql.CreateSelect("employee", null, null));
            super.re = super.pst.executeQuery();
            int rmcount = 0;
            if (re.last()) {
                rmcount = re.getRow();
                re.beforeFirst();
            }
            String to[] = new String[rmcount];
            int q = 0;
            while (super.re.next()) {
                to[q] = super.re.getString("E_Email");
                q++;
            }
            em.sentemail(to, sub, masage, fpath, fname);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

}
