package streams.parallelStreams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class parallelFunction {
    public static void main(String[] args) throws IOException {
        File myFile = new File("D:\\Studies\\javaRevision\\streams\\parallelStreams\\parallelFunction.txt");
        if (myFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        Stream<String> text = Files.lines(myFile.toPath());

        // this does reading parallelly
        text.parallel().forEach(x -> System.out.println(x));
        // this does reading sequentially i.e. sequential streams
        // text.forEach(x -> System.out.println(x));

        text.close();
    }
}
