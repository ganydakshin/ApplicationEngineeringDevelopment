package Business.Employee;

import java.util.ArrayList;

public class EmployeeDirectory {

    private ArrayList<Employee> listOfEmployees;
    
    public EmployeeDirectory() {
        listOfEmployees= new ArrayList<Employee>();
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
    
    public Employee createEmployee() {
        Employee employee = new Employee();
        listOfEmployees.add(employee);
        return employee;
    }
}
