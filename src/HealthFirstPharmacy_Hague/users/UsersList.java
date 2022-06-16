/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

/**
 *
 * @author joehague
 */
import HealthFirstPharmacy_Hague.medicines.Drug;
import static HealthFirstPharmacy_Hague.medicines.Inventory.inventory;
import static HealthFirstPharmacy_Hague.medicines.Inventory.model;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joehague
 */
public class UsersList {
    
    public static ArrayList<User> usersList = new ArrayList<>();
    
    public static void addUser(User staff){
        usersList.add(staff);
    }
    
    public static void removeUser(User staff){
        usersList.removeIf(s -> s.getEmail().equals(staff.getEmail()));
    }
    
    public static DefaultTableModel  getStaffList(){
        
        model = new DefaultTableModel(new String[] {"Name","Role","Email"},0);
        for(User user : usersList){
            if(!user.getRole().equals("Patient"))
            model.addRow(new Object[]{user.getName(),user.getRole(),user.getEmail()});
        }
        return model;
    }
    
    //listAllUsers() not annotated in the class diagram as not essential but
    //was good for testing.
    public static void listAllUsers(){
        usersList.forEach(s -> s.getName());
    }
    
    public static ArrayList<User> getUsers(){
        return usersList;
    }
    
    public static void addPerson(String firstName, String lastName, String email, String address, float salary, String uname, char[] pw, String subClass){
        switch (subClass) {
            case "Patient":
                Patient patient = new Patient(firstName, lastName,address, email, uname, pw);
                Patients.addUser(patient);
                UsersList.addUser(patient);
                break;
            case "Admin":
                 Admin admin = new Admin(firstName, lastName,address, email, salary,uname,pw);
                 UsersList.addUser(admin);
                 break;
            case "Manager":
                Manager manager = new Manager(firstName, lastName,address, email, salary, uname, pw);
                UsersList.addUser(manager);
                break;
            case "Pharmacist":
                Pharmacist pharmacist = new Pharmacist(firstName, lastName,address, email, salary, uname, pw);
                UsersList.addUser(pharmacist);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
