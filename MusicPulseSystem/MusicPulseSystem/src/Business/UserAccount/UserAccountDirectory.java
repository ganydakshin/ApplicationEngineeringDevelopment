package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

public class UserAccountDirectory {
    
    private ArrayList<UserAccount> listOfUserAccounts;
    
    public UserAccountDirectory() {
        listOfUserAccounts = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getListOfUserAccounts() {
        return listOfUserAccounts;
    }

    public void setListOfUserAccounts(ArrayList<UserAccount> listOfUserAccounts) {
        this.listOfUserAccounts = listOfUserAccounts;
    }

    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : listOfUserAccounts)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        listOfUserAccounts.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : listOfUserAccounts){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
