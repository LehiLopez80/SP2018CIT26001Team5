/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.model;
import java.io.Serializable;

/**
 * @author Lehi Lopez
 */
public enum Author implements Serializable{
    
    Alonso("Obispo", "Alonso Bernaldo"),
    Lehi("Ingeniero", "Lehi Lopez"),
    Salvador("Mister", "Salvador Rubio");
    
    private String title;
    private String name;

    private Author(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" + "title=" + title + ", name=" + name + '}';
    }   
}
