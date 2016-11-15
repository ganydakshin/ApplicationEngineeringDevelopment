package userInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private int rowSelected;
    private Network editNetwork;
    
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        networkName2Text.setVisible(false);
        jLabel3.setVisible(false);
        saveButton.setVisible(false);
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }
    
    private int stringValidate(String stringVal) {
        if(!stringVal.matches("^[a-zA-Z0-9 ]*$")) {
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

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        for(Network n : business.getNetworkList()) {
            Object row[] = new Object[1];
            row[0]=n;
            dtm.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        networkNameText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        editNetworkButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        networkName2Text = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE NETWORKS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Network Name :");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("Add Network");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editNetworkButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        editNetworkButton.setText("Edit Network");
        editNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNetworkButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("New Network Name :");

        saveButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("<<-- Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(networkNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(editNetworkButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(networkName2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(saveButton)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(editNetworkButton))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(networkName2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(68, Short.MAX_VALUE))
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
        String name = networkNameText.getText();
        networkNameText.setEnabled(true);
        
        int flag = 0;
        int flag1 = 0;
        if(name.length()==0) {
            JOptionPane.showMessageDialog(null, "Network Name cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            networkNameText.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
        
        if(flag == 0) {
            for(Network n : business.getNetworkList()) {
                if(n.getName().equals(name)) {
                    JOptionPane.showMessageDialog(null, "Network with the same name already exists", "Failure", JOptionPane.PLAIN_MESSAGE);
                    networkNameText.setBorder(BorderFactory.createLineBorder(Color.red));
                    flag=1;
                }
            }
        }
     
        if(flag == 0) {
            flag1=stringValidate(name);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Network Name cannot contain special characters", "Failure", JOptionPane.PLAIN_MESSAGE);
                networkNameText.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0) {
            Network network = business.createAndAddNetwork();
            network.setName(name);
            JOptionPane.showMessageDialog(null, "New Network Added to the list", "Success", JOptionPane.PLAIN_MESSAGE);
            networkNameText.setText("");
            networkNameText.setBorder(BorderFactory.createLineBorder(Color.black));
            populateTable();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNetworkButtonActionPerformed
        rowSelected = jTable1.getSelectedRow();
        
        String networkName;
        if(rowSelected < 0) {
            JOptionPane.showMessageDialog(null, "Please select a network from the above list!", "Failure", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            networkName2Text.setVisible(true);
            jLabel3.setVisible(true);
            saveButton.setVisible(true);
            editNetworkButton.setEnabled(false);
            jButton1.setEnabled(false);
            networkNameText.setEnabled(false);
            editNetwork = (Network)jTable1.getValueAt(rowSelected, 0);
        }
    }//GEN-LAST:event_editNetworkButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String name = networkName2Text.getText();
        
        int flag = 0;
        int flag1 = 0;
        if(name.length()==0) {
            JOptionPane.showMessageDialog(null, "Network Name cannot be null", "Failure", JOptionPane.PLAIN_MESSAGE);
            networkNameText.setBorder(BorderFactory.createLineBorder(Color.red));
            flag=1;
        }
     
        if(flag == 0) {
            flag1=stringValidate(name);
            if(flag1 == 1) {
                JOptionPane.showMessageDialog(null, "Network Name cannot contain special characters", "Failure", JOptionPane.PLAIN_MESSAGE);
                networkNameText.setBorder(BorderFactory.createLineBorder(Color.red));
                flag=1;
            }
        }
        
        if(flag == 0) {
            editNetwork.setName(name);
            JOptionPane.showMessageDialog(null, "Network Name modified", "Success", JOptionPane.PLAIN_MESSAGE);
            populateTable();
            networkName2Text.setText("");
            networkName2Text.setVisible(false);
            jLabel3.setVisible(false);
            saveButton.setVisible(false);
            editNetworkButton.setEnabled(true);
            jButton1.setEnabled(true);
            networkNameText.setEnabled(true);
            
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton editNetworkButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField networkName2Text;
    private javax.swing.JTextField networkNameText;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
