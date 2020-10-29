package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
    public void writeToFile(String data, String out) throws FileNotFoundException {
        File file = new File(out);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print(data);
        }
    }
}
