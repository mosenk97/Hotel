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
public class Steuerung {
    
    static Steuerung refSteuerung = null;
    ArrayList <Kunde> refKunde = new ArrayList();
    ArrayList <Zimmer> refZimmer = new ArrayList();
    ArrayList <Buchung> refBuchung = new ArrayList();
    ArrayList <Registriert> refRegistriert = new ArrayList();
    
    public static Steuerung getSteuerung(){
        if (refSteuerung == null){
            refSteuerung = new Steuerung();
        }
        return refSteuerung;
    }
    public void addKunde (Kunde kunde){
        this.refKunde.add(kunde);
    }
    public void addZimmer (Zimmer zimmer){
        this.refZimmer.add(zimmer);
    }
    public void addBuchung (Buchung buchung){
        this.refBuchung.add(buchung);
    }
    public void addRegistriert (Registriert registriert){
        this.refRegistriert.add(registriert);
    }
    
    public ArrayList <Kunde> getKunde(){
        return refKunde;
    }
    public ArrayList <Zimmer> getZimmer(){
        return refZimmer;
    }
    public ArrayList <Buchung> getBuchung(){
        return refBuchung;
    }
    public ArrayList <Registriert> getRegistriert(){
        return refRegistriert;
    }
    
    
    
   // public Kunde sucheKundebyID (int kunden_id){
       // Kunde rueckgabe = null;
        //for (Kunde a : refKunde){
          //  if(a.getkunden_id().equals(kunden_id)){
            //    rueckgabe = a;
           // }
        //}
   // }
    
}
 //public Buchung createBuchung(String kunden_id , String zimmer_id) {
       // if (zimmer_id.isAvailable()) 
            
            
            
        //} else {
          //  System.out.println("Das Zimmer ist bereits gebucht.");
           // return null;
        //}

    
    
    
    //public void cancelBuchung (Buchung buchung){
       // Buchung.remove(buchung);
       // Buchung gebuchtesZimmer = Buchung.getraum();
        //gebuchtesZimmer.setavailable(true);
        
    