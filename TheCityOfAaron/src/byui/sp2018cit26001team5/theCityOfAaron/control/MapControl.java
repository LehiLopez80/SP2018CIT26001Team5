/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.control;

import byui.sp2018cit26001team5.theCityOfAaron.model.Location;
import byui.sp2018cit26001team5.theCityOfAaron.model.Map;
import byui.sp2018cit26001team5.theCityOfAaron.model.Point;

/**
 * @author Salvador Rubio
 */
public class MapControl {

    public MapControl() {
    }
    
    public static Map createMap() {
        
        Map map = new Map();
        
        String[] gameTips = new String[5];
        gameTips[0] = "Each person needs 20 bushels of grain each year to live";
        gameTips[1] = "Each person can till at most 10 acres of land";
        gameTips[2] = "Each acre of land requires one bushel of grain to plant seeds";
        gameTips[3] = "The price of each acre of land fluctuates from 17 bushels per acre to 27 bushels";
        gameTips[4] = "If you have grain remaining, you might spend some buying additional acres of land, especially if the price is right.";
        
        Location[][] locations = new Location[5][5];
        
        locations[0][0] = new Location("Storehouse", "Place to store items", "SH", gameTips);
        locations[0][1] = new Location("Wheat Field", "Place where wheat grow", "WF", gameTips);
        locations[0][2] = new Location("Wheat Field", "Place where wheat grow", "WF", gameTips);
        locations[0][3] = new Location("The border of the Lamanites land", "Frontier between realms", "BL", gameTips);
        locations[0][4] = new Location("The border of the Lamanites land", "Frontier between realms", "BL", gameTips);
        locations[1][0] = new Location("Storehouse", "Place to store items", "SH", gameTips);
        locations[1][1] = new Location("Wheat Field", "Place where wheat grow", "WF", gameTips);
        locations[1][2] = new Location("Wheat Field", "Place where wheat grow", "WF", gameTips);
        locations[1][3] = new Location("The Village", "Where people live", "TV", gameTips);
        locations[1][4] = new Location("The Village", "Where people live", "TV", gameTips);
        locations[2][0] = new Location("A River", "Water supply to the town", "AR", gameTips);
        locations[2][1] = new Location("Wheat Field", "Place where wheat grow", "WF", gameTips);
        locations[2][2] = new Location("The Ruler´s Court", "The house of the ruler", "RC", gameTips);
        locations[2][3] = new Location("The City´s Granary", "The place where the wheat is stored", "CG", gameTips);
        locations[2][4] = new Location("The Village", "Where people live", "TV", gameTips);
        locations[3][0] = new Location("Undeveloped Land", "The portion of land that is still not used", "UL", gameTips);
        locations[3][1] = new Location("A River", "Water supply to the town", "AR", gameTips);
        locations[3][2] = new Location("Undeveloped Land", "The portion of land that is still not used", "UL", gameTips);
        locations[3][3] = new Location("Undeveloped Land", "The portion of land that is still not used", "UL", gameTips);
        locations[3][4] = new Location("The Village", "Where people live", "TV", gameTips);
        locations[4][0] = new Location("Undeveloped Land", "The portion of land that is still not used", "UL", gameTips);
        locations[4][1] = new Location("A River", "Water supply to the town", "AR", gameTips);
        locations[4][2] = new Location("A River", "Water supply to the town", "AR", gameTips);
        locations[4][3] = new Location("Undeveloped Land", "The portion of land that is still not used", "UL", gameTips);
        locations[4][4] = new Location("The Temple", "The sanctuary where people go to pray", "TT", gameTips);
        
        map.setLocations(locations);
        map.setCurrentLocation(new Point(2,2));        
        
        return map;
    }
    
}
