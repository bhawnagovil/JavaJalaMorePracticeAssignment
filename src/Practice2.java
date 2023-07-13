


public class Practice2 {



     String name;
     String  section;
     static int value=1;// make the value static, its static all over the program



        public Practice2( String name, String section) {
             this.name= name;
             this.section= section;
           // System.out.println(name + " "+ section);
        }

        void display(){
            System.out.println(name + " "+ section + " "+ value);

        }

    public static void main(String[] args) {

            Practice2 obj = new Practice2("kabir","number1");
            Practice2 obj1 = new Practice2("Raju","number1");

            obj1.display();
        }


}
