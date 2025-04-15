package Taulak;

public class Erosi {
    private int idKarrito;
    private int kodeSweet;
    private int kantitate;

    public Erosi(int idKarrito, int kodeSweet, int kantitate) {
        this.idKarrito = idKarrito;
        this.kodeSweet = kodeSweet;
        this.kantitate = kantitate;
    }

	public int getIdKarrito() {
		return idKarrito;
	}

	public void setIdKarrito(int idKarrito) {
		this.idKarrito = idKarrito;
	}

	public int getKodeSweet() {
		return kodeSweet;
	}

	public void setKodeSweet(int kodeSweet) {
		this.kodeSweet = kodeSweet;
	}

	public int getKantitate() {
		return kantitate;
	}

	public void setKantitate(int kantitate) {
		this.kantitate = kantitate;
	}
}

