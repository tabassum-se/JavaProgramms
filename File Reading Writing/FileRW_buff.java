
import java.io.*;

public class FileRW_buff {
    public static void main(String[] args) {
        String path = "new_file1.txt";
        // writing files
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write("my files are written...." + "\n" + "new line");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // file reading
        try {
            BufferedReader reader = new BufferedReader(new FileReader("new_file1.txt"));
            System.out.println(reader.readLine());

            String line;
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}