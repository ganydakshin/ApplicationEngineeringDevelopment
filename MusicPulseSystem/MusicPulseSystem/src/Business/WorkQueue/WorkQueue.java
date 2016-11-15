/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import java.util.ArrayList;

/**
 *
 * @author GANY
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> listOfWorkRequest; 
    
    public WorkQueue () {
        listOfWorkRequest = new ArrayList<>();
    }
    
    public ArrayList<WorkRequest> getListOfWorkRequest() {
        return listOfWorkRequest;
    }

    public void setListOfWorkRequest(ArrayList<WorkRequest> listOfWorkRequest) {
        this.listOfWorkRequest = listOfWorkRequest;
    }
    
    
}
