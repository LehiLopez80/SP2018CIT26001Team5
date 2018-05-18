/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.model;

import java.util.Arrays;

/**
 *
 * @author Lehi Lopez
 */
public class Map {
    
    //class instance variables
    private Location[][] locations;

    public Map() {
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }
    
    
}
