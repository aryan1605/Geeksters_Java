package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS {
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
    public static void printDFS(ArrayList<ArrayList<Integer>> adj,int start,boolean [] visited)
    {

        visited[start] = true;

        System.out.print(start+" ");

        for(int i = 0;i<adj.get(start).size();i++)
        {
            if(!visited[adj.get(start).get(i)])
            {
                printDFS(adj,adj.get(start).get(i),visited);
            }
        }
    }
    public static void printDFSGraph(ArrayList<ArrayList<Integer>> adj,int start)
    {
        int v = adj.size();

        boolean [] visited = new boolean[v];

        printDFS(adj,start,visited);
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
            printDFSGraph(adj,start);
    }
}
