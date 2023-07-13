package ThisAndSuper;

public class ThisPractice {
    int num;
    String name;
    int age;
    ThisPractice(){
        //Calling argument constructor of current class using this()
        this(11, "Sharan", 12);
    }
    ThisPractice(String name){
        this.name= name;
        age= 0;

    }
    ThisPractice(int num, String name, int age){
        //1. Printing fields of the current class using this
         //this();this.num = num;
        this.name = name;
        this.num= num;
        this.age= age;
        System.out.println(num + " " + name + " "+ age);

    }

    public static void main(String[] args) {
        ThisPractice th= new ThisPractice();
        ThisPractice th1= new ThisPractice(12, "Sarita", 13);

    }
}

