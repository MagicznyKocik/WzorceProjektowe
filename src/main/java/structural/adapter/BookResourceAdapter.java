package structural.adapter;

public class BookResourceAdapter implements ResourceProduct {

    private final Book book;

    public BookResourceAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String gerPicture() {
        return book.frontPicture();
    }

    @Override
    public String getContent() {
        return book.title() + "\n" + book.biogrphy();
    }
}
