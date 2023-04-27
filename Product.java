public abstract class Product {
    private double price;
    private boolean available;

    public Product(double price, boolean available) {
        this.price = price;
        this.available = available;
    }
    public double GetPrice() {
        return price;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public boolean IsAvailable() {
        return available;
    }

    public void SetIsAvailable(boolean available) {
        this.available = available;
    }
}
