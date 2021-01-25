package Business.Inventory;


import Business.Food.FoodItem;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayashree
 */
public class Inventory {
    
   private List<FoodItem> edibleInventory;
   private List<FoodItem> wasteInventory;
   private List<Packet> distributedInventory;

    public Inventory() {
        this.edibleInventory = new ArrayList<FoodItem>();
        this.wasteInventory = new ArrayList<FoodItem>();
        this.distributedInventory = new ArrayList<Packet>();
    }

    public List<FoodItem> getEdibleInventory() {
        return edibleInventory;
    }

    public void setEdibleInventory(List<FoodItem> edibleInventory) {
        this.edibleInventory = edibleInventory;
    }

    public List<FoodItem> getWasteInventory() {
        return wasteInventory;
    }

    public void setWasteInventory(List<FoodItem> wasteInventory) {
        this.wasteInventory = wasteInventory;
    }

    public List<Packet> getDistributedInventory() {
        return distributedInventory;
    }

    public void setDistributedInventory(List<Packet> distributedInventory) {
        this.distributedInventory = distributedInventory;
    }


   

   
}
