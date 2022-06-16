/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author joehague
 */
public class Patients {
    
    private static ArrayList<Patient> patientsList = new ArrayList<>();
   
    public Patients(){
      
//        Patient joe = new Patient("Joe","Hague","16 Taranto Hill, Ilchester, Yeovil, BA22 8JP","joehague86@gmail.com");
//        joe.setUpPrescription();
//      usersCollection.add(joe);
//      usersCollection.add(new Patient("Emily","Hague","17 Taranto Hill, Ilchester, Yeovil, BA22 8JP","emily_hague14@outlook.com"));
//      usersCollection.add(new Patient("Jack","Hague","18 Taranto Hill, Ilchester, Yeovil, BA22 8JP","jackhague86@gmail.com"));
//      usersCollection.add(new Patient("William","Hague","19 Taranto Hill, Ilchester, Yeovil, BA22 8JP","willhague86@gmail.com"));
//      usersCollection.add(new Patient("Tyler","Garner","20 Taranto Hill, Ilchester, Yeovil, BA22 8JP","tylergarner86@gmail.com"));
    }
    
    
    
    public static void addUser(Patient user) {
        patientsList.add(user); 

    }
    
    public static void allNames(){
        for(var item : patientsList){
            System.out.println(item.getName());
            //Tested Works
        }
    }
    
    public static Patient getPatient(String email){
        for(var patient :patientsList){
            if(patient.getEmail().equals(email)){
                return patient;
            }
        }
        return null;
    }
    
    public static ArrayList<Patient> returnAllPatients(){
        return patientsList;
    }
    
    
    public static void removePatient(String email){
          patientsList.removeIf(user -> user.getEmail().equals(email));
          //Tested works
    }
    
    
    
    
    
    
    
}
