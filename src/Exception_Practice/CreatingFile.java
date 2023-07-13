package Exception_Practice;

import java.io.*;

    public class CreatingFile {
    public static void main(String[] args) {
        String[] names= new String[3];
        int[] numbers= {1,2,3,4};
        names[0]= "Bhawna";
        names[1]= "Shalu";
        names[2]= "Bhalu";
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing to a file");
            writer.write("\n another line");
            for(String name:names){
                writer.write("\n"+name);
            }
            for(int num:numbers){
                writer.write("\n"+num);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


            try {
                BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
                System.out.println(reader.readLine());
                reader.close();
            } catch (IOException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();

            }
        }


}
