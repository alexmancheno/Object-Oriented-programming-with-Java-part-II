
import java.io.File;
import java.util.Scanner;

public class Printer {

    private Scanner reader;
    private File file;

    public Printer(String fileName) throws Exception {
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        reader = new Scanner(this.file);
        String currentLine = "";
        while (reader.hasNextLine()) {
            currentLine = reader.nextLine();
            if (currentLine.contains(word)) {
                System.out.println(currentLine);
            }
        }
        reader.close();
    }

}
