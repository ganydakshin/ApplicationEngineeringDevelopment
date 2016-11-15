package Business.Product;

public class Product {

    private int productId;
    private String productName;
    private int productPrice;
    private int productQuantity;

    public int getTempQuantity() {
        return tempQuantity;
    }

    public void setTempQuantity(int tempQuantity) {
        this.tempQuantity = tempQuantity;
    }
    private int tempQuantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return productName;
    }

}
