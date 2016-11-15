package userInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Role.Admin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Enterprise.MusicEnterprise;
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateTable();
        populateCombo1();
    
        populateCombo3();
    }
    
    
    public void resetFields() {
            populateCombo1();
    
            populateCombo3();
            jTextField1.setText("");
            adminNameTextField.setText("");
            ssnTextField.setText("");
            emailText.setText("");
            userNameTextField.setText("");
            passwordTextField.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
    }
    
    public void populateCombo1() {
        jComboBox1.removeAllItems();
        for(Network n : business.getNetworkList()) {
            jComboBox1.addItem(n);
        }
        
    }
    
    
    
    public void populateCombo3() {
        jComboBox3.removeAllItems();
        for(int i=1;i<=100;i++) {
            jComboBox3.addItem(i);
        }
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
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseTable.getModel();

        model.setRowCount(0);
        for(Network network : business.getNetworkList()) {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(o.getName().equals("Admin")) {
                        AdminOrganization ao = (AdminOrganization)o;
                        for(UserAccount ua : ao.getUserAccountDirectory().getListOfUserAccounts()) {
                            Object[] row = new Object[3];
                            row[0] = network;
                            row[1] = enterprise.getName();
                            row[2] = ua.getUsername();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        adminNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ssnTextField = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        viewEnterpriseButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE ENTERPRISE");

        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Enterprise", "Admin User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTable);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Network Name");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Enterprise Name");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("Add Enterprise");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Admin Name");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("SSN");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Email ID");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("User Name");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Password");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("<<-- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        viewEnterpriseButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewEnterpriseButton.setText("Modify Enterprise Admin");
        viewEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEnterpriseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                            .addComponent(jButton2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adminNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1)
                        .addGap(122, 122, 122)
                        .addComponent(viewEnterpriseButton)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(adminNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel7)
                    .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(viewEnterpriseButton))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Network net = (Network) jComboBox1.getSelectedItem();
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.MusicSystem;
        if (net == null || type == null) {
            JOptionPane.showMessageDialog(null, "Network and Enterprise Type cannot be null!");
            return;
        }

        for(Network n : business.getNetworkList()) {
            if(n.getName().equals(String.valueOf(net))) {
                if(n.getEnterpriseDirectory().getEnterpriseList().size() >= 1) {
                    JOptionPane.showMessageDialog(null, "Multiple Enterprise for a single Network cannot be created!", "FAILURE", JOptionPane.PLAIN_MESSAGE);
                    return;
                }            
            }
        }
        
        String name = jTextField1.getText();
        String adminName = adminNameTextField.getText();
        String ssn = ssnTextField.getText();
        String email = emailText.getText();
        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();
        String age = String.valueOf(jComboBox3.getSelectedItem());
        int ageInt = Integer.parseInt(age);
        
        int flag = 0;
        int flag1 = 0;
        if(name.length()==0) {
            JOptionPane.showMessageDialog(null, "Enterprise Name cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
     
        if(flag == 0) {
            for(Network n : business.getNetworkList()) {
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if(e.getName().equals(name)) {
                        JOptionPane.showMessageDialog(null, "Enterprise with the same name already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
                        jTextField1.setBorder(BorderFactory.createLineBorder(Color.red));
                        flag=1;
                    }
                }
            }
        }
        
        if(flag == 0) {
            flag1=stringValidate(name);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Enterprise Name cannot contain special characters", "Failure", JOptionPane.PLAIN_MESSAGE);
                jTextField1.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
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
        double ssnInt = 0;
        if(flag == 0 && ssn.length()==0) {
            JOptionPane.showMessageDialog(null, "SSN cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
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
        
        
        if(flag == 0) {
            ssnInt = Double.parseDouble(ssn);
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
        
        if(flag == 0) {
            for(Network n : business.getNetworkList()) {
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        for(Employee emp : o.getEmployeeDirectory().getListOfEmployees()) {
                            if(email.equals(emp.getMailId()) || email.equals("gany.dakshin@gmail.com")) {
                                JOptionPane.showMessageDialog(null, "You cannot register with the provided mail ID. Mail ID already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
                                return;
                            }
                        }
                    }
                }
            }
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
        
        //Password Validator
        
        if(flag == 0 && password.length() == 0) {
            JOptionPane.showMessageDialog(null, "Password cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            passwordTextField.setBorder(BorderFactory.createLineBorder(Color.red));
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
            Enterprise createEnterprise = net.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            createEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.User);
            createEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
            createEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Manager);
            createEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Delivery);
            for(Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if(o.getName().equals("Admin")) {
                        AdminOrganization ao = (AdminOrganization)o;
                        Employee employee = ao.getEmployeeDirectory().createEmployee();
                        employee.setName(name);
                        employee.setAge(ageInt);
                        employee.setSsn(ssnInt);
                        employee.setGender(gender);
                        employee.setMailId(email);
                        UserAccount account = ao.getUserAccountDirectory().createUserAccount(userName, password, employee, new Admin());
                        account.setAdminFlag(1);
                    }
                }
            }
            
            populateTable();
            
            JOptionPane.showMessageDialog(null, "New Enterprise launched", "Success", JOptionPane.PLAIN_MESSAGE);
            resetFields();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEnterpriseButtonActionPerformed
        int rowSelected = enterpriseTable.getSelectedRow();
        if(rowSelected < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!", "FAILURE", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            Network n = (Network) enterpriseTable.getValueAt(rowSelected, 0);
            ViewEnterpriseJPanel vejp = new ViewEnterpriseJPanel(userProcessContainer, n, business,this);
            userProcessContainer.add("View Enterprise",vejp);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_viewEnterpriseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminNameTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailText;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JButton viewEnterpriseButton;
    // End of variables declaration//GEN-END:variables
}
