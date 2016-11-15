package Business.Organization;

import Business.Role.Role;
import Business.Role.User;

public class UserOrganization extends Organization {

    public UserOrganization() {
        super(Type.User.getValue());
    }
    
    @Override
    public Role getSupportedRole() {
        Role r = new User();
        return r;
    }

    
    
}
