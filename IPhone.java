public class IPhone extends Product {
    private final int ram;

    public IPhone(double price, boolean available, int ram) {
        super(price, available);
        this.ram = ram;
    }

    public int GetRam() {
        return ram;
    }
}
