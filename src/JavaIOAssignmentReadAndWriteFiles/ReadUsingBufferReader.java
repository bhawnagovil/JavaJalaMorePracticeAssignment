package JavaIOAssignmentReadAndWriteFiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.FileVisitResult;

public class ReadUsingBufferReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("bw.txt");
            BufferedReader reader = new BufferedReader(fr);
            int i;
            while ((i = reader.read()) != -1) {
                System.out.println((char) i);
                reader.close();
                fr.close();
            }
        }
            catch(Exception e){
             e.printStackTrace();

            }
        }
    }

