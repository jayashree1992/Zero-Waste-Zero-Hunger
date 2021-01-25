/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public RoleType roleType;

    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        DonarManager("Donar Manager"),
        DonarStaff("Donar Staff"),
        DeliveryManager("Delivery Manager"),
        DeliveryStaff("Delivery Staff"),
        NGOManager("NGO Manager"),
        NGOStaff("NGO Staff"),
        NGOTester("NGO Tester"),
        Mayor("Mayor"),
        EnterpriseAdmin("Enterprise Admin"),
        SystemAdmin("System Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public Role(RoleType roleType) {
        this.roleType = roleType;
    }

    public RoleType getRoleType() {
        return roleType;
    }
    
    public abstract JPanel createWorkArea(
            JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        int index = this.getClass().getName().lastIndexOf('.');
        return this.getClass().getName().substring(index+1);
    }
    
    
}