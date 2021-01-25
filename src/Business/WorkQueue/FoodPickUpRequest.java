/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import Business.Food.FoodItem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jayashree
 */
public class FoodPickUpRequest extends WorkRequest{
    private List<FoodItem>  foodItemList;
    private UserAccount deliveryPerson;
    private String pickupLocation;
    private String donorEnterprise;
   

    public FoodPickUpRequest() {
        this.foodItemList = new ArrayList<FoodItem>();
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
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

    public String getDonorEnterprise() {
        return donorEnterprise;
    }

    public void setDonorEnterprise(String donorEnterprise) {
        this.donorEnterprise = donorEnterprise;
    }
    
    
}
