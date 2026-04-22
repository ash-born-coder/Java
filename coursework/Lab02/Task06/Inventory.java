package Task6;

public class Inventory {

    private Item[] items;
    private int itemCount;

    public Inventory() {
        items = new Item[5]; // small to show resizing
        itemCount = 0;
    }

    private void resizeArray() {
        Item[] newArray = new Item[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            newArray[i] = items[i];
        }
        items = newArray;
    }

    public void addItem(Item item) {
        if (itemCount == items.length) {
            resizeArray();
        }
        items[itemCount] = item;
        itemCount++;
    }

    public Item searchByID(int id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItemID() == id) {
                return items[i];
            }
        }
        return null;
    }

    public Item searchByName(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().equalsIgnoreCase(name)) {
                return items[i];
            }
        }
        return null;
    }

    public boolean restock(int id, int qty) {
        Item item = searchByID(id);
        if (item == null || qty <= 0) return false;
        item.setQuantity(item.getQuantity() + qty);
        return true;
    }

    public boolean sell(int id, int qty) {
        Item item = searchByID(id);
        if (item == null || qty <= 0 || item.getQuantity() < qty) return false;
        item.setQuantity(item.getQuantity() - qty);
        return true;
    }

    public void displayLowStock() {
        System.out.println("\nLow Stock Items:");
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].isLowStock()) {
                System.out.println(items[i]);
                found = true;
            }
        }
        if (!found) System.out.println("None");
    }

    public double totalValue() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotalValue();
        }
        return total;
    }

    public void printReport() {
        System.out.println("\n--- Inventory Report ---");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
        System.out.println("Total Inventory Value: " + totalValue());
    }
}
