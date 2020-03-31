import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner (System.in);
    BookPrinter printer = new BookPrinter();
    BookCreator bookCreator = new BookCreator();
    int check;

    public void showMenu () throws IOException {
        System.out.println("1. Dodaj nowa ksiazke\n2. Wyswietl ksiazki");

        this.getCorrectCheck(2);

        switch (check) {
            case 1:
                this.addBook();
                break;
            case 2:
                this.printBooks();
                break;
        }
    }

    private void addBook () throws IOException {
        BookSerializer serializer;
        Book newBook = bookCreator.createBook();

        System.out.println("Zapisz do formatu:\n1. txt\n2. html\n3. csv\n4. do wszystkich");

        this.getCorrectCheck(4);

            switch (check) {
                case 1:
                    serializer = new BookTxtSerializer();
                    serializer.save(newBook);
                    break;
                case 2:
                    serializer = new BookHtmlSerializer();
                    serializer.save(newBook);
                    break;
                case 3:
                    serializer = new BookCsvSerializer();
                    serializer.save(newBook);
                    break;
                case 4:
                    serializer = new CompositeSerializer();
                    serializer.save(newBook);
            }
    }

    private void printBooks () throws FileNotFoundException {
        System.out.println("Wyswietl format:\n1. txt\n2. html\n3. csv");

        this.getCorrectCheck(3);
        while (check != 1 && check != 2 && check != 3) {
            check = scan.nextInt();
        }
            switch (check) {
                case 1:
                    printer.printTxtBooks();
                    break;
                case 2:
                    printer.printHtmlBooks();
                    break;
                case 3:
                    printer.printCsvBooks();
                    break;
            }
    }

    private int getCorrectCheck (int numberOptions) {

        do {
            try {
                this.check = Integer.valueOf(scan.nextLine());
            } catch (NumberFormatException e) {
                this.getCorrectCheck(numberOptions);
            }
        } while (this.check < 1 || this.check > numberOptions);
        return this.check;
    }
}
