package Taulak;

import java.time.LocalDateTime;

public class Karritoa {
    private int id;
    private String dataOrdua;
    private String bukatu;
    private String NAN;

    public Karritoa(int id, String dataOrdua, String bukatu, String NAN) {
        this.id = id;
        this.dataOrdua = dataOrdua;
        this.bukatu = bukatu;
        this.NAN = NAN;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataOrdua() {
		return dataOrdua;
	}

	public void setDataOrdua(String dataOrdua) {
		this.dataOrdua = dataOrdua;
	}

	public String getBukatu() {
		return bukatu;
	}

	public void setBukatu(String bukatu) {
		this.bukatu = bukatu;
	}

	public String getNAN() {
		return NAN;
	}

	public void setBezeroa(String NAN) {
		this.NAN = NAN;
	}
}

