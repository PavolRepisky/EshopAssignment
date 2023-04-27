import java.util.ArrayList;
import java.util.Comparator;

public class EshopManager {
    private final ArrayList<Product> products = new ArrayList<>();

    public void AddIphone(double price, boolean available, int ram) {
        this.products.add(new IPhone(price, available, ram));
    }

    public void AddIpad(double price, boolean available, boolean simCardSupport) {
        this.products.add(new IPad(price, available, simCardSupport));
    }

    public void AddAppleWatch(double price, boolean available, double displaySize) {
        this.products.add(new AppleWatch(price, available, displaySize));
    }

    public void PrintPriceAndAvailabilityOfTheCheapestItem() {
        Product cheapestItem = products.stream()
                .min(Comparator.comparing(Product::GetPrice))
                .orElse(null);

        if (cheapestItem == null) {
            return;
        }

        System.out.printf(
                "Price: %.2f\nAvailability: %s%n",
                cheapestItem.GetPrice(),
                cheapestItem.IsAvailable() ? "Available" : "Unavailable"
        );
    }
}

