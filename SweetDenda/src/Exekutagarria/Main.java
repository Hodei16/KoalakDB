package Exekutagarria;

import Kudeatzailea.DendaSortu;
import Kudeatzailea.Teklatua;

public class Main {
    public static void main(String[] args) {
        DendaSortu denda = DendaSortu.getNDS();

        while (true) {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Saioa ireki");
            System.out.println("2. Erregistratu");
            System.out.println("3. Kontua ezabatu");
            System.out.println("4. Sesioa itxi");
            System.out.print("AUKERATU BAT: ");

            int opcion = Teklatua.getTeklatua().irakurriZenb();
            boolean saioaHasita = false;
            boolean bezeroBerriaSartuta = false;

            if (opcion == 1) {
                if (!saioaHasita) {
                    denda.saioaHasi();
                    saioaHasita = true;
                } else {
                    System.out.println("Saioa dagoeneko hasita dago.");
                }
            } else if (opcion == 2) {
                if (!bezeroBerriaSartuta) {
                    denda.addBezero();
                    bezeroBerriaSartuta = true;
                } else {
                    System.out.println("Bezero berria dagoeneko sartuta dago.");
                }
            } else if (opcion == 3) {
                denda.kenduBezeroa();
            } else if (opcion == 4) {
                System.out.println("Ixten...");
                Teklatua.close();
                denda.itxiKonexioa();
            } else {
                System.out.println("Txarto, saiatu berriro.");
            }

        }
    }
}	