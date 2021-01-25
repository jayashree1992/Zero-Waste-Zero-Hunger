/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DonarManagerRole;
import Business.Role.DonarStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class DonarStaffOrganization extends Organization{
    
    public DonarStaffOrganization() {
        super(Organization.OrganizationType.DonarStaff.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonarStaffRole());
        return roles;
    }
}
