package homework.seven.files;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MyFiles {
    private String fileName;
    private String path;
    private String dataStr;

    public MyFiles() {
    }

    public MyFiles(String fileName) {
        this.fileName = fileName;
    }

    public void saveToFile(String s) throws IOException{
        Files.newByteChannel(
                    Paths.get(fileName),

                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING
                )
                .write(ByteBuffer.allocate(s.length()).put(s.getBytes()).position(0));
    }

    public String readFromFile() throws IOException {
        String content = Files.readString(Path.of(fileName), StandardCharsets.US_ASCII);
        return content;
    }
}
