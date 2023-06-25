package LinkedList;
import java.util.*;
public class DetectLoopInLL {

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }
    /*
        Method 1 : TC ---> O(n^2)
        Method 2 : TC ---> O(n) but it requires some modification in the structure of Node of the LL.
     */
    public static boolean Detect_Loop3(Node head) {

        Node prev = head,newNode = new Node(Integer.MIN_VALUE);
        while(prev != null)
        {
            if(prev.next == newNode)
                return true;

            Node next = prev.next;
            prev.next = newNode;
            prev = next;
        }
        return false;

        // Time Complexity : O(n) where 'n' is the number of nodes in LL.
        /*
            This solution modifies the sequence structure of the LL.
         */
    }
    public static boolean Detect_Loop4(Node head)
    {
        if(head == null)
            return false;

        HashSet<Node> pointers = new HashSet<>();
        pointers.add(head);
        Node temp = head.next;


        while(temp != null)
        {
            if(pointers.contains(temp))
                return true;

            pointers.add(temp);
            temp = temp.next;
        }
        return false;

        // Time Complexity : O(n) where 'n' is the number of nodes in LL.
        // Auxiliary Space : O(n)
        /*
            This solution neither modifies the structure of node nor the sequence of the LL.
         */
    }
    public static boolean Detect_Loop5(Node head){

        // Using Floyd Cycle Detection
        Node prev = head,curr = head;

        while(curr != null && curr.next != null)
        {
            curr = curr.next.next;
            prev = prev.next;

            if(prev == curr)
                return true;
        }
        return false;
        // Time Complexity : O(N), N(total number of nodes) = n + m where 'n' is the number of nodes inside the loop and 'm' is the number of nodes outside the loop.
        // Auxiliary Space : O(1)
        /*
            This solution neither modifies the structure of node nor the sequence of the LL.
         */
    }
    public static void main(String[] args) {

    }
}
