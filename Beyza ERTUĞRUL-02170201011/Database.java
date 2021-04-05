
package carpark;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    
    public static Connection getConnection(){
        
        Connection con =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/carpark", "root", "123");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Veritabani Baglantisi Saglanamadi...");
        }
        return con;
    } 
}
