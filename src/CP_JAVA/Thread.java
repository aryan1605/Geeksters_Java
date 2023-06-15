package CP_JAVA;
import java.util.Scanner;

public class Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = 2;
        int [][]arr = new int[m][n];
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(j == 0)
                {
                    System.out.println("Enter the roll_no : ");
                    arr[i][j] = sc.nextInt();
                }
                else
                {
                    System.out.println("Enter the marks : ");
                    arr[i][j] = sc.nextInt();
                }
            }
        }
        Sort(arr,m);
        display(arr,m);
    }
    public static void Sort(int [][] arr,int m)
    {
        for(int i = 0;i<m-1;i++)
        {
            int min = arr[i][0];
            int pos = 0;
           for(int j = i+1;j<m;j++)
           {
               if(min > arr[j][0]) {
                   min = arr[j][0];
                   pos = j;
               }
           }
           int temp1 = arr[i][0];
           arr[i][0] = arr[pos][0];
           arr[pos][0] = temp1;

            int temp2 = arr[i][0];
            arr[i][0] = arr[pos][0];
            arr[pos][0] = temp2;
        }
    }
    public static void display(int [][] arr,int m)
    {
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
