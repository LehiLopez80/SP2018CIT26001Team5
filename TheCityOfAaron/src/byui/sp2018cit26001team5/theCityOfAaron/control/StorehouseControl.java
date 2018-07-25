/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.control;

import byui.sp2018cit26001team5.theCityOfAaron.model.Animal;
import byui.sp2018cit26001team5.theCityOfAaron.model.Author;
import byui.sp2018cit26001team5.theCityOfAaron.model.Condition;
import byui.sp2018cit26001team5.theCityOfAaron.model.InventoryItem;
import byui.sp2018cit26001team5.theCityOfAaron.model.ItemType;
import byui.sp2018cit26001team5.theCityOfAaron.model.Provision;
import byui.sp2018cit26001team5.theCityOfAaron.model.Storehouse;
import java.util.ArrayList;

/**
 *
 * @author Salvador Rubio
 */
public class StorehouseControl {

    public StorehouseControl() {
    }
    
    public static Storehouse createStorehouse() {
        
        Storehouse storehouse = new Storehouse();
        
        Author[] authors = createAuthors();
        Animal[] animalItems = createAnimals();
        InventoryItem[] toolItems = createToolItems();
        Provision[] provitionItems = createProvisions();
        ArrayList <Animal> animalsArrayList = createAnimalArrayList();
        
        storehouse.setAnimals(animalItems);
        storehouse.setTools(toolItems);
        storehouse.setProvisions(provitionItems);
        storehouse.setAnimalArrayList(animalsArrayList);
        
        return storehouse;
    }
    
    public static Author[] createAuthors() {
        
        Author[] authors = new Author[3];
        
        authors[0] = Author.Alonso;
        authors[1] = Author.Lehi;
        authors[2] = Author.Salvador;   
        
        return authors;
    }
    
    public static Animal[] createAnimals() {
        
        Animal[] animals = new Animal[4];
        
        animals[0] = new Animal(ItemType.Animal, 15, Condition.Good, "Cow", 7);
        animals[1] = new Animal(ItemType.Animal, 20, Condition.Good, "Pig", 5);
        animals[2] = new Animal(ItemType.Animal, 25, Condition.Good, "Chicken", 2);
        animals[3] = new Animal(ItemType.Animal, 10, Condition.Good, "Horse", 9);
        
        return animals;
    }
    
    public static ArrayList <Animal> createAnimalArrayList() {
        
        ArrayList<Animal> animalsArrayList = new ArrayList <> ();
        
        animalsArrayList.add(new Animal(ItemType.Animal, 15, Condition.Good, "Cow", 7));
        animalsArrayList.add(new Animal(ItemType.Animal, 20, Condition.Good, "Pig", 5));
        animalsArrayList.add(new Animal(ItemType.Animal, 25, Condition.Good, "Chicken", 2));
        animalsArrayList.add(new Animal(ItemType.Animal, 10, Condition.Good, "Horse", 9));
        
        return animalsArrayList;
    }
    
    public static InventoryItem[] createToolItems() {
        
        InventoryItem[] toolItems = new InventoryItem[4];
        
        toolItems[0] = new InventoryItem(ItemType.Tool, 5, Condition.Fair, "Hammer");
        toolItems[1] = new InventoryItem(ItemType.Tool, 4, Condition.Fair, "Axe");
        toolItems[2] = new InventoryItem(ItemType.Tool, 3, Condition.Poor, "Shovel");
        toolItems[3] = new InventoryItem(ItemType.Tool, 2, Condition.Poor, "Sickle");
                
        return toolItems;
    }    
    
    public static Provision[] createProvisions() {
        
        Provision[] provisions = new Provision[4];
        
        provisions[0] = new Provision(ItemType.Provisions, 70, Condition.Good, "Potatoes", true);
        provisions[1] = new Provision(ItemType.Provisions, 90, Condition.Fair, "Breads  ", true);
        provisions[2] = new Provision(ItemType.Provisions, 80, Condition.Good, "Apples  ", true);
        provisions[3] = new Provision(ItemType.Provisions, 50, Condition.Fair, "Tomatoes", true);
        
        return provisions;
    }   
    
    public static int minimumToolItems(InventoryItem[] toolItems) {  
    
        if (toolItems.length == 0)   
            return -1;
        
        for (InventoryItem toolItem: toolItems) {
            if (toolItem.getQuantity() < 0)
                return -1;            
        }
        
        int minValue = toolItems[0].getQuantity();
        
        for (InventoryItem toolItem: toolItems) {
            
            if (toolItem.getQuantity() < minValue) {
                minValue = toolItem.getQuantity();
            }
        }
        
        return minValue;        
    }  
    
    public static int totalAnimals(Animal[] animals) {  
    
        if (animals.length == 0)   
            return 0;
        
        for (Animal animal: animals) {
            if (animal.getQuantity() < 0)
                return -1;            
        }
        
        int total = 0;
        
        for (Animal animal: animals) {
            total = total + animal.getQuantity();
        }
        
        return total;        
    } 
    
    public static int totalAnimalsArrayList(ArrayList<Animal> animalArrayList) {  
    
        if (animalArrayList.isEmpty())   
            return 0;
        
        for (Animal animal: animalArrayList) {
            if (animal.getQuantity() < 0)
                return -1;            
        }
        
        int total = 0;
        
        for (Animal animal: animalArrayList) {
            total = total + animal.getQuantity();
        }
        
        return total;        
    }
    
    public static Provision[] sortProvisions(Provision[] provisions) {  
    
        if (provisions.length == 0)   
            return null;
                
        for (Provision provision: provisions) {
            if (provision.getQuantity() < 0)
                return null;            
        }        
        
        if (provisions.length == 1)   
            return provisions;        
               
        for (int m = provisions.length; m >= 0; m--) {                       
            for (int i = 0; i < provisions.length - 1; i++) {
                int aux = i + 1;
                if (provisions[i].getQuantity() > provisions[aux].getQuantity()) {
                    Provision temp = provisions[i];
                    provisions[i] = provisions[aux];
                    provisions[aux] = temp;
                }
            }
        }
   
        return provisions;        
    }  
}
