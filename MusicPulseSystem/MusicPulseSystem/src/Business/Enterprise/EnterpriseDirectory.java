package Business.Enterprise;

import java.util.ArrayList;

public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.MusicSystem){
            enterprise = new MusicEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
