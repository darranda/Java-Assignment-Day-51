package LibraryManagementSystem;

//Create a class DVD that extends LibraryItem
public class DVD extends LibraryItem {

    //director (String) and duration (int) attributes
    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + "\n" +
                "Release Year: " + getReleaseYear() + "\n" +
                "Director: " + getDirector() + "\n" +
                "Duration: " + getDuration() + " minutes";
    }


    @Override
    public void display() {

    }
}