package Taulak;

public class Bezeroa {
    private String nan;
    private int telefono;
    private String bankuKontua;
    private String helbidea;
    private String pasahitza;
    private String izena;
    private String abizena;
    private String postaElektronikoa;
    
    public Bezeroa(String nan, int telefono, String bankuKontua, String helbidea,
                   String pasahitza, String izena, String abizena, String postaElektronikoa) {
        this.nan = nan;
        this.telefono = telefono;
        this.bankuKontua = bankuKontua;
        this.helbidea = helbidea;
        this.pasahitza = pasahitza;
        this.izena = izena;
        this.abizena = abizena;
        this.postaElektronikoa = postaElektronikoa;
    }

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getBankuKontua() {
		return bankuKontua;
	}

	public void setBankuKontua(String bankuKontua) {
		this.bankuKontua = bankuKontua;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getPostaElektronikoa() {
		return postaElektronikoa;
	}

	public void setPostaElektronikoa(String postaElektronikoa) {
		this.postaElektronikoa = postaElektronikoa;
	}
}

