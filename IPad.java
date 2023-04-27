public class IPad extends Product {
    private final boolean simCardSupport;

    public IPad(double price, boolean available, boolean simCardSupport) {
        super(price, available);
        this.simCardSupport = simCardSupport;
    }

    public boolean SupportsSimCard() {
        return simCardSupport;
    }
}
