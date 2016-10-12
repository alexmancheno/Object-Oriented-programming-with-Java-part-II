
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public ArrayList<String> read(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner reader = new Scanner(f);
        ArrayList<String> page = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            page.add(line);
        }
        reader.close();
        return page;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (String line : texts)
            writer.write(line + "\n");
        writer.close();
    }
}
