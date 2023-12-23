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
public class Zimmer {
    
    private String zimmer_art;
    private int anzahl_betten;
    private boolean suit;
    private int zimmer_preis;
    private int zimmer_id;
    private float zimmer_groesse;
    private String zimmer_status;
    private boolean gesperrt;
    
    
    
      public String getzimmer_art (){
        return zimmer_art;
    }
    
    public void setzimmer_art (String zimmer_art){
        this.zimmer_art = zimmer_art;
}

     public String getzimmer_status (){
        return zimmer_status;
    }
    
    public void setzimmer_status (String zimmer_status){
        this.zimmer_status = zimmer_status;
}

    public int getanzahl_betten (){
        return anzahl_betten;
    }
    
    public void setanzahl_betten (int anzahl_betten){
        this.anzahl_betten = anzahl_betten;
}

    public int getzimmer_preis (){
        return zimmer_preis;
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
