package TaulaKudeatzaileak;

import java.sql.Connection;

public class KarritoaDAO {
    private Connection konexioa;

	public KarritoaDAO(Connection konexioa) {
		this.konexioa = konexioa;
	}

}
