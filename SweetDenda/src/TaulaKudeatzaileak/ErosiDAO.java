package TaulaKudeatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Taulak.Erosi;


public class ErosiDAO {
    private Connection konexioa;

	public ErosiDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}
	public boolean gehituErosi(Erosi pE) {
		String query="INSERT INTO EROSI VALUES (?,?,?)";
		try (PreparedStatement pst = konexioa.prepareStatement(query)) {
			pst.setInt(1, pE.getIdKarrito());
			pst.setInt(2, pE.getKodeSweet());
			pst.setInt(3, pE.getKantitate());
			
		
			int rowsAffected = pst.executeUpdate();
		
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
	}

	}

}
