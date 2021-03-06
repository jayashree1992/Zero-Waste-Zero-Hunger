/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonarStaff;

import Business.Food.FoodItem;
import Business.Food.FoodList;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryRequest;
import Business.WorkQueue.FoodPickUpRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jayashree
 */
public class DonarStaffViewPickUpRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonarStaffViewPickUpRequestJPanel
     */
    JPanel userProcessContainer;
    UserAccount donarStaffAccount;
    
    public DonarStaffViewPickUpRequestJPanel(JPanel userProcessContainer, UserAccount donarStaffAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.donarStaffAccount = donarStaffAccount;
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

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPickUpRequestTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        foodItemTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setText("Donar Staff Work Area - Raise Pick Up Request");

        setBackground(new java.awt.Color(255, 228, 140));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewPickUpRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Request Date", "Collected By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        viewPickUpRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPickUpRequestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewPickUpRequestTable);

        jLabel3.setText("**Select a request to view it's food items**");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel2.setText("Food Items in the Selected Request");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel1.setText("Log of Pickup Requests Raised");

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
        jLabel5.setText("Donar Staff Work Area - View Pick Up Request Log");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                        .addComponent(jScrollPane3))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewPickUpRequestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPickUpRequestTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) viewPickUpRequestTable.getModel();
        int selectedRowIndex = viewPickUpRequestTable.getSelectedRow();
        FoodPickUpRequest pr = (FoodPickUpRequest) dtm.getValueAt(selectedRowIndex, 0);
        
        populateFoodItemListTable(pr);
    }//GEN-LAST:event_viewPickUpRequestTableMouseClicked

    private void populateTable(){
        
       
        DefaultTableModel dtm = (DefaultTableModel) viewPickUpRequestTable.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr : donarStaffAccount.getWorkQueue().getWorkRequestList()){
            FoodPickUpRequest pr =  (FoodPickUpRequest)wr;
            Object row[] = new Object[3];
            row[0] = wr;
            row[1] = wr.getRequestDate();
           
            row[2] = pr.getDeliveryPerson() == null ? "Not yet pickedup" : pr.getDeliveryPerson();
            dtm.addRow(row);
            
           
            
        }
    }
    
    private void populateFoodItemListTable(FoodPickUpRequest pr){
        
        DefaultTableModel dtm = (DefaultTableModel) foodItemTable.getModel();
        dtm.setRowCount(0);
        for(FoodItem item : pr.getFoodItemList()){
            Object row[] = new Object[4];
            row[0] = item.getFoodItemName();
            row[1] = item.getQuantity();
            row[2] = Math.round(FoodList.getFoodInPounds().get(item.getFoodItemName()) * item.getQuantity() * 100.0) / 100.0; 
          //  row[3] = item.getHoursToPerish();
            row[3] = FoodList.getFoodPrice().get(item.getFoodItemName()) * item.getQuantity();
            dtm.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable foodItemTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable viewPickUpRequestTable;
    // End of variables declaration//GEN-END:variables
}
