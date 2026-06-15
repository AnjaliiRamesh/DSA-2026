import java.util.*;

class Hset{
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();

        hset.add(1);
        hset.add(2);
        hset.add(3);

        // System.out.println("HashSet ka size is: "+hset.size());
        // System.out.println("Elements in HashSet is: "+hset);

        HashSet<String> set = new HashSet<>();


        //Adding elements 
        set.add("Anjali");
        set.add("Ramesh");
        set.add("Gupta");
        set.add("A");
        set.add("B");
        set.add("Z");

        System.out.println("HashSet: " +set);

        // Removing the element B
        set.remove("B");

        // Printing the updated HashSet elements
        System.out.println("after removing B HashSet: " +set);

        //returns false if the element is not present
        System.out.println("B exists in Set : " + set.remove("B"));

        System.out.println("Using iterator: ");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext())
            System.out.print(iterator.next() + ", ");
        System.out.println();

        System.out.print("using for loop");
        for(String element : set)
            System.out.print(element + " , ");

    }


}