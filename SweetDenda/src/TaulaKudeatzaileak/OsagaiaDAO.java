package TaulaKudeatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Taulak.Osagaia;

public class OsagaiaDAO {
    private Connection konexioa;

	public OsagaiaDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}
	public boolean gehituOsagaia(Osagaia pO) {
		String query = "INSERT INTO OSAGAIAK VALUES (?,?,?,?,?)";
		try (PreparedStatement pst = konexioa.prepareStatement(query)) {
			pst.setInt(1, pO.getKodea());
			pst.setString(2, pO.getIzena());
			pst.setFloat(3, pO.getPrezioaKg());
			pst.setString(4, pO.getEnpresa());
			pst.setString(5, pO.getNondik());
			int rowsAffected = pst.executeUpdate();
		
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
	}

	}
	
}
