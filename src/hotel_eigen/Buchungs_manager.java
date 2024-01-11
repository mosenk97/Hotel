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
public class Buchungs_manager {
    private ArrayList<Buchung> buchung;
    private int maxBuchungperKat;
    
    public Buchungs_manager (int maxBuchungperKat){
        this.buchung = new ArrayList<>();
        this.maxBuchungperKat = maxBuchungperKat;
    }

    
    
}
