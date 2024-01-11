/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author johan
 */

    public abstract class Zimmer_Manager implements Serializable {
        private static final long serialVersionUID = 1L;
        
    private static int naechsteZimmerNummer = 1;
    private static int anzahlEinzelbettzimmer = 0;
    private static int anzahlZweibettzimmer = 0;
    private static int anzahlSuiten = 0;
    private static final int MAX_ZIMMER_PRO_TYP = 4;
 
    private double zimmer_preis;
    private int zimmer_id;
    private Kategorie zimmer_kategorie;
    private boolean verfuegbar;
    private boolean gesperrt;
    
        
    public Zimmer_Manager(Kategorie zimmer_kategorie, boolean verfuegbar) {
        if (naechsteZimmerNummer > 4 *3) {
            throw new IllegalStateException("Maximale Anzahl an Zimmern erreicht");
        }
        this.zimmer_id = naechsteZimmerNummer++;
        this.zimmer_kategorie = zimmer_kategorie;
        this.zimmer_preis = berechnePreis();
        this.verfuegbar = false;  
        this.gesperrt = false;
    }
    
    public zimmer (int Preis, boolean)
    
    
    public double berechnePreis(){
        switch (zimmer_kategorie){
            case EinBettZimmer:
                return 55.0;
            case ZweiBettZimmer:
                return 90.0;
            case Suite:
                return 230.0;
            default:
                throw new IllegalArgumentException("Ungültige Zimmerkategorie");
              
        }
    }

     public Kategorie getzimmer_kategorie (){
        return zimmer_kategorie;
    }
    
    public void setzimmer_kategorie (Kategorie zimmer_kategorie){
        this.zimmer_kategorie = zimmer_kategorie;
}


    public double getzimmer_preis (){
        return zimmer_preis;
    }
    
    public void setzimmer_preis (double zimmer_preis){
        this.zimmer_preis = zimmer_preis;
}

    public int getzimmer_id (){
        return zimmer_id;
    }
    
    public void setzimmer_id (int zimmer_id){
        this.zimmer_id = zimmer_id; 
    }
    public boolean getverfuegbar(){
        return true;
    }
    public boolean isverfuegbar (){
        return true;
    }
    
    public boolean nichtverfuegbar(){
        return false;
    }
    
    public void setverfuegbar (boolean verfuegbar){
        this.verfuegbar = verfuegbar;
        
}
    public void setgesperrt (boolean gespert){
        this.gesperrt = gesperrt;
    }
    
    public boolean isgesperrt(){
        return gesperrt;
    }
    
    
 //public void zimmerBuchen(String zimmer) {
 //       switch (zimmer) {
 //          case ("eins"):
 //               zimmer_einzeln--;
 //               break;
 //           case ("zwei"):
 //               zimmer_doppelt--;
 //               break;
 //           case ("suite"):
 //               zimmer_suite--;
 //               break;
 //       }
 //   }

 //   public void zimmerStornieren(String zimmer) {
 //       switch (zimmer) {
 //           case ("eins"):
 //               zimmer_einzeln++;
 //               break;
 //           case ("zwei"):
 //               zimmer_doppelt++;
 //               break;
 //           case ("suite"):
 //               zimmer_suite++;
 //               break;

 //       }    
 
 enum Kategorie{
     EinBettZimmer,
     ZweiBettZimmer,
     Suite
 }  
    
@Override
    public String toString() {
        return "Zimmer{" +
                "zimmer-id=" + zimmer_id +
                ", preis=" + zimmer_preis +
                ", kategorie'" + zimmer_kategorie + '\'' + 
                ", verfuegbar=" + verfuegbar +
                '}';
    }    
}
