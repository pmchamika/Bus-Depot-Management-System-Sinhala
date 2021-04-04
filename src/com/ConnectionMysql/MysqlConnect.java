/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ConnectionMysql;
import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
/**
 *
 * @author Chamika Prabath
 */
public class MysqlConnect {
     private static Connection conn;
    ;
    private MysqlConnect() {

    }
    /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized Connection getDbCon() {
        try {
            if (conn == null) {
                String url = "jdbc:mysql://localhost:3306/";
                String dbName = "SLTB";
                String driver = "com.mysql.jdbc.Driver";
                String userName = "root";
                String password = "12345";

                Class.forName(driver);
                conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
                System.out.println("Connection successful");
            }
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }

        return conn;

    }
    
}
