package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class MindfulDictionary {

    private HashMap<String, String> finToEng;
    private HashMap<String, String> engToFin;
    private File f;
    

    public MindfulDictionary() {
        finToEng = new HashMap<String, String>();
        engToFin = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) {
        finToEng = new HashMap<String, String>();
        engToFin = new HashMap<String, String>();
        f = new File(file);
    }
    
    public boolean load() {
        Scanner fileReader;
        try {
            fileReader = new Scanner(f);
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        FileWriter writer;
        try {
            writer = new FileWriter(f);
            for(String word : engToFin.keySet()) {
                writer.write(word + ":" + engToFin.get(word) + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!finToEng.keySet().contains(word)) 
            finToEng.put(word, translation);
        if (!engToFin.keySet().contains(translation))
            engToFin.put(translation, word);
    }

    public String translate(String word) {
        if (finToEng.keySet().contains(word))
            return finToEng.get(word);
        else if (engToFin.keySet().contains(word))
            return engToFin.get(word);
        return null;
    }
    
    public void remove(String key) {
        String value = finToEng.get(key);
        engToFin.remove(key);
        engToFin.remove(value);
        finToEng.remove(key);
        finToEng.remove(value);
    }
}
