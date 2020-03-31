import java.util.Scanner;

public class BookCreator {

    BookType[] typeValues = BookType.values();
    Scanner scan = new Scanner(System.in);

    public Book createBook () {
        System.out.println("\nDodaje nowa ksiazke.");
        System.out.println("Prosze podac autora: ");
        String author = scan.nextLine();
        System.out.println("Prosze podac tytul: ");
        String title = scan.nextLine();
        System.out.println("Prosze podac rok wydania: ");
        int publicationYear = scan.nextInt();
        scan.nextLine();
        System.out.print("Prosze podac gatunek ");
        for (BookType bookType : typeValues) {
            System.out.print(bookType + " ");
        }
        System.out.print(":");

        String type = scan.nextLine();
        while (!this.correctType(type)) {
            System.out.println("Nie istnieje taka kategoria. Sprobuj ponownie: ");
            type = scan.nextLine();
        }

        return new Book (author, title, publicationYear, BookType.valueOf(type));
    }

    private boolean correctType(String type) {
        String stringBookType = "";
        for (BookType bookType : typeValues) {
            if (type.equals(stringBookType.valueOf(bookType))) return true;
        }
        return false;
    }

}
