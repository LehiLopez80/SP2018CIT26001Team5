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
public class Animal extends InventoryItem implements Serializable {
    
    private int age;

    public Animal() {
    }
    
    public Animal (ItemType itemType, int quantity, Condition condition, String name, int age) {
        this.itemType = itemType;
        this.quantity = quantity;
        this.condition = condition;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.age;
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
        final Animal other = (Animal) obj;
        if (this.age != other.age) {
            return false;
        }
        return true;
    }      
}
