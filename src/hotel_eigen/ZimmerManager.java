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
public class ZimmerManager {
    public static ZimmerManager refzimmerManager;
    public static final int numberofSuits = 4;
    public static final int numberofEinbett = 4;
    public static final int numberofZweibett = 4;
    ArrayList<Zimmer> refzimmerList = new ArrayList();
    
            
        public static ZimmerManager getzimmerManager(){
        if (refzimmerManager == null){
            refzimmerManager = new ZimmerManager();
        }
        return refzimmerManager;
    }

    private ZimmerManager() {
    }
    
    private void setup(){
        refzimmerList.add(new Suite(1));
        refzimmerList.add(new Suite(2));
        refzimmerList.add(new Suite(3));
        refzimmerList.add(new Suite(4));
        refzimmerList.add(new EinBettZimmer(5));
        refzimmerList.add(new EinBettZimmer(6));
        refzimmerList.add(new EinBettZimmer(7));
        refzimmerList.add(new EinBettZimmer(8));
        refzimmerList.add(new ZweiBettZimmer(9));
        refzimmerList.add(new ZweiBettZimmer(10));
        refzimmerList.add(new ZweiBettZimmer(11));
        refzimmerList.add(new ZweiBettZimmer(12));
        
    }
}
