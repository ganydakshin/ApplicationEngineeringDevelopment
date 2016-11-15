package userInterface.UserWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Music.FreeMusic;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class ListenFreeSongsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    SimpleDateFormat sdf  = new SimpleDateFormat("MM/dd/YYYY HH:mm");
    private int   currentSecond;
    private Calendar calendar;
    private int prevHour;
    
    public ListenFreeSongsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.business=business;
        populateTable();
        prevHour = currentDate1();
        start();
    }
    
    private void reset(){
        calendar = Calendar.getInstance();
        currentSecond = calendar.get(Calendar.SECOND);
    }
    public void start(){
        reset();
        Timer timer = new Timer(1000, new ActionListener(){
        public void actionPerformed( ActionEvent e ) {
                if( currentSecond == 60 ) {
                    reset();
                    
                }
                timeTextField.setText( String.format("%s:%02d", sdf.format(calendar.getTime()), currentSecond ));
                int currHour = currentDate1();
                if(prevHour != currHour) {
                    populateTable();
                    prevHour = currHour;
                }    
                currentSecond++;
            }
        });
        timer.start();
    }
    
    public int currentDate1() {
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        String currDate=dateFormat.format(date);
        return Integer.parseInt(currDate);
    }
    
    public String currentDate() {
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        String currDate=dateFormat.format(date);
        return currDate;
    }
    
    public void populateTable() {
        String date = currentDate();
        String timeOfDay;
        int hours = Integer.parseInt(date);
        
        if(hours > 3 && hours <= 9) {
            timeOfDay = "Morning";
        }
        else if(hours > 9 && hours <= 16) {
            timeOfDay = "Afternoon";
        } 
        else if(hours > 16 && hours <= 22) {
            timeOfDay = "Evening";
        }
        else {
            timeOfDay = "Night";
        }
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(o.getName().equals(Organization.Type.Admin.getValue())) {
                UserAccount ua = o.getUserAccountDirectory().getListOfUserAccounts().get(0);
                for(FreeMusic fm : ua.getFreeMusicList()) {
                    if(fm.getTimeOfDay().equals(timeOfDay)) {
                        
                        File f = new File(fm.getPath());
                        if(f.exists()) {
                            Object obj[] = new Object[2];
                            obj[0] = fm;
                            obj[1] = fm.getSongAlbum();
                            dtm.addRow(obj);
                        }
                        
                    }
                }
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        timeTextField = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("MUSIC PULSE SYSTEM - DUBS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Song Name", "Song Album"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        timeTextField.setBackground(new java.awt.Color(0, 0, 0));
        timeTextField.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        timeTextField.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<<-- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("LISTEN FREE SONGS");

        jButton1.setText("Listen to Song");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(143, 143, 143)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rowSelected = jTable1.getSelectedRow();
        if(rowSelected < 0) {
            JOptionPane.showMessageDialog(null, "Please select a song", "Message", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        else {
            FreeMusic fm1 = (FreeMusic) jTable1.getValueAt(rowSelected, 0);
            String path = fm1.getPath();
            String songName = fm1.getSongName();
            ListenSongsJPanel lsjp = new ListenSongsJPanel(userProcessContainer, songName, path);
            userProcessContainer.add("Listen Songs", lsjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel timeTextField;
    // End of variables declaration//GEN-END:variables
}
