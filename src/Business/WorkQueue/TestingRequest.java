/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author jayashree
 */
public class TestingRequest extends WorkRequest {
    
    private boolean testComplete;    
    private FoodPickUpRequest foodPackage;

    public FoodPickUpRequest getFoodPackage() {
        return foodPackage;
    }

    public void setFoodPackage(FoodPickUpRequest foodPackage) {
        this.foodPackage = foodPackage;
    }

    public boolean isTestComplete() {
        return testComplete;
    }

    public void setTestComplete(boolean testComplete) {
        this.testComplete = testComplete;
    }

    
   
}
