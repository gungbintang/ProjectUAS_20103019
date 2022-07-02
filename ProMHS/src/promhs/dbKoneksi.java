package promhs;
 import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author AnakAgng Bintang Purnama Dewi_20103019
 */
public class dbKoneksi {
   
 String JDBC_DRIVER = "com.maysql.cj.jdbc.Driver";
 String DB_URL = "jdbc:mysql://localhost:3306/dbmhs";
 String USER= "root";
 String PASS ="";
 
 private static Connection koneksi;

public Connection koneksi(){
    if(this.koneksi == null){
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            this.koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch(Exception e){
            System.out.println("Eror saat membuat koneksi Database");
        }
    }
    return this.koneksi;
}
}

