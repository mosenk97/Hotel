/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;
import java.util.ArrayList;


/**
 *
 * @author johan
 */
public class Hotel_main {
    
    ArrayList <Kunde> refKunde = new ArrayList();
    ArrayList <Zimmer> refZimmer = new ArrayList();
    ArrayList <Buchung> refBuchung = new ArrayList();
    
    public void addKunde (Kunde kunde){    
    this.refKunde.add(kunde); 
}
    public void addZimmer (Zimmer zimmer){    
    this.refZimmer.add(zimmer); 
}
    public Buchung addBuchung (int buchungs_id){    
    this.buchungs_id = buchungs_id; 
}
    public Buchung createBuchung(String kunden_id , String zimmer_id) {
        if (zimmer_id.isAvailable()) 
            
            
            
        } else {
            System.out.println("Das Zimmer ist bereits gebucht.");
            return null;
        }

    
    
    
    public void cancelBuchung (Buchung buchung){
        Buchung.remove(buchung);
        Buchung gebuchtesZimmer = Buchung.getraum();
        gebuchtesZimmer.setavailable(true);
        
    }
    

    
}
