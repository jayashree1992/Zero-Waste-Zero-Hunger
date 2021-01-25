/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.NGOManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class NGOManagerOrganization extends Organization{
    
       public NGOManagerOrganization() {
        super(Organization.OrganizationType.NGOManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOManagerRole());
        return roles;
    }
}
