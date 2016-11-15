package userInterface.UserSignUp;

import Business.DB4O.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ForgotPasswordJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private JButton loginButton;
    private JButton logoutButton;
    private JButton signUpButton;
    private JButton cancelSignUp;
    private JTextField userNameText;
    private JPasswordField passwordField;
    private JLabel jLabel25;
    private DB4OUtil db4OUtil;
    private EcoSystem business;
    private int randomNumber;

    public ForgotPasswordJPanel(EcoSystem business, JPanel userProcessContainer, JButton loginButton, JButton logoutButton, JButton signUpButton, JButton cancelSignUp, JTextField userNameText, JPasswordField passwordField, DB4OUtil db40Util, JLabel jLabel25) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.loginButton = loginButton;
        this.logoutButton = logoutButton;
        this.signUpButton = signUpButton;
        this.cancelSignUp = cancelSignUp;
        this.userNameText = userNameText;
        this.passwordField = passwordField;
        this.db4OUtil = db40Util;
        this.jLabel25 = jLabel25;
        jLabel3.setVisible(false);
        jTextField3.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("MUSIC PULSE SYSTEM - DUBS");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("FORGOT PASSWORD");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL ID :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REQUEST CONFIRMATION CODE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIRMATION CODE :");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CHANGE PASSWORD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD :");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RE-ENTER PASSWORD :");

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(jTextField2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(jTextField1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(44, 44, 44)
                                    .addComponent(jTextField3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton3)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    public int sendFromGMail(String recipient, String bodyContent) {
        String to = recipient;
       //String subject = subjectjTextField.getText();
        //String messageToSender = messagejTextArea.getText();

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("donotreplydubs@gmail.com", "ganydakshin");
                    }

                }
        );

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("donotreplydubs@gmail.com"));
            
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            
            message.setSubject("Music Pulse System - DUBS");

            try {
                message.setText(bodyContent);
                Transport.send(message);

                return 1;

            } catch (AddressException e) {
                JOptionPane.showMessageDialog(null, "It appears that your email address id not valid");
                return 2;
            }

            //message.setText(messageToSender);
            // Transport.send(message);
            // JOptionPane.showMessageDialog(null, "Message successfully sent");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return 2;
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String userName = jTextField1.getText();
        String email = jTextField2.getText();
        int flag = 0;
        if (userName.length() == 0 || email.length() == 0) {
            JOptionPane.showMessageDialog(null, "Username and Email ID cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            flag = 1;
        }
        int flag3 = 0;
        if (flag == 0) 
        {
            for (Network n : business.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equals(Organization.Type.User.getValue())) {
                            for (UserAccount ua : o.getUserAccountDirectory().getListOfUserAccounts()) {
                                String uaMail = ua.getEmployee().getMailId();
                                String uaUserName = ua.getUsername();
                                if (uaMail.equals(email) && uaUserName.equals(userName)) {
                                    flag3 = 1;
                                    String to = email; // list of recipient email addresses
                                    //String subject = "Music Pulse System - DUBS Confirmation Code";
                                    Random rnd = new Random();
                                    randomNumber = 100000 + rnd.nextInt(900000);
                                    String randomNumber2 = String.valueOf(randomNumber);
                                    String content = "Thank you for using Music Pulse System - DUBS. Your Confirmation code is ";

                                    String body = content + randomNumber2;

                                    int flag2 = sendFromGMail(to, body);
                                    if (flag2 == 2) {
                                        JOptionPane.showMessageDialog(null, "Email could not be sent to the specified email ID! Please try again", "Failure", JOptionPane.PLAIN_MESSAGE);
                                        flag = 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (flag3 == 0) {
            JOptionPane.showMessageDialog(null, "Invalid UserName or Password", "Failure", JOptionPane.PLAIN_MESSAGE);
            return;
        } 
        else if(flag == 0 && flag3 == 1 ){
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(false);
            jButton1.setEnabled(false);
            jButton2.setVisible(true);
            jTextField3.setVisible(true);
            jLabel3.setVisible(true);
            JOptionPane.showMessageDialog(null, "Confirmation Code has been sent to the specified email ID.", "Success", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private int numberValidate(String numberVal) {
        if (!numberVal.matches("[0-9]+$")) {
            return 1;
        } else {
            return 2;
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String confirmationCode = jTextField3.getText();
        int flag = 0;
        int flag1 = 0;
        if (confirmationCode.length() == 0 || confirmationCode.length() > 6) {
            JOptionPane.showMessageDialog(null, "Confirmation Code cannot be null or cannot be greater than 6 digits", "Failure", JOptionPane.PLAIN_MESSAGE);
            flag = 1;
        }

        if (flag == 0) {
            flag1 = numberValidate(confirmationCode);
            if (flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Confirmation Code can contain only numbers", "Failure", JOptionPane.PLAIN_MESSAGE);
                flag = 1;
            }
        }
        if (flag == 0) {
            int cnfrmCode = Integer.parseInt(confirmationCode);
            if (randomNumber == cnfrmCode) {
                jButton2.setEnabled(false);
                jTextField3.setEnabled(false);
                jLabel3.setEnabled(false);
                jPasswordField1.setVisible(true);
                jPasswordField2.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jButton3.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Confirmation Code", "Failure", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pass1 = String.valueOf(jPasswordField1.getPassword());
        String pass2 = String.valueOf(jPasswordField2.getPassword());

        int flag = 0;
        int flag1 = 0;
        if (flag == 0 && pass1.length() == 0) {
            JOptionPane.showMessageDialog(null, "Password cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = 1;
        }

        if (flag == 0) {
            flag1 = passwordValidator(pass1);
            if (flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Password restrictions \n 1. Length should be 6 to 20 characters long \n 2. Must contain atleast one Number \n 3. Must contain atleast one Upper-case character \n 4. Must contain atleast one Lower-case character \n 5. Must contain atleast one special character '@#$%'", "Failure", JOptionPane.PLAIN_MESSAGE);
                passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag = 1;
            }
        }

        if (flag == 0 && pass2.length() == 0) {
            JOptionPane.showMessageDialog(null, "Confirm Password cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);

            flag = 1;
        }

        if (flag == 0) {
            flag1 = passwordValidator(pass2);
            if (flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Confirm Password restrictions \n 1. Length should be 6 to 20 characters long \n 2. Must contain atleast one Number \n 3. Must contain atleast one Upper-case character \n 4. Must contain atleast one Lower-case character \n 5. Must contain atleast one special character '@#$%'", "Failure", JOptionPane.PLAIN_MESSAGE);

                flag = 1;
            }
        }

        if (flag == 0) {
            for (Network n : business.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equals(Organization.Type.User.getValue())) {
                            for (UserAccount ua : o.getUserAccountDirectory().getListOfUserAccounts()) {
                                if (ua.getUsername().equals(jTextField1.getText())) {
                                    ua.setPassword(pass1);
                                    JOptionPane.showMessageDialog(null, "Password Changed successfully", "Success", JOptionPane.PLAIN_MESSAGE);
                                    userNameText.setEnabled(true);
                                    passwordField.setEnabled(true);
                                    signUpButton.setEnabled(true);
                                    logoutButton.setEnabled(false);
                                    loginButton.setEnabled(true);
                                    cancelSignUp.setEnabled(false);
                                    userNameText.setText("");
                                    passwordField.setText("");
                                    jLabel25.setVisible(true);
                                    db4OUtil.storeSystem(business);
                                    userProcessContainer.removeAll();
                                    JPanel blankJP = new JPanel();
                                    blankJP.setBackground(Color.black);
                                    userProcessContainer.add("blank", blankJP);
                                    CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
                                    crdLyt.next(userProcessContainer);
                                }
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private int passwordValidator(String stringVal) {
        if (!stringVal.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")) {
            return 1;
        } else {
            return 2;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
