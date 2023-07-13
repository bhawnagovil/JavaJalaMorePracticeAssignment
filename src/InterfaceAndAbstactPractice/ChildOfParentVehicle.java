package InterfaceAndAbstactPractice;

public class ChildOfParentVehicle extends ParentVehicleClass{
    @Override
    public void color() {
        System.out.println("color is blue for this child");
    }

    @Override
    public void shape() {
        System.out.println("shape is unique for this child");
    }

    public void childQuality(){
        System.out.println("child class should have it own quality");
    }

    public static void main(String[] args) {
        ParentVehicleClass p= new ChildOfParentVehicle();
        p.color();
      //  p.  can not access the method of the current class because referring the parent class object
        p.safetyGuidelines(); // accessing non abstract method from object of parent class
        ChildOfParentVehicle c= new ChildOfParentVehicle(); // creating object for the child class and accessing method of the current class
        c.color();// calling the abstract method of the parebt class from child class object
        c.shape();// calling the abstract method
        c.Wheel(); // calling non abstract method of the parent class.
        c.childQuality(); // can access the method the current class when having the the reference of the current class

    }
}
