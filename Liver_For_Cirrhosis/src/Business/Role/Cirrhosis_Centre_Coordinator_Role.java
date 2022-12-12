/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Cirrhosis_Centre_Organization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import UI.Cirrhosis_Centre_Coordinator_Role.Cirrhosis_Centre_Coordinator_WorkAreaJPanel;

/**
 *
 * @author satwik
 */
public class Cirrhosis_Centre_Coordinator_Role extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new Cirrhosis_Centre_Coordinator_WorkAreaJPanel(account, (Cirrhosis_Centre_Organization) organization, enterprise, business, network);
    }
}
