package CP_JAVA;
import java.util.Scanner;

public class NegativesAndPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1;i<=t;i++)
        {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int j = 0;j<n;j++)
                arr[j] = sc.nextInt();

            Max_Sum(arr,n);
            int sum = 0;
            for(int ele : arr)
                sum += ele;
            System.out.println(sum);
        }
    }
   public static void Max_Sum(int [] arr,int n)
   {
       for(int i = 0;i < n-1;i++)
       {
           if((arr[i] < 0 && arr[i+1] < 0) || (arr[i] == 0 && arr[i+1] < 0) || (arr[i+1] == 0 && arr[i] < 0))
           {
               arr[i] = arr[i] * -1;
               arr[i+1] = arr[i+1] * -1;
               i++;
           }
           else if(arr[i] >= 0 && arr[i+1] >= 0)
               continue;
           else if(arr[i] >= 0 && arr[i+1] < 0)
           {
               if(Math.abs(arr[i+1]) > arr[i])
               {
                   arr[i+1] *= -1;
                   arr[i] *= -1;
               }
           }
           else if(arr[i+1] >= 0 && arr[i] < 0)
           {
               if(Math.abs(arr[i]) > arr[i+1])
               {
                   arr[i] *= -1;
                   arr[i+1] *= -1;
               }
           }
       }
   }
}
