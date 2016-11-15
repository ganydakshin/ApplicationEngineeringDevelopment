package userInterface.ManagerWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageCustomerDelivery extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account; 
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    
    public ManageCustomerDelivery(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.business=business;
        populateTable();
    }

    public void populateTable() {
//        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
//        dtm.setRowCount(0);
//        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if(o.getName().equals(Organization.Type.Manager.getValue())) {
//                for(WorkRequest wr : o.getWorkQueue().getListOfWorkRequest()) {
//                    Object obj[]=new Object[4];
//                    obj[0]=wr;
//                    obj[1]=wr.getListOfProducts().getListOfProducts().size();
//                    obj[2]=wr.getListOfProducts()
//                    dtm.addRow(obj);
//                }
//            }
//        }
            
          DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
          dtm.setRowCount(0);
          for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
              if(o.getName().equals(Organization.Type.Manager.getValue())) {
                  int size = o.getWorkQueue().getListOfWorkRequest().size();
                  System.out.println(size);
                  for(WorkRequest wr : o.getWorkQueue().getListOfWorkRequest()) {
                      
                      Object obj[] = new Object[3];
                      obj[0] = wr;
                      obj[1] = wr.getListOfProducts().getListOfProducts().size();
                      obj[2] = wr.getStatus();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE CUSTOMER DELIVERY");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Username", "Number of products", "Status of Order"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Approve Order");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(233, Short.MAX_VALUE))
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
        int rowSelected = jTable1.getSelectedRow();
        if(rowSelected < 0){
            JOptionPane.showMessageDialog(null, "Please select an order to approve", "Failure", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        else {
            WorkRequest r = (WorkRequest)jTable1.getValueAt(rowSelected, 0);
            if(r.getStatus().equals("Order Placed")) {
                r.setStatus("Ready to Dispatch");
                JOptionPane.showMessageDialog(null, "Order Approved", "Success", JOptionPane.PLAIN_MESSAGE);
                populateTable();
                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(o.getName().equals(Organization.Type.Delivery.getValue())) {
                        o.getWorkQueue().getListOfWorkRequest().add(r);
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Order is already approved", "Failure", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
