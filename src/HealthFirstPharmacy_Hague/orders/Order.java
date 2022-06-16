/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.orders;

import HealthFirstPharmacy_Hague.medicines.Drug;
import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.UUID;


/**
 *
 * @author joehague
 */
public class Order {
    
    public final UUID id;
    private int quantity;
    private Drug drug;
    private BigDecimal price;
    
    //Constructor
    public Order(Drug drug, int quantity, Boolean reduceStock){
            this.id = UUID.randomUUID();
            this.quantity = quantity;
            this.drug = drug;
            this.price = new BigDecimal(drug.getPrice() * quantity).setScale(2,RoundingMode.HALF_UP)  ;
            if(reduceStock){drug.subtractStock(drug, quantity);}
            if(reduceStock)System.out.println("Order for " + this.quantity + " " +  drug.getName() + " is " + this.price);
            
            
            
        }
    
    //Cancel the order and add stock back to the inventory
    public void cancelOrder(){
        drug.addStock(quantity);   
    }
    
    //return the total order price
    public BigDecimal getOrderPrice(){    
        return price;    
    }
    
    //return the order quantity
    public int getOrderQuantity(){
        return this.quantity;
    }
    
    //return the drug being ordered
    public Drug getOrderDrug(){
        return drug;
    }
    
    //print out the order details
    public void getOrderDetails(){
        System.out.println(this.drug.getName() + ",  " + this.price);
    }
    
    
    
    
}
