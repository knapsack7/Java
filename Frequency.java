/* Java program to print frequencies of all elements using 
   HashMap */
package collections;
import java.util.*;
class Frequency{
	 static void printFreq(int arr[]){// This function prints frequencies of all elements
        HashMap<Integer,Integer>hmap=new HashMap<Integer, Integer>(); // Creates an empty HashMap
        for(int i=0;i<arr.length;i++){// Traverse through the given array
        Integer c=hmap.get(arr[i]);
        if(hmap.get(arr[i])==null) // If this is first occurrence of element
            hmap.put(arr[i],1);
        else
            hmap.put(arr[i],++c);}// If elements already exists in hash map
        for(Map.Entry m:hmap.entrySet()){// Print result
          System.out.println("Frequency of "+m.getKey()+" is " + m.getValue());}}
    public static void main(String[]args){ // Driver method to test above method
        int arr[]={10,34,5,10,3,5,11,10};
        printFreq(arr);}
}
