package Graph;
import java.lang.reflect.Array;
import java.util.*;

public class AdjacencyList {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v, boolean direction)
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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of vertices");
        int ver = sc.nextInt();

        System.out.println("Enter the no. of edges");
        int edg = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<ver;i++)
        {
            adj.add(new ArrayList<>());
        }

        boolean direction = sc.nextBoolean();
        for(int i = 0;i<edg;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();

            addEdge(adj,u,v,direction);
        }

        printGraph(adj);
    }
}
