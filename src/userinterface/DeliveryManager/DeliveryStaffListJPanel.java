/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManager;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryStaffOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Employee.DeliveryStaff;
import Business.UserAccount.UserAccount;
import Business.Utility.EmailSender;
import Business.WorkQueue.DeliveryRequest;
import Business.WorkQueue.FoodPickUpRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author jayashree
 */
public class DeliveryStaffListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryStaffListJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private DeliveryRequest deliveryRequest;

    public DeliveryStaffListJPanel(JPanel userProcessContainer, Enterprise enterprise, DeliveryRequest deliveryRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.deliveryRequest = deliveryRequest;
        populateStaffTable();
    }

    private void populateStaffTable() {

        DefaultTableModel dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DeliveryStaffOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    DeliveryStaff ds = (DeliveryStaff) ua.getEmployee();
                    Object row[] = new Object[2];
                    row[0] = ua;
                    row[1] = ds.isIsAvailable() ? "Available" : "Not Available";
                    dtm.addRow(row);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 228, 140));

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Name", "Staff Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(staffTable);

        jButton1.setText("Assign");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("Delivery Manager Work Area - List of all Delivery Staff");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel4.setText("All Delivery Staff List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addContainerGap(338, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) staffTable.getModel();

        int selectedRowIndex = staffTable.getSelectedRow();
        String availabilty = (String) dtm.getValueAt(selectedRowIndex, 1);

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Select an Delivery staff to assign");
            return;
        }
        
        if (availabilty.equals("Not Available")) {
            
            JOptionPane.showMessageDialog(null, "Delivery Staff is not available");
            return;
        }
        
         

        UserAccount deliveryStaff = (UserAccount) dtm.getValueAt(selectedRowIndex, 0);
        DeliveryStaff deliveryStaffEmployee = (DeliveryStaff) deliveryStaff.getEmployee();
        deliveryRequest.setDeliveryPerson(deliveryStaff);
        deliveryRequest.setStatus("Delivery Assigned");
        deliveryRequest.getPickupRequest().setStatus("Delivery Assigned");
        deliveryStaff.getWorkQueue().getWorkRequestList().add(deliveryRequest);
        deliveryStaffEmployee.setIsAvailable(false);
        populateStaffTable();

        JOptionPane.showMessageDialog(null, "Delivery assigned to " + deliveryStaff.getEmployee().getName());
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        int index = userProcessContainer.getComponentCount() - 1;
        DeliveryManagerViewPickUpRequest panel = (DeliveryManagerViewPickUpRequest) userProcessContainer.getComponent(index);
        panel.removeAllFoodItems();
        panel.populateTable();
        EmailSender.sendEmail("patel.jaya@husky.neu.edu", deliveryRequest.getSender().getEmployee().getName(), "Delivery Assigned to " + deliveryStaff);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable staffTable;
    // End of variables declaration//GEN-END:variables
}
