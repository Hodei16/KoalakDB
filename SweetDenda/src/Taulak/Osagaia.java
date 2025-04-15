package Taulak;

public class Osagaia {
    private int kodea;
    private String izena;
    private float prezioaKg;
    private String enpresa;
    private String nondik;
    
    public Osagaia(int kodea, String izena, float prezioaKg, String enpresa, String nondik) {
        this.kodea = kodea;
        this.izena = izena;
        this.prezioaKg = prezioaKg;
        this.enpresa = enpresa;
        this.nondik = nondik;
    }

	public int getKodea() {
		return kodea;
	}

	public void setKodea(int kodea) {
		this.kodea = kodea;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public float getPrezioaKg() {
		return prezioaKg;
	}

	public void setPrezioaKg(float prezioaKg) {
		this.prezioaKg = prezioaKg;
	}

	public String getEnpresa() {
		return enpresa;
	}

	public void setEnpresa(String enpresa) {
		this.enpresa = enpresa;
	}

	public String getNondik() {
		return nondik;
	}

	public void setNondik(String nondik) {
		this.nondik = nondik;
	}
}

