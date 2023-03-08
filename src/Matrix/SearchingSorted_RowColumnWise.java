package Matrix;

import java.util.Scanner;

public class SearchingSorted_RowColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int r = sc.nextInt();
        System.out.println("Enter columns : ");
        int c = sc.nextInt();

        int [][] arr = new int[r][c];
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();

        Searching1(arr,x); // Naive Solution
        Searching2(arr,x); // Efficient Solution
    }
    public static void Searching2(int [][] arr,int x)
    {
        int r = arr.length,c = arr[0].length;
        int i = 0,j = c-1;
        while(i < r && j >= 0)
        {
            if(x == arr[i][j])
            {
                System.out.println("Element "+arr[i][j]+" is found at ("+i+","+j+")");
                return;
            }
            else if(x > arr[i][j])
                i++;
            else
                j--;
        }
        System.out.println("Element not found");
        // Time Complexity : O(r + c)
        // Auxiliary Space : O(1)
    }
    public static void Searching1(int [][] arr,int x) // Naive Solution
    {
        int r = arr.length,c = arr[0].length;
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(arr[i][j] == x)
                {
                    System.out.println("Element "+arr[i][j]+" is found at ("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Element not found");

        // Time Complexity : O(r * c)
        // Auxiliary Space : O(1)
    }
}
