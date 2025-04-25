package TaulaKudeatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ErosiDAO {
    private Connection konexioa;

	public ErosiDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}

}
