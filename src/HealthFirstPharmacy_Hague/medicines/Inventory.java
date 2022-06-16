/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.medicines;



import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author joehague
 */
public class Inventory {
    
    public static ArrayList<Drug> inventory;
    public static DefaultListModel<String> listModel;
    public static DefaultTableModel model;
    
    
    
    public Inventory(){
        
        //intatiate new drugs
        Inventory.inventory =  new ArrayList();
        Drug Calpol = new Drug("Calpol",100,5.99f);
        Drug Antibiotics = new Drug("Antibiotics",100,10.99f);
        Drug Hayfever = new Drug("Hayfever Tablets",100,18.99f);
        Drug Paracetemol = new Drug("Paracetemol",100,11.99f);
        Drug Amoxycillin = new Drug("Amoxycillin",100,15.99f);
        Drug Anadin = new Drug("Anadin Extra",100,1.99f);
        Drug HRT = new Drug("HRT",100,12.99f);

        //Add drugs to the inventory
        inventory.add(Calpol);
        inventory.add(Antibiotics);
        inventory.add(Hayfever);
        inventory.add(Paracetemol);
        inventory.add(Amoxycillin);
        inventory.add(Anadin);
        inventory.add(HRT);
        Inventory.listModel = new DefaultListModel<>();
        inventory.forEach(d -> listModel.addElement(d.getName()));
    }
    
    
    //Put an order back into inventory stock
    public static void replaceOrder(Drug drug , int quantity){
        for(Drug d : inventory){
            if(d.getName().equals(drug.getName())){
                d.addStock(quantity);
                
            }
            
        }
    }
    
    //get the total value of entire inventory holdings
    public void getHoldingsValue(){
        double total = 0.00d;
        for(Drug drug : inventory){
            total += drug.getHoldingsTotalValue();
        }
        System.out.println("£"+total);
    }
    
    public static DefaultTableModel  getInventoryTableModel(){
        
        model = new DefaultTableModel(new String[] {"Product Name","Holdings","deficient","Price","Total Value of Holdings"},0);
        for(Drug drug : inventory){
            model.addRow(new Object[]{drug.getName(),drug.getStock(),drug.getAmountDeficient(),"£" + drug.getPrice(),"£" + drug.getHoldingsTotalValue()});
        }
        return model;
    }
    
    public static DefaultTableModel  getInventoryBasicList(){
        
        model = new DefaultTableModel(new String[] {"Product Name","Holdings","deficient"},0);
        for(Drug drug : inventory){
            model.addRow(new Object[]{drug.getName(),drug.getStock(),drug.getAmountDeficient()});
        }
        return model;
    }
    
    
    public static void addDrugs(Drug drug){
        int count = 0;
        listModel.clear();
        //Check to see if the drug exists in the inventory list
        for(Drug d : inventory){
            
            //listModel.addElement(d.getName());
            if(d.getName().equals(drug.getName())){
                d.addStock(drug.getStock());
                count += 1;
            }  
        }
        
        if(count == 0){
            inventory.add(drug);
        }
        inventory.forEach(d -> listModel.addElement(d.getName()));
    }
    
    // list all the inventory **Currently only prints out**
    public void getInventory(){
       inventory.forEach(d -> d.getDetails());
    }
    
    //returns a drug object based from string "drugName"
    public static Drug getDrug(String drugName){
        for(Drug drug : inventory){
            if(drug.getName().equals(drugName)){
                return drug;
            }
        }
        return null;
    }
    
    //Returns an String[] of all the inventory drug names
    public static ListModel returnArrayOfNames(){
        listModel.clear();
        inventory.forEach(d -> listModel.addElement(d.getName()));
        
        return listModel;
    }
    
    
    
    
        
    
    
    

    
    
   
}
