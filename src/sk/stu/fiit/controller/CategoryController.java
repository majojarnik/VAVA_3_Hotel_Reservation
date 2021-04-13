/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controller;

import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.model.Category;

/**
 *
 * @author jarni
 */
public class CategoryController {
    public void addCategory(String name, String desc, String price) throws BlankFields{
        
        if ("".equals(name) || "".equals(desc) || "".equals(price)){
            throw new BlankFields();
        }
        
        try {
            double priceNew = Double.parseDouble(price);
        
            Category category = new Category(name, desc, priceNew);        
            Data.getAllCategories().add(category);
        }
        catch (NumberFormatException e) {
            throw e;
        }
       
    }
}
