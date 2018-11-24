package structural.adapter;

public class FantasyBook implements Book {

    private String biography, title, frontPicture;

    public FantasyBook(String biography, String title, String frontPicture) {
        this.biography = biography;
        this.title = title;
        this.frontPicture = frontPicture;
    }

    @Override
    public String biogrphy() {
        return biography;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public String frontPicture() {
        return frontPicture;
    }
}
