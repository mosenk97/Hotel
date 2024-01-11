/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_eigen;

/**
 *
 * @author johan
 */
public abstract class Zimmer {
    
    private int pricePerNight;
    private int zimmerID;
    
    
    public Zimmer (int pricePerNight, int zimmerID){
        this.pricePerNight = pricePerNight;
        this.zimmerID = zimmerID;
    }
    

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setZimmerID(int zimmerID) {
        this.zimmerID = zimmerID;
    }

    public  int getPricePerNight() {
        return pricePerNight;
    }

    public int getZimmerID() {
        return zimmerID;
    }

    
    
    
    
    
    
}
