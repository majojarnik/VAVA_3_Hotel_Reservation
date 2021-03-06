/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sk.stu.fiit.controller.ReservationController;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BadDate;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.exceptions.RoomOccupied;
import sk.stu.fiit.model.Customer;
import sk.stu.fiit.model.Reservation;
import sk.stu.fiit.model.Room;

/**
 *
 * @author jarni
 */
public class AddReservation extends javax.swing.JFrame {

    /**
     * Creates new form AddReservation
     */
    private MainWindow main;
    private boolean accom = false;
    
    public AddReservation(MainWindow main) {
        this.main = main;
        initComponents();
        lblPrice.setVisible(false);
    }
    
    public void initAccomNoRes(){
        lblHeading.setText("Ubytovanie");
        SimpleDateFormat sdf = new SimpleDateFormat("dd. MM. yyyy");
        
        
        String dateS = sdf.format(main.getDateNow());
        ftxfFrom.setText(dateS);
        accom = true;
    }
    
    /*public void initAccomRes(Reservation res){
        lblHeading.setText("Ubytovanie");
        cmbCustomer.setSelectedItem(res.getCustomer().getFirstName() + res.getCustomer().getLastName());
        ftxfFrom.setText(String.valueOf(res.getFrom()));
        ftxfTo.setText(String.valueOf(res.getTo()));
        cmbRoom.setSelectedItem(res.getRoom().getId());
        lblPrice.setText(String.valueOf(res.getRoom().getCategory().getPrice()));
        accom = true;
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ftxfFrom = new javax.swing.JFormattedTextField();
        ftxfTo = new javax.swing.JFormattedTextField();
        cmbCustomer = new javax.swing.JComboBox<>();
        cmbRoom = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAddCustomer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(ftxfFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, -1));
        getContentPane().add(ftxfTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, -1));

        List<String> names = new ArrayList<String>();
        for (Customer cus: Data.getAllCustomers()){
            names.add(cus.getFirstName() + " " +  cus.getLastName());
        }

        String[] array = names.toArray(new String[0]);
        cmbCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(array));
        getContentPane().add(cmbCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        List<String> strings = new ArrayList<String>();
        for (Room room: Data.getAllRooms()){
            strings.add(room.getId() + " - " +  room.getCategory().getName());
        }

        String[] arrayS = strings.toArray(new String[0]);
        cmbRoom.setModel(new javax.swing.DefaultComboBoxModel<>(arrayS));
        getContentPane().add(cmbRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 30));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Z??kazn??k");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnSave.setText("Ulo??i??");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 368, 160, 40));

        btnCancel.setText("Zru??i??");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelMouseReleased(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        lblHeading.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblHeading.setText("Rezerv??cia");
        getContentPane().add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Izba");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnAddCustomer.setText("btnAddCustomer");
        btnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddCustomerMouseReleased(evt);
            }
        });
        getContentPane().add(btnAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Za??iatok");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Koniec");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblPrice.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblPrice.setText("0 Eur");
        getContentPane().add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 90, 30));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 40, 40));

        btnCount.setText("Vypo????ta?? cenu");
        btnCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCountMouseReleased(evt);
            }
        });
        getContentPane().add(btnCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseReleased
        dispose();
    }//GEN-LAST:event_btnCancelMouseReleased

    private void btnCountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCountMouseReleased
        ReservationController con = new ReservationController();
        
        int room = cmbRoom.getSelectedIndex();
        
        if (room < 0 || "".equals(ftxfFrom.getText()) || "".equals(ftxfTo.getText())){
            JOptionPane.showMessageDialog(rootPane, "Vypl??te d??tumy a vyberte izbu.", "Nevyplnen?? ??daje", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                
                lblPrice.setText(String.format("%.2f EUR", con.countPrice(ftxfFrom.getText(), ftxfTo.getText(), Data.getAllRooms().get(room))));
                lblPrice.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(AddReservation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadDate ex) {
                JOptionPane.showMessageDialog(rootPane, "Vypl??te spr??vne d??tumy.", "Zl?? d??tumy", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCountMouseReleased

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        ReservationController con = new ReservationController();
        
        int cus = cmbCustomer.getSelectedIndex();
        int room = cmbRoom.getSelectedIndex();
        
        if (room < 0 || cus < 0 || "".equals(ftxfFrom.getText()) || "".equals(ftxfTo.getText())){
            JOptionPane.showMessageDialog(rootPane, "Vypl??te v??etky ??daje.", "Nevyplnen?? ??daje", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                con.addReservation(ftxfFrom.getText(), ftxfTo.getText(), Data.getAllRooms().get(room), Data.getAllCustomers().get(cus), accom, main.getDateNow());
                main.initTableReservations();
                main.initAccomodationTable(0, false);
                dispose();
            } catch (ParseException ex) {
                Logger.getLogger(AddReservation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadDate ex) {
                JOptionPane.showMessageDialog(rootPane, "Vypl??te spr??vne d??tumy. Nem????ete si rezervova?? ubytovanie v minulosti.", "Zl?? d??tumy", JOptionPane.ERROR_MESSAGE);
            } catch (RoomOccupied ex) {
                JOptionPane.showMessageDialog(rootPane, "Izba je v danom obdob?? obsaden??. Vyberte in??.", "Obsaden?? izba", JOptionPane.ERROR_MESSAGE);
            }         
        }
    }//GEN-LAST:event_btnSaveMouseReleased

    private void btnAddCustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomerMouseReleased
        AddCustomer addCustomer = new AddCustomer(main);
        addCustomer.initFromRes(this);
        addCustomer.setVisible(true);
    }//GEN-LAST:event_btnAddCustomerMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbCustomer;
    private javax.swing.JComboBox<String> cmbRoom;
    private javax.swing.JFormattedTextField ftxfFrom;
    private javax.swing.JFormattedTextField ftxfTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblPrice;
    // End of variables declaration//GEN-END:variables

    void initCmbCustomer() {
        List<String> names = new ArrayList<String>();
        for (Customer cus: Data.getAllCustomers()){
            names.add(cus.getFirstName() + " " +  cus.getLastName());
        }

        String[] array = names.toArray(new String[0]);
        cmbCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(array));
    }
}
