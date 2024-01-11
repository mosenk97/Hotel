/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author johan
 */
public class Kunde implements Serializable {
    private static final long serialVersionUID = 1L;

    static Iterator<Kunde> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String vorname;
    private String name;
    private Date geburtstag;
    private String wohnort;
    private int plz;
    private boolean registriert;
    private int kunden_id;
    
        
        public Kunde (String vorname, String name, String wohnort, int plz){
            this.vorname = vorname;
            this.name = name;
            this.geburtstag = geburtstag;
            this.wohnort = wohnort;
            this.plz = plz;
            this.registriert = registriert;
            this.kunden_id = kunden_id;
        }
    public void datenAktualisieren(String vorname, String name, String wohnort, int plz) {
        this.vorname = vorname;
        this.name = name;
        this.wohnort = wohnort;
        this.plz = plz;
    }
    
     public String getvorname (){
        return vorname;
    }
    
    public void setvorname (String vorname){
        this.vorname = vorname;
}   
    public void setname (String name){
        this.name = name;
    }
    
    public String getname (){
        return name;
    }
    
    public Date getgeburtstag(){
        return geburtstag;
    }
    
    public void setgeburtstag(Date geburtstag){
        this.geburtstag = geburtstag;
    }
    
    public void setwohnort(){
       this.wohnort = wohnort;
    }
    
    public String getwohnort(String wohnort){
        return wohnort;
    }
    
    public void setregistriert (){
        this.registriert = registriert;
    }
    
    public boolean getregistriert(boolean registriert){
        return registriert;
    }  
    
    public void setkunden_id(){
        this.kunden_id = kunden_id;
    }
    
    public int getkunden_id(int kunden_id){
        return kunden_id;
    }
    
    public int getplz (){
        return plz;
    }
    
    public void setplz (int plz){
        this.plz = plz;
}
    public int checkePLZ(String text) {
        int plz;
        try {
            plz = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return -1;
        }
        if (plz < 1000 || plz > 99999) {
            return -1;
        }
        return plz;
    }
    
    
        
    
    
    //public String toString() {
       // String s = "Gast " + getkunden_id()+": "+getvorname()+" "+getname()+" aus "+getplz()+" ";
        // s += getwohnort()+" (Umsatz "+getUmsatz()+" �)";
        //return s;
    
    //}
@Override
    public String toString() {
        return "Kunde: " +
                "Kunden-Id" + kunden_id + 
                "vorname='" + vorname + '\'' +
                ", nachname='" + name + '\'' +
                ", geburtstag=" + geburtstag +
                ", wohnort='" + wohnort + '\'' +
                ", postleitzahl" + plz + 
                ", registriert=" + registriert + "\n";
    }

}