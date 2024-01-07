/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;
import java.util.Date;

/**
 *
 * @author johan
 */
public class Registriert {
    
    Kunde kunden_id;
    String email;
    Date erstbesuch;
    boolean newsletter;
    boolean dsvgo;
    boolean umfrage;
   


    public Registriert (String email, 
            boolean newsletter, boolean dsvgo, boolean umfrage){
        //this.kunden_id = kunden_id;
        this.email = email;
        //this.erstbesuch = erstbesuch;
        this.newsletter = newsletter;
        this.dsvgo = dsvgo;
        this.umfrage = umfrage;
        
    }
    
public void setkunden_id(Kunde kunden_id){
    this.kunden_id = kunden_id;
}
public Kunde getkunden_id(){
        return kunden_id;
    }
public void setemail(String email){
    this.email = email;
}    
public String getemail(){
    return email;
}
public void seterstbesuch(Date erstbesuch){
    this.erstbesuch = erstbesuch;
}
public Date geterstbesuch(){
    return erstbesuch;
}
public void setnewsletter(boolean newsletter){
    this.newsletter = newsletter;
}
public boolean getnewsletter(){
    return newsletter;
}
public void setdsvgo(boolean dsvgo){
    this.dsvgo = dsvgo;
}
public boolean getdsvgo(){
    return dsvgo;
}
public void setumfrage(boolean umfrage){
    this.umfrage = umfrage;
}
public boolean getumfrage(){
    return umfrage;
}


