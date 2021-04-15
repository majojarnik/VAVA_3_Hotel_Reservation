/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import sk.stu.fiit.gui.MainWindow;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date;  
import sk.stu.fiit.data.Data;
import sk.stu.fiit.model.Category;

/**
 *
 * @author jarni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{        
        Data.loadEverything();
        
        MainWindow main = new MainWindow();
        main.setVisible(true);
        
        
        
        
        /*String sDate1="31/12/1998";  
        String sDate5="-4. 12. 1998";  
        String sDate2 = "31-Dec-1998";  
        String sDate3 = "12 31, 1998";  

        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
        SimpleDateFormat formatter5=new SimpleDateFormat("dd.MM.yyyy");  
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
        SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
       
        Date date1=formatter1.parse(sDate1);  
        Date date2=formatter2.parse(sDate2);  
        Date date3=formatter3.parse(sDate3);  
        Date date5=formatter5.parse(sDate5);

        System.out.println(sDate1+"\t"+date1);  
        System.out.println(sDate2+"\t"+date2);  
        System.out.println(sDate3+"\t"+date3);  
        System.out.println(sDate5+"\t"+date5);  

        System.out.println("-----------------------------------------");
        */
        /*String dt = "2008-1-1";  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(dt));
        c.add(Calendar.DATE, -5);  // number of days to add
        dt = sdf.format(c.getTime());  // dt is now the new date
        System.out.println(dt);
        c.add(Calendar.YEAR, 5);
        dt = sdf.format(c.getTime());  // dt is now the new date

        System.out.println(dt);*/
        
         /*SimpleDateFormat formatter= new SimpleDateFormat("dd.MM.yyyy");
                    Date date = new Date(System.currentTimeMillis());
                    System.out.println(date);
        SimpleDateFormat formatterTime = new SimpleDateFormat("HH:mm:ss");
        System.out.println(formatterTime.format(date));
        */
    }
    
}
