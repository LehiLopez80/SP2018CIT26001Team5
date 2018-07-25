/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Lehi Lopez
 */
public class Game implements Serializable{
    
    //class instance variables
    private Player player;
    private Map map;
    private Storehouse storehouse;
    private int currentPopulation;
    private int acresOwned;
    private int wheatInStorage;
    private int currentYear;
    
    //class static variables
    private static int acresPrice;
    private static int bushelsFeedPeople;
    private static int cropsPlanted;
    private static int offeringsPercentage;

    public static int getBushelsFeedPeople() {
        return bushelsFeedPeople;
    }

    public static void setBushelsFeedPeople(int bushelsFeedPeople) {
        Game.bushelsFeedPeople = bushelsFeedPeople;
    }    
    
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Storehouse getStorehouse() {
        return storehouse;
    }

    public void setStorehouse(Storehouse storehouse) {
        this.storehouse = storehouse;
    }
    
    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatInStorage() {
        return wheatInStorage;
    }

    public void setWheatInStorage(int wheatInStorage) {
        this.wheatInStorage = wheatInStorage;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public static int getAcresPrice() {
        return acresPrice;
    }

    public static void setAcresPrice(int acresPrice) {
        Game.acresPrice = acresPrice;
    }

    public static int getCropsPlanted() {
        return cropsPlanted;
    }

    public static void setCropsPlanted(int cropsPlanted) {
        Game.cropsPlanted = cropsPlanted;
    }

    public static int getOfferingsPercentage() {
        return offeringsPercentage;
    }

    public static void setOfferingsPercentage(int offeringsPercentage) {
        Game.offeringsPercentage = offeringsPercentage;
    }      
      
    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", map=" + map + ", storehouse=" + storehouse + ", currentPopulation=" + currentPopulation + ", acresOwned=" + acresOwned + ", wheatInStorage=" + wheatInStorage + ", currentYear=" + currentYear + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.player);
        hash = 83 * hash + Objects.hashCode(this.map);
        hash = 83 * hash + Objects.hashCode(this.storehouse);
        hash = 83 * hash + this.currentPopulation;
        hash = 83 * hash + this.acresOwned;
        hash = 83 * hash + this.wheatInStorage;
        hash = 83 * hash + this.currentYear;
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
        final Game other = (Game) obj;
        if (this.currentPopulation != other.currentPopulation) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.wheatInStorage != other.wheatInStorage) {
            return false;
        }
        if (this.currentYear != other.currentYear) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.storehouse, other.storehouse)) {
            return false;
        }
        return true;
    }   
}
