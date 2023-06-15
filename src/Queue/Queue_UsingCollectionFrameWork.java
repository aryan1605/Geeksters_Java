package Queue;

import java.util.*;

public class Queue_UsingCollectionFrameWork {
    public static void main(String[] args) {
        // Creating Queue Object
        //Queue<Integer> que = new LinkedList<>();
        Queue<Integer> que = new ArrayDeque<>();

        // add
        que.add(1);
        que.add(2);
        que.add(3);

        //Traversal
        while(!(que.isEmpty()))
        {
            System.out.print(que.peek()+" ");
            que.remove();
        }
    }
}
