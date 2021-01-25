/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author jayashree
 */
public class DeliveryStaff extends Employee {
    
    private boolean isAvailable;

    public DeliveryStaff(boolean isAvailable) {
        super();
        this.isAvailable = isAvailable;
    }


    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    

    
}

