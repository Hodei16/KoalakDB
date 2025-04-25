package TaulaKudeatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Taulak.Ditu;

public class DituDAO {
    private Connection konexioa;

	public DituDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}
	public boolean gehituDitu(Ditu pD) {
		String query = "INSERT INTO DITU VALUES(?,?)";
		try (PreparedStatement pst = konexioa.prepareStatement(query)) {
			pst.setInt(1, pD.getKodeOsagaia());
			pst.setInt(2, pD.getKodeSweet());
			
		
			int rowsAffected = pst.executeUpdate();
		
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
	}

	}
}
