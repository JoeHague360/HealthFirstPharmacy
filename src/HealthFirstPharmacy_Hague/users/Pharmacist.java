/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;


import HealthFirstPharmacy_Hague.orders.Order;
import HealthFirstPharmacy_Hague.utilities.checkDrugStock;
import java.util.ArrayList;

/**
 *
 * @author joehague
 */
public class Pharmacist extends Staff {

    public Pharmacist(String firstName, String lastName, String address, String email, float salary, String uname, char[] pw ) {
        this.firstname = firstName;
        this.lastname= lastName;
        this.address = address;
        this.email = email;  
        this.pw = pw;
        this.uname = uname;
        this.setSalary(salary);
        
    }
    
    public void prepareMedicines(Patient patient){
        
        ArrayList<String> outOfStockArray = new ArrayList<>();
        outOfStockArray.add("The following Items are out of stock");
        
        for(Order presOrder : patient.getPrescription()){
            
            if(checkDrugStock.checkStock(presOrder.getOrderDrug(), presOrder.getOrderQuantity())){
                patient.orders().addOrder(presOrder.getOrderDrug(), presOrder.getOrderQuantity());  
               
            }
            else{
                outOfStockArray.add(presOrder.getOrderDrug().getName() + ":  " + presOrder.getOrderQuantity() );
            }
        }
         
        if(outOfStockArray.size() > 1){
            outOfStockArray.forEach(o -> System.out.println(o));
        }else{
            System.out.println("All orders have been fullfilled");
        }
    }
    
}

