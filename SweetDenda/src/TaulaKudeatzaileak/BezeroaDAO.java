package TaulaKudeatzaileak;

import Taulak.Bezeroa;
import java.sql.*;

public class BezeroaDAO {
    private Connection konexioa;

    public BezeroaDAO(Connection konexioa) {
        this.konexioa = konexioa;
    }

    public boolean gehituBezero(Bezeroa bezeroa) {
        String query = "INSERT INTO BEZEROA (NAN, TELEFONO, BANKU_KONTUA, HELBIDEA, PASAHITZA, IZENA, ABIZENA, POSTA_1ELEKTRONIKOA) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pst = konexioa.prepareStatement(query)) {
            pst.setString(1, bezeroa.getNan());
            pst.setInt(2, bezeroa.getTelefono());
            pst.setString(3, bezeroa.getBankuKontua());
            pst.setString(4, bezeroa.getHelbidea());
            pst.setString(5, bezeroa.getPasahitza());
            pst.setString(6, bezeroa.getIzena());
            pst.setString(7, bezeroa.getAbizena());
            pst.setString(8, bezeroa.getPostaElektronikoa());
            
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
