package userInterface.UserWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PurchaseProductsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private ProductDirectory pd;
    
    
    public PurchaseProductsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.business=business;
        pd = new ProductDirectory();
        prodQuantity();
        populateTable();
        
    }
    
    public void prodQuantity() {
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(o.getName().equals(Organization.Type.Admin.getValue())) {
                UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                for(Product p : ua.getProductDirectory().getListOfProducts()) {
                    p.setTempQuantity(p.getProductQuantity());
                }
            }
        }
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(o.getName().equals("Admin")) {
                UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                for(Product p : ua.getProductDirectory().getListOfProducts()) {
                    Object obj[] = new Object[4];
                    obj[0] = p;
                    obj[1] = p.getProductId();
                    obj[2] = p.getProductPrice();
                    obj[3] = p.getTempQuantity();
                    dtm.addRow(obj);
                }
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
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PURCHASE PRODUCTS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Price", "Product Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity :");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Add to Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Product Price", "Product Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Checkout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveOrderItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRemoveOrderItem.setForeground(new java.awt.Color(102, 102, 255));
        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 255));
        jButton3.setText("<<-- Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("MUSIC PULSE SYSTEM - DUBS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton3)
                            .addGap(172, 172, 172)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveOrderItem))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnRemoveOrderItem)
                    .addComponent(jButton3))
                .addGap(0, 49, Short.MAX_VALUE))
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

    public void populateTable2() {
        DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
        dtm.setRowCount(0);
        for(Product p2 : pd.getListOfProducts()) {
            Object obj[] = new Object[4];
            obj[0]=p2;
            obj[1] = p2.getProductId();
            obj[2] = p2.getProductPrice();
            obj[3] = p2.getProductQuantity();
            dtm.addRow(obj);
        }
    }
    
    private int numberValidate(String numberVal) {
        if(!numberVal.matches("[0-9]+$"))
            return 1;
        else
            return 2;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int rowSelected = jTable1.getSelectedRow();
        if(rowSelected < 0){
            JOptionPane.showMessageDialog(null, "Please select a Product", "Failure", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        else {
            String quantity = String.valueOf(jSpinner1.getValue());
            
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
            int qty=0;
            Product p = (Product)jTable1.getValueAt(rowSelected, 0);
            
            if(flag == 0) {
                qty = Integer.parseInt(quantity);
                if(qty <= 0 || qty > p.getProductQuantity()) {
                    JOptionPane.showMessageDialog(null, "Invalid Quantity", "Failure", JOptionPane.PLAIN_MESSAGE);
                    flag = 1;
                }
            }
            
            if(flag == 0) {
            int flag3=0;
            
            for(Product p1 : pd.getListOfProducts()) {
                if(p.getProductId() == p1.getProductId()) {
                    p1.setProductQuantity(p1.getProductQuantity()+qty);
                    p.setTempQuantity(p.getTempQuantity()-qty);
                    flag3 = 1;
                    populateTable();
                    populateTable2();
                }
            }
            
            if(flag3 == 0) {
                Product p1 = pd.addProduct();
                p1.setProductId(p.getProductId());
                p1.setProductName(p.getProductName());
                p1.setProductPrice(p.getProductPrice());
                p1.setProductQuantity(qty);
                p.setTempQuantity(p.getTempQuantity()-qty);
                populateTable();
                populateTable2();
                JOptionPane.showMessageDialog(null, "Product added to cart", "Success", JOptionPane.PLAIN_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(pd.getListOfProducts().size() == 0) {
            JOptionPane.showMessageDialog(null,"Please add Items to cart","Failure",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            
            for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if(o.getName().equals(Organization.Type.Admin.getValue())) {
                    UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                    for(Product p1 : ua.getProductDirectory().getListOfProducts()) {
                        p1.setProductQuantity(p1.getTempQuantity());
                    }
                }
            }
            for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if(o.getName().equals(Organization.Type.Manager.getValue())) {
                    //account.getEmployee().setStatus("New Order");
                    WorkRequest request = new WorkRequest();
                    request.setCustomer(account);
                    request.setListOfProducts(pd);
                    request.setStatus("Order Placed");
                    o.getWorkQueue().getListOfWorkRequest().add(request);
                    account.getWorkQueue().getListOfWorkRequest().add(request);
                    
                    //o.getWorkQueue().addWorkRequest(pd, account.getEmployee());
                    //account.getWorkQueue().addWorkRequest(pd, account.getEmployee());
                }
                
            }
            int totalPrice=0;
            for(Product p : pd.getListOfProducts()) {
                totalPrice = totalPrice + (p.getProductPrice()*p.getProductQuantity());
            }
            pd = new ProductDirectory();
            populateTable(); 
            populateTable2();
            JOptionPane.showMessageDialog(null,"Thank you for your purchase with Music Pulse System - DUBS \n The total amount is " +totalPrice, "Success", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"The product will be delivered at the below location \n" +account.getEmployee().getAddressLine1() +"\n" +account.getEmployee().getAddressLine2() +"\n" +account.getEmployee().getZipCode(),"Success",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int rowSelected = jTable2.getSelectedRow();
        if(rowSelected < 0) {
            JOptionPane.showMessageDialog(null, "Please select a product to be deleted", "Failure", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        else {
            Product p = (Product)jTable2.getValueAt(rowSelected, 0);
            int currentQuantity = p.getProductQuantity();
            System.out.println(currentQuantity);
            for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                
                if(o.getName().equals(Organization.Type.Admin.getValue())) {
                
                    UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                    for(Product p1 : ua.getProductDirectory().getListOfProducts()) {
                
                        if(p.getProductId() == p1.getProductId()) {
                
                            p1.setTempQuantity(currentQuantity+p1.getTempQuantity());
                        }
                    }
                }
            }
            pd.getListOfProducts().remove(p);
            populateTable();
            populateTable2();
        }
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(pd.getListOfProducts().size() > 0) {
            ArrayList<Product> list = pd.getListOfProducts();
            for(Product prod : list) {
                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(o.getName().equals(Organization.Type.Admin.getValue())) {
                        UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                        for(Product p1 : ua.getProductDirectory().getListOfProducts()) {
                            if(prod.getProductId() == p1.getProductId()) {
                                p1.setProductQuantity(prod.getProductQuantity()+p1.getTempQuantity());
                            }
                        }
                    }
                }
                
            }
            pd.getListOfProducts().removeAll(list);
        }
        
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
