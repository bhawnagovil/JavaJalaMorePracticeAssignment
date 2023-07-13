package NewPractice;

public class Static {
    public static int sv1=  11;
    public static int sv2=  12;

     java.lang.String a= "kabir";

    java.lang.String b= "Fyler";

    static void printStaticVriableInInstanceMethod(){

        Static obj= new Static();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
    void printStaticVariableIninstanceMethod(){
        System.out.println("Static variables: "+ sv1+ sv2);
    }

    void CallStaticMethodIninstanceMethod2(){
        System.out.println("Static and Instance are confusing me");
        printStaticVriableInInstanceMethod();
    }

    static void callInstanceMethodInStaticMethod(){
      Static obj2= new Static();
      obj2.printStaticVariableIninstanceMethod();


    }

    public static void main(StringPractice[] args) {
        Static obj= new Static();
        System.out.println(obj.a+ obj.b);
        System.out.println(sv1+ sv2);
        obj.CallStaticMethodIninstanceMethod2();
        obj.printStaticVariableIninstanceMethod();
        callInstanceMethodInStaticMethod();
        printStaticVriableInInstanceMethod();


    }


}
