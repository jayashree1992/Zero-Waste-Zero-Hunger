/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jayashree
 */
public class FoodList {
    
    private static Map<String,Double> foodInPounds;
    private static Map<String,Integer> foodPrice;
    
    public static void initialize(){
        foodInPounds = new HashMap<String,Double>();
        foodPrice = new HashMap<String,Integer>();
        
        foodInPounds.put("Sandwhich", 1d);
        foodInPounds.put("Pizza", 0.75d);
        foodInPounds.put("Egg", 2d);
        foodInPounds.put("Bagel", 0.05d);
        foodInPounds.put("Salad", 1d);
        foodInPounds.put("Rice", 2d);
        foodInPounds.put("Burrito", 1d);
        foodInPounds.put("Cake", 3d);
        foodInPounds.put("Meat", 1d);
        foodInPounds.put("Fish", 2d);
        
        foodPrice.put("Sandwhich", 3);
        foodPrice.put("Pizza", 2);
        foodPrice.put("Egg", 1);
        foodPrice.put("Bagel", 3);
        foodPrice.put("Salad", 4);
        foodPrice.put("Rice", 5);
        foodPrice.put("Burrito", 3);
        foodPrice.put("Cake", 6);
        foodPrice.put("Meat", 2);
        foodPrice.put("Fish", 4);
        
    }

    public static Map<String, Double> getFoodInPounds() {
        return foodInPounds;
    }

    public static void setFoodInPounds(Map<String, Double> foodInPounds) {
        FoodList.foodInPounds = foodInPounds;
    }

    public static Map<String, Integer> getFoodPrice() {
        return foodPrice;
    }

    public static void setFoodPrice(Map<String, Integer> foodPrice) {
        FoodList.foodPrice = foodPrice;
    }
    
    
    
}
