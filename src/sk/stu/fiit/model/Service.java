/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jarni
 */
public class Service implements ITableModel{
    private String name;
    private String desc;
    private double price;
    private Date date;

    public Service(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Service(String name, String desc, double price, Date date) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String[] rowsTable(){

        return new String[] {name, desc, String.valueOf(price)};
    }
    
    @Override
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Služba");
        columns.add("Opis služby");
        columns.add("Cena");
        
        return columns;
    }
    
    
}
