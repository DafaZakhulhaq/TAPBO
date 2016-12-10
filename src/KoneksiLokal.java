
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dafa Zakhulhaq
 */
public class KoneksiLokal {
   
    
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
    
        if (koneksi == null){
        
            try {
                String url = "jdbc:mysql://localhost/perpustakaan"; //database yang berada di server localhost dengan nama database test
                String user = "root"; //user untuk masuk ke database
                String pass = ""; //password untuk masuk ke database
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url, user, pass);
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Gagal mengkoneksikan "+e); //pemberiahuan jika koneksi ke database gagal
            }
            
        }
        return koneksi;
        
    }
    
}
