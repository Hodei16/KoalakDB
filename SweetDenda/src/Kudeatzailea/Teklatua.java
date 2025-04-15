package Kudeatzailea;

import java.util.Scanner;

public class Teklatua {
    private static Teklatua nireTeklatua;
    private Scanner scanner;

    private Teklatua() {
        scanner = new Scanner(System.in);
    }

    public static Teklatua getTeklatua() {
        if (nireTeklatua == null) {
            nireTeklatua = new Teklatua();
        }
        return nireTeklatua;
    }

    public static void close() {
        if (nireTeklatua != null) {
            nireTeklatua.scanner.close();
            nireTeklatua = null;
        }
    }
    
    public int irakurriZenb() {
        return Integer.parseInt(scanner.nextLine());
    }

    public String irakurriString(String mezua) {
        System.out.print(mezua);
        return scanner.nextLine();
    }

    public int irakurriInt(String mezua) {
        while (true) {
            try {
                System.out.print(mezua);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Errorea: Zenbaki oso bat sartu behar duzu.");
            }
        }
    }

    public String irakurriNAN() {
        return irakurriString("		Sartu NAN: ");
    }

    public int irakurriTelefonoa() {
        return irakurriInt("		Sartu telefonoa: ");
    }

    public String irakurriBankuKontua() {
        return irakurriString("		Sartu banku kontua: ");
    }

    public String irakurriHelbidea() {
        return irakurriString("		Sartu helbidea: ");
    }

    public String irakurriPasahitza() {
        return irakurriString("		Sartu pasahitza: ");
    }

    public String irakurriIzena() {
        return irakurriString("		Sartu izena: ");
    }

    public String irakurriAbizena() {
        return irakurriString("		Sartu abizena: ");
    }

    public String irakurriPostaElektronikoa() {
        return irakurriString("		Sartu posta elektronikoa: ");
    }
}