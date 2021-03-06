/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOTestingDepartment;

import Business.Enterprise.Enterprise;
import Business.Food.FoodItem;
import Business.Food.FoodList;
import Business.Organization.Organization;
import Business.WorkQueue.TestingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jayashree
 */
public class NGOTestingDepartmentCompletedTestingLogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOTestingDepartmentCompletedTestingLogJPanel
     */
    
    private JPanel userProcessContainer;
   private  Organization organization;
    private Enterprise enterprise;
     private TestingRequest testingRequest;

    public NGOTestingDepartmentCompletedTestingLogJPanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise) {
        initComponents();
       
           
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
         populateTable();
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
        testingTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        foodItemTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 228, 140));

        testingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Received Date", "Requestor", "Status", "Testing done date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        testingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(testingTable);

        foodItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity", "Quantity in Pounds"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        foodItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodItemTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(foodItemTable);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setText("NGO Tester Work Area - Completed Tests Log");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel7.setText("Tests Completed");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel8.setText("FoodItems in the selected test request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) testingTable.getModel();

        dtm.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            TestingRequest tr = (TestingRequest) wr;
            
            if(tr.getStatus().equals("Testing Completed")){
                Object row[] = new Object[4];
                row[0] = tr.getRequestDate();
                row[1] = tr.getSender();
                row[2] = tr;
                row[3] = tr.getResolveDate();
                dtm.addRow(row);
            }

              
            

        }
    }
    
      private void populateFoodItemTable(TestingRequest tr) {

        DefaultTableModel dtmi = (DefaultTableModel) foodItemTable.getModel();
        dtmi.setRowCount(0);

        for (FoodItem fi : tr.getFoodPackage().getFoodItemList()) {
            Object row[] = new Object[3];
            row[0] = fi;
            row[1] = fi.getQuantity();
            row[2] = FoodList.getFoodInPounds().get(fi.getFoodItemName()) * fi.getQuantity();
           
          
            dtmi.addRow(row);
        }
    }
      
    private void testingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testingTableMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) testingTable.getModel();
        int selectedIndex = testingTable.getSelectedRow();

       

        TestingRequest tr = (TestingRequest) dtm.getValueAt(selectedIndex, 2);
        testingRequest = tr;
       


        populateFoodItemTable(tr);

       
    }//GEN-LAST:event_testingTableMouseClicked

    private void foodItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodItemTableMouseClicked
        // TODO add your handling code here:

     

     

     
    }//GEN-LAST:event_foodItemTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable foodItemTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable testingTable;
    // End of variables declaration//GEN-END:variables
}
