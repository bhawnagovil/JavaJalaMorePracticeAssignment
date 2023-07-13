package NewPractice;

public class ThisPractice {

    StringPractice name;
    StringPractice section;
    int value;



    public ThisPractice(java.lang.String kabir, java.lang.String number1, int value) {
        //this.name= name;
       // this.section= section;
       // this.value= value;
    }

    void display(){
        System.out.println(name + " "+ section + " "+ value);

    }

    public static void main(StringPractice[] args) {
        ThisPractice practice = new ThisPractice("kabir","number1", 1);
        practice.display();
    }
}
