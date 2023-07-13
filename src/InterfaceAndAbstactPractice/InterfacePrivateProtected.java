package InterfaceAndAbstactPractice;

public class InterfacePrivateProtected implements NewInterface{
    public static void main(String[] args) {
        InterfacePrivateProtected if9 = new InterfacePrivateProtected();
        System.out.println(if9.num1 + " " + if9.num2);
    }
/* NOTE :
1. Interface in Java is similar to class but, it contains only abstract methods and
   fields which are final and static.

2. If the members of the interface are private you cannot provide implementation to
   the methods or, cannot access the fields of it in the implementing class.

3. The protected members can be accessed in the same class or,the class inheriting it.
   But, we do not inherit an interface we will implement it.

 */
}

