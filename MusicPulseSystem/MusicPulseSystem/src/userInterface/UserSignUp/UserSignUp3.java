package userInterface.UserSignUp;

import Business.DB4O.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.UserOrganization;
import Business.Role.User;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserSignUp3 extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private String name;
    private String userName;
    private int ageInt;
    private String email;
    private String gender;
    private Network net;
    private int randomNumber;
    private OrganizationDirectory od;
    private JButton loginButton;
    private JButton logoutButton;
    private JButton signUpButton;
    private JButton cancelSignUp;
    private JTextField userNameText;
    private JPasswordField passField;
    private DB4OUtil db4OUtil;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private JLabel jLabel25;
    
    public UserSignUp3(JPanel userProcessContainer, EcoSystem business, String name, String userName, int ageInt, String email,String gender,Network net,int randomNumber,JButton loginButton, JButton logoutButton,JButton signUpButton,JButton cancelSignUp,JTextField userNameText,JPasswordField passField, DB4OUtil db4OUtil, String addressLine1, String addressLine2, String addressLine3, JLabel jLabel25) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business=business;
        this.name = name;
        this.userName = userName;
        this.ageInt = ageInt;
        this.email = email;
        this.gender = gender;
        this.net = net;
        this.randomNumber = randomNumber;
        this.loginButton = loginButton;
        this.logoutButton = logoutButton;
        this.signUpButton = signUpButton;
        this.cancelSignUp = cancelSignUp;
        this.userNameText = userNameText;
        this.passField = passField;
        this.db4OUtil = db4OUtil;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.jLabel25 = jLabel25;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER SIGN UP - PART 3");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD :");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIRM PASSWORD :");

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("MUSIC PULSE SYSTEM - DUBS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private int passwordValidator(String stringVal) {
        if(!stringVal.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")) {
            return 1;
        }
        else
            return 2;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pass1 = String.valueOf(passwordField.getPassword());
        String pass2 = String.valueOf(confirmPasswordField.getPassword());
        
        int flag = 0;
        int flag1 = 0;
        if(flag == 0 && pass1.length() == 0) {
            JOptionPane.showMessageDialog(null, "Password cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=passwordValidator(pass1);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Password restrictions \n 1. Length should be 6 to 20 characters long \n 2. Must contain atleast one Number \n 3. Must contain atleast one Upper-case character \n 4. Must contain atleast one Lower-case character \n 5. Must contain atleast one special character '@#$%'", "Failure", JOptionPane.PLAIN_MESSAGE);
                passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0 && pass2.length() == 0) {
            JOptionPane.showMessageDialog(null, "Confirm Password cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            confirmPasswordField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=passwordValidator(pass2);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Confirm Password restrictions \n 1. Length should be 6 to 20 characters long \n 2. Must contain atleast one Number \n 3. Must contain atleast one Upper-case character \n 4. Must contain atleast one Lower-case character \n 5. Must contain atleast one special character '@#$%'", "Failure", JOptionPane.PLAIN_MESSAGE);
                confirmPasswordField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0) {
            if(pass1.equals(pass2)) {
                for(Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if(o.getName().equals("User")) {
                            UserOrganization uo = (UserOrganization)o;
                            Employee emp = uo.getEmployeeDirectory().createEmployee();
                            emp.setName(name);
                            emp.setAge(ageInt);
                            emp.setMailId(email);
                            emp.setGender(gender);
                            emp.setAddressLine1(addressLine1);
                            emp.setAddressLine2(addressLine2);
                            emp.setZipCode(Integer.parseInt(addressLine3));
                            UserAccount ua = uo.getUserAccountDirectory().createUserAccount(userName, pass1, emp, new User());
                            ua.setAdminFlag(0);
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Thank you for Signing up with Music Pulse System - DUBS. \n Please login to the system to complete registration process.", "Success", JOptionPane.PLAIN_MESSAGE);
                userNameText.setEnabled(true);
                passField.setEnabled(true);
                signUpButton.setEnabled(true);
                logoutButton.setEnabled(false);
                loginButton.setEnabled(true);
                cancelSignUp.setEnabled(false);
                userNameText.setText("");
                passField.setText("");
                jLabel25.setVisible(true);
                db4OUtil.storeSystem(business);
                
                userProcessContainer.removeAll();
                JPanel blankJP = new JPanel();
                blankJP.setBackground(Color.black);
                userProcessContainer.add("blank", blankJP);
                CardLayout crdLyt = (CardLayout)userProcessContainer.getLayout();
                crdLyt.next(userProcessContainer);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Password provided do not match", "Failure", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
