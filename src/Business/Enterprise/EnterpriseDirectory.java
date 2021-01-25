/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type, String address){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.Donar){
            enterprise=new DonarEnterprise(name, address);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Authority){
            enterprise=new AuthorityEnterprise(name, address);
            enterpriseList.add(enterprise);
        }
      
        else if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NGOEnterprise(name, address);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Delivery){
            enterprise=new DeliveryEnterprise(name, address);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
