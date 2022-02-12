package com.bilgeadam.ogrencibilgisistemi.test;

import com.bilgeadam.ogrencibilgisistemi.dao.OgrenciDAO;
import com.bilgeadam.ogrencibilgisistemi.dto.Ogrenci;

import java.sql.SQLException;

public class OgrenciDAOTest {

    public static void main(String[] args) {

        try {
            Ogrenci ogr = new Ogrenci();
            ogr.setAd("Tanju");
            ogr.setSoyad("Çolak");
            ogr.setKredi(100);

            boolean sonuc = OgrenciDAO.ekle(ogr);

            //if (sonuc) demek if (sonuc == true) demek aynı şey
            if (sonuc)
                System.out.println("Başarıyla eklendi");
            else
                System.out.println("Ekleme başarısız oldu");

            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
