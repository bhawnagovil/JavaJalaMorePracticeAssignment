public class ClassWithMain {
    public static void main(String[] args) {
        ChildClassB B= new ChildClassB();
        ParentclassA A= new ParentclassA();
        ChildClassC C= new ChildClassC();
        //calling every method of  class B using its own object/instance
        B.defineHeightB();
        B.defineNatureB();
        B.defineSkintypeB();
        //calling every method of  class A using its own object/instance
        A.defineActionA();
        A.defineShapeA();
        A.moveA();
        //calling every method of  class C using its own object/instance
        C.defineConfidenceC();
        C.defineExperinceC();
        //Calling an overridden method with super class reference
        ParentclassA a = new ChildClassB();//upcasting
        a.defineProgramming();
        ChildClassB b= new ChildClassC();
        b.defineProgramming();


    }
}
