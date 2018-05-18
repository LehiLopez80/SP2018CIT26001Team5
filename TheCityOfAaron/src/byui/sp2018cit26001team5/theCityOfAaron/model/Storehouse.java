/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Lehi Lopez
 */
public class Storehouse implements Serializable{
    
    //class instance variables
    private Author[] authors;

    public Storehouse() {
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Storehouse{" + "authors=" + authors + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Arrays.deepHashCode(this.authors);
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
        return true;
    }    

}
