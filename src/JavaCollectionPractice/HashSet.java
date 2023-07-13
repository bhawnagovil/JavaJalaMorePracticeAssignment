package JavaCollectionPractice;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {
        Set<String>set = new java.util.HashSet<>();
        set.add("Walter");
        set.add("Kumar");
        set.add("Shona");
        set.add("ship");
        set.add("Shona");
        set.add("Parul");
        //we have added the shone twicw buit render in the set one time because set does not allow the duplicate value
        ////does not allow duplicate elements, Set contains unique elements only.
        System.out.println(set);
        //HashSet doesn't maintain the insertion order
        //b. Iterating through the HashSet by using Iterator object
        //removing the object from the set
        System.out.println(set.remove("Shona"));
        System.out.println(set);
        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        //System.out.println(set.clone());
        System.out.println("\nIterating through the HashSet : ");;
        Iterator<String>itr= set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ///f. Checking if the set is empty using isEmpty() method
        System.out.println(set.isEmpty());
        System.out.println("\nChecking if the set is empty :");
         //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(set.size());
        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'shona' is present in the HashSet : ");
        System.out.println(set.contains("Shona"));
        System.out.println(set.contains("Parul"));
        System.out.println("*******************************");
        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        set.clear();
        System.out.println(set);














    }

}
