/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NGOManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

import userinterface.NGOManager.NGOManagerWorkAreaJPanel;



/**
 *
 * @author jayashree
 */
public class NGOManagerRole extends Role{
    
    public NGOManagerRole() {
        super(RoleType.NGOManager);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
       return new NGOManagerWorkAreaJPanel(userProcessContainer, (NGOManagerOrganization) organization, enterprise, account, network);
    }
}
