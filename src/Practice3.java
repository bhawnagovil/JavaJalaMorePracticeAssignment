public class Practice3 {

   String s1= "RamjTraining";
   String s3= "Ram";
   String s2= new String("ram");

   public void printConcatenatedStringAndLength(){
       System.out.println(s1+" "+s3);
       System.out.println(s1.length());
       System.out.println(s1.charAt(1));
       System.out.println(s1.substring(2));
       System.out.println(s1.concat("govil"));
        String[] arr= s1.split("j");
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(s1.indexOf("T"));

   }
    public void ConvertingNumberstoStringswithvalueOf(){
    int ns = 11;
    //valueOf() method converts different types of values into string.
    String nTs = String.valueOf(ns);
        System.out.println("Converted Num to Str : " + nTs + 22);}

    public void numberToStringMethod(){
    int is = 11;
    //Integer.toString() method converts int to str
    String iTs = Integer.toString(is);
        System.out.println("Converted int to str : " + iTs + 33);}
   public void comparingStringOrManuplatingString(){
       String cs1= "Ramgovil";
       String cs2=  " RamGovil";
       String ss= "Splitting String";
       System.out.println("Equal " + cs1.equals(cs2));
       System.out.println("Equal Ignore case " + cs1.equalsIgnoreCase(cs2));
       System.out.println("Trimming the String " + cs2.trim());
       System.out.println("Replacing String" + cs2.replace("G", "n"));

       String[] spl = ss.split(" "); //splits space

       for (String i : spl) {
           System.out.println("Splitted : " + i);

       }


   }
    public void changingonvertingToUppercase(){
    String a = "upper case";
    String b = "LOWER CASE";
    //toUpperCase() method converts lower to upper case
    String c = a.toUpperCase();
    //toLowerCase() method converts upper to lower case
    String d = b.toLowerCase();
        System.out.println("Converted to upper case : " + c);
        System.out.println("Converted yo lower case : " + d);
}
   public void findIndexValueOfString(){
       String b1= "Searching index";
       int i1 = b1.indexOf("index");
       int i2=  b1.indexOf("h");
       System.out.println(i1+" "+ i2);




   }

    public static void main(String[] args) {
        Practice3 practice= new Practice3();
        //practice.printConcatenatedStringAndLength();
        //practice.findIndexValueOfString();
        //practice.comparingStringOrManuplatingString();
        practice.ConvertingNumberstoStringswithvalueOf();
        //practice.changingonvertingToUppercase();
       // practice.printConcatenatedStringAndLength();
        practice.numberToStringMethod();

    }
}
