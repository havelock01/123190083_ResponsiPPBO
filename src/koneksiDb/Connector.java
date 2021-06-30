/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksiDb;
import java.sql.DriverManager;
import java.sql.Connection; 
import java.sql.SQLException; 
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/movie_db";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("Koneksi Berhasil");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
