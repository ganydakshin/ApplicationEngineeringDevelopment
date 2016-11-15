package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.UserFeedback.WorkQueue1;
import Business.WorkQueue.WorkQueue;

public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private WorkQueue1 workQueue1;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin"), User("User"), Manager("ManagerOrganization"), Delivery("DeliveryOrganization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue1 = new WorkQueue1();
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract Role getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue1 getWorkQueue1() {
        return workQueue1;
    }

    public void setWorkQueue1(WorkQueue1 workQueue1) {
        this.workQueue1 = workQueue1;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
