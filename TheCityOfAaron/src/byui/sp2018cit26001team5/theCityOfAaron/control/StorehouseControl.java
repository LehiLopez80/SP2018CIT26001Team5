/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.control;

import byui.sp2018cit26001team5.theCityOfAaron.model.Author;
import byui.sp2018cit26001team5.theCityOfAaron.model.Condition;
import byui.sp2018cit26001team5.theCityOfAaron.model.InventoryItem;
import byui.sp2018cit26001team5.theCityOfAaron.model.ItemType;
import byui.sp2018cit26001team5.theCityOfAaron.model.Storehouse;

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
        
        InventoryItem[] animalItems = createAnimalItems();
        InventoryItem[] toolItems = createToolItems();
        InventoryItem[] provitionItems = createProvisionItems();
        
        storehouse.setAnimals(animalItems);
        storehouse.setTools(toolItems);
        storehouse.setProvisions(provitionItems);
        
        return storehouse;
    }
    
    public static Author[] createAuthors() {
        
        Author[] authors = new Author[3];
        
        authors[0] = Author.Alonso;
        authors[0] = Author.Lehi;
        authors[0] = Author.Salvador;
        
        return authors;
    }
    
    public static InventoryItem[] createAnimalItems() {
        
        InventoryItem[] animalItems = new InventoryItem[4];
        
        animalItems[0] = new InventoryItem(ItemType.Animal, 15, Condition.Good, "Cow");
        animalItems[1] = new InventoryItem(ItemType.Animal, 20, Condition.Good, "Pig");
        animalItems[2] = new InventoryItem(ItemType.Animal, 25, Condition.Good, "Chicken");
        animalItems[3] = new InventoryItem(ItemType.Animal, 10, Condition.Good, "Horse");
        
        return animalItems;
    }
    
    public static InventoryItem[] createToolItems() {
        
        InventoryItem[] toolItems = new InventoryItem[4];
        
        toolItems[0] = new InventoryItem(ItemType.Tool, 5, Condition.Fair, "Hammer");
        toolItems[1] = new InventoryItem(ItemType.Tool, 4, Condition.Fair, "Axe");
        toolItems[2] = new InventoryItem(ItemType.Tool, 3, Condition.Poor, "Shovel");
        toolItems[3] = new InventoryItem(ItemType.Tool, 2, Condition.Poor, "Sickle");
                
        return toolItems;
    }    
    
    public static InventoryItem[] createProvisionItems() {
        
        InventoryItem[] provitionItems = new InventoryItem[4];
        
        provitionItems[0] = new InventoryItem(ItemType.Provisions, 70, Condition.Good, "Potatoes");
        provitionItems[1] = new InventoryItem(ItemType.Provisions, 100, Condition.Fair, "Breads");
        provitionItems[2] = new InventoryItem(ItemType.Provisions, 80, Condition.Good, "Apples");
        provitionItems[3] = new InventoryItem(ItemType.Provisions, 50, Condition.Fair, "Tomatoes");
        
        return provitionItems;
    }   
}
