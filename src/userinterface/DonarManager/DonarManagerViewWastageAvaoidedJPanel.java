/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonarManager;

import Business.Enterprise.Enterprise;
import Business.Food.FoodItem;
import Business.Food.FoodList;
import Business.Organization.DonarStaffOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodPickUpRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author jayashree
 */
public class DonarManagerViewWastageAvaoidedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonarManagerViewWastageAvaoidedJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public DonarManagerViewWastageAvaoidedJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateWastageAvoided();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChart = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 228, 140));

        pnlChart.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("Donar Manager Work Area - View Wastage avoided by Staff");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(532, 532, 532)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void populateWastageAvoided() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        double wastageAvoided = 0;

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DonarStaffOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    String name = ua.getEmployee().getName();
                    for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                            FoodPickUpRequest pr = (FoodPickUpRequest) wr;
                            for (FoodItem fi : pr.getFoodItemList()) {
                                wastageAvoided += fi.getInPounds();
                            }
                    }
                    dataSet.setValue(wastageAvoided, "Wastage Avoided (in pounds)", name);
                    wastageAvoided = 0;
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Wastage Avoided by each Employee",
                "Employee",
                "Wastage Avoided(In Pounds)",
                dataSet,
                PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        // ChartFrame chartFrame = new ChartFrame("Wastage Avoided by each Employee", chart, true);
        // chartFrame.setVisible(true);
        // chartFrame.setSize(500,400); 
        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChart.removeAll();
        pnlChart.add(chartPanel, BorderLayout.CENTER);
        pnlChart.validate();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlChart;
    // End of variables declaration//GEN-END:variables
}
