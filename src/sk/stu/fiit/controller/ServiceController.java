/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controller;

import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.model.Service;

/**
 *
 * @author jarni
 */
public class ServiceController {
    public void addService(String name, String desc, String price) throws BlankFields{
        
        if ("".equals(name) || "".equals(desc) || "".equals(price)){
            throw new BlankFields();
        }
        
        try {
            double priceNew = Double.parseDouble(price);
        
            Service serv = new Service(name, desc, priceNew);        
            Data.getAllServices().add(serv);
        }
        catch (NumberFormatException e) {
            throw e;
        }
       
    }
}
