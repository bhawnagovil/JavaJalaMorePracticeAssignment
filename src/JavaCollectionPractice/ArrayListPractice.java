package JavaCollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/*1.Create an ArrayList of type String with 10 string elements. Add 10 string elements to
        * ArrayList and perform the below operations
        * - a. Add an element to the ArrayList
        * - b. Iterate through the ArrayList by using Iterator object
        * - c. Add an element at a specific index
        * - d. Remove an element from the ArrayList, Remove at an index
        * - e. Update the element at a specific index
        * - f. Check the element is present at a particular index
        * - g. Get an element at a particular index
        * - h. Find out the size of the ArrayList
        * - i. Check the given element is present in the ArrayList
        * - j. Remove all elements of the ArrayList
        */


public class ArrayListPractice {
    public static void main(String[] args) {

        //passing an Array converted to List using the asList() method
        ArrayList<String> arrayList
                = new ArrayList<String>(Arrays.asList("Manu", "Komal","Sohan","Balu","Cholu","Shiva","Bhawna","Romi","Tomi","Shoni"));
        System.out.println("\nArrayList :"+ arrayList);
        //a. adding elements to the ArrayList using add method using add() method
        arrayList.add("Rohah");
        arrayList.add("Sohan");
        arrayList.add("Parul");
        //after adding element to the arraylist
        System.out.println("\nArrayList :"+ arrayList);
        //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr= arrayList.iterator();
        System.out.println("\nIterating through the list :" );
        while(itr.hasNext()){
            System.out.println(itr.next()+ " ");
        }
        System.out.println("*******************************");
        //c. Adding an element at a specific index using add() method
        arrayList.add(1, "Akshara");
        arrayList.add(2, "Rishik");
        System.out.println("\nafter adding at the specific index 1 and 2 : " + arrayList);
        System.out.println("**************************************");
        //d. Removing an element at a specific index using remove() method
        arrayList.remove(1);
        System.out.println("after removing the element at index 1");
        System.out.println("\nArrayList"+ arrayList);
        System.out.println("*****************************************");
        //e. Updating the element at a specific index using set() method
        arrayList.set(1,"Roshan");
        arrayList.set(2, "Boshan");
        System.out.println("\nAfter updating the element at specific index 1 and 2 the ArrayList is " + arrayList);
        System.out.println("*********************************************");
        //f.  Checking the element is present at a particular index using indexOf() method
        System.out.println("\nThe element is present at index :");
        System.out.println(arrayList.indexOf("Boshan"));
        System.out.println("****************************************");
        //g. Getting an element at a particular index using get() method
        System.out.println("\nGetting the element of the particular index 2 :");
        System.out.println(arrayList.get(2));
        System.out.println("**************************************************");
        //h. Finding the size of the ArrayList using size() method
        System.out.println("\nFinding the size of the arraylist by size()");
        System.out.println(arrayList.size());
        System.out.println("**********************************************");
        //i. Checking the element is present in the ArrayList using contains() method
        System.out.println("\n checking if Boshan is present in the arraylist :");
        System.out.println(arrayList.contains("Boshan"));// return boolean
        System.out.println("*******************************************************");
        //j. Removing all elements of the ArrayList using clear() method
        System.out.println("\n removing all the element from the ArrayList :");
        arrayList.clear();
        System.out.println("After removing all the element from the arraylist :"+ arrayList);














    }
}
