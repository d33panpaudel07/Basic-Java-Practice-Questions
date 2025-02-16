import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

public class fileInputAndOutput {
    public static void main(String[] args) {
        File myFile = new File("testFile.txt");
        OutputStream ostream;
        ostream = System.out;

        try (FileOutputStream outputStream = new FileOutputStream(myFile, true)) {
            ostream.write('c');
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Looking for file at: " + myFile.getAbsolutePath());
        if (myFile.exists()) {
            System.out.println(myFile.getName() + " exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
