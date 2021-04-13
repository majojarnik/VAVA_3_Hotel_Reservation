/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controller;

import java.awt.image.BufferedImage;
import java.util.Date;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.model.Customer;
import sk.stu.fiit.model.Service;

/**
 *
 * @author jarni
 */
public class CustomerController {
    public void addCustomer(String first, String last) throws BlankFields{
        
        if ("".equals(first) || "".equals(last)){
            throw new BlankFields();
        }
        
        Customer customer = new Customer(first, last);        
        Data.getAllCustomers().add(customer);
       
    }
}
