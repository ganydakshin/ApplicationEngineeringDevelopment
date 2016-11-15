package Business.Organization;

import Business.Role.Manager;
import Business.Role.Role;
import java.util.ArrayList;

public class ManagerOrganization extends Organization {

    public ManagerOrganization() {
        super(Type.Manager.getValue());
    }
    
    @Override
    public Role getSupportedRole() {
        Role r = new Manager();
        return r;
    }

    
}
