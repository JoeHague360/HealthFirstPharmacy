/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.session;


import HealthFirstPharmacy_Hague.users.User;
import HealthFirstPharmacy_Hague.users.UsersList;

/**
 *
 * @author joehague
 */
public class LogIn {
    private String u;
    private char[] p;
    
    public LogIn(String u, char[] p){
        this.p = p;
        this.u = u;
        
    }
    
    public void verify(){
        for(User user : UsersList.getUsers()){
            
            if(user.checkCredentials(u, p)){
                System.out.println(user.getName() + " logged In as " + user.getClass().getSimpleName());
                new Session(user);
                
            }
        }
        if (!Session.isLive()) System.out.println("No User with those credentils");
        
    }
    
    
}
