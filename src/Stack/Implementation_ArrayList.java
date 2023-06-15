package Stack;
import java.util.*;

public class Implementation_ArrayList {
    static class Stack
    {
        public static ArrayList<Integer> list = new ArrayList<>();

        // Checking whether the Stack is Empty or not.
        public static boolean isEmpty()
        {
            return (list.size() == 0);
        }

        // Adding the elements at the top
        public static void Push(int data)
        {
            list.add(data);
        }

        // Removing the elements from the top
        public static int Pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return top;
        }

        // Returning the element at the top
        public static int Peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.Push(1);
        stk.Push(2);
        stk.Push(3);
        stk.Push(4);

        while(!(stk.isEmpty()))
        {
            System.out.println(stk.Peek());
            stk.Pop();
        }
    }
}
