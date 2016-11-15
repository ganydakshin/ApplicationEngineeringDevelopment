package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

public class ConfigureASystem {

    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee();
        employee.setName("Gany");
        employee.setAge(25);
        employee.setGender("M");
        employee.setMailId("gany.dakshin@gmail.com");
        employee.setSsn(20101990);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}    
