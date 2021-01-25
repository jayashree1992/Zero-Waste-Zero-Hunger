/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class DeliveryManagerOrganization extends Organization{
    
     public DeliveryManagerOrganization() {
        super(Organization.OrganizationType.DeliveryManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManagerRole());
        return roles;
    }
     
}
