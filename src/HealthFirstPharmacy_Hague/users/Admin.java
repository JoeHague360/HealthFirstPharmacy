/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

/**
 *
 * @author joehague
 */
public class Admin extends Staff {
    
    public Admin(String firstName, String lastName, String address, String email, float salary, String uname, char[] pw) {
        this.firstname = firstName;
        this.lastname= lastName;
        this.address = address;
        this.email = email;
        this.pw = pw;
        this.uname = uname;
        this.setSalary(salary);
        
    }
    
    public Patient createPatient(String firstName, String lastName, String email, String address , String uname, char[] pw){
        
        Patient patient = new Patient(firstName, lastName,address, email, uname, pw);
        Patients.addUser(patient);
        UsersList.addUser(patient);
        return patient;
    }
    
    public Manager createManager(String firstName, String lastName, String email, String address, float salary, String uname, char[] pw){
        Manager manager = new Manager(firstName, lastName,address, email, salary, uname, pw);
        UsersList.addUser(manager);
        return manager;
    }
    
    
    public Admin createAdmin(String firstName, String lastName, String email, String address, float salary, String uname, char[] pw){
        Admin admin = new Admin(firstName, lastName,address, email, salary,uname,pw);
        UsersList.addUser(admin);
        return admin;
    }
    
    public Pharmacist createPharmacist(String firstName, String lastName, String email, String address, float salary, String uname, char[] pw){
        Pharmacist pharmacist = new Pharmacist(firstName, lastName,address, email, salary, uname, pw);
        UsersList.addUser(pharmacist);
        return pharmacist;
    }
}
