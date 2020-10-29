package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public String readFromFile(String in) throws IOException {
        File file = new File(in);
        return Files.readString(Path.of(file.getAbsolutePath()));
    }
}
