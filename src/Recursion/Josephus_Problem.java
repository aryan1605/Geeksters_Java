package Recursion;
import java.util.Scanner;

public class Josephus_Problem {
    public static int Survivor_Series(int n,int k)
    {
        // We are playing the Game_Of_Death in clockwise direction.
        // Indexing starting from 0.
        // Induction - Base Condition - Hypothesis(IBH) Approach.
        // Modular Arithmetic is done to limit the value of the result less than 'n'.
        if(n == 1)
            return 0;
        else
            return (Survivor_Series(n-1,k)+k) % n;
        //Time Complexity = Theta(n)
        //Auxiliary Space = Theta(n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and k : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Survivor will be at position "+(Survivor_Series(n,k)+1)); // Indexing starting from 1.
    }
}
