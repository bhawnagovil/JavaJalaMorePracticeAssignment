package Exception_Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckUncheckExcep {


    public static void readFile(String filename) {
        try {

            FileReader reader = new FileReader(filename);
        } catch (FileNotFoundException fnfe) {
            System.out.println("if file is not found through this exception");
        }
    }

        public static void main (String[]args){

            readFile("myfile.txt");
        }


    }
