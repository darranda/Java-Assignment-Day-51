package LibraryManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {

    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("Item added to the library: " + item.getTitle());
    }

    public void removeItem(T item) {
        boolean removed = items.remove(item);
        if (removed) {
            System.out.println("Item removed from the library: " + item.getTitle());
        }
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("There are no items in the library.");
        } else {
            System.out.println("Library items:");
            for (T item : items) {
                item.display();
                System.out.println(item.getItemDetails());
            }
        }
    }
}
