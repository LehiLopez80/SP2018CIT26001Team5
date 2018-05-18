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
 * @author Lehi Lopez
 */
public class Storehouse implements Serializable{
    
    //class instance variables
    private Game game;

    public Storehouse() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Storehouse{" + "game=" + game + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.game);
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
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }
    
    

}
