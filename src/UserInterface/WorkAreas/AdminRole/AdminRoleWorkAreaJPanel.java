/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.WorkAreas.AdminRole;

import Business.Business;
import Business.ProfileWorkAreaMainFrame;
import UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp.ManageUserAccountsJPanel;
import UserInterface.WorkAreas.AdminRole.ManagePersonnelWorkResp.ManagePersonsJPanel;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author kal
 */
public class AdminRoleWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;

    /**
     * Creates new form UnitRiskWorkArea
     */

    public AdminRoleWorkAreaJPanel(Business b, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdministerUserAccounts = new javax.swing.JButton();
        btnManageFaculty = new javax.swing.JButton();
        btnRegisterPersons = new javax.swing.JButton();
        btnMyProfile = new javax.swing.JButton();
        btnManageStudents = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setForeground(new java.awt.Color(51, 51, 51));

        btnAdministerUserAccounts.setBackground(new java.awt.Color(102, 153, 255));
        btnAdministerUserAccounts.setFont(getFont());
        btnAdministerUserAccounts.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministerUserAccounts.setText("Administer User Accounts");
        btnAdministerUserAccounts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdministerUserAccounts.setMaximumSize(new java.awt.Dimension(200, 40));
        btnAdministerUserAccounts.setMinimumSize(new java.awt.Dimension(20, 23));
        btnAdministerUserAccounts.setPreferredSize(new java.awt.Dimension(240, 30));
        btnAdministerUserAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministerUserAccountsIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnManageFaculty.setBackground(new java.awt.Color(102, 153, 255));
        btnManageFaculty.setFont(getFont());
        btnManageFaculty.setForeground(new java.awt.Color(255, 255, 255));
        btnManageFaculty.setText("Manage Faculty");
        btnManageFaculty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageFaculty.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageFaculty.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageFaculty.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFacultyActionPerformed(evt);
            }
        });

        btnRegisterPersons.setBackground(new java.awt.Color(102, 153, 255));
        btnRegisterPersons.setFont(getFont());
        btnRegisterPersons.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterPersons.setText("Register  Persons (HR)");
        btnRegisterPersons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegisterPersons.setMaximumSize(new java.awt.Dimension(200, 40));
        btnRegisterPersons.setMinimumSize(new java.awt.Dimension(20, 20));
        btnRegisterPersons.setPreferredSize(new java.awt.Dimension(240, 25));
        btnRegisterPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPersonsActionPerformed(evt);
            }
        });

        btnMyProfile.setBackground(new java.awt.Color(102, 153, 255));
        btnMyProfile.setFont(getFont());
        btnMyProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnMyProfile.setText("My Profile");
        btnMyProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMyProfile.setMaximumSize(new java.awt.Dimension(145, 40));
        btnMyProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnMyProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyProfileIdentifyEventsActionPerformed(evt);
            }
        });

        btnManageStudents.setBackground(new java.awt.Color(102, 153, 255));
        btnManageStudents.setFont(getFont());
        btnManageStudents.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStudents.setText("Manage Students");
        btnManageStudents.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageStudents.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageStudents.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageStudents.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStudentsActionPerformed(evt);
            }
        });

        btnLogout.setText("<<<Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnManageFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdministerUserAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegisterPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministerUserAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministerUserAccountsIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministerUserAccountsIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:

        ManageUserAccountsJPanel aos = new ManageUserAccountsJPanel(business, CardSequencePanel);

        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnAdministerUserAccountsIdentifyResourceAssetsActionPerformed

    private void btnRegisterPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPersonsActionPerformed
        // TODO add your handling code here:

        ManagePersonsJPanel aos = new ManagePersonsJPanel(business, CardSequencePanel);

        CardSequencePanel.add("Manage Persons", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnRegisterPersonsActionPerformed

    private void btnManageStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnManageStudentsActionPerformed

    private void btnMyProfileIdentifyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyProfileIdentifyEventsActionPerformed
    }//GEN-LAST:event_btnMyProfileIdentifyEventsActionPerformed

    private void btnManageFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFacultyActionPerformed
    }//GEN-LAST:event_btnManageFacultyActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
        
        ProfileWorkAreaMainFrame profileMainFrame = new ProfileWorkAreaMainFrame();
        profileMainFrame.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministerUserAccounts;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageFaculty;
    private javax.swing.JButton btnManageStudents;
    private javax.swing.JButton btnMyProfile;
    private javax.swing.JButton btnRegisterPersons;
    // End of variables declaration//GEN-END:variables

}
