/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sk.stu.fiit.model.Category;
import sk.stu.fiit.model.Customer;
import sk.stu.fiit.model.Payment;
import sk.stu.fiit.model.Reservation;
import sk.stu.fiit.model.Room;
import sk.stu.fiit.model.Service;

/**
 *
 * @author jarni
 */
public class Data {
    private static List<Category> allCategories = new ArrayList<>();
    private static List<Customer> allCustomers = new ArrayList<>();
    private static List<Reservation> allReservations = new ArrayList<>();
    private static List<Payment> allPayments = new ArrayList<>();
    private static List<Room> allRooms = new ArrayList<>();
    private static List<Service> allServices = new ArrayList<>();

    public static List<Category> getAllCategories() {
        return allCategories;
    }

    public static void setAllCategories(List<Category> aAllCategories) {
        allCategories = aAllCategories;
    }

    public static List<Customer> getAllCustomers() {
        return allCustomers;
    }

    public static void setAllCustomers(List<Customer> aAllCustomers) {
        allCustomers = aAllCustomers;
    }

    public static List<Reservation> getAllReservations() {
        return allReservations;
    }

    public static void setAllReservations(List<Reservation> aAllReservations) {
        allReservations = aAllReservations;
    }

    public static List<Payment> getAllPayments() {
        return allPayments;
    }

    public static void setAllPayments(List<Payment> aAllPayments) {
        allPayments = aAllPayments;
    }

    public static List<Room> getAllRooms() {
        return allRooms;
    }

    public static void setAllRooms(List<Room> aAllRooms) {
        allRooms = aAllRooms;
    }

    public static List<Service> getAllServices() {
        return allServices;
    }

    public static void setAllServices(List<Service> aAllServices) {
        allServices = aAllServices;
    }
    
    
    public static void saveToFile(String fileName, List<? extends Serializable> list){
        try
        {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
        
    }
     
   /* public static List<? extends Serializable> reloadFromFile(String fileName, List<? extends Serializable> list){
        try
        {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            list = (ArrayList) ois.readObject();
 
            ois.close();
            fis.close();
            return list;
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
            return null;
        } 
        catch (ClassNotFoundException c) 
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }
    
    }*/
    
    public static void saveEverythingToFile(){
        saveToFile("customersData", allCustomers);
        saveToFile("roomsData", allRooms);
        saveToFile("categoriesData", allCategories);
        saveToFile("paymentsData", allPayments);
        saveToFile("reservationsData", allReservations);
        saveToFile("servicesData", allServices);
    }
    
    public static void loadEverything(){
        try
        {
            FileInputStream fisCus = new FileInputStream("customersData");
            ObjectInputStream oisCus = new ObjectInputStream(fisCus);
 
            allCustomers = (ArrayList) oisCus.readObject();
 
            oisCus.close();
            fisCus.close();
            
            FileInputStream fisRoom = new FileInputStream("roomsData");
            ObjectInputStream oisRoom = new ObjectInputStream(fisRoom);
 
            allRooms = (ArrayList) oisRoom.readObject();
 
            oisRoom.close();
            fisRoom.close();
            
            FileInputStream fisRes = new FileInputStream("reservationsData");
            ObjectInputStream oisRes = new ObjectInputStream(fisRes);
 
            allReservations = (ArrayList) oisRes.readObject();
 
            oisRes.close();
            fisRes.close();
            
            FileInputStream fisCat = new FileInputStream("categoriesData");
            ObjectInputStream oisCat = new ObjectInputStream(fisCat);
 
            allCategories = (ArrayList) oisCat.readObject();
 
            oisCat.close();
            fisCat.close();
            
            FileInputStream fisSer = new FileInputStream("servicesData");
            ObjectInputStream oisSer = new ObjectInputStream(fisSer);
 
            allServices = (ArrayList) oisSer.readObject();
 
            oisSer.close();
            fisSer.close();
            
            FileInputStream fisPay = new FileInputStream("paymentsData");
            ObjectInputStream oisPay = new ObjectInputStream(fisPay);
 
            allPayments = (ArrayList) oisPay.readObject();
 
            oisPay.close();
            fisPay.close();
                       
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
            return;
        } 
        catch (ClassNotFoundException c) 
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        
    }
    
    
}
