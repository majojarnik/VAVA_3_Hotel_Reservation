/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controller;

import java.awt.image.BufferedImage;
import java.util.List;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.model.Room;

/**
 *
 * @author jarni
 */
public class RoomController {
    public void addRoom(String id, int category, String note, List<BufferedImage> images) throws BlankFields{
        
        if ("".equals(id) || "".equals(note)){
            throw new BlankFields();
        }
        
        Room room = new Room(id, Data.getAllCategories().get(category), note, images);        
        Data.getAllRooms().add(room);
       
    }

    public void editRoom(Room room, String id, int category, String note, List<BufferedImage> images) throws BlankFields {
        if ("".equals(id) || "".equals(note)){
            throw new BlankFields();
        }
        
        room.setId(id);
        room.setCategory(Data.getAllCategories().get(category));
        room.setNote(note);
        room.setImages(images);     
        
    }
}
