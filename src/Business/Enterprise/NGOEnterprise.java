/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.Inventory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class NGOEnterprise extends Enterprise {
    
    private Inventory inventory;
    
    public NGOEnterprise(String name, String address){
        super(name,Enterprise.EnterpriseType.NGO, address);
        System.out.print("Hello1");
        inventory = new Inventory();
        System.out.print("Hello2");
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
}
