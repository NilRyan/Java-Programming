/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class Container {
    private int amount;
    private final int maxAmount;
    
    public Container() {
        this.amount = 0;
        this.maxAmount = 100;
    }
    
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
        }
        
        if (this.amount > maxAmount ) {
            this.amount = maxAmount;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
        }
        
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.amount + "/100";
    }
    
}
