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

public class UserSignUp1 extends javax.swing.JPanel {

    private String name;
    private int age;
    private String gender;
    private String email;
    private String userName;
    private String country;
    private EcoSystem business;
    private JPanel userProcessContainer;
    private JButton loginButton;
    private JButton logoutButton;
    private JButton signUpButton;
    private JButton cancelSignUp;
    private JTextField userNameText;
    private JPasswordField passwordField;
    private JLabel jLabel25;
    private DB4OUtil db4OUtil;
    
    public UserSignUp1(EcoSystem business, JPanel userProcessContainer,JButton loginButton, JButton logoutButton,JButton signUpButton,JButton cancelSignUp,JTextField userNameText,JPasswordField passwordField, DB4OUtil db40Util, JLabel jLabel25) {
        initComponents();
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        this.loginButton = loginButton;
        this.logoutButton = logoutButton;
        this.signUpButton = signUpButton;
        this.cancelSignUp = cancelSignUp;
        this.userNameText = userNameText;
        this.passwordField = passwordField;
        this.db4OUtil = db40Util;
        this.jLabel25 = jLabel25;
        populateCombo();
        populateComboCountry();
        populateComboEnterprise();
        
    }
    
    public void populateCombo() {
        ageCombo.removeAllItems();
        for(int i=1;i<=100;i++) {
            ageCombo.addItem(i);
        }
    }
    
    public void populateComboEnterprise() {
        jComboBox2.removeAllItems();
        for(Enterprise.EnterpriseType e : Enterprise.EnterpriseType.values()) {
            jComboBox2.addItem(e);
        }
    }
    
    public void populateComboCountry() {
        jComboBox1.removeAllItems();
        for(Network n : business.getNetworkList()) {
            jComboBox1.addItem(n);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        mailTextField = new javax.swing.JTextField();
        ageCombo = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        nextButton = new javax.swing.JButton();
        errorPromptLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        errorPromptLabel1 = new javax.swing.JLabel();
        errorPromptLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mailTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mailTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mailTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW USER SIGN UP");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age :");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender :");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pref User Name :");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email ID :");

        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyReleased(evt);
            }
        });

        userNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameTextFieldFocusLost(evt);
            }
        });
        userNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userNameTextFieldKeyReleased(evt);
            }
        });

        mailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailTextFieldFocusLost(evt);
            }
        });
        mailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextFieldKeyReleased(evt);
            }
        });

        ageCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ageCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Network :");

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nextButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        nextButton.setText("NEXT >>");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        errorPromptLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        errorPromptLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("MUSIC PULSE SYSTEM - DUBS");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enterprise Type :");

        jComboBox2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        errorPromptLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        errorPromptLabel1.setForeground(new java.awt.Color(255, 0, 0));

        errorPromptLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        errorPromptLabel2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address Line 1 :");

        mailTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailTextField1FocusLost(evt);
            }
        });
        mailTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextField1KeyReleased(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address Line 2 :");

        mailTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailTextField2FocusLost(evt);
            }
        });
        mailTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextField2KeyReleased(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Zip Code :");

        mailTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailTextField3FocusLost(evt);
            }
        });
        mailTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextField3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(nextButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(200, 200, 200)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mailTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(mailTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(errorPromptLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mailTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorPromptLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorPromptLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel5)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorPromptLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mailTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(mailTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addContainerGap(31, Short.MAX_VALUE))
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
                
                }
                catch(AddressException e) {
                    JOptionPane.showMessageDialog(null, "It appears that your email address id not valid");
                    return 2;
                }
            
            //message.setText(messageToSender);
            
            // Transport.send(message);
            
            // JOptionPane.showMessageDialog(null, "Message successfully sent");
            
            
        } catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return 2;
        }
    }
   

    
    
    
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        String name = nameTextField.getText();
        String userName = userNameTextField.getText();
        String email = mailTextField.getText();
        String addressLine1 = mailTextField1.getText();
        String addressLine2 = mailTextField2.getText();
        String addressLine3 = mailTextField3.getText();
        String age = String.valueOf(ageCombo.getSelectedItem());
        int ageInt = Integer.parseInt(age);
        int randomNumber = 0;
        int flag = 0;
        int flag1 = 0;
        if(name.length()==0) {
            JOptionPane.showMessageDialog(null, "Name cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            nameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=stringValidate(name);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Name cannot contain special characters", "Failure", JOptionPane.PLAIN_MESSAGE);
                nameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0) {
            if(name.equals(" ")) {
                JOptionPane.showMessageDialog(null, "Name cannot be a space character", "Failure", JOptionPane.PLAIN_MESSAGE);
                nameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        //Gender Validation
        
        if(flag == 0 && buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Please select Gender", "Failure", JOptionPane.PLAIN_MESSAGE);
            flag=1;
        }
        
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
                    for(UserAccount ua : e.getUserAccountDirectory().getListOfUserAccounts()) {
                        if(ua.equals(userName)) {
                            JOptionPane.showMessageDialog(null, "User Name already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
                            userNameTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                            flag=1;
                            return;
                        }
                    }
                }
            }
        }
        
        if(flag == 0 && email.length()==0) {
            JOptionPane.showMessageDialog(null, "Email cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            mailTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
    
        
        
        if((!validateEmailAddress(email)) && flag == 0) {
            JOptionPane.showMessageDialog(null, "Invalid email address","Failure",JOptionPane.PLAIN_MESSAGE);
            mailTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }

        if(flag == 0) {
            for(Network n : business.getNetworkList()) {
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if(o.getName().equals(Organization.Type.User)) {
                            for(UserAccount ua : o.getUserAccountDirectory().getListOfUserAccounts()) {
                                if(ua.getEmployee().getMailId().equals(email)) {
                                    JOptionPane.showMessageDialog(null, "The provided mail ID is already present in the system. Please try to log in to system", "Failure", JOptionPane.PLAIN_MESSAGE);
                                    mailTextField.setBorder(BorderFactory.createLineBorder(Color.red));
                                    flag=1;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if(flag ==0 && addressLine1.length() == 0) {
            JOptionPane.showMessageDialog(null, "Address Line1 cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            mailTextField1.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = 1;
        } 
        
        if(flag == 0 && addressLine2.length() == 0) {
            JOptionPane.showMessageDialog(null, "Address Line2 cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            mailTextField2.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = 1;
        }
        
        if(flag == 0 && addressLine3.length() == 0) {
            JOptionPane.showMessageDialog(null, "Zip Code cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            mailTextField3.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = 1;
        }
        
        if(flag == 0 && addressLine3.length() > 5) {
            JOptionPane.showMessageDialog(null, "Zip Code cannot have more than 5 digits", "Failure", JOptionPane.PLAIN_MESSAGE);
            mailTextField3.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = 1;
        }
        
        if(flag == 0) {
            flag1 = numberValidate(addressLine3);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Zip Code can contain only numbers", "Failure", JOptionPane.PLAIN_MESSAGE);
                mailTextField3.setBorder(BorderFactory.createLineBorder(Color.red));
                flag = 1;
            }
        }
        
        if(flag == 0) {
            //String from = "gany.dakshin@gmail.com";
            //String pass = "ganydakshin";
            String to = email; // list of recipient email addresses
            //String subject = "Music Pulse System - DUBS Confirmation Code";
            Random rnd = new Random();
            randomNumber = 100000 + rnd.nextInt(900000);
            String randomNumber2 = String.valueOf(randomNumber);
            String content = "Thank you for signing up with Music Pulse System - DUBS. Your Confirmation code is ";
            
            String body = content+randomNumber2;
            
            int flag2=sendFromGMail(to, body);
            if(flag2 == 2) {
                JOptionPane.showMessageDialog(null, "Email could not be sent to the specified email ID! Please try again", "Failure", JOptionPane.PLAIN_MESSAGE);
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
            Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) jComboBox2.getSelectedItem();
            
            Network net = (Network)jComboBox1.getSelectedItem();
            
            JOptionPane.showMessageDialog(null, "An email with Confirmation Code has been sent to the provided Email Address!", "Success", JOptionPane.PLAIN_MESSAGE);
            UserSignUp2 usu2 = new UserSignUp2(userProcessContainer, business, name, userName, ageInt, email,gender,net,randomNumber,loginButton,logoutButton,signUpButton,cancelSignUp,userNameText,passwordField, db4OUtil, addressLine1, addressLine2, addressLine3, jLabel25);
            userProcessContainer.add("UserSignUp2",usu2);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void userNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTextFieldKeyReleased
        int flag=0;
        for(Network n : business.getNetworkList()) {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for(UserAccount ua : o.getUserAccountDirectory().getListOfUserAccounts()) {
                        if(userNameTextField.getText().equals(ua.getUsername()) || userNameTextField.getText().equals("sysadmin")) {
                            errorPromptLabel.setText("Username already exists");
                            flag=1;
                        }
                    }
                }
            }
        }
        if(flag == 0) {
            errorPromptLabel.setText("");
        }        
    }//GEN-LAST:event_userNameTextFieldKeyReleased

    private void nameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyReleased
        String name = nameTextField.getText();
        int flag = 0;
        flag = stringValidate(name);
        if(flag == 1 || name.length() == 0) {
            errorPromptLabel1.setText("Invalid name");
        }
        else {
            errorPromptLabel1.setText("");
        }
    }//GEN-LAST:event_nameTextFieldKeyReleased

    private void mailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextFieldKeyReleased
        
            
        
    }//GEN-LAST:event_mailTextFieldKeyReleased

    private void mailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextFieldFocusLost
        String email = mailTextField.getText();
        int flag = 0;
            for(Network n : business.getNetworkList()) {
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if(o.getName().equals(Organization.Type.User)) {
                            for(UserAccount ua : o.getUserAccountDirectory().getListOfUserAccounts()) {
                                if(ua.getEmployee().getMailId().equals(email)) {
                                    errorPromptLabel2.setText("Email already exists");
                                    flag = 1;
                                }
                                
                            }
                        }
                    }
                }
            }
            if(flag == 0) {
                if(!validateEmailAddress(email)) {
                    errorPromptLabel2.setText("Invalid Email");
                    flag = 1;
                }
            }
            if(flag == 0) {
                if(email.length() == 0) {
                    errorPromptLabel2.setText("Invalid Email");
                    flag = 1;
                }
            }
            if(flag==0) {
                errorPromptLabel2.setText("");
            }
    }//GEN-LAST:event_mailTextFieldFocusLost

    private void userNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTextFieldFocusLost
        String name1 = userNameTextField.getText();
        System.out.println(name1);
        System.out.println(name1.length());
        int flag = 0;
        if(flag == 0) {
            int flag1 = stringValidate1(name1);
            if(flag1 == 1) {
                errorPromptLabel.setText("Invalid username");
                flag = 1;
            }
        }
        if(flag == 0 && name1.length() < 8) {
            errorPromptLabel.setText("Invalid username");
            flag = 1;
        }
        
        if(flag == 0 && name1.length() > 12) {
            errorPromptLabel.setText("Invalid username");
            flag = 1;
        }
        if(flag == 0) {
            errorPromptLabel.setText("");
        }
    }//GEN-LAST:event_userNameTextFieldFocusLost

    private void mailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextFieldFocusGained
        errorPromptLabel2.setText("");
    }//GEN-LAST:event_mailTextFieldFocusGained

    private void mailTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField1FocusGained

    private void mailTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField1FocusLost

    private void mailTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField1KeyReleased

    private void mailTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextField2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField2FocusGained

    private void mailTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextField2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField2FocusLost

    private void mailTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextField2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField2KeyReleased

    private void mailTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextField3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField3FocusGained

    private void mailTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextField3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField3FocusLost

    private void mailTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextField3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextField3KeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ageCombo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel errorPromptLabel;
    private javax.swing.JLabel errorPromptLabel1;
    private javax.swing.JLabel errorPromptLabel2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JTextField mailTextField1;
    private javax.swing.JTextField mailTextField2;
    private javax.swing.JTextField mailTextField3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
