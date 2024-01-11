/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;
import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;
import java.time.LocalDate;





/**
 *
 * @author johan
 */
public class Steuerung {
    
    static Steuerung refSteuerung = null;
    ArrayList <Kunde> refKunde = new ArrayList();
    ArrayList <Zimmer_Manager> refZimmer = new ArrayList();
    ArrayList <Buchung> refBuchung = new ArrayList();
    
//    private List<Zimmer> zimmerList;
//    private List<Kunde> kundenList;
//    private List<Buchung> buchungsList;
    
    
        
//        for (int i = 0, i < 4, i++){
//            zimmerList.add(new zimmer_einzeln());
//            zimmerList.add(new zimmer_doppelt());
//            zimmerList.add((new zimmer_suite));
//       
//        }
        
        
    
    public static Steuerung getSteuerung(){
        if (refSteuerung == null){
            refSteuerung = new Steuerung();
        }
        return refSteuerung;
    }

    public boolean istZimmerVerfuegbar(Zimmer_Manager raum, LocalDate einzug, int dauer) {
        for (Buchung buchung : refBuchung) {
            if (buchung.getraum().getzimmer_id() == raum.getzimmer_id()) {
                LocalDate auszug = buchung.geteinzug().plusDays(buchung.getdauer());
                LocalDate angefragtesEndeDatum = einzug.plusDays(dauer);

                if (!einzug.isAfter(auszug) && !angefragtesEndeDatum.isBefore(buchung.geteinzug())) {
                    return false; 
                }
            }
        }
        return true; 
    }
    
    public static int getVerfuegbareZimmer(String kategorie) {
        int zimmerVerfuegbar = 0;
        for (Zimmer_Manager zimmer : refZimmer) {
            if (zimmer.getzimmer_kategorie().equals(kategorie) && zimmer.isverfuegbar()){
               zimmerVerfuegbar++;
            }
        }
        return zimmerVerfuegbar;
    }
    
    public Zimmer_Manager getzimmer(int zimmer_id) {
        for (Zimmer_Manager zimmer : refZimmer) {
            if (zimmer.getzimmer_id() == zimmer_id) {
                return zimmer;
            }
        }
        return null;
    }


    // Kunde aus der Kundenliste entfernen
    public void kundeEntfernen(Kunde kunde) {
        refKunde.remove(kunde);
    }

    // Buchung in die Buchungsliste einfügen
    public void buchungHinzufuegen(Buchung buchung) {
        refBuchung.add(buchung);
    }

    // Buchung aus der Buchungsliste entfernen
    public void buchungEntfernen(Buchung buchung) {
        refBuchung.remove(buchung);
    }

    
    
    public void addKunde (Kunde kunde){
        this.refKunde.add(kunde);
    }
    public void addZimmer (Zimmer_Manager zimmer){
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
    public ArrayList <Zimmer_Manager> getZimmer(){
        return refZimmer;
    }
    public ArrayList <Buchung> getBuchung(){
        return refBuchung;
    }
    public ArrayList <Registriert> getRegistriert(){
        return refRegistriert;
    }
    
 
    
}    
    
    
   // public Kunde sucheKundebyID (int kunden_id){
       // Kunde rueckgabe = null;
        //for (Kunde a : refKunde){
          //  if(a.getkunden_id().equals(kunden_id)){
            //    rueckgabe = a;
           // }
        //}
   // }
    

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
        
    