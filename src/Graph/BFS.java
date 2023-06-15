package Graph;
import java.util.*;

public class BFS {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v,boolean direction)
    {
        adj.get(u).add(v);

        if(direction == false)
        {
            adj.get(v).add(u);
        }
    }
    public static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i = 0;i<adj.size();i++)
        {
            System.out.print(i+" --> ");
            for(int j = 0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void printBFSGraph(ArrayList<ArrayList<Integer>> adj,int start)
    {
        int v = adj.size();

        boolean [] visited = new boolean[v];

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty())
        {
            int ele = q.poll();

            System.out.print(ele+" ");

            int i = 0;
            while(i < adj.get(ele).size())
            {
                int edge_ele = adj.get(ele).get(i);
                i++;

                if(!visited[edge_ele])
                {
                    q.add(edge_ele);
                    visited[edge_ele] = true;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ver = sc.nextInt();
        int edg = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<ver;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        boolean direction = sc.nextBoolean();
        for(int i = 0;i<edg;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();

            addEdge(adj,u,v,direction);
        }
        printGraph(adj);

        System.out.println("Enter the starting point");
        int start = sc.nextInt();

        if(start >= 0 && start <= ver - 1)
        printBFSGraph(adj,start);
    }
}
