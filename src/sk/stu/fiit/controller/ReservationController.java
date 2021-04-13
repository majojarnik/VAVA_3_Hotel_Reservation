/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BadDate;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.model.Customer;
import sk.stu.fiit.model.Room;
import sk.stu.fiit.model.Reservation;

/**
 *
 * @author jarni
 */
public class ReservationController {
    
    public void addReservation(String from, String to, Room room, Customer cus, boolean accom, Date currentDate) throws ParseException, BadDate{
        
        double price = countPrice(from, to, room);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
        Date fromD = sdf.parse(from);
        Date toD = sdf.parse(to);
        
        String dateS = sdf.format(currentDate);
        Date dateD = sdf.parse(dateS);
        
        if (dateD.after(fromD)){
            throw new BadDate();
        }
         
        Reservation res = new Reservation(fromD, toD, room, price, cus, accom);        
        Data.getAllReservations().add(res);
       
    }
    
    public double countPrice(String from, String to, Room room) throws ParseException, BadDate {
        SimpleDateFormat sdf =new SimpleDateFormat("dd.MM.yyyy");
        
        Date fromD = sdf.parse(from);
        Date toD = sdf.parse(to);
        
        
        long diff = toD.getTime() - fromD.getTime();
        double daysBetween = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        
        if (daysBetween <= 0){
            throw new BadDate();
        }
        
        double discount = 0;
        
        if (daysBetween > 6.5){
            discount = 0.1;
        }
        if (daysBetween > 13.5){
            discount = 0.15;
        }
        
        double price = daysBetween * room.getCategory().getPrice() * (1 - discount);
        
        return price;
    }
}
