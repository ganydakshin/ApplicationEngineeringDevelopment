package userInterface.ManagerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageProducts extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account; 
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    public ManageProducts(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.business=business;
        populateTable();
        populateTable2();
    }
    
    public void populateTable2() {
        DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
        dtm.setRowCount(0);
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(o.getName().equals("Admin")) {
                UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                for(Product p : ua.getProductDirectory().getListOfProducts()) {
                        Object obj[] = new Object[4];
                        obj[0] = p;
                        obj[1] = p.getProductId();
                        obj[2] = p.getProductPrice();
                        obj[3] = p.getProductQuantity();
                        dtm.addRow(obj);
                }
                
            }
        }
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        
        for(UserAccount ua : business.getUserAccountDirectory().getListOfUserAccounts()) {
            for(Product p : ua.getProductDirectory().getListOfProducts()) {
                Object obj[] = new Object[4];
                obj[0] = p;
                obj[1] = p.getProductId();
                obj[2] = p.getProductPrice();
                obj[3] = p.getProductQuantity();
                dtm.addRow(obj);
            }
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE PRODUCTS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Product Price", "Product Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Product Price", "Product Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setText("Quantity");

        jButton1.setText("Purchase Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("MASTER PRODUCTS");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("LOCAL STORE PRODUCTS");

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
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(85, Short.MAX_VALUE))
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

    private int numberValidate(String numberVal) {
        if(!numberVal.matches("[0-9]+$"))
            return 1;
        else
            return 2;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rowSelected = jTable1.getSelectedRow();
        if(rowSelected < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Product", "Failure", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        else {
            String quantity = String.valueOf(jSpinner1.getValue());
            Product p = (Product)jTable1.getValueAt(rowSelected, 0);
            int flag = 0;
            int flag1 = 0;
            if(flag == 0 && quantity.length()==0) {
                JOptionPane.showMessageDialog(null, "Quantity cannot be empty", "Failure", JOptionPane.PLAIN_MESSAGE);
                flag = 1;
            }
            if(flag == 0) {
                flag1 = numberValidate(quantity);
                if(flag1 == 1) {
                    JOptionPane.showMessageDialog(null, "Quantity can contain only numbers", "Failure", JOptionPane.PLAIN_MESSAGE);
                    flag = 1;
                }
            }
            int quantityInt=0;
            
            if(flag == 0) {
                quantityInt = Integer.parseInt(quantity);
                if(quantityInt <= 0 || quantityInt > p.getProductQuantity()) {
                    JOptionPane.showMessageDialog(null, "Invalid Quantity", "Failure", JOptionPane.PLAIN_MESSAGE);
                    flag = 1;
                }
            }
            int flag3=0;
            if(flag == 0) {    
                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(o.getName().equals("Admin")) {
                        UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                        for(Product product : ua.getProductDirectory().getListOfProducts()) {
                            if(product.getProductId() == (p.getProductId())) {
                                product.setProductPrice(p.getProductPrice());
                                product.setProductQuantity(quantityInt+product.getProductQuantity());
                                p.setProductQuantity(p.getProductQuantity()-quantityInt);
                                p.setTempQuantity(p.getProductQuantity()-quantityInt);
                                populateTable();
                                populateTable2();
                                flag3=1;
                                JOptionPane.showMessageDialog(null, "Additional Quantity Purchased", "Success", JOptionPane.PLAIN_MESSAGE);
                            }
                        }
                    }
                }
                
                if(flag3 == 0) {
                    for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if(o.getName().equals("Admin")) {
                            UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                            Product product = ua.getProductDirectory().addProduct();
                            product.setProductId(p.getProductId());
                            product.setProductName(p.getProductName());
                            product.setProductPrice(p.getProductPrice());
                            product.setProductQuantity(quantityInt);
                            p.setProductQuantity(p.getProductQuantity()-quantityInt);
                            p.setTempQuantity(p.getProductQuantity()-quantityInt);
                            populateTable();
                            populateTable2();
                            JOptionPane.showMessageDialog(null, "New Product Purchased Successfully", "Success", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
