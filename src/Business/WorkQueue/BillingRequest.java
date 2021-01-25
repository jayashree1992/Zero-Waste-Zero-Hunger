/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author jayashree
 */
public class BillingRequest extends WorkRequest{
    
    private boolean billPaid;
    private Date billingDate;
    private Date invoiceDate;
    private DeliveryRequest deliveryrequest;

    public boolean isBillPaid() {
        return billPaid;
    }

    public void setBillPaid(boolean billPaid) {
        this.billPaid = billPaid;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public DeliveryRequest getDeliveryrequest() {
        return deliveryrequest;
    }

    public void setDeliveryrequest(DeliveryRequest deliveryrequest) {
        this.deliveryrequest = deliveryrequest;
    }
    
    
    
    
    
    
}
