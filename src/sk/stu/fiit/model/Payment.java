/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.model;

import java.util.Date;

/**
 *
 * @author jarni
 */
public class Payment{
    private boolean cash;
    private Date date;

    public Payment(boolean cash, Date date) {
        this.cash = cash;
        this.date = date;
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

}
