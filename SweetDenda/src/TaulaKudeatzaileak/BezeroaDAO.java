package TaulaKudeatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Taulak.Bezeroa;

public class BezeroaDAO {
    private Connection konexioa;

    public BezeroaDAO(Connection konexioa) {
        this.konexioa = konexioa;
    }

    public boolean gehituBezero(Bezeroa bezero) {
        String query = "INSERT INTO BEZEROA (NAN, TELEFONO, BANKU_KONTUA, HELBIDEA, PASAHITZA, IZENA, ABIZENA, POSTA_ELEKTRONIKOA) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pst = konexioa.prepareStatement(query)) {
            pst.setString(1, bezero.getNan());
            pst.setInt(2, bezero.getTelefono());
            pst.setString(3, bezero.getBankuKontua());
            pst.setString(4, bezero.getHelbidea());
            pst.setString(5, bezero.getPasahitza());
            pst.setString(6, bezero.getIzena());
            pst.setString(7, bezero.getAbizena());
            pst.setString(8, bezero.getPostaElektronikoa());
            
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void kenduBezeroa(String email, String pasahitza) {
        String sql = "DELETE FROM BEZEROA WHERE POSTA_ELEKTRONIKOA = ? AND PASAHITZA = ?";
        try (PreparedStatement stmt = konexioa.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, pasahitza);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Bezeroa ezabatu da!");
            } else {
                System.out.println("Ez da bezero hori aurkitu edo pasahitza okerra da.");
            }
        } catch (SQLException e) {
            System.err.println("Errorea bezeroa ezabatzean.");
            e.printStackTrace();
        }
    }
    
    public boolean saioaHasi(String email, String pasahitza) {
        String sql = "SELECT * FROM BEZEROA WHERE POSTA_ELEKTRONIKOA = ? AND PASAHITZA = ?";
        
        try (PreparedStatement pstmt = konexioa.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, pasahitza);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Ongi etorri, " + rs.getString("IZENA") + "!");
                return true;
            } else {
                System.out.println("Posta elektronikoa edo pasahitza ez da zuzena.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
