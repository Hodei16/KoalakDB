package Taulak;

public class Sweet {
    private int kodea;
    private String izena;
    private float prezioa;
    private int stock;
    private String forma;
    private String zaporea;
    private String kolorea;
    
    public Sweet(int kodea, String izena, float prezioa, int stock, String forma, String zaporea, String kolorea) {
        this.kodea = kodea;
        this.izena = izena;
        this.prezioa = prezioa;
        this.stock = stock;
        this.forma = forma;
        this.zaporea = zaporea;
        this.kolorea = kolorea;
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

	public float getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(float prezioa) {
		this.prezioa = prezioa;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getZaporea() {
		return zaporea;
	}

	public void setZaporea(String zaporea) {
		this.zaporea = zaporea;
	}

	public String getKolorea() {
		return kolorea;
	}

	public void setKolorea(String kolorea) {
		this.kolorea = kolorea;
	}
}

