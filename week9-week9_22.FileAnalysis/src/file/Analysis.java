package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private Scanner reader;
    private File file;

    public Analysis(File file) throws Exception {
        this.file = file;
    }

    public int lines() throws Exception {
        int numOfLines = 0;
        String currentLine;
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            currentLine = reader.nextLine();
            numOfLines++;
        }
        reader.close();
        return numOfLines;
    }

    public int characters() throws Exception {        
        int numOfChars = 0;
        String currentWord;
        Scanner reader = new Scanner(file);
        reader.useDelimiter("");
        while (reader.hasNext()) {
            currentWord = reader.next();
            numOfChars++;
        }
        reader.close();
        return numOfChars;
    }
}
