/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Lehi Lopez
 */
public class Storehouse implements Serializable{
    
    //class instance variables
    private Author[] authors;
    private Animal[] animals;
    private InventoryItem[] tools;
    private Provision[] provisions;
    private ArrayList <Animal> animalArrayList;

    public ArrayList<Animal> getAnimalArrayList() {
        return animalArrayList;
    }

    public void setAnimalArrayList(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

    public Storehouse() {
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public InventoryItem[] getTools() {
        return tools;
    }

    public void setTools(InventoryItem[] tools) {
        this.tools = tools;
    }

    public Provision[] getProvisions() {
        return provisions;
    }

    public void setProvisions(Provision[] provisions) {
        this.provisions = provisions;
    }

    @Override
    public String toString() {
        return "Storehouse{" + "authors=" + authors + ", animals=" + animals + ", tools=" + tools + ", provisions=" + provisions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Arrays.deepHashCode(this.authors);
        hash = 17 * hash + Arrays.deepHashCode(this.animals);
        hash = 17 * hash + Arrays.deepHashCode(this.tools);
        hash = 17 * hash + Arrays.deepHashCode(this.provisions);
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
        final Storehouse other = (Storehouse) obj;
        if (!Arrays.deepEquals(this.authors, other.authors)) {
            return false;
        }
        if (!Arrays.deepEquals(this.animals, other.animals)) {
            return false;
        }
        if (!Arrays.deepEquals(this.tools, other.tools)) {
            return false;
        }
        if (!Arrays.deepEquals(this.provisions, other.provisions)) {
            return false;
        }
        return true;
    }    
}
