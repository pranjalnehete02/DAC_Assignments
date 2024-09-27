import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Item class with itemCode, itemName, price, and quantity
class Item {
    private String itemCode;
    private String itemName;
    private double price;
    private int quantity;

    public Item(String itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

public class BillingSystem {
    private static List<Item> stock = new ArrayList<>();
    private static List<Item> customerCart = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize stock with JSON data
        initializeStock();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Display stock");
            System.out.println("2. Buy item by item code");
            System.out.println("3. Display bill");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayStock();
                    break;
                case 2:
                    buyItem(scanner);
                    break;
                case 3:
                    displayBill();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void initializeStock() {
        stock.add(new Item("P001", "Toothpaste", 50, 100));
        stock.add(new Item("P002", "Shampoo", 150, 50));
        stock.add(new Item("P003", "Soap", 30, 200));
        stock.add(new Item("P004", "Rice", 60, 75));
        stock.add(new Item("P005", "Sugar", 40, 120));
        stock.add(new Item("P006", "Salt", 20, 300));
        stock.add(new Item("P007", "Cooking Oil", 120, 80));
        stock.add(new Item("P008", "Biscuits", 25, 150));
        stock.add(new Item("P009", "Tea", 90, 60));
        stock.add(new Item("P010", "Coffee", 110, 40));
    }

    private static void displayStock() {
        System.out.println("Stock:");
        for (Item item : stock) {
            System.out.println(item);
        }
    }

    private static void buyItem(Scanner scanner) {
        System.out.print("Enter item code: ");
        String itemCode = scanner.next();
        Item itemToBuy = null;

        for (Item item : stock) {
            if (item.getItemCode().equals(itemCode)) {
                itemToBuy = item;
                break;
            }
        }

        if (itemToBuy != null) {
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            if (quantity <= itemToBuy.getQuantity()) {
                customerCart.add(new Item(itemToBuy.getItemCode(), itemToBuy.getItemName(), itemToBuy.getPrice(), quantity));
                itemToBuy = new Item(itemToBuy.getItemCode(), itemToBuy.getItemName(), itemToBuy.getPrice(), itemToBuy.getQuantity() - quantity);
                System.out.println("Item added to cart.");
            } else {
                System.out.println("Insufficient stock.");
            }
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void displayBill() {
        double total = 0;
        System.out.println("Bill:");
        for (Item item : customerCart) {
            System.out.println(item);
            total += item.getPrice() * item.getQuantity();
        }
        System.out.println("Total: " + total);
    }
}
