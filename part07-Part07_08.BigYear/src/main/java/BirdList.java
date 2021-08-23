
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class BirdList {
    private ArrayList<Bird> allBirds;
    private HashMap<Bird, Integer> birdFrequency; 

    public BirdList() {
        this.allBirds = new ArrayList<>();
        this.birdFrequency = new HashMap<>();
    }
    
    public void add(Bird bird) {
        this.allBirds.add(bird);
        int count = birdFrequency.containsKey(bird) ? birdFrequency.get(bird) : 0;
        birdFrequency.put(bird, count + 1);
    }

    public ArrayList<Bird> getAllBirds() {
        return allBirds;
    }
    
    public HashMap<Bird, Integer> getBirdFrequency() {
        return birdFrequency;
    }
    
    public void addObservation(String birdName) {
         for (Map.Entry<Bird, Integer> entry : birdFrequency.entrySet()) {
             if (entry.getKey().getName().equals(birdName)) {
                 entry.setValue(entry.getValue() + 1);
             }
        }
    }
    
    
    
    
}
