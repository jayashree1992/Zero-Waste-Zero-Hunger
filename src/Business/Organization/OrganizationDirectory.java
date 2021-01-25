/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(OrganizationType type){
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.NGOManager.getValue())){
            organization = new NGOManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.NGOTester.getValue())){
            organization = new NGOTestingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.NGOStaff.getValue())){
            organization = new NGOStaffOrganization();
            organizationList.add(organization);
        }
      
        else if (type.getValue().equals(OrganizationType.DeliveryManager.getValue())){
            organization = new DeliveryManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.DeliveryStaff.getValue())){
            organization = new DeliveryStaffOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.Mayor.getValue())){
            organization = new MayorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.DonarManager.getValue())){
            organization = new DonarManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.DonarStaff.getValue())){
            organization = new DonarStaffOrganization();
            organizationList.add(organization);
        }
      
        return organization;
    }
}