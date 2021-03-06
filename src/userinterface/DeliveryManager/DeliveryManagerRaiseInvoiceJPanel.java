/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManager;

import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Network.Network;
import Business.Organization.NGOManagerOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.BillingRequest;
import Business.WorkQueue.DeliveryRequest;
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
public class DeliveryManagerRaiseInvoiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManagerRaiseInvoiceJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Network system;

    public DeliveryManagerRaiseInvoiceJPanel(JPanel userProcessContainer, Organization organization, Network system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        populateInvoiceTable();
        
      
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
        invoiceTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 228, 140));
        setMaximumSize(new java.awt.Dimension(1300, 950));
        setMinimumSize(new java.awt.Dimension(1300, 950));
        setPreferredSize(new java.awt.Dimension(1300, 950));

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bill Status", "Billing Date", "Invoice Date", "Cost", "Bill Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(invoiceTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generate Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("Delivery Manager Work Area - Generate Invoice");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel4.setText("Details for raising Invoice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(440, 440, 440))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addContainerGap(540, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_invoiceTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) invoiceTable.getModel();

        int selectedRowIndex = invoiceTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Select a request for raising bill");
            return;
        }
        
        

        WorkRequest wr = (WorkRequest) dtm.getValueAt(selectedRowIndex, 0);

      
        BillingRequest br = (BillingRequest) wr;
        
        if(br.getInvoiceDate()!=null){
            JOptionPane.showMessageDialog(null, "Invoice already raised");
            return;
        }
        
        br.setInvoiceDate(new Date());
        br.setStatus("Invoice Generated");
        for (Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof NGOEnterprise && br.getDeliveryrequest().getNgoEnterprise().equals(e.getName())) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof NGOManagerOrganization) {
                        o.getWorkQueue().getWorkRequestList().add(br);
                    }
                }
            }
        }
        populateInvoiceTable();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void populateInvoiceTable() {

        DefaultTableModel dtm = (DefaultTableModel) invoiceTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {

            if (wr instanceof BillingRequest) {
                BillingRequest b = (BillingRequest) wr;
                Object row[] = new Object[5];
                row[0] = b;
                row[1] = b.getBillingDate();
                row[2] = b.getInvoiceDate() == null ? "Invoice not yet generated" : b.getInvoiceDate();
                row[3] = b.getDeliveryrequest().getCost();
                row[4] = b.isBillPaid() ? "Yes" : "No";

                dtm.addRow(row);

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable invoiceTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
