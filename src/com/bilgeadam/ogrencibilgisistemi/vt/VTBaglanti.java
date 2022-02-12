package com.bilgeadam.ogrencibilgisistemi.vt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VTBaglanti {

    public static Connection baglantiGetir() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/odb","postgres","postgres");


        return conn;
    }

    public static boolean baglantiKapat(Connection conn)
    {
        try {
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
