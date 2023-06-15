package SlidingWindow;
import java.util.*;

public class CountAnagrams_SizePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String pat = sc.nextLine();


        System.out.println("No of Anagrams of "+pat+" in "+str+" = "+CountAnagrams(str,pat));
    }
    public static int CountAnagrams(String str,String pat) {
        int n = str.length();
        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i = 0;i<pat.length();i++)
        {
            char ch = pat.charAt(i);
            if(freq.containsKey(ch))
            {
                freq.put(ch,freq.get(ch)+1);
            }
            else
                freq.put(ch,1);
        }

        int i = 0,j = 0;
        int k = pat.length();
        int count = freq.size(),ans = 0;
        while(j < n)
        {
            if(freq.containsKey(str.charAt(j)))
            {
                freq.put(str.charAt(j),freq.get(str.charAt(j))-1);
                if(freq.get(str.charAt(j)) == 0)
                    count--;
            }
            if((j-i+1) < k)
            {
                j++;
            }
            else if((j-i+1) == k)
            {
                if(count == 0)
                    ans++;

                char ch = str.charAt(i);
                if(freq.containsKey(ch))
                {
                    freq.put(ch, freq.get(ch)+1);
                    if(freq.get(ch) == 1)
                        count++;
                }
                i++;
                j++;
            }
        }
        return ans;
    }

}
