package LibraryManagementSystem;


//Implement the interface LibraryOperations<T> in a class LibraryManager<T extends LibraryItem>
//using generics, with the following methods:
//void addItem(T item)
//void removeItem(T item)
//void displayItems()
public interface LibraryOperations<T> {
    void addItem(T item);
    void removeItem(T item);
    void displayItems();
}
