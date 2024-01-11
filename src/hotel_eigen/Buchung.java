/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;
import java.util.Date;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author johan
 */
public class Buchung implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Kunde gast;
    private Zimmer_Manager raum;
    private LocalDate einzug;
    private LocalDate auszug;
    private long dauer;
    private int buchungs_id;
    
    
    public Buchung(Kunde gast, Zimmer_Manager raum, LocalDate einzug, LocalDate auszug, int buchungs_id){
        this.gast = gast;
        this.raum = raum;
        this.einzug = einzug;
        this.auszug = auszug;
        this.buchungs_id = buchungs_id;
} 
    
     public Kunde getgast (){
        return gast;
    }
    
    public void setgast (Kunde gast){
        this.gast = gast;
}

    public Zimmer_Manager getraum (){
        return raum;
    }
    public void setraum(Zimmer_Manager raum){
        this.raum = raum;
    }
    public LocalDate geteinzug (){
        return einzug;
    }
            
    public void seteinzug (LocalDate einzug){
        this.einzug = einzug;
}

    public LocalDate getauszug (){
        return auszug;
    }
    
    public void setauszug (LocalDate auszug){
        this.auszug = auszug;
    }
        
     public void setdauer(long dauer){
        this.dauer = dauer;
        }
    
     public long getdauer(){
         return dauer;
     }

    
     public int getbuchungs_id (){
        return buchungs_id;
    }
    
    public void setbuchungs_id (int buchungs_id){
        this.buchungs_id = buchungs_id;
}
//private double errechneKosten(Buchung buchung) {
//        
//        long längedesaufenthalts = (buchung.geteinzug() -- buchung.getauszug());
//        return buchung.getraum().getzimmer_preis() * längedesaufenthalts;
    
public void berechneDauer(){
    if (einzug != null & auszug != null){
        dauer = ChronoUnit.DAYS.between(einzug, auszug);
        System.out.println("Aufenthalt: " + dauer + "Tage!");
        
    }else {
        System.out.println("Fehler beim ausgeben der Aufenthaltsdauer");
    }
    
}

public void berechneKosten(){
    if (dauer > 0){
        int preis = dauer * Zimmer.getPricePerNight();
        System.out.println(preis);
    }else 
}

    
 @Override
    public String toString() {
        return "Buchungs{" +
                "buchungs-id=" + buchungs_id +
                "kunde=" + gast +
                ", zimmer=" + raum +
                ", buchungsdatum=" + einzug +
                ", auszug=" + auszug +
                ", dauer=" + dauer +
                '}';
    }    
}


