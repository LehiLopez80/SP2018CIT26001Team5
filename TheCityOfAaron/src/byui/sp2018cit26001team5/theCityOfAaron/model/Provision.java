/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Salvador Rubio
 */
public class Provision extends InventoryItem implements Serializable{
       
    private boolean perishable;

    public Provision() {
    }
    
    public Provision (ItemType itemType, int quantity, Condition condition, String name, boolean perishable) {
        this.itemType = itemType;
        this.quantity = quantity;
        this.condition = condition;
        this.name = name;
        this.perishable = perishable;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public String toString() {
        return "Provision{" + "perishable=" + perishable + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.perishable ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Provision other = (Provision) obj;
        if (this.perishable != other.perishable) {
            return false;
        }
        return true;
    }   
}
