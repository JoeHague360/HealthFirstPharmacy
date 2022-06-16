/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.utilities;

import HealthFirstPharmacy_Hague.medicines.Drug;
import HealthFirstPharmacy_Hague.medicines.Inventory;

/**
 *
 * @author joehague
 */
public class checkDrugStock {
    
    public static Boolean checkStock(Drug drugToCheck, int quantity){
        for(Drug drug : Inventory.inventory){
            if (drug.getName().equals(drug.getName())){
                if(drug.getStock() > quantity){
                    return true;
                }
                
            }
        }
        return false;
    }
    
}
