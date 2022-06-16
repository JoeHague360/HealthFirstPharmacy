/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

/**
 *
 * @author joehague
 */
public class Manager extends Staff {

    public Manager(String firstName, String lastName, String address, String email, float salary, String uname, char[] pw ) {
        this.firstname = firstName;
        this.lastname= lastName;
        this.address = address;
        this.email = email;  
        this.pw = pw;
        this.uname = uname;
        this.setSalary(salary);
        
        
    }
    
}
