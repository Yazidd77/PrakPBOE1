/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author shopi
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if(koneksi == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost/pbo";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("Koneksi Berhasil!");
                }
            }
            catch(ClassNotFoundException one){
                System.out.println("Gagal Load Driver : " + one.getMessage());
            }
            catch(SQLException sqle){
                System.out.println("Gagal Koneksi : " +sqle.getMessage());
            }
        }
        return koneksi;
    }
}
