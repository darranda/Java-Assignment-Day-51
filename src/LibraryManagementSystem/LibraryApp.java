package LibraryManagementSystem;

public class LibraryApp {
    public static void main(String[] args) {

        Book book1 = new Book("The Chronicles of Narnia", 1950, "C.S.Lewis", "978-0064471046");
        Book book2 = new Book("Matilda", 1988, "Roald Dahl", "978-0142410370");
        Book book3 = new Book("The Cat in the Hat", 1957, "Dr. Seuss", "978-0394800011");
        DVD dvd1 = new DVD("Frozen", 2010, "Chris Buck and Jennifer Lee", 102);
        DVD dvd2 = new DVD("Toy Story", 1994, "John Lasseter", 81);
        DVD dvd3 = new DVD("Moana", 2016, "Ron Clements and John Musker", 107);

        // LibraryManager instance
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        // Add
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(book3);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);
        libraryManager.addItem(dvd3);

        // Display the list
        libraryManager.displayItems();


        // Remove
        libraryManager.removeItem(book3);
        libraryManager.removeItem(book1);

        // Display updated list
        libraryManager.displayItems();
    }
}