package CP_JAVA;

import java.util.List;

// Implementation of a Singly LinkedList.
public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void InsertFirst(int value) // Inserting a value at the beginning of the LinkedList.
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void Traverse() // Traversing the LinkedList.
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int Length() //Calculating the Length of the LinkedList.
    {
        int count = 0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.InsertFirst(4);
        sll.InsertFirst(3);
        sll.InsertFirst(2);
        sll.InsertFirst(1);
        sll.Traverse();
        System.out.println("Length of the LinkedList : "+sll.Length());
    }
}
