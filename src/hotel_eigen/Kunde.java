/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;
import java.io.Serializable;

/**
 *
 * @author johan
 */
public class Kunde {
    
    private String vorname;
    private String name;
    private date geburtstag;
    private String wohnort;
    private int plz;
    private boolean registriert;
    private int kunden_id;
    
        private static class date {

        public date() {
        }
    }
    
     public String getvorname (){
        return vorname;
    }
    
    public void setvorname (String vorname){
        this.vorname = vorname;
}

    public int getplz (){
        return plz;
    }
    
    public void setplz (int plz){
        this.plz = plz;
}

    public int getkunden_id (){
        return kunden_id;
    }
    
    public void setzimmer_preis (int zimmer_preis){
        this.zimmer_preis = zimmer_preis;
}

    public int getzimmer_id (){
        return zimmer_id;
    }
    
    public void setzimmer_id (int zimmer_id){
        this.zimmer_id = zimmer_id;
}

    public float getzimmer_groesse (){
        return zimmer_groesse;
    }
    
    public void setzimmer_groesse (float zimmer_groesse){
        this.zimmer_groesse = zimmer_groesse;
}

    public boolean getsuit (){
        return suit;
    }
    
    public void setsuit (boolean suit){
        this.suit = suit;
}
    public boolean getgesperrt (){
        return gesperrt;
    }
    
    public void setgesperrt (boolean gesperrt){
        this.gesperrt = gesperrt;
}
        
        
}
