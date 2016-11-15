package Business.Organization;

import java.util.ArrayList;

public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.User.getValue())){
            organization = new UserOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.Manager.getValue())) {
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.Delivery.getValue())) {
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
