/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

import java.util.HashMap;

/**
 *
 * @author sachin kumara
 */
public class SqlQueryCreater {

    private String quary;
    // private String type;

    /*
        type=in if insert query
        type=up if update query
        type=del if delete query
        type=se if select query
     */
    public String CreateSelect(String tbl, String col[], String para[]) {
        if (col == null) {
            if (para == null) {
                this.quary = "select * from " + tbl;
            } else {
                int paralen = para.length;
                this.quary = "select * from " + tbl + " WHERE ";
                for (int i = 0; i < paralen; i++) {
                    this.quary += para[i] + "=? ";
                    if (i != paralen - 1) {
                        this.quary += "AND ";
                    }
                }
            }
        } else {

            int collen = col.length;
            this.quary = "select ";
            for (int i = 1; i < collen; i++) {
                this.quary += col[i];
                if (i != collen - 1) {
                    this.quary += ",";
                }
            }

            this.quary += " from " + tbl;

            if (para != null) {
                int paralen = para.length;
                this.quary += " WHERE ";
                for (int i = 0; i < paralen; i++) {
                    this.quary += para[i] + "=? ";
                    if (i != paralen - 1) {
                        this.quary += "AND ";
                    }
                }
            }

        }

        //type="se";
        return quary;
    }

    public String CreateInsert(String tbl, String col[]) {
        int collen = col.length;
        this.quary = "INSERT INTO " + tbl + " (";

        for (int i = 0; i < collen; i++) {
            this.quary += col[i];
            if (i != collen - 1) {
                this.quary += ",";
            }
        }
        this.quary += ") VALUES(";
        for (int i = 0; i < collen; i++) {
            this.quary += "?";
            if (i != collen - 1) {
                this.quary += ",";
            }
        }
        this.quary += ")";
        return quary;
    }

    public String CreateUpdate(String tbl, String col[], String para[]) {

        int collen = col.length;
        this.quary = "UPDATE " + tbl + " SET ";

        for (int i = 0; i < collen; i++) {
            this.quary += col[i] + "=?";
            if (i != collen - 1) {
                this.quary += ",";
            }
        }
        this.quary += " WHERE ";
        for (int i = 0; i < para.length; i++) {
            this.quary += para[i] + "=?";
            if (i != collen - 1) {
                this.quary += " AND ";
            }
        }

        return quary;
    }

    public String CreateDelete(String tbl, String para[]) {

        int collen = para.length;
        this.quary = "DELETE FROM " + tbl + " WHERE ";

        for (int i = 0; i < collen; i++) {
            this.quary += para[i] + "=?";
            if (i != collen - 1) {
                this.quary += " AND ";
            }
        }

        return quary;
    }

    public String CreateSearch(String tbl, String col[], String parati[], String para[]) {

        int collen;
        int paralen = para.length;

        if (col == null) {
            this.quary = "select *";
        } else {
            collen = col.length;
            this.quary = "select ";
            for (int i = 1; i < collen; i++) {
                this.quary += col[i];
                if (i != collen - 1) {
                    this.quary += ",";
                }
            }
        }

        this.quary += " from " + tbl + " where ";
        //System.out.println("iia ");
        for (int i = 0; i < paralen; i++) {
            this.quary += parati[i] + " LIKE '" + para[i] + "%'";
            if (i != paralen - 1) {
                this.quary += " AND ";
            }
        }
        System.out.println(quary);
        return quary;
    }
}
