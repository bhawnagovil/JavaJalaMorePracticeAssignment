package JavaIOAssignmentReadAndWriteFiles;

import java.io.FileInputStream;
import java.util.Properties;
public class ReadProperliesFile {
public static void getProperties(){
        try {
        FileInputStream fis = new FileInputStream("C:\\Intel\\New JalaProject\\resources\\config.properties");
        Properties prop= new Properties();
        prop.load(fis);
        String userName= prop.getProperty("username");
        String pword= prop.getProperty("password");
        System.out.println(userName);
        System.out.println(pword);
        }
        catch(Exception e){
        e.printStackTrace();
        }
        }


    public static void main(String[] args) {
     getProperties();
    }

}
