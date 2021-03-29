
package carpark;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class NewCar {
        private String plaka;
        private String musteri_ismi;
        private String giris_saati;
        private String alan;
        private String kuru_temizleme ;
        
    public NewCar(String plaka, String musteri_ismi,  String giris_saati,  String alan,String kuru_temizleme) {
        this.plaka = plaka;
        this.musteri_ismi = musteri_ismi;
        this.giris_saati=giris_saati;
        this.alan = alan;
        this.kuru_temizleme=kuru_temizleme;
    }
    
    public boolean Insert() throws SQLException{
      
    }
}
