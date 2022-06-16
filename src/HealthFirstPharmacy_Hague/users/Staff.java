/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

import java.util.UUID;

/**
 *
 * @author joehague
 */
public class Staff extends User {
    
    private double salary;
    private UUID employeeNumber = UUID.randomUUID();
    
    
//    Staff(double salary){
//        this.salary = salary;
//    }
    
    public void pay(){
        double monthlyPay = salary/12;
        System.out.println(this.firstname + " " + this.lastname + " has been paid £" + monthlyPay );
    }
    
   
    
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public UUID getID(){
        return employeeNumber;
    }
    
}
