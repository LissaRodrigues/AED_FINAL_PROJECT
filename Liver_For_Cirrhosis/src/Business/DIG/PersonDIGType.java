/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DIG;

import java.util.ArrayList;

/**
 *
 * @author satwik
 */
public class PersonDIGType {
    private ArrayList<HLAType> hlaList = new ArrayList();
    
    public PersonDIGType() {
        hlaList = new ArrayList<>();
    }
    
    public enum HLAType{
        DIAG_A("DIAG_A"),
        DIAG_B("DIAG_B"),
        DIAG_C("DIAG_C"),
        DIAG_DR("DIAG_DR"),
        DIAG_DBQ1("DIAG_DBQ1");
        
        private String value;
        private HLAType(String value){
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

    public ArrayList<HLAType> getHlaList() {
        return hlaList;
    }
    
    public ArrayList<String> getHlaValuesList() {
        ArrayList<String> hlaValuesList = new ArrayList<String>();
        for(HLAType h : this.hlaList) {
            hlaValuesList.add(h.getValue());
        }
        
        return hlaValuesList;
    }

    public void setHlaList(ArrayList<HLAType> hlaList) {
        this.hlaList = hlaList;
    }
    
    public void addHLA(HLAType hlaType) {
        
        for(HLAType t : this.getHlaList()) {
            if(t.getValue().equals(hlaType.getValue())) {
                System.out.println("HLAType already in patient's HLA List");
                return;
            }
        }
        
        this.getHlaList().add(hlaType);
    }
    
    public void updateHLAlist(String hlaList) {
        this.hlaList = new ArrayList<HLAType>();
        try {
            for(String hlaType: hlaList.split(",")) {
                this.hlaList.add(HLAType.valueOf(hlaType.trim()));
            }
        }
        catch (Exception e){
            System.out.println(e);
            this.hlaList.add(HLAType.valueOf(hlaList));
        }
//        return this;
    }
    
    public void removeHLA(HLAType hlaType) {

        this.getHlaList().remove(hlaType);
    }
    
    public static PersonDIGType createHLA(String hlaList) {
        PersonDIGType pHLA = new PersonDIGType();
        pHLA.updateHLAlist(hlaList);
        return pHLA;
    }
    
}
