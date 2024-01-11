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
public class Buchung_str {
    
    static Steuerung refBuchung = null;
    ArrayList <Buchung> buchung = new ArrayList();
    
    public static Steuerung getbuchSteuerung(){
     if (refBuchung == null){
         refBuchung = new Steuerung();
     }
     
     return refBuchung;
    }
    
    public void addBuchung(Buchung buchung){
        this.buchung.add(buchung);
    }
    
    public ArrayList <Buchung> getBuchung(){
        return buchung;
    }
    
    public void removeBuchung(Buchung buchung){
        this.buchung.remove(buchung);
    }
    
    public Buchung vergleicheBuchung (int buchungs_id){
        Buchung rueckgabe = null;
        for (Buchung b : buchung){
            if(b.getbuchungs_id().equals(buchungs_id)){
            rueckgabe = b;
            }
        }
        return rueckgabe;
        
    }
    
    
}
    
    

