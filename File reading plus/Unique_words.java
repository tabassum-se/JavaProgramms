// this code read file
// count all words
// count unique words 

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String path = "abc"; // File path
        ArrayList<String> myWords = new ArrayList<>(); // ArrayList to store unique words
        int uniqueWords = 0;
        int allWords = 0;
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(path));

            // Process each line
            for (String line : lines) {
                // Convert to lowercase and split into words using regex
                // The regex "\\s+" splits on any whitespace (spaces, tabs, newlines)
                String[] words = line.toLowerCase().split("\\s+");

                // Process each word in the line
                for (String word : words) {
                    // Remove any punctuation from the word (optional)
                    word = word.replaceAll("[^a-zA-Z]", "");

                    // Skip empty strings that might result from punctuation removal
                    if (!word.isEmpty()) {
                        allWords++;
                        // Check if word already exists in the list
                        int index = myWords.indexOf(word);
                        // If word not found, add it to the list
                        if (index == -1) {
                            myWords.add(word);
                            uniqueWords++;
                        }
                    }
                }
            }

            // Print the final list of unique words
            System.out.println("unique words in the file are : " + uniqueWords );
            System.out.println("all words in the file are : " + allWords );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}