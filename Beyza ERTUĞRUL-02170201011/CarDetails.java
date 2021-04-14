package carpark;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDetails {

    private String plaka;

    public CarDetails(String plaka) {
        this.plaka = plaka;
    }
    
    public String[] PlakaBul(){
        
            try{
                Connection con =Database.getConnection();
                String[] details = new String[5];
                PreparedStatement ps;
                ResultSet rs;
                
                ps=con.prepareStatement("SELECT * FROM araclar WHERE plaka='"+plaka+"'");
                rs=ps.executeQuery();
                if(rs.next()){
                    details[0] = rs.getString("plaka");
                    details[1] = rs.getString("musteri_ismi");
                    details[2] = rs.getString("giris_saati");
                    details[3] = rs.getString("alan");
                    details[4] = rs.getString("kuru_temizleme");
                    
                }else{
                    details = null;
                }
                
                return details;
            }catch(SQLException error){
                
                System.out.println("Veritabanina Baglanamadi(CarDetails): " + error);
                return null;
                          
    }
}
}
