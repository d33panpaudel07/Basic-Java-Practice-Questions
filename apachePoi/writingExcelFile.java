package apachePoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class writingExcelFile {
    public static void main(String[] args) throws IOException {
        File excelFile = new File("./apachePoi/writeTest.xlsx");
        if (excelFile.createNewFile()) {
            System.out.println("File creation successful.");
        } else {
            System.out.println("File already exists.");
        }

        String excelData = "Test excel data";
        FileOutputStream fos = new FileOutputStream("./apachePoi/writeTest.xlsx");

    }
}
