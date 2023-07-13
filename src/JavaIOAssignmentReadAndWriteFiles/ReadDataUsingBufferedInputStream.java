package JavaIOAssignmentReadAndWriteFiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadDataUsingBufferedInputStream {
    public static void main(String[] args) {
        //reading bytes is faster using BufferedInputStream

        try {
            FileInputStream fis = new FileInputStream("bos.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i = bis.read()) != -1) {
                System.out.println((char) i);
            }
                bis.close();
                fis.close();
        }
        catch(Exception e){
            /*  printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
          e.printStackTrace();
        }

    }
}
