/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jarni
 */
public class Payment{
    private boolean cash;
    private Date date;
    private List<IService> listServices;

    public Payment(boolean cash, Date date, List<IService> listServices) {
        this.cash = cash;
        this.date = date;
        this.listServices = listServices;
    }

    public boolean isCash() {
        return cash;
    }

    public void setCash(boolean cash) {
        this.cash = cash;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<IService> getListServices() {
        return listServices;
    }

    public void setListServices(List<IService> listServices) {
        this.listServices = listServices;
    }
    
}
