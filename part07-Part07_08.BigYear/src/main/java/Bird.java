/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class Bird {
    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }
    
    @Override
    public String toString() {
        return name + " (" + latinName + ")";
    }
    
    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        
        if (!(comparedObject instanceof Bird)) {
            return false;
        }
        
        Bird comparedBird = (Bird) comparedObject;
        
        if (this.name.equals(comparedBird.name)) {
            return true;
        }
        
        return false;
    }
    
    // Needed in order for BirdList HashMap to determine equality of bird objects
    @Override
    public int hashCode() {
        String name = this.name + this.latinName;
        int hash = name.hashCode() + 50;
        
        return hash;
    }
}
