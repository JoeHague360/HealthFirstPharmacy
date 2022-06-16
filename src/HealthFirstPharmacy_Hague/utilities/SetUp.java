/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.utilities;

import HealthFirstPharmacy_Hague.medicines.Inventory;
import HealthFirstPharmacy_Hague.users.Admin;
import HealthFirstPharmacy_Hague.users.Manager;
import HealthFirstPharmacy_Hague.users.Pharmacist;
import HealthFirstPharmacy_Hague.users.UsersList;

/**
 *
 * @author joehague
 */
public class SetUp {
    
    public SetUp(){
        Inventory inventory = new Inventory();
        Admin admin = new Admin("Emily", "Hague", "16 Taranto Hill", "emilyhague@healthfirstpharmacy.com",25000f,"Emily",new char[]{'E','m','i','l','y','1'});
        UsersList.addUser(admin);
        admin.createPatient("Joe", "Hague", "joehague890@mod.gov.uk", "16 Taranto Hill","Joe",new char[]{'J','o','e','1'}).setUpPrescription();
        Manager manager = admin.createManager("William", "Hague", "william@healthfirstpharmacy.com", "Wills address", 49500f,"William",new char[]{'J','o','e','1'});
        Pharmacist pharmacist = admin.createPharmacist("Tyler", "Garner", "tyler@healthfirstpharmacy.com", "Tylers address", 70500f,"Tyler",new char[]{'J','o','e','1'});
        Pharmacist pharmacist2 = admin.createPharmacist("Jack", "Hague", "jack@healthfirstpharmacy", "17 Teafhrjh road", 60000.00f,"Jack", new char[]{'J','o','e','1'});
        inventory.getHoldingsValue();
    }
    
    
}
