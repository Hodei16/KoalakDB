package Taulak;

import java.time.LocalDateTime;

public class Karritoa {
    private int id;
    private LocalDateTime dataOrdua;
    private String bukatu;
    private Bezeroa bezeroa;

    public Karritoa(int id, LocalDateTime dataOrdua, String bukatu, Bezeroa bezeroa) {
        this.id = id;
        this.dataOrdua = dataOrdua;
        this.bukatu = bukatu;
        this.bezeroa = bezeroa;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDataOrdua() {
		return dataOrdua;
	}

	public void setDataOrdua(LocalDateTime dataOrdua) {
		this.dataOrdua = dataOrdua;
	}

	public String getBukatu() {
		return bukatu;
	}

	public void setBukatu(String bukatu) {
		this.bukatu = bukatu;
	}

	public Bezeroa getBezeroa() {
		return bezeroa;
	}

	public void setBezeroa(Bezeroa bezeroa) {
		this.bezeroa = bezeroa;
	}
}

