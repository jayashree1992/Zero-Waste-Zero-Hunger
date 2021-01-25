/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Mayor;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.DonarStaff.DonarStaffViewPickUpRequestJPanel;

/**
 *
 * @author jayashree
 */
public class MayorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MayorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount useraccount;
    
    
    public MayorWorkAreaJPanel(JPanel userProcessContainer, Network network, Enterprise enterprise, Organization organization, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        
        enterpriseName.setText(enterprise.getName());
        organizationName.setText(organization.getName());
        employeeName.setText(useraccount.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        employeeName = new javax.swing.JLabel();
        organizationName = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        enterpriseName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 228, 140));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/jayashree/Desktop/Aed Images/icons8-people-96.png")); // NOI18N
        jButton1.setText("View People Fed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/jayashree/Desktop/Aed Images/icons8-empty-trash-100 (1).png")); // NOI18N
        jButton2.setText("View Wastage Avoided");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Enterprise :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Mayor Work Area");

        enterpriseLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel3.setText("Employee:");

        employeeName.setText("<value>");

        organizationName.setText("<value>");

        enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel2.setText("Organization:");

        enterpriseName.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(organizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(608, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseName))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationName))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeName))
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MayorWastageAvoidedJPanel mayorWastageAvoidedJPanel = new MayorWastageAvoidedJPanel( userProcessContainer, network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("MayorWastageAvoidedJPanel", mayorWastageAvoidedJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MayorPeopleFedJPanel mayorPeopleFedJPanel = new MayorPeopleFedJPanel( userProcessContainer, network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("mayorPeopleFedJPanel", mayorPeopleFedJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeeName;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel enterpriseName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel organizationName;
    // End of variables declaration//GEN-END:variables
}
