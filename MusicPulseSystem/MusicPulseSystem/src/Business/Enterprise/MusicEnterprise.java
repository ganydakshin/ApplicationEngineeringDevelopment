package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

public class MusicEnterprise extends Enterprise {

    public MusicEnterprise(String name) {
        super(name, EnterpriseType.MusicSystem);
    }
    
    @Override
    public Role getSupportedRole() {
        return null;
    }
    
}
