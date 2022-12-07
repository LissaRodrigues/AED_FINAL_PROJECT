/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DIG.DiagnosisType;
import Business.DIG.PersonDIGType;
import Business.Role.DoctorRole;
import Business.Role.Liver_Bank_CoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cheril
 */
public class Liver_Bank_Organization extends Organization{
        DiagnosisType inventory;
    
    public Liver_Bank_Organization() {
        super(Organization.BoneMarrowBankType.BoneMarrowBank.getValue());
        inventory = new DiagnosisType();
        PersonDIGType h = new PersonDIGType();
        h.updateHLAlist("HLA_A,HLA_B");
        inventory.HLACountAdd(h,6);
        h = new PersonDIGType();
        h.updateHLAlist("HLA_A");
        inventory.HLACountAdd(h,5);
        h = new PersonDIGType();
        h.updateHLAlist("HLA_A,HLA_B,HLA_C");
        inventory.HLACountAdd(h,7);
    }

    public DiagnosisType getInventory() {
        return inventory;
    }
    
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getHlaComboCounts();
    }

    public void setInventory(DiagnosisType inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Liver_Bank_CoordinatorRole());
        return roles;
    }
     
    
}
