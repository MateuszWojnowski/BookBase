import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookPrinter {

    public void printTxtBooks () throws FileNotFoundException {
        File books = new File("media//BookBase//TXT//Books.txt");
        System.out.println(this.readingFile(books) + "\n");
    }

    public void printHtmlBooks () throws FileNotFoundException {
        File books = new File("media//BookBase//HTML//Books.html");
        System.out.println(this.readingFile(books) + "\n");
    }

    public void printCsvBooks () throws FileNotFoundException {
        File books = new File("media//BookBase//CSV//Books.csv");
        System.out.println(this.readingFile(books) + "\n");
    }

    private String readingFile (File file) throws FileNotFoundException {
        String fileContent = "pusto";
        if (file.exists()) {
            fileContent = "";
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                fileContent = fileContent + scan.nextLine() + "\n";
            }
        }
        return fileContent;
    }
}
