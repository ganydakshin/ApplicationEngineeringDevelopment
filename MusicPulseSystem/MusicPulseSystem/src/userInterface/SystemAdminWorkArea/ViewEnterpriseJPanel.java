package userInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;
    private EcoSystem business;
    private ManageEnterpriseJPanel mejp1;
    
    public ViewEnterpriseJPanel(JPanel userProcessContainer, Network network, EcoSystem business,ManageEnterpriseJPanel mejp1) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.business = business;
        this.mejp1 = mejp1;
        populateFields();
        populateCombo();
    }
    
    public void populateCombo() {
        jComboBox3.removeAllItems();
        for(int i=1;i<=100;i++) {
            jComboBox3.addItem(i);
        }
    }
    
    public void resetFields() {
            populateCombo();
            adminNameTextField.setText("");
            ssnTextField.setText("");
            emailText.setText("");
            userNameTextField.setText("");
            passwordTextField.setText("");
    }
    
    public void populateFields() {
        networkName.setText(network.getName());
    }
    
    
    private int stringValidate(String stringVal) {
        if(!stringVal.matches("^[a-zA-Z ]*$")) {
            return 1;
        }
        else
            return 2;
    }
    
    private int stringValidate1(String stringVal) {
        if(!stringVal.matches("^[a-zA-Z0-9]*$")) {
            return 1;
        }
        else
            return 2;
    }
    
    private int passwordValidator(String stringVal) {
        if(!stringVal.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")) {
            return 1;
        }
        else
            return 2;
    }
    
    private int numberValidate(String numberVal) {
        if(!numberVal.matches("[0-9]+$"))
            return 1;
        else
            return 2;
    }
    
    public boolean validateEmailAddress(String mail) {
           String emailPattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(emailPattern);
           java.util.regex.Matcher match = pattern.matcher(mail);
           return match.matches();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adminNameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ssnTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        userNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        networkName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("VIEW ENTERPRISE PANEL");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Admin Name");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("SSN");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Email ID");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Password");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("User Name");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Age");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("Modify Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("<<-- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adminNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(networkName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adminNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 112, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String adminName = adminNameTextField.getText();
        String ssn = ssnTextField.getText();
        String email = emailText.getText();
        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();
        String age = String.valueOf(jComboBox3.getSelectedItem());
        int ageInt = Integer.parseInt(age);
        
        int flag = 0;
        int flag1 = 0;
        
        //Admin Name Validation
        
        if(flag == 0 && adminName.length()==0) {
            JOptionPane.showMessageDialog(null, "Admin Name cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            adminNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=stringValidate(adminName);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Admin Name cannot contain special characters", "Failure", JOptionPane.PLAIN_MESSAGE);
                adminNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        //Gender Validation
        
        if(flag == 0 && buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Please select Gender", "Failure", JOptionPane.PLAIN_MESSAGE);
            flag=1;
        }
        
        //SSN Validation
        
        if(flag == 0 && ssn.length()==0) {
            JOptionPane.showMessageDialog(null, "SSN cannot be null or greater than 10 digits", "Failure", JOptionPane.PLAIN_MESSAGE);
            ssnTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=numberValidate(ssn);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "SSN can contain only numbers", "Failure", JOptionPane.PLAIN_MESSAGE);
                ssnTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        
        double ssnInt = Double.parseDouble(ssn);
        
        for(Network n : business.getNetworkList()) {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                for(Employee emp : o.getEmployeeDirectory().getListOfEmployees()) {
                    if(emp.getSsn() == ssnInt || ssnInt == 20101990) {
                        JOptionPane.showMessageDialog(null, "SSN provided already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
                        ssnTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                        return;
                    }
                }    
                }
            }
        }
        
        //Email ID validation
        
        if(flag == 0 && email.length()==0) {
            JOptionPane.showMessageDialog(null, "Email cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            emailText.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if((!validateEmailAddress(email)) && flag == 0) {
            JOptionPane.showMessageDialog(null, "Invalid email address","Failure",JOptionPane.PLAIN_MESSAGE);
            emailText.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        //Username validation
        
        if(flag == 0 && userName.length()==0) {
            JOptionPane.showMessageDialog(null, "UserName cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0 && (userName.length() < 8 || userName.length() > 12)) {
            JOptionPane.showMessageDialog(null, "UserName should contain between 8 to 12 charcters", "Failure", JOptionPane.PLAIN_MESSAGE);
            userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=stringValidate1(userName);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "User Name cannot contain special characters", "Failure", JOptionPane.PLAIN_MESSAGE);
                userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0 && userName.equals("sysadmin")) {
            JOptionPane.showMessageDialog(null, "User Name already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
            userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            for(Network n : business.getNetworkList()) {
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        for(UserAccount ua : o.getUserAccountDirectory().getListOfUserAccounts()) {
                        if(ua.getUsername().equals(userName)) {
                            JOptionPane.showMessageDialog(null, "User Name already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
                            userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                            flag=1;
                            return;
                        }
                        }    
                    }
                }
            }
        }
        
//        if(flag == 0) {
//            for(Network n : business.getNetworkList()) {
//                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                    for(UserAccount ua : e.getUserAccountDirectory().getListOfUserAccounts()) {
//                        if(ua.equals(userName)) {
//                            JOptionPane.showMessageDialog(null, "User Name already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
//                            userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
//                            flag=1;
//                            return;
//                        }
//                    }
//                }
//            }
//        }
        
        //Password Validator
        
        if(flag == 0 && password.length() == 0) {
            JOptionPane.showMessageDialog(null, "Password cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=passwordValidator(password);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Password restrictions \n 1. Length should be 6 to 20 characters long \n 2. Must contain atleast one Number \n 3. Must contain atleast one Upper-case character \n 4. Must contain atleast one Lower-case character \n 5. Must contain atleast one special character '@#$%'", "Failure", JOptionPane.PLAIN_MESSAGE);
                passwordTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0) {
            String gender = null;
            if(jRadioButton1.isSelected() == true) {
                gender = "Male";
            }
            else {
                gender = "Female";
            }
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if(o.getName().equals("Admin")) {
                        AdminOrganization ao = (AdminOrganization) o;
                        for(UserAccount ua : ao.getUserAccountDirectory().getListOfUserAccounts()) {
                            Employee emp = ua.getEmployee();
                            ua.setUsername(userName);
                            ua.setPassword(password);
                            emp.setName(adminName);
                            emp.setAge(ageInt);
                            emp.setGender(gender);
                            emp.setSsn(ssnInt);
                        }
                    }
                }
                    
            }
            JOptionPane.showMessageDialog(null, "New Admin Appointed!", "Success", JOptionPane.PLAIN_MESSAGE);
            resetFields();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mejp1.populateTable();
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminNameTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel networkName;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
