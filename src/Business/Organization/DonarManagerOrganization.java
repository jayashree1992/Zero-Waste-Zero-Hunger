/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DonarManagerRole;
import Business.Role.MayorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class DonarManagerOrganization extends Organization {
    
    public DonarManagerOrganization() {
        super(Organization.OrganizationType.DonarManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonarManagerRole());
        return roles;
    }
}
