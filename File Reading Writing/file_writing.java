//Writing files using another files
//

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_writing {
    public static void main(String[] args) {
        String path = "abc.txt";
        File file = new File(path);

        try {
            FileWriter writer = new FileWriter("new_file.txt");
            Scanner sc = new Scanner(file);
            String fileContent = "";
            while (sc.hasNextLine())
            {
                fileContent = fileContent.concat(sc.nextLine() + "\n");
            }
            sc.close();
            //writing content in file and saving file
            writer.write(fileContent);
            writer.close();

            // File writing from existing file

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}