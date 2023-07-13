public class StringInterviewQuestions {
    public static void main(String[] args) {
        String a= "hello";
        String b= "hello";
        a.concat("Ram");
        System.out.println(a.concat("World"));
        System.out.println(a);
        StringBuffer sb= new StringBuffer(("Hello"));
        System.out.println(sb.replace(1,2, "Ram"));// changes will be done on 1 place not on 2, thats denote border
        System.out.println(sb.delete(0,1));// only chamges will be done on 0 index not 1
        System.out.println(sb);
        System.out.println(sb.reverse());
        StringBuilder sbb= new StringBuilder("hello");
        StringBuilder sbb1= new StringBuilder("hello");
         System.out.println(a.equals(b));//same literals
        System.out.println(sb.equals(sbb1));// different object reference
       // System.out.println(sb.append("Hello"))*/
    }
}

