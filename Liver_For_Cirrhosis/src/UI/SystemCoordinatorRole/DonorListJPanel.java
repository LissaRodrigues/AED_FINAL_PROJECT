/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.SystemCoordinatorRole;

/**
 *
 * @author cheril
 */
public class DonorListJPanel {
   
     private EcoSystem system;
    private Enterprise_Directory Enterprise_Directory;
    private Network network;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public DonorListJPanel(UserAccount userAccount, EcoSystem system, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.system=system;
        this.network=network;
        
        tblDonors.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblHospital.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblAssignment.getTableHeader().setDefaultRenderer(new MyTableFormat());
        
        
        populateDonorTable();
        populateHospitalTable();
        populateRequestTable();
        //this.userProcessContainer=userProcessContainer;        
        //this.donorDirectory = donorDirectory;
    }
    
        private void populateDonorTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblDonors.getModel();
        dtm.setRowCount(0);
        
        for (Donor donor : system.getDonorDirectory().getDonorList()){
            Object row[] = new  Object[4];
            row[0] = donor;
            row[1] = donor.getName();
            row[2] = donor.getContact();
            row[3] = donor.getStatus();
            
            dtm.addRow(row);
        }}
        
        private void populateHospitalTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblHospital.getModel();
        dtm.setRowCount(0);
        
        System.out.println("list of enterprises:");
       // System.out.println(Enterprise_Directory.getEnterpriseList());
        System.out.println("list of enterprises ends");
        System.out.println(network.getName());
        for (Enterprise enterprise : network.getEnterprise_Directory().getEnterpriseList()){
            if(enterprise.getEnterpriseType().toString().equals("Hospital")){
                System.out.println("Hosp");
                Object[] row = new Object[2];
                row[0] = enterprise;
                row[1] = enterprise.getName();
                
                dtm.addRow(row);
        }
        }       
        }
}
