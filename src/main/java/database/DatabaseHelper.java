/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author trand
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost;database=baiToanBalo;" +
                "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
        String username = "sa";
        String password = "26112002";
        Connection con  = DriverManager.getConnection(url,username,password);
        return con;
    }
}
