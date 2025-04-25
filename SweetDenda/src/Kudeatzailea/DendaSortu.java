package Kudeatzailea;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import TaulaKudeatzaileak.BezeroaDAO;
import Taulak.Bezeroa;

public class DendaSortu {
	private static DendaSortu nDS;
    private Connection konexioa;
    BezeroaDAO bezeroaDAO;

    private DendaSortu() {
        konektatu();
        bezeroaDAO = new BezeroaDAO(konexioa);
    }
    
    public static DendaSortu getNDS() {
    	if(nDS == null) {
    		nDS = new DendaSortu();
    	}
    	return nDS;
    }

    private void konektatu() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String zerbitzaria = "jdbc:mysql://localhost:3306/sweetdenda";
            String erabiltzailea = "root";
            String pasahitza = "";
            konexioa = DriverManager.getConnection(zerbitzaria, erabiltzailea, pasahitza);
            System.out.println("Konexioa eginda!");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver ez dago eskuragarri!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Ezin izan da konektatu datu-basearekin!");
            e.printStackTrace();
        }
    }

    public void itxiKonexioa() {
        try {
            if (konexioa != null && !konexioa.isClosed()) {
                konexioa.close();
                System.out.println("Konexioa itxita!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBezero() {
        System.out.println("-- KONTU BERRIA SORTU --");
        System.out.println("");

        Teklatua tek = Teklatua.getTeklatua();
        
        String nan = tek.irakurriNAN();
        int telefono = tek.irakurriTelefonoa();
        String bankuKontua = tek.irakurriBankuKontua();
        String helbidea = tek.irakurriHelbidea();
        String pasahitza = tek.irakurriPasahitza();
        String izena = tek.irakurriIzena();
        String abizena = tek.irakurriAbizena();
        String postaElektronikoa = tek.irakurriPostaElektronikoa();

        Bezeroa bezeroa = new Bezeroa(nan, telefono, bankuKontua, helbidea, pasahitza, izena, abizena, postaElektronikoa);
        
        BezeroaDAO bezeroaDAO = new BezeroaDAO(konexioa);
        boolean emaitza = bezeroaDAO.gehituBezero(bezeroa);

        if (emaitza) {
            System.out.println("Bezeroa arrakastaz gehitu da.");
        } else {
            System.out.println("Errore bat egon da bezeroa gehitzerakoan.");
        }
    }
    
    public void kenduBezeroa() {
        System.out.println("-- KONTUA EZABATU --");
        System.out.println("");

        String email = Teklatua.getTeklatua().irakurriPostaElektronikoa();

        String pasahitza = Teklatua.getTeklatua().irakurriPasahitza();

        bezeroaDAO.kenduBezeroa(email, pasahitza);
    }
    
    public void saioaHasi() {
        String email = Teklatua.getTeklatua().irakurriPostaElektronikoa();
        String pasahitza = Teklatua.getTeklatua().irakurriPasahitza();

        boolean ongiSartu = bezeroaDAO.saioaHasi(email, pasahitza);

        if (ongiSartu) {
            System.out.println("Saioa ondo hasi da.");
        } else {
            System.out.println("Ezin izan da saioa hasi.");
        }
    }
    
    public void saioa() {
        System.out.println("Erregistratzeko sakatu [1]");
        System.out.println("Kontua ezatzeko sakatu [2]");
        
    	int zeregina = Teklatua.getTeklatua().irakurriZenb();
    	if(zeregina == 1) this.addBezero();
    	else if(zeregina == 2) this.kenduBezeroa();
    }
}
