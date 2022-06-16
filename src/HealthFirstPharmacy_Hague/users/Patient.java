/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

import HealthFirstPharmacy_Hague.orders.Prescription;
import HealthFirstPharmacy_Hague.medicines.Drug;
import HealthFirstPharmacy_Hague.orders.Order;
import HealthFirstPharmacy_Hague.orders.Orders;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;


/**
 *
 * @author joehague
 */
public class Patient extends User {
 
        
        private final Prescription prescription  = new Prescription();
        private final Orders orderList = new Orders();
        private final BigDecimal amountDue  = new BigDecimal(0.00);
        private final UUID NHSNumber = UUID.randomUUID();
        

                
        
        public Patient(String firstname, String lastname, String address,String email, String uname, char[] pw){
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.email = email;   
            this.uname = uname;
            this.pw = pw;   
        }
        
        public void updateDetails(String firstname, String lastname, String address,String email){
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.email = email; 
        }
        
        public void changePassword(char[] pw){
            this.pw = pw;
        }
        
        public ArrayList<Order> getPrescription(){
            return prescription.getPrescription();
        }
        
        //newOrder creates a new order and adds it to patients prescription array.
        //******** Required stock check and validation of drug *************
        public Orders orders(){
            return orderList;
//            
        }
        
        
        
        public void setUpPrescription(){
            prescription.setUpBasicPrescriptionDemo();
        }
        
    }
    

