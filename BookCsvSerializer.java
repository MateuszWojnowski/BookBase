import java.io.*;

public class BookCsvSerializer implements BookSerializer {

    @Override
    public void save(Book book) throws IOException {

        File csv = new File ("media//BookBase//CSV//Books.csv");
        Writer output = new BufferedWriter(new FileWriter(csv, true));

        output.append(book.getAuthor() + book.getTitle() + book.getPublicationYear() + book.getType()+"\n");
        output.close();
        System.out.println("Zapisano.");
    }
}
