/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.model;

import java.util.List;

/**
 *
 * @author jarni
 */
public interface ITableModel {
    public abstract List<String> columnsTable();
    
    public abstract String[] rowsTable();
}
