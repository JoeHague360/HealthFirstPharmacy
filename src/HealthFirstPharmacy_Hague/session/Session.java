/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.session;
import HealthFirstPharmacy_Hague.users.User;
import java.time.LocalDateTime;

/**
 *
 * @author joehague
 */
public class Session implements Runnable{
    
    private Boolean isPharmacist = false;
    private Boolean isManager  = false;
    private Boolean isPatient = false;
    private Boolean isAdmin  = false;
    private LocalDateTime sessionStart, sessionEnd;
    private static User currentUser;
    private static boolean isRunning;
    
    
    public  Session(User user){
        switch(user.getClass().getSimpleName()){
            
            case "Pharmacist":
                isPharmacist = true;
                break;
                
            case "Manager":
                isManager = true;
                break;
                
            case "Admin":
                isAdmin = true;
                break;
                
            case "Patient":
                isPatient = true;
                break;
                
            default:
                
        }
        
        this.sessionStart = LocalDateTime.now();
        this.sessionEnd = sessionStart.plusMinutes(15);
        currentUser = user;
        Thread t = new Thread(this);
        isRunning = true;
        t.start();
        
    }
    
//    public static void reset(){
//        Session.
//    }
    
    public static Boolean isLive(){
        return isRunning;
    }
    
    public static User getCurrentUser(){
        return currentUser;
    }
    
    
    @Override
    public void run(){
        //Some running multi-thead goodness
        while(sessionStart.isBefore(sessionEnd)){
            
        }
        System.out.println("Stopped Running");
        isRunning = false;
        sessionStart = null;
        sessionEnd = null;
        currentUser = null;     
    }
}


    
    
    
    
//    public Session(User user, LocalDateTime now){
//        this.currentUser = user;
//        this.sessionEndDate = now.plusSeconds(5);
//        this.running = false;
//    }
//    
//    @Override
//    public void run(){
//        while(LocalDateTime.now().isBefore(sessionEndDate)){
//            
//        }
//        System.out.println("Stopped Running");
//    }
//    
//}