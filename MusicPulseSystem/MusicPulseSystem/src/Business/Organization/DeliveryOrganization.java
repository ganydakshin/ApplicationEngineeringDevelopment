package Business.Organization;

import static Business.Organization.Organization.Type.Delivery;
import Business.Role.Delivery;
import Business.Role.Role;
import java.util.ArrayList;

public class DeliveryOrganization extends Organization {

    public DeliveryOrganization() {
        super(Type.Delivery.getValue());
    }
    
    @Override
    public Role getSupportedRole() {
        Role r = new Delivery();
        return r;
    }

    
    
}
