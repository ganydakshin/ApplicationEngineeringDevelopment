package Business.Product;

import java.util.ArrayList;

public class ProductDirectory {

    private ArrayList<Product> listOfProducts;

    public ProductDirectory() {
        listOfProducts = new ArrayList<Product>();
    }

    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ArrayList<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
    
    public Product addProduct() {
        Product p = new Product();
        listOfProducts.add(p);
        return p;
    }
    
}
