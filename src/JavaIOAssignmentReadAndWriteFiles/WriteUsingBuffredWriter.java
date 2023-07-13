package JavaIOAssignmentReadAndWriteFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteUsingBuffredWriter {
    public static void main(String[] args) {
        String s=  "This text is written using BufferedWriter.";
        try{
            //creates a file writer
            //file path passed as parameter to the FileWriter constructor.
            FileWriter fw = new FileWriter("bw.txt");
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write(s);
            bw.close();
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("end here");
        }

    }

}
