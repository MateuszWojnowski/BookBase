import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Book {

    private String author;
    private String title;
    private int publicationYear;
    private BookType type;

    public String getAuthor () {
        return this.author;
    }

    public String getTitle () {
        return this.title;
    }

    public int getPublicationYear () {
        return this.publicationYear;
    }

    public BookType getType () {
        return this.type;
    }

    public Book (String author, String title, int publicationYear, BookType type) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.type = type;
    }
}
