package JavaCollectionPractice;

import java.util.HashMap;
        /* If you try to insert the duplicate key, it will
            replace the element of the corresponding key*/
 /* 2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
         * - a. Insert a Key value mapping into the map
         * - b. Fetch the value of a Key
         * - c. Create a clone/copy of HashMap
         * - d. Check if the given Key is in the Map
         * - e. Check if the value is in the Map
         * - f. Check if the map is empty
         * - g. Print the size of the Map to the console
         * - h. Print all the Keys of the map to the console
         * - j. Remove a specific Key-value pair
         * - k. Copy all the elements of the Map to another Map
         */
public class MapHashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String>hashmap= new HashMap<>();
        //storing key in Integer and value in String
        hashmap.put(1, "Rohan");
        hashmap.put(2, "Sohan");
        hashmap.put(3, "Hari");
        hashmap.put(4, "Chapu");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println(hashmap);
        //b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 4 :");
        System.out.println(hashmap.get(4));
        System.out.println("**********************");
        //c. Creating a clone/copy of HashMap using clone() method
        System.out.println("\nclone/copy of HashMap hashmap : ");
        System.out.println(hashmap.clone());

        //when tried to give the same key again it replaced the value with what given later
        hashmap.put(4, "shanu");
        System.out.println(hashmap);
        // e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Sohan' is in the map :");
        System.out.println(hashmap.containsValue("Sohan"));
        //f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(hashmap.isEmpty());
        System.out.println("*******************************");
        //g. Printing the size of the Map to the console using size() method
        System.out.println("\n size of the map");
        System.out.println(hashmap.size());
        //h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(hashmap.keySet());
        //j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        System.out.println(hashmap.remove(2,"Sohan"));
        System.out.println(hashmap);
        System.out.println("***************************");
        //k. Copying all the elements of the Map to another Map using puttAll() method
        System.out.println("\nCopied all the elements of the hashmap to hashmap2 :");
        System.out.println();
        HashMap<Integer, String>hashmap2= new HashMap<>();
        hashmap2.putAll(hashmap);
        System.out.println("hasmap2 :" +hashmap2);










    }
}
