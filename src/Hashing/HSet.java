package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class HSet {
    public static void main(String[] args) {

        // Creating a HashSet(Unordered)
        HashSet<Integer> set = new HashSet<>();

        // Inserting an element(Do not allow Duplicates)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        // Size of the HashSet
        System.out.println("Size of the HashSet : "+set.size());

        // Searching an element
        if(!(set.contains(4)))
            System.out.println("Not Present");
        if(set.contains(3))
            System.out.println("Present");

        //Removing an element
        set.remove(3);
        if(!(set.contains(3)))
            System.out.println("Not Present");

        set.add(2);
        //Displaying all the elements of the HashSet
        System.out.println(set);

        // Creating an Iterator for the Hashset
        Iterator it = set.iterator();

        // Traversal using the Iterator
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
