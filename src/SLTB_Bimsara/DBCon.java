package SLTB_Bimsara;

import SLTB_Bimsara.Panel.BusRegistation.BusRegistationMain;
import com.ConnectionMysql.MysqlConnect;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;
//import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DBCon {

    //MySQLConnection con;
    private static Connection db = MysqlConnect.getDbCon();
    private static PreparedStatement pst = null;
    private static ResultSet re = null;
    private static String x;

    public static int InsertToDb(String tableName, String ColList, String valueList) {
        try {
            String q = "Insert into " + tableName + " (" + ColList + ") values (" + valueList + ") ;";
            pst = db.prepareStatement(q);
            //System.out.println(pst);
            pst.execute();
            return 0;
        } catch (Exception sqle) {
            sqle.printStackTrace();

            return 99;
        }

    }

    public static int UpdateTable(String tableName, String valueList, String id) {

        try {
            String uq = "UPDATE " + tableName + " set " + valueList + " where " + id;
            pst = db.prepareStatement(uq);
            System.out.println(pst);
            pst.execute();
            return 0;
        } catch (Exception sqle) {
            sqle.printStackTrace();
            return 99;
        }
    }

    public static ResultSet displayTable(String ColumList, String TName) {
        try {
            String qu = "select " + ColumList + " from " + TName;
            pst = db.prepareStatement(qu);
            re = pst.executeQuery();
            return re;

        } catch (SQLException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public static ResultSet busdisplayTable(String ColumList, String TName) {
        try {
            String qu = "select " + ColumList + " from " + TName + " where BusStatus=0";
            System.out.println(qu);
            pst = db.prepareStatement(qu);
            re = pst.executeQuery();
            return re;

        } catch (SQLException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public static String getValues(String col, String ta_name) {

        try {
            String Qu = "SELECT MAX(" + col + ") FROM " + ta_name;
            //System.out.println(Qu);
            pst = db.prepareStatement(Qu);
            re = pst.executeQuery();
            while (re.next()) {
                x = re.getString(1);
                //System.out.println(x);

            }
            return x;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

    public static ResultSet combobox(String t1, String t1C, String t2, String t2C) {
        try {
            String qu = "select t1." + t1C + " from " + t1 + " t1 left join " + t2 + " t2 on t2." + t2C + "=t1." + t1C + " WHERE t2." + t2C + " IS NULL";
            //System.out.println(qu);
            pst = db.prepareStatement(qu);
            re = pst.executeQuery();
            /* while (re.next()) {
                x = re.getString(1);
                System.out.println(x);

            }*/
            return re;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static ResultSet buscombobox(String t1, String t1C, String t2, String t2C) {
        try {
            String qu = "select t1." + t1C + " from " + t1 + " t1 left join " + t2 + " t2 on t2." + t2C + "=t1." + t1C + " WHERE t2." + t2C + " IS NULL and BusStatus=0";
            //System.out.println(qu);
            pst = db.prepareStatement(qu);
            re = pst.executeQuery();
            /* while (re.next()) {
                x = re.getString(1);
                System.out.println(x);

            }*/
            return re;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static ResultSet Search(String q) {
        try {
            
            pst = db.prepareStatement(q);
            re = pst.executeQuery();
            
            return re;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
