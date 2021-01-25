/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManager;

import Business.Enterprise.Enterprise;
import Business.Food.FoodItem;
import Business.Food.FoodList;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryRequest;
import Business.WorkQueue.FoodPickUpRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jayashree
 */
public class DeliveryManagerViewPickUpRequest extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManagerViewPickUpRequest
     */
    private JPanel userProcessContainer;
    private Network network;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount deliveryManagerUserAccount;

    public DeliveryManagerViewPickUpRequest(JPanel userProcessContainer, Network network, Organization organization, Enterprise enterprise, UserAccount deliveryManagerUserAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.organization = organization;
        this.enterprise = enterprise;
        this.deliveryManagerUserAccount = deliveryManagerUserAccount;
        populateTable();
    }
    
    public void removeAllFoodItems(){
        DefaultTableModel dtm = (DefaultTableModel) foodItemTable.getModel();
        dtm.setRowCount(0);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPickUpRequestTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        foodItemTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 228, 140));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Assign Resource");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("**Select a request to view it's food items**");

        viewPickUpRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Request Date", "Delivery Person", "Received By", "Pickup Time", "DropOff Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewPickUpRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPickUpRequestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewPickUpRequestTable);

        foodItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity", "Quantity in Pounds", "Worth"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(foodItemTable);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("Delivery Manager Work Area - List of Pickup Requests Received");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel4.setText("Pickup requests received and to be assigned");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel6.setText("FoodItems in the selected request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane3))
                        .addComponent(jButton1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) viewPickUpRequestTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {

            
          if(wr instanceof DeliveryRequest)  {
            DeliveryRequest dr = (DeliveryRequest) wr;
            if (dr.getDeliveryPerson() == null) {
                Object row[] = new Object[6];
                row[0] = dr;
                row[1] = dr.getRequestDate();
               
                row[2] = dr.getDeliveryPerson() == null ? "Not Asssigned" : dr.getDeliveryPerson().getEmployee();
                row[3] = dr.getReceiver() == null ? "Not yet reached receiver" : dr.getReceiver().getEmployee();
                row[4] = dr.getPickupTime() == null ? "Not yet picked up" : dr.getPickupTime();
                row[5] = dr.getDropOfTime() == null ? "Not yet dropped off" : dr.getDropOfTime();
                dtm.addRow(row);
            }
            
        }
        }

    }

    private void populateFoodItemListTable(DeliveryRequest pr) {

        DefaultTableModel dtm = (DefaultTableModel) foodItemTable.getModel();
        dtm.setRowCount(0);
        for (FoodItem item : pr.getPickupRequest().getFoodItemList()) {
            Object row[] = new Object[4];
            row[0] = item.getFoodItemName();
            row[1] = item.getQuantity();
            row[2] = Math.round(FoodList.getFoodInPounds().get(item.getFoodItemName()) * item.getQuantity() * 100.0) / 100.0;
           // row[3] = item.getHoursToPerish();
            row[3] = FoodList.getFoodPrice().get(item.getFoodItemName()) * item.getQuantity();
            dtm.addRow(row);
        }
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) viewPickUpRequestTable.getModel();

        int selectedRowIndex = viewPickUpRequestTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Select a request for assigning");
            return;
        }

        DeliveryRequest dr = (DeliveryRequest) dtm.getValueAt(selectedRowIndex, 0);

        if (dr.getDeliveryPerson() != null) {
            JOptionPane.showMessageDialog(null, "Delivery already assigned to " + dr.getDeliveryPerson());
            return;
        }

        DeliveryStaffListJPanel deliveryStaffListJPanel = new DeliveryStaffListJPanel(userProcessContainer, enterprise, dr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("deliveryStaffListJPanel", deliveryStaffListJPanel);
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewPickUpRequestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPickUpRequestTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) viewPickUpRequestTable.getModel();
        int selectedRowIndex = viewPickUpRequestTable.getSelectedRow();
        DeliveryRequest pr = (DeliveryRequest) dtm.getValueAt(selectedRowIndex, 0);

        populateFoodItemListTable(pr);
    }//GEN-LAST:event_viewPickUpRequestTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable foodItemTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable viewPickUpRequestTable;
    // End of variables declaration//GEN-END:variables
}
