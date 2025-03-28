// version-2: using HashMap find unique words with frequency
// this code read file
// count all words
// count unique words

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "abc1"; // File path
       // ArrayList<String> myWords = new ArrayList<>(); // ArrayList to store unique words
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        int uniqueWords = 0;
        int allWords = 0;

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
                       if (!map.keySet().contains(word))
                       {
                        map.put(word,1);
                       }else{
                           map.put(word, map.get(word)+1);
                       }
                    }
                }
            }

        //print instances with frequency....
        for (String w: map.keySet())
        {
            int freq = map.get(w);
            // I want to show only those words with freq > 20
            if(freq > 20) {
                System.out.println(freq + "\t" + w);
            }
        }
    }

}