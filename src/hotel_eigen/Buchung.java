/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;
import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author johan
 */
public class Buchung implements Serializable{
    
    private Kunde gast;
    private Zimmer raum;
    private Date einzug;
    private Date auszug;
    private int buchungs_id;
    
    
     public Kunde getgast (){
        return gast;
    }
    
    public void setgast (Kunde gast){
        this.gast = gast;
}

    public Zimmer getraum (){
        return raum;
    }
    
    public void seteinzug (Date einzug){
        this.einzug = einzug;
}

    public Date getauszug (){
        return auszug;
    }
    
    public void setauszug (Date auszug){
        this.auszug = auszug;

    }
     public int getbuchungs_id (){
        return buchungs_id;
    }
    
    public void setbuchungs_id (int buchungs_id){
        this.buchungs_id = buchungs_id;
}

}



