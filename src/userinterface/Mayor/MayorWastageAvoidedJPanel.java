/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Mayor;

import Business.Enterprise.DonarEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Food.FoodItem;
import Business.Network.Network;
import Business.Organization.NGOTestingOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.TestingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
public class MayorWastageAvoidedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MayorWastageAvoidedJPanel
     */
    private JPanel userProcessContainer;
    private Network network;

    public MayorWastageAvoidedJPanel(JPanel userProcessContainer, Network network) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        populateChart();
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
        btnBack1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 228, 140));

        pnlChart.setBackground(new java.awt.Color(204, 204, 255));
        pnlChart.setLayout(new java.awt.BorderLayout());

        btnBack1.setText(" Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("Mayor Work Area - Wastage avoided by each Donar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack1))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateChart() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        double wastageAvoided = 0;
        Map<String, Double> wastageAvoidedMap = new HashMap<String, Double>();
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof NGOEnterprise) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof NGOTestingOrganization) {
                        for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                            TestingRequest tr = (TestingRequest) wr;
                            for (FoodItem fi : tr.getFoodPackage().getFoodItemList()) {
                                 if(fi.getTestResult().isTestPassed()){
                                     String donorEnterprise = tr.getFoodPackage().getDonorEnterprise();
                                     double test = wastageAvoidedMap.getOrDefault(donorEnterprise, 0.0d) + fi.getInPounds();
                                     wastageAvoidedMap.put(donorEnterprise, wastageAvoidedMap.getOrDefault(donorEnterprise, 0.0d) + fi.getInPounds());
                                 }
                            }
                        }
                    }
                }

            }
        }
        
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            if (e instanceof DonarEnterprise) {               
                dataSet.setValue(wastageAvoidedMap.getOrDefault(e.getName(),0.0d), "Wastage Avoided", e.getName());
            }
        }
        
        JFreeChart chart = ChartFactory.createBarChart("Wastage Avoided by each Donar",
                "Donar",
                "Wastage Avoided (In Pounds)",
                dataSet,
                PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChart.removeAll();
        pnlChart.add(chartPanel, BorderLayout.CENTER);
        pnlChart.validate();

    }
    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlChart;
    // End of variables declaration//GEN-END:variables
}
