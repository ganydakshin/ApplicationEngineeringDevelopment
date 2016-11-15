
package Business.WorkQueue;

import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;

public class WorkRequest {
    
    private ProductDirectory listOfProducts;
    private String status;
    private UserAccount customer;
    
    public WorkRequest () {
        listOfProducts = new ProductDirectory();
        //customer = new Employee();
    }

    public ProductDirectory getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ProductDirectory listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }
    
    

//    public Employee getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Employee customer) {
//        this.customer = customer;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return customer.getUsername();
    }
    
    
}

