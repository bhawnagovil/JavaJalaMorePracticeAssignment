package ConstructorPractice;

public class PublicPrivateProtectedDefaultConstructor {
    int rollNo;
    String name;
    String clg;
    String city;

   /* PublicPrivateProtectedDefaultConstructor(){

    }*/  // if we don't specify the constructor' modifier it's by default public'
    //default access modifier
   public PublicPrivateProtectedDefaultConstructor() {
       this(11);
   }
     public  PublicPrivateProtectedDefaultConstructor(int rollNO){
         this("Sharan");
         this.rollNo = rollNo;
         System.out.println("rollNo : " + rollNo);

     }
    private PublicPrivateProtectedDefaultConstructor(String name) {
        this("ICFAI", "Hyderabad");
        this.name = name;
        System.out.println("Name : " + name);
    }
    protected PublicPrivateProtectedDefaultConstructor(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }
    // NOTE : 4.Constructor looks like method but it is not. It does not have a return type
}




