package CP_JAVA;
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
    public boolean Search(int target)
    {
        ListNode temp = head;
        while(temp != null)
        {
           if(temp.data == target)
           {
               return true;
           }
           temp = temp.next;
        }
        return false;
    }
    public ListNode MiddleNode()
    {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
    public ListNode ReverseLL()
    {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.InsertFirst(4);
        sll.InsertFirst(3);
        sll.InsertFirst(2);
        sll.InsertFirst(1);
        sll.Traverse();
        System.out.println("Length of the LinkedList : "+sll.Length());
        if(sll.Search(2))
        {
            System.out.println("PRESENT");
        }
        else
        {
            System.out.println("NOT PRESENT");
        }
        System.out.println("Middle Node Element = "+sll.MiddleNode().data);
        sll.head = sll.ReverseLL();
        sll.Traverse();
    }
}
