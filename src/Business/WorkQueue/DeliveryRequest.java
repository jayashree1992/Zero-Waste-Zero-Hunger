/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Food.FoodItem;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author jayashree
 */
public class DeliveryRequest extends WorkRequest {
    private FoodPickUpRequest pickupRequest;
    private int cost;
    private long deliveryTime;
    private String pickupLocation;
    private String dropOffLocation;
    private String donorEnterprise;
    private String ngoEnterprise;
    private String deliveryEnterprise;
    private Date pickupTime;
    private Date dropOfTime;
    private UserAccount deliveryPerson;
    private boolean sentForTesting;
    
    public FoodPickUpRequest getPickupRequest() {
        return pickupRequest;
    }

    public void setPickupRequest(FoodPickUpRequest pickupRequest) {
        this.pickupRequest = pickupRequest;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public long getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime() {
        long diff = dropOfTime.getTime() - pickupTime.getTime();
        long diffSeconds = diff / 1000 % 60;
        this.deliveryTime = diffSeconds;
    }

    public Date getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Date getDropOfTime() {
        return dropOfTime;
    }

    public void setDropOfTime(Date dropOfTime) {
        this.dropOfTime = dropOfTime;
    }

    public UserAccount getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(UserAccount deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    } 

    public String getDonorEnterprise() {
        return donorEnterprise;
    }

    public void setDonorEnterprise(String donorEnterprise) {
        this.donorEnterprise = donorEnterprise;
    }

    public String getNgoEnterprise() {
        return ngoEnterprise;
    }

    public void setNgoEnterprise(String ngoEnterprise) {
        this.ngoEnterprise = ngoEnterprise;
    }

    public String getDeliveryEnterprise() {
        return deliveryEnterprise;
    }

    public void setDeliveryEnterprise(String deliveryEnterprise) {
        this.deliveryEnterprise = deliveryEnterprise;
    }

    public boolean isSentForTesting() {
        return sentForTesting;
    }

    public void setSentForTesting(boolean sentForTesting) {
        this.sentForTesting = sentForTesting;
    }
    
    
    
}
