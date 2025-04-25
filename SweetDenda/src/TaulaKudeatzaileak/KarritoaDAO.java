package TaulaKudeatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Taulak.Karritoa;

public class KarritoaDAO {
    private Connection konexioa;

	public KarritoaDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}
	public boolean gehituKarritoa(Karritoa pK) {
		String query = "INSERT INTO KARRITOA VALUES(?,?,?,?)";
		try (PreparedStatement pst = konexioa.prepareStatement(query)) {
			pst.setInt(1, pK.getId());
			pst.setString(2, pK.getDataOrdua());
			pst.setString(3, pK.getBukatu());
			pst.setString(4,pK.getNAN());
			int rowsAffected = pst.executeUpdate();
		
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
	}

}

}
