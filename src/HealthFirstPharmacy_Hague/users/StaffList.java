/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

import java.util.ArrayList;

/**
 *
 * @author joehague
 */
public class StaffList {
    
    private static ArrayList<Staff> staffList = new ArrayList<>();
    
    public static void addStaff(Staff staff){
        staffList.add(staff);
    }
    
    public static void removeStaff(Staff staff){
        staffList.removeIf(s -> s.getID().equals(staff.getID()));
    }
    
    public static void listAllStaff(){
        staffList.forEach(s -> s.getName());
    }
    
}
