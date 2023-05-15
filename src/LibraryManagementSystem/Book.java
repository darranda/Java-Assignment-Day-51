package LibraryManagementSystem;

//Create a class Book that extends LibraryItem
public class Book extends LibraryItem {

    //author (String) and ISBN (String) attributes
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getItemType() {
        return "Book" ;
    }

    @Override
    public String getItemDetails() {
        return  "Title: " + getTitle() + "\n" +
                "Release Year: " + getReleaseYear() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "ISBN: " + getISBN();
    }

    @Override
    public void display() {

    }
}
