/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.users;

//import jdk.internal.vm.annotation.IntrinsicCandidate;

import java.util.Arrays;
import java.util.UUID;


/**
 *
 * @author joehague
 */
public class User {
    
    
    protected UUID id = UUID.randomUUID();
    protected String firstname,lastname, address, telephone,email,uname;
    protected char[] pw;
    private String role = this.getClass().getSimpleName();
    
    
    public String getName() { 
        return firstname + " " + lastname ;    
    }
    
    public UUID getID(){
        return id;
    }
    
     public String getRole(){
        return this.role;
    }

    public String getEmail() {
        return email;
    }
    
    public Boolean checkCredentials(String u, char[] p){
        
        if (Arrays.equals(p, this.pw)) {
            
            return true;
        } else {
            
            return false;
        }
        
    }
    
    
}
