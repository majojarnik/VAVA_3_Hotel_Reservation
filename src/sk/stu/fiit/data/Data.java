/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.data;

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
    
    
    
}
