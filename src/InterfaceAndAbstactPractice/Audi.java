package InterfaceAndAbstactPractice;

public class Audi implements Vehicle, Design{
    @Override
    public void move() {
        System.out.println("have interface to move safely");
    }

    @Override
    public void turn() {
        System.out.println("have interface to turn it safely");
    }

    @Override
    public void wiper() {
        System.out.println("have something to wipe the front mirror easily");
    }

    @Override
    public void horn() {
        System.out.println("honk honk");

    }
    public void audiColor(){
        System.out.println("you can choose any color");
    }

    public static void main(String[] args) {
       // Audi audi = new Audi();// way to create the object of the class but since the class is implementing the Vehicle we can put the interface name to call the method.
        Vehicle audi= new Audi();
        Design d= new Audi();// creting object to access the method of design class
        audi.horn();
        audi.move();
        audi.turn();
        audi.wiper();
        Audi obj= new Audi();// creating object of the Audi class
        obj.audiColor();// to access the method which is in the current class not in the interface we have to create the object of this particular class

    }

    @Override
    public void model() {
        System.out.println("model should be unique");
    }

    @Override
    public void shape() {
        System.out.println("shape is own choice");
    }
}
