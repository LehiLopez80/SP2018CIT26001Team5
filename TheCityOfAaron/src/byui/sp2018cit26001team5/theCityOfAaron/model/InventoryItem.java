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
 * @author Alonso Bernaldo
 */
public class InventoryItem implements Serializable{
    //class instance variables  
    private ItemType itemType;
    private int quantity;
    private Condition condition; 

    public InventoryItem() {
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "itemType=" + itemType + ", quantity=" + quantity + ", condition=" + condition + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.itemType);
        hash = 97 * hash + this.quantity;
        hash = 97 * hash + Objects.hashCode(this.condition);
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.itemType != other.itemType) {
            return false;
        }
        if (this.condition != other.condition) {
            return false;
        }
        return true;
    }
    
}
