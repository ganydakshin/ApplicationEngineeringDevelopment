package userInterface.SystemAdminWorkArea;

import Business.Product.Product;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ModifyProductJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product p;
    private ManageProductsJPanel mpjp;
    
    public ModifyProductJPanel(JPanel userProcessContainer, Product p, ManageProductsJPanel mpjp) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.p = p;
        this.mpjp = mpjp;
        populateFields();
    }
    
    public void populateFields() {
        jTextField1.setText(p.getProductName());
        jTextField2.setText(String.valueOf(p.getProductPrice()));
        jTextField3.setText(String.valueOf(p.getProductQuantity()));
    }
    
    public void resetFields() {
        jTextField1.setBorder(null);
        jTextField2.setBorder(null);
        jTextField3.setBorder(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("MODIFY PRODUCT DETAILS");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("PRODUCT NAME :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("PRODUCT PRICE :");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("PRODUCT QUANTITY :");

        jTextField1.setEditable(false);

        jButton1.setText("Modify Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addGap(0, 191, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mpjp.populateTable();
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private int numberValidate(String numberVal) {
        if(!numberVal.matches("[0-9]+$"))
            return 1;
        else
            return 2;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String productPrice = jTextField2.getText();
        String productQuantity = jTextField3.getText();
        int flag = 0;
        int flag1 = 0;
        if(flag == 0 && productPrice.length()==0) {
            JOptionPane.showMessageDialog(null, "Product Price cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0 && productPrice.length() > 9) {
            JOptionPane.showMessageDialog(null, "Product Price cannot be greater than 999,999,999", "Failure", JOptionPane.PLAIN_MESSAGE);
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=numberValidate(productPrice);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Product Price can contain only numbers", "Failure", JOptionPane.PLAIN_MESSAGE);
                jTextField2.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0 && productQuantity.length()==0) {
            JOptionPane.showMessageDialog(null, "Product Quantity cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0 && productQuantity.length() > 9) {
            JOptionPane.showMessageDialog(null, "Cannot order more than 999,999,999 quantity of products", "Failure", JOptionPane.PLAIN_MESSAGE);
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            flag1=numberValidate(productQuantity);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Product Quantity cannot contain special characters", "Failure", JOptionPane.PLAIN_MESSAGE);
                jTextField3.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0) {
            int productPriceInt = Integer.parseInt(productPrice);
            int productQuantityInt = Integer.parseInt(productQuantity);
            p.setProductPrice(productPriceInt);
            p.setProductQuantity(productQuantityInt);
            JOptionPane.showMessageDialog(null, "Product Details modified", "Success", JOptionPane.PLAIN_MESSAGE);
            resetFields();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
