package fileHandling.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1FileInputStreamReadBytesFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int read = fileInputStream.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
