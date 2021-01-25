/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayashree
 */
public class AuthorityEnterprise extends Enterprise{
 
        public AuthorityEnterprise(String name, String address){
        super(name,Enterprise.EnterpriseType.Authority, address);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
