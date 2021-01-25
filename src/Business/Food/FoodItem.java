/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

/**
 *
 * @author jayashree
 */
public class FoodItem implements Cloneable{
    
    private String foodItemName;
    private int quantity;
    private int hoursToPerish;
    private String restaurantName;
    private String ngoName;
    private TestResult testResult;
    

    public FoodItem(String foodItemName, int quantity, String restaurantName) {
        this.foodItemName = foodItemName;
        this.quantity = quantity;
        this.restaurantName= restaurantName;
       // this.hoursToPerish = hoursToPerish;
        testResult = new TestResult();
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getHoursToPerish() {
        return hoursToPerish;
    }

    public void setHoursToPerish(int hoursToPerish) {
        this.hoursToPerish = hoursToPerish;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    } 

    public TestResult getTestResult() {
        return testResult;
    }

    public void setTestResult(TestResult testResult) {
        this.testResult = testResult;
    }  
    
    public double getInPounds(){
        return Math.round(FoodList.getFoodInPounds().get(foodItemName) * quantity * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return foodItemName;
    }
    
    
    public Object clone() throws
                   CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
}
