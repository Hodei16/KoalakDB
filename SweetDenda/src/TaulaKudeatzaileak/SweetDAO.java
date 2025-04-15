package TaulaKudeatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Taulak.Sweet;

public class SweetDAO {
    private Connection konexioa;

	public SweetDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}
	
	public boolean gehituSweet(Sweet pS) {
		String query = "INSERT INTO SWEET VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement pst = konexioa.prepareStatement(query)) {
			pst.setInt(1, pS.getKodea());
			pst.setString(2, pS.getIzena());
			pst.setFloat(3, pS.getPrezioa());
			pst.setInt(4, pS.getStock());
			pst.setString(5, pS.getForma());
			pst.setString(6, pS.getZaporea());
			pst.setString(7, pS.getKolorea());
		
			int rowsAffected = pst.executeUpdate();
		
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
