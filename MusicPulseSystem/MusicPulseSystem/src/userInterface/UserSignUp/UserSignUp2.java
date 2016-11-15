package userInterface.UserSignUp;

import Business.DB4O.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserSignUp2 extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private String name;
    private String userName;
    private int ageInt;
    private String email;
    private String gender;
    private Network net;
    private int randomNumber;
    private JButton loginButton;
    private JButton logoutButton;
    private JButton signUpButton;
    private JButton cancelSignUp;
    private JTextField userNameText;
    private JPasswordField passwordField;
    private DB4OUtil db4OUtil;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private JLabel jLabel25;
    
    public UserSignUp2(JPanel userProcessContainer, EcoSystem business, String name, String userName, int ageInt, String email,String gender,Network net,int randomNumber,JButton loginButton, JButton logoutButton,JButton signUpButton,JButton cancelSignUp,JTextField userNameText,JPasswordField passwordField, DB4OUtil db4OUtil, String addressLine1, String addressLine2, String addressLine3, JLabel jLabel25) {
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
        this.passwordField = passwordField;
        this.db4OUtil = db4OUtil;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.jLabel25 = jLabel25;
    }
    
    private int numberValidate(String numberVal) {
        if(!numberVal.matches("[0-9]+$"))
            return 1;
        else
            return 2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        confirmationCodeText = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("MUSIC PULSE SYSTEM - DUBS");

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER SIGN UP - PART 2");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONFIRMATION CODE");

        nextButton.setBackground(new java.awt.Color(0, 0, 204));
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("NEXT -->>");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
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
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmationCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(nextButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmationCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addContainerGap(337, Short.MAX_VALUE))
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

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        String confirm = confirmationCodeText.getText();
        
        int flag = 0;
        int flag1= 0;
        if(confirm.length()==0 || confirm.length() > 6) {
            JOptionPane.showMessageDialog(null, "Confirmation Code cannot be null or greater than 6 digits", "Failure", JOptionPane.PLAIN_MESSAGE);
            confirmationCodeText.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=numberValidate(confirm);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Confirmation Code can contain only numbers", "Failure", JOptionPane.PLAIN_MESSAGE);
                confirmationCodeText.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        int confirmInt = Integer.parseInt(confirm);
        
        if(confirmInt == randomNumber) {
        //if(confirmInt == 1234) {
            flag = 0;
        }
        else {
            flag=1;
            JOptionPane.showMessageDialog(null, "Confirmation Code does not match with the sent Code", "Failure", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        if(flag == 0) {
            UserSignUp3 usu3 = new UserSignUp3(userProcessContainer, business, name, userName, ageInt, email,gender,net,randomNumber,loginButton,logoutButton,signUpButton,cancelSignUp,userNameText,passwordField,db4OUtil, addressLine1, addressLine2, addressLine3, jLabel25);
            userProcessContainer.add("UserSignUp3",usu3);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        }
        
        
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmationCodeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
