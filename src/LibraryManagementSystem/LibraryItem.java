package LibraryManagementSystem;

//Create an abstract class LibraryItem
public abstract class LibraryItem {

    //title (String) attribute
    private String title;

    //releaseYear (int) attribute
    private int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    //String getItemType()
    public abstract String getItemType();

    //String getItemDetails()
    public abstract String getItemDetails();

    public abstract void display();
}
