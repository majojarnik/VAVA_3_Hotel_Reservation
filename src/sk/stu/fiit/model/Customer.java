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
public class Customer implements ITableModel, Serializable{
    private String firstName;
    private String lastName;
    private List<Reservation> reservations = new ArrayList<Reservation>();
    
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String[] rowsTable(){      
        return new String[] {firstName, lastName};
    }
    
    @Override
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Meno");
        columns.add("Priezvisko");

        return columns;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }


    
    
    
}
