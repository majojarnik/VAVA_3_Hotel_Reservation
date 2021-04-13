/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.model;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jarni
 */
public class Room implements ITableModel{
    private String id;
    private Category category;
    private String note;
    private List<BufferedImage> images;

    public Room(String id, Category category, String note, List<BufferedImage> images) {
        this.id = id;
        this.category = category;
        this.note = note;
        this.images = images;
    }
    
    public Room(String id, Category category, String note) {
        this.id = id;
        this.category = category;
        this.note = note;
    }
    
    public Room(String id, Category category) {
        this.id = id;
        this.category = category;
    }

    public List<BufferedImage> getImages() {
        return images;
    }

    public void setImages(List<BufferedImage> images) {
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String[] rowsTable(){

        return new String[] {id, category.getName(), note};
    }
    
    @Override
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("ID izby");
        columns.add("Kategória");
        columns.add("Poznámka");
        
        return columns;
    }
    
    
    
}
