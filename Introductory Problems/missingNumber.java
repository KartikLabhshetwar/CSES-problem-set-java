import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int)n-1];
        int sumArr = 0;

       for(int i = 0; i < n-1; i++) {
           arr[i] = sc.nextInt();
           sumArr += arr[i];
       }

        long sum = (long) n * (n+1) / 2;
            
        System.out.println(sum - sumArr);
        
        sc.close();
    }

    
}