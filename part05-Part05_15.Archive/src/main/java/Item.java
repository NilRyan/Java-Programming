/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilryan
 */
public class Item {

    private String name;
    private String identifier;

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;
         if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }

        if (this.identifier.equals(comparedItem.identifier)
                && this.name.equals(comparedItem.name)) {
            return true;
        }

        return false;

    }

}
