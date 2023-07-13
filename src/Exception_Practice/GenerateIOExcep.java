package Exception_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GenerateIOExcep {
    //IOExceptions are thrown when there is any input / output file operation issues{
        public static void main(String[] args) {

            File file = new File("test1.txt");
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                fis.read();
                fis.close();
            }
            //FileNotFoundException is a subclass of IOException.
            catch (IOException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
                e.printStackTrace();
            }
        }
    }

