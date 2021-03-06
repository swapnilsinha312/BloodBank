/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bloodbank;

import com.mycompany.bloodbank.DiseaseFindingDoctor.DiseaseFinderAdd;
import com.mycompany.bloodbank.Donor.DonorAdd;
import com.mycompany.bloodbank.City.CityAdd;
import com.mycompany.bloodbank.BloodSpecimen.BloodSpecimenAdd;
import com.mycompany.bloodbank.Recipient.RecipientAdd;
import com.mycompany.bloodbank.RecordingStaff.RecordingStaffAdd;
import com.mycompany.bloodbank.BloodBankManager.BloodBankManagerAdd;
import com.mycompany.bloodbank.BloodBankManager.BloodBankManagerPage;
import com.mycompany.bloodbank.BloodReq.BloodReqPage;
import com.mycompany.bloodbank.BloodSpecimen.BloodSpecimenPage;
import com.mycompany.bloodbank.City.CityPage;
import com.mycompany.bloodbank.DiseaseFindingDoctor.DiseaseFinderPage;
import com.mycompany.bloodbank.Donor.DonorPage;
import com.mycompany.bloodbank.Hospital.HospitalAdd;
import com.mycompany.bloodbank.Hospital.HospitalPage;
import com.mycompany.bloodbank.Recipient.RecipientPage;
import com.mycompany.bloodbank.RecordingStaff.RecordingStaffPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Swap
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    private Connection conn;
    public HomePage() {
        String dbURL = "jdbc:mysql://localhost:3306/bloodBankDB";
            String username = "root";
            String password = "abcd@1234";
            
            try {
                conn = DriverManager.getConnection(dbURL, username, password);
                } 
            catch (SQLException ex) {
            Logger.getLogger(DiseaseFinderAdd.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        initComponents();
        addStats();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bColNo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cityNo = new javax.swing.JLabel();
        hospNo = new javax.swing.JLabel();
        collectedNo = new javax.swing.JLabel();
        reqNo = new javax.swing.JLabel();
        pplNo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        DonorsMainPageButton = new javax.swing.JButton();
        RecipientsMainPageButton = new javax.swing.JButton();
        CityMainPageButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        DiseaseFinderMainPageButton = new javax.swing.JButton();
        bloodSpecimenMainPageButton = new javax.swing.JButton();
        BloodReqButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BBManagerMainPageButton = new javax.swing.JButton();
        RecordingStaffMainPageButton = new javax.swing.JButton();
        HospitalsMainPageButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Blood Bank Manager");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stats and Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cities :");

        jLabel4.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hospitals :");

        bColNo.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        bColNo.setForeground(new java.awt.Color(255, 255, 255));
        bColNo.setText("Blood Collected :");

        jLabel6.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Required :");

        jLabel7.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("People involved :");

        cityNo.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        cityNo.setForeground(new java.awt.Color(255, 255, 255));
        cityNo.setText("Cities :");

        hospNo.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        hospNo.setForeground(new java.awt.Color(255, 255, 255));
        hospNo.setText("Cities :");

        collectedNo.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        collectedNo.setForeground(new java.awt.Color(255, 255, 255));
        collectedNo.setText("Cities :");

        reqNo.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        reqNo.setForeground(new java.awt.Color(255, 255, 255));
        reqNo.setText("Cities :");

        pplNo.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
        pplNo.setForeground(new java.awt.Color(255, 255, 255));
        pplNo.setText("Cities :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(bColNo)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityNo)
                    .addComponent(hospNo)
                    .addComponent(collectedNo)
                    .addComponent(reqNo)
                    .addComponent(pplNo))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityNo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hospNo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bColNo)
                    .addComponent(collectedNo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(reqNo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pplNo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peoples Corner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        DonorsMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        DonorsMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        DonorsMainPageButton.setText("Donors");
        DonorsMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonorsMainPageButtonActionPerformed(evt);
            }
        });

        RecipientsMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        RecipientsMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        RecipientsMainPageButton.setText("Recipients");
        RecipientsMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecipientsMainPageButtonActionPerformed(evt);
            }
        });

        CityMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        CityMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        CityMainPageButton.setText("City");
        CityMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityMainPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DonorsMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecipientsMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CityMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DonorsMainPageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecipientsMainPageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CityMainPageButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Requirement Dependencies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        DiseaseFinderMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        DiseaseFinderMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        DiseaseFinderMainPageButton.setText("Disease Finder");
        DiseaseFinderMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiseaseFinderMainPageButtonActionPerformed(evt);
            }
        });

        bloodSpecimenMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        bloodSpecimenMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        bloodSpecimenMainPageButton.setText("Blood Specimen");
        bloodSpecimenMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodSpecimenMainPageButtonActionPerformed(evt);
            }
        });

        BloodReqButton.setBackground(new java.awt.Color(255, 255, 255));
        BloodReqButton.setForeground(new java.awt.Color(0, 102, 102));
        BloodReqButton.setText("Blood Requirement");
        BloodReqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodReqButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DiseaseFinderMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloodSpecimenMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BloodReqButton, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(DiseaseFinderMainPageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bloodSpecimenMainPageButton)
                .addGap(6, 6, 6)
                .addComponent(BloodReqButton)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Institutional Corner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        BBManagerMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        BBManagerMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        BBManagerMainPageButton.setText("Blood Bank Manager");
        BBManagerMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBManagerMainPageButtonActionPerformed(evt);
            }
        });

        RecordingStaffMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        RecordingStaffMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        RecordingStaffMainPageButton.setText("Recording Staff");
        RecordingStaffMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingStaffMainPageButtonActionPerformed(evt);
            }
        });

        HospitalsMainPageButton.setBackground(new java.awt.Color(255, 255, 255));
        HospitalsMainPageButton.setForeground(new java.awt.Color(0, 102, 102));
        HospitalsMainPageButton.setText("Hospitals");
        HospitalsMainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalsMainPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HospitalsMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecordingStaffMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBManagerMainPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(HospitalsMainPageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBManagerMainPageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecordingStaffMainPageButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStats() 
    {
        try { 
                if (conn != null) {
                    System.out.println("Connected");
                } 
                
                String sql="select count(*) from hospital";
                PreparedStatement st = conn.prepareStatement(sql);
                ResultSet rs = st.executeQuery(); 
                int hosp=0;
                while(rs.next())
                hosp=rs.getInt(1);
                
                sql="select count(cityId) as cityNo from city";
                st = conn.prepareStatement(sql);
                rs = st.executeQuery(); 
                int city=0;
                while(rs.next())
                    city=rs.getInt("cityNo");
                
                sql="select sum(hospitalNeededQuantity) as reqNo from hospitalRequirement";
                st = conn.prepareStatement(sql);
                rs = st.executeQuery(); 
                int req=0;
                while(rs.next())
                    req=rs.getInt("reqNo");
                
                sql="select sum(bloodSpecimenId) as specNo from bloodspecimen";
                st = conn.prepareStatement(sql);
                rs = st.executeQuery(); 
                int specNo=0;
                while(rs.next())
                    specNo=rs.getInt("specNo");
                
                sql="select count(managerId) as manageNo from bloodbankmanager";
                st = conn.prepareStatement(sql);
                rs = st.executeQuery(); 
                int manageNo=0;
                while(rs.next())
                    manageNo=rs.getInt("manageNo");
                
                sql="select count(diseaseFinderId) as dNo from diseaseFinder";
                st = conn.prepareStatement(sql);
                rs = st.executeQuery(); 
                int dNo=0;
                while(rs.next())
                    dNo=rs.getInt("dNo");
                
                sql="select count(recordingStaffId) as recNo from recordingStaff";
                st = conn.prepareStatement(sql);
                rs = st.executeQuery(); 
                int recNo=0;
                while(rs.next())
                    recNo=rs.getInt("recNo");
                
                int pplInv=recNo+dNo+manageNo;
                
                cityNo.setText(city+"");
                hospNo.setText(hosp+"");
                collectedNo.setText(specNo+"");
                reqNo.setText(req+"");
                pplNo.setText(pplInv+"");
                
        }
            
            catch (Exception e) 
            {
                System.out.println("Error home page add");
                e.printStackTrace();
            } 
    }
    
    private void HospitalsMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalsMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HospitalPage().setVisible(true);
    }//GEN-LAST:event_HospitalsMainPageButtonActionPerformed

    private void BBManagerMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBManagerMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new BloodBankManagerPage().setVisible(true);
    }//GEN-LAST:event_BBManagerMainPageButtonActionPerformed

    private void RecordingStaffMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingStaffMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RecordingStaffPage().setVisible(true);
    }//GEN-LAST:event_RecordingStaffMainPageButtonActionPerformed

    private void DonorsMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonorsMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DonorPage().setVisible(true);
    }//GEN-LAST:event_DonorsMainPageButtonActionPerformed

    private void RecipientsMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecipientsMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RecipientPage().setVisible(true);
    }//GEN-LAST:event_RecipientsMainPageButtonActionPerformed

    private void CityMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CityPage().setVisible(true);
    }//GEN-LAST:event_CityMainPageButtonActionPerformed

    private void DiseaseFinderMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiseaseFinderMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DiseaseFinderPage().setVisible(true);
    }//GEN-LAST:event_DiseaseFinderMainPageButtonActionPerformed

    private void bloodSpecimenMainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodSpecimenMainPageButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new BloodSpecimenPage().setVisible(true);
    }//GEN-LAST:event_bloodSpecimenMainPageButtonActionPerformed

    private void BloodReqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodReqButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new BloodReqPage().setVisible(true);
    }//GEN-LAST:event_BloodReqButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBManagerMainPageButton;
    private javax.swing.JButton BloodReqButton;
    private javax.swing.JButton CityMainPageButton;
    private javax.swing.JButton DiseaseFinderMainPageButton;
    private javax.swing.JButton DonorsMainPageButton;
    private javax.swing.JButton HospitalsMainPageButton;
    private javax.swing.JButton RecipientsMainPageButton;
    private javax.swing.JButton RecordingStaffMainPageButton;
    private javax.swing.JLabel bColNo;
    private javax.swing.JButton bloodSpecimenMainPageButton;
    private javax.swing.JLabel cityNo;
    private javax.swing.JLabel collectedNo;
    private javax.swing.JLabel hospNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel pplNo;
    private javax.swing.JLabel reqNo;
    // End of variables declaration//GEN-END:variables
 
    
}
