/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NGOStaffRole;
import Business.Role.NGOTesterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class NGOTestingOrganization extends Organization{
    
    public NGOTestingOrganization() {
        super(Organization.OrganizationType.NGOTester.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOTesterRole());
        return roles;
    }
}
