/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.orders;

import HealthFirstPharmacy_Hague.medicines.Drug;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author joehague
 * 
 * Every patient has an associated instance of the Orders class which holds their orders of individual drug orders as prepared by the pharmacist
 */
public class Orders {
    
    private ArrayList<Order> orders;
    private BigDecimal amountDue;
    private Boolean paid;
    
    //Constructor
    public Orders(){
        this.orders = new ArrayList();
        this.amountDue = new BigDecimal(0);
        this.paid = false;
           
    };
    
    
    
    //Add order to the orders list
    public void addOrder(Drug drug, int qty){
        
        Order order = new Order(drug, qty, true); /* If 3rd property is true then stock will reduce from the inventory*/
        orders.add(order);
        amountDue = amountDue.add(order.getOrderPrice());
        System.out.println("TOTAL: "+ amountDue); 
    }
    
    
    
    //Remove an order from the Orders array
    public void removeOrder(Drug drug){
        
        for(Order order : orders){
            if (order.getOrderDrug().getName().equals(drug.getName())){
                amountDue.subtract(order.getOrderPrice());   
                drug.addStock(order.getOrderQuantity());  
            }
        }      
        orders.removeIf(order -> order.getOrderDrug().getName().equals(drug.getName()));   
    }
    
    
    
    //Return the total price of all orders in the Orders array
    public BigDecimal getTotalPrice(){
        System.out.println("Total order price: " + amountDue);
        
        return amountDue;
    }
    
    
    
    //Printrs out the order details for each order
    public void getAllOrders(){
        for(Order order : orders){
            order.getOrderDetails();
        }
    }
}
