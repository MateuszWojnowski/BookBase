import java.io.*;

public class BookHtmlSerializer implements BookSerializer {
    @Override
    public void save(Book book) throws IOException {

        File html = new File ("media//BookBase//HTML//Books.html");
        Writer output = new BufferedWriter(new FileWriter(html, true));

        output.append(book.getAuthor() + " - " + book.getTitle() + ", rok wydania: " + book.getPublicationYear() + ", kategoria: " + book.getType()+"<br>\n");
        output.close();
        System.out.println("Zapisano.");
    }
}
