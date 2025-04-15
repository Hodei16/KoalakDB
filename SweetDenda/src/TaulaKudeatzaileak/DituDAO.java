package TaulaKudeatzaileak;

import java.sql.Connection;

public class DituDAO {
    private Connection konexioa;

	public DituDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}

}
