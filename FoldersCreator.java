import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FoldersCreator {

    public static void createFolders () throws IOException {
        File media = new File ("media");
        File bookBase = new File("media//BookBase");
        File txt = new File("media//BookBase//TXT");
        File csv = new File("media//BookBase//CSV");
        File html = new File("media//BookBase//HTML");

        if(!media.exists()) {
            Files.createDirectory(Paths.get("media"));
        }
        if (!bookBase.exists()) {
            Files.createDirectory(Paths.get("media//BookBase"));
        }
        if (!txt.exists()) {
            Files.createDirectory(Paths.get("media//BookBase//TXT"));
        }
        if (!csv.exists()) {
            Files.createDirectory(Paths.get("media//BookBase//CSV"));
        }
        if (!html.exists()) {
            Files.createDirectory(Paths.get("media//BookBase//HTML"));
        }

    }
}