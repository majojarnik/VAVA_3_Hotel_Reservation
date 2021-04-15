/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jarni
 */
public class Reservation implements ITableModel,Serializable{
    
    private Date from;
    private Date to;
    private Room room;
    private double price;
    private Customer customer;
    private boolean accomodation;
    private List<Service> services = new ArrayList<Service>();
    private double priceAll;
    private Payment payment = null;
    
    
    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public Reservation(Date from, Date to, Room room, double price, Customer customer, boolean accomodation) {
        this.from = from;
        this.to = to;
        this.room = room;
        this.price = price;
        this.customer = customer;
        this.accomodation = accomodation;
        priceAll = price;
    }

    public Reservation(Date from, Date to, Room room, double price) {
        this.from = from;
        this.to = to;
        this.room = room;
        this.price = price;
        priceAll = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isAccomodation() {
        return accomodation;
    }

    public void setAccomodation(boolean accomodation) {
        this.accomodation = accomodation;
    }

    @Override
    public String[] rowsTable(){
        if (accomodation)
            return null;
        
        SimpleDateFormat sdf =new SimpleDateFormat("dd.MM.yyyy");
        
        String fromS = sdf.format(from);
        String toS = sdf.format(to);
        
        return new String[] {customer.getFirstName() + " " + customer.getLastName(), fromS, toS, room.getId() + " - " + room.getCategory().getName(), String.format("%.2f EUR", price)};
    }
    
    @Override
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Celé meno");
        columns.add("Začiatok");
        columns.add("Koniec");
        columns.add("Izba");
        columns.add("Cena");
        
        return columns;
    }

    public double getPriceAll() {
        return priceAll;
    }

    public void setPriceAll(double priceAll) {
        this.priceAll = priceAll;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    
    
    
}
