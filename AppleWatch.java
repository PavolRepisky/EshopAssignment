public class AppleWatch extends Product {
    private final double displaySize;

    public AppleWatch(double price, boolean available, double displaySize) {
        super(price, available);
        this.displaySize = displaySize;
    }

    public double GetDisplaySize() {
        return displaySize;
    }
}
