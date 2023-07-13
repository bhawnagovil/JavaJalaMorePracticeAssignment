package Exception_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CretefilebyFileAndGenerateIoException {
    //IOExceptions are thrown when there is any input / output file operation issues
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");// representing the file
        //FileInputStream fis = null;
        if (!file.exists()) {
            file.createNewFile();
        }
        // writing the text into the file using fileoutput stream
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("creating the new file and add the text".getBytes());
        fos.flush();
        fos.close();
        // reading the text from file

        FileInputStream fis = new FileInputStream(file);
        int i = fis.read();
        while (!(i == -1)) {
            char c= (char)i;
            System.out.print(c);
            i= fis.read();
        }
        fis.close();

    }
}
