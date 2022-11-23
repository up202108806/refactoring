package pt.up.fe.ldts.example1;

public class OrderLine {
    private Product product;
    private int quantity;
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return getProduct().getPrice() * getQuantity();
    }

    @Override
    public String toString() {
        return getProduct().getName() + "(x" + getQuantity() + "): " + (getTotal());
    }
}