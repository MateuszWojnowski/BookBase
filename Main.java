import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

   public static void main (String args []) throws IOException {

       FoldersCreator.createFolders();
       Menu menu = new Menu ();
       while (true) {
           menu.showMenu();
       }
   }
}