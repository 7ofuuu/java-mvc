/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class koneksi {
    private static Connection connect;
    public static Connection getConnection(){
        if(connect==null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connect=DriverManager.getConnection("jdbc:mysql://localhost/db_penjualan","root","");
            }catch(SQLException ex){
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
        return connect;
    }
    
}
