package Recursion;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void Tower_Of_Hanoi(int disks,char a,char b,char c)
    {
        if(disks == 0)
        {
            return;
        }
        Tower_Of_Hanoi(disks-1,a,c,b);
        System.out.println("Move Disk "+disks+" from "+a+" to "+c);
        Tower_Of_Hanoi(disks-1,b,a,c);
        // T(n) = 2T(n-1) + 1
        // T(1)= 1
        // No. of movements for a given no. of disks = 2^n -1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks : ");
        int disks = sc.nextInt();
        Tower_Of_Hanoi(disks,'A','B','C');
    }
}
