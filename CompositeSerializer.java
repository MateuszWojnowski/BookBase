import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompositeSerializer implements BookSerializer {

    @Override
    public void save(Book book) throws IOException {

        List <BookSerializer> list = this.createList();

        for (BookSerializer s : list) {
            s.save(book);
        }
    }

    private List createList () {
        List <BookSerializer> list = new ArrayList <> ();
        list.add(new BookTxtSerializer());
        list.add(new BookHtmlSerializer());
        list.add(new BookCsvSerializer());
        return list;
    }
}
