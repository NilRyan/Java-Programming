
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
public class Stack {
    private ArrayList<String> elements;
    
    public Stack() {
        this.elements = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }
    
    public void add(String value) {
        this.elements.add(value);
    }
    
    public ArrayList<String> values() {
        return this.elements;
    }
    
    public String take() {
        String lastElement = this.elements.get(this.elements.size() - 1);
        this.elements.remove(this.elements.size() - 1);
        return lastElement;
    }
    
    
}
