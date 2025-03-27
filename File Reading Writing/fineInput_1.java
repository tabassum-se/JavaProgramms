//file input
// the file should be in the same path

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileInput_1 {
    public static void main(String[] args) {
        String path = "abc.txt";
        File file = new File(path);

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}