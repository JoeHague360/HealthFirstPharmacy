/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HealthFirstPharmacy_Hague.GUI;

import HealthFirstPharmacy_Hague.medicines.Inventory;
import HealthFirstPharmacy_Hague.session.LogIn;
import HealthFirstPharmacy_Hague.session.Session;
import HealthFirstPharmacy_Hague.users.Admin;
import HealthFirstPharmacy_Hague.users.Manager;
import HealthFirstPharmacy_Hague.users.Pharmacist;
import HealthFirstPharmacy_Hague.users.UsersList;
import HealthFirstPharmacy_Hague.utilities.SetUp;
import java.util.Arrays;

/**
 *
 * @author joehague
 */
public class LogInFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form mainFrame
     */
    public LogInFrame() {
        initComponents();
        
    
    }
    
    /**
     *
     */
    public void toggleLogin(){
        
        this.setVisible(!this.isVisible());
        this.setLocation(200,200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_logIn = new javax.swing.JPanel();
        label_userName = new javax.swing.JLabel();
        text_userName = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        text_password = new javax.swing.JPasswordField();
        button_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        label_userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_userName.setText("UserName");

        text_userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_password.setText("Password:");

        text_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        button_login.setText("Login");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_logInLayout = new javax.swing.GroupLayout(panel_logIn);
        panel_logIn.setLayout(panel_logInLayout);
        panel_logInLayout.setHorizontalGroup(
            panel_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logInLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logInLayout.createSequentialGroup()
                        .addGroup(panel_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_password, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(text_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(label_userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text_password)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logInLayout.createSequentialGroup()
                        .addComponent(button_login)
                        .addGap(82, 82, 82))))
        );
        panel_logInLayout.setVerticalGroup(
            panel_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logInLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_userName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_login)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(panel_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(panel_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        System.out.println(text_password.getPassword());
        
        
            
       new LogIn(text_userName.getText(),text_password.getPassword()).verify();
       if(!"".equals(Session.getCurrentUser().getName())){            
           
           this.setVisible(false);            
           MainFrame mainFrame = new MainFrame();
           mainFrame.setVisible(true);
           mainFrame.setExtendedState(MAXIMIZED_BOTH);
           
            
        }
    }//GEN-LAST:event_button_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_userName;
    private javax.swing.JPanel panel_logIn;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_userName;
    // End of variables declaration//GEN-END:variables
}
