package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() {
        int numOfWords = 0;
        try {
            Scanner reader = new Scanner(file);
            //reader.useDelimiter(" ");
            String word;
            while (reader.hasNext()) {
                word = reader.next();
                numOfWords++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return numOfWords;
    }
    
    public List<String> wordsContainingZ() {
        List<String> list = new ArrayList<String>();
        try {
            Scanner reader = new Scanner(file);
            String word;
            while(reader.hasNext()) {
                word = reader.next();
                if (word.contains("z"))
                    list.add(word);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }  

    public List<String> wordsEndingInL() {
        List<String> list = new ArrayList<String>();
        try {
            Scanner reader = new Scanner(file);
            String word;
            while(reader.hasNext()) {
                word = reader.next();
                if (word.charAt(word.length() - 1) == 'l')
                    list.add(word);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

    public List<String> palindromes() {
        List<String> list = new ArrayList<String>();
        try {
            Scanner reader = new Scanner(file);
            String word;
            while (reader.hasNext()) {
                String reversedWord = "";
                word = reader.next();
                for (int i = word.length() - 1; i >= 0; i--)
                    reversedWord += word.charAt(i);
                if (word.equals(reversedWord))
                    list.add(word);
                reversedWord = "";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> list = new ArrayList<String>();
        try {
            Scanner reader = new Scanner(file, "UTF-8");
            String word;
            while (reader.hasNext()) {
                word = reader.next();
                if (word.contains("a") && word.contains("e") && word.contains("i")
                && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä")
                && word.contains("ö")) list.add(word);
                }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }
}
