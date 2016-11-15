package Business.Organization;

import Business.Role.Admin;
import Business.Role.Role;
import java.util.ArrayList;

public class AdminOrganization extends Organization {
    
    public AdminOrganization() {
        super(Type.Admin.getValue());
    }

    @Override
    public Role getSupportedRole() {
        Role r = new Admin();
        return r;
    }
}
