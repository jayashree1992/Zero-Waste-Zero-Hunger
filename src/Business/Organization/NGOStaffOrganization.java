/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.NGOStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class NGOStaffOrganization extends Organization{
    
    
        public NGOStaffOrganization() {
        super(Organization.OrganizationType.NGOStaff.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOStaffRole());
        return roles;
    }
}
