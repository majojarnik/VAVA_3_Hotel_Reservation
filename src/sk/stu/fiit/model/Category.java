/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jarni
 */
public class Category implements Serializable{
    private String name;
    private String desc;
    private double price;

    public Category(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /*@Override
    public String[] rowsTable(){
        String aud;
        if (NBU)
            aud = "áno";
        else
            aud = "nie";
        
        return new String[] {name, String.valueOf(manDay), String.valueOf(experience), education.toString(), aud};
    }
    
    @Override
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Meno");
        columns.add("Cena za deň");
        columns.add("Dĺžka praxe");
        columns.add("Vzdelanie");
        columns.add("Auditor NBU?");

        return columns;
    }*/
    
    
    
}
