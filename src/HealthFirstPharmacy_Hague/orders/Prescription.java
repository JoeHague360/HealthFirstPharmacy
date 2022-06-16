/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.orders;



import HealthFirstPharmacy_Hague.medicines.Inventory;
import java.util.ArrayList;


/**
 *
 * @author joehague
 */

public class Prescription {
    
    private final ArrayList<Order> prescription = new ArrayList<>();
    private Boolean approved = false;
    
    public void addOrderToPrescription(Order order){
        prescription.add(order);
    }
    
    public ArrayList<Order> getPrescription(){
        
        return prescription;
    }
    
    //This is purely to set up a prescription
    public void setUpBasicPrescriptionDemo(){
        this.addOrderToPrescription(new Order(Inventory.getDrug("Calpol"),20,false));
        this.addOrderToPrescription(new Order(Inventory.getDrug("HRT"),10,false));
        this.addOrderToPrescription(new Order(Inventory.getDrug("Amoxycillin"),1000,false));
    }

}

