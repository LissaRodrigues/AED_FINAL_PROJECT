/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author cheril
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;
     
      public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;}
        
         public Organization createOrganization(Organization.Type type, String realName){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SystemCoordinator.getValue())){
            organization = new SystemCoordinatorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MedicalTechnician.getValue())){
            organization = new MedicalTechnicianOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
}
