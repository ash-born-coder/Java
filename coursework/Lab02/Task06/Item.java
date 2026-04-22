package Task6;

public class Item {

    private String name;
    private int itemID;
    private int quantity;
    private double price;

    public Item(String name, int itemID, int quantity, double price) {
        this.name = name;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalValue() {
        return quantity * price;
    }

    public boolean isLowStock() {
        return quantity < 5;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getItemID() { return itemID; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Item[ID: " + itemID + ", Name: " + name +
                ", Qty: " + quantity + ", Price: " + price +
                ", TotalValue: " + getTotalValue() + "]";
    }
}
