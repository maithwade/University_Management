/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Courses;

import Business.Business;
import Business.CourseCatalog.Course;
import Business.CourseSchedule.CourseOffer;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class RegistrationInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationInformationJPanel
     */
    javax.swing.JPanel CardSequenceJPanel;
    Business business;
    Course course;
    CourseOffer courseOffer;
    
    
    public RegistrationInformationJPanel(Business b, JPanel CardSequenceJPanel) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        business = b;
        tblRegistrationInfo.removeAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrationInfo = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Registration Information");

        tblRegistrationInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Course Number", "Faculty", "Credit", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistrationInfo);
        if (tblRegistrationInfo.getColumnModel().getColumnCount() > 0) {
            tblRegistrationInfo.getColumnModel().getColumn(0).setResizable(false);
            tblRegistrationInfo.getColumnModel().getColumn(1).setResizable(false);
            tblRegistrationInfo.getColumnModel().getColumn(2).setResizable(false);
            tblRegistrationInfo.getColumnModel().getColumn(3).setResizable(false);
            tblRegistrationInfo.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitle)
                        .addGap(176, 176, 176)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        CardSequenceJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) CardSequenceJPanel.getLayout();
        cardLayout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblRegistrationInfo;
    // End of variables declaration//GEN-END:variables
    
    public void updateRegistrationInfoTable(DefaultTableModel registerCoursesModel) {
       DefaultTableModel registrationInfoModel = (DefaultTableModel) tblRegistrationInfo.getModel();
       
       for(int i = 0; i < registerCoursesModel.getRowCount(); i++) {
           boolean isNewRow = true;
           
           for(int k = 0; k < registrationInfoModel.getRowCount(); k++) {
               
               Object currentValue = registerCoursesModel.getValueAt(i, 0);
               Object existingValue = registrationInfoModel.getValueAt(k, 0); 
               
               if(currentValue != null && currentValue.equals(existingValue)) {
                   isNewRow = false;
                   break;
           }   
        }
           
           if(isNewRow) {
               Object[] rowData = new Object[5];
               
               for(int j = 0; j < 4; j++) {
                   rowData[j] = registerCoursesModel.getValueAt(i, j);
               }
               
               rowData[4] = "Registered";
               
               registrationInfoModel.insertRow(0, rowData);
           }
       }
    }


}
