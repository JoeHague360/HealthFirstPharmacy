/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthFirstPharmacy_Hague.main;

import HealthFirstPharmacy_Hague.GUI.LogInFrame;
import HealthFirstPharmacy_Hague.utilities.SetUp;

/**
 *
 * @author joehague
 */
public class Main {
    
    public static void main(String[] args){
        
        
        new SetUp();
        LogInFrame logIn = new LogInFrame();
        logIn.setVisible(true);
        logIn.setLocationRelativeTo(null);
//        new LogInFrame().setVisible(true);
        
        
    }
    
}
