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
public class Kunde implements Serializable {
    
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
}