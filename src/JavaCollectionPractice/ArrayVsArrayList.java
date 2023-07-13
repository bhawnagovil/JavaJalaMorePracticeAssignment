package JavaCollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // declaring array and adding the string to it
        String [] arr= { "Rohan","Mohan", "Sohan", "Chirag"};
        String [] arr1= new String[4];
        arr1[0]= "Tim";
        arr1[1]= "Sim";
        arr1[2]= "Rom";
        arr1[3]= "Gom";
        //Declaring Arraylist and adding values to it
        ArrayList<String>arraylist= new ArrayList<>(Arrays.asList(arr));// declaring this way gives a immutable list
        System.out.println(arraylist);
        ArrayList<String>arraylist1= new ArrayList<>();
        arraylist1.add(0, "Sita");
        arraylist1.add(1,"Punam");
        arraylist1.add(2, "Gita");
        System.out.println(arraylist1);
        //getting the value from arraylist and array
        System.out.println("********************************");
        System.out.println(arr1[0]);
        System.out.println(arraylist.get(0));
        //getting the size of array and arraylist
        System.out.println(arr.length);
        System.out.println(arraylist.size());
        //array are fixed in size so we can not add element to it, because having fixed in size, but we can add member to arraylist
        arraylist1.add(1, "Him");
        System.out.println("*******************");
        System.out.println(arraylist1.size());
        //updating the element in arraylist, but can not update the element in array
        arraylist.set(1,"Bhawna");
        System.out.println(arraylist);
        // removing the element from array not possible and cant reduce its size but possiblein arraylist
        arraylist.remove(1);
        System.out.println(arraylist);
        // printing array will give the asci value where it stored in the memory without using the string method, but printing arraylist will give you
        //how it should be, because arraylist implements the tostring method. lets ptint the array and arraylist
        System.out.println(arr);
        System.out.println(arraylist);









    }
}
