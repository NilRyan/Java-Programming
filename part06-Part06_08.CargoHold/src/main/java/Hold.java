
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> onHold;
    private int totalWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.onHold = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight <= this.maxWeight) { 
            this.totalWeight += suitcase.totalWeight();
            onHold.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.onHold) {
            suitcase.printItems();  
        }
    }
    @Override
    public String toString() {
        return this.onHold.size() + " suitcases (" + this.totalWeight + " kg)"; 
    }
    
}
