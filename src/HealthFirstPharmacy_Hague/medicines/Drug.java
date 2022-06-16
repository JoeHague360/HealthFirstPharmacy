/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.medicines;


import java.util.UUID;

/**
 *
 * @author joehague
 */
public class Drug {
    
        private UUID id = UUID.randomUUID();
        private String name;
        private int stock, requiredStock = 100;
        private float price;

        
        
        
        public Drug(String name, int stock, float price){
            
            this.name = name;
            this.stock = stock;
            this.price = price;  
        }
        
        //Returns Stock level of drug
        public int getStock(){
            return stock;
        }
        
        //Returns total value of indivisual drug holdings
        public double getHoldingsTotalValue(){
            double total =  price * stock;
            return total;
        }
        
        //prints out the details of the drug
        public void getDetails(){
            System.out.println("We hold " + name + "  (£"+ price + ")  stock levels are " + stock);
        }
        
        //returns the price of the drug
        public float getPrice(){
            return price;
        }
        
        //get the amount required to replenish the stock to 100%
        public int getAmountDeficient(){
            return requiredStock - stock;
        }
        
        //Add stock of drug to quantity
        public void addStock(int incrementValue){
            stock += incrementValue;
        }
        
        //Reduce stock of drug
        public void subtractStock(Drug drug, int decrementValue){
            stock -= decrementValue;
        }
        
        //Return the nbame of the drug
        public String getName(){
            return name;
        }
}
