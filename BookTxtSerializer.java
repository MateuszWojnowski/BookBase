import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BookTxtSerializer implements BookSerializer {

    @Override
    public void save(Book book) throws IOException {

        File txt = new File ("media//BookBase//TXT//Books.txt");
        Writer output = new BufferedWriter(new FileWriter(txt, true));

        output.append(book.getAuthor() + " - " + book.getTitle() + ", rok wydania: " + book.getPublicationYear() + ", kategoria: " + book.getType()+"\n");
        output.close();
        System.out.println("Zapisano.");
    }
}
