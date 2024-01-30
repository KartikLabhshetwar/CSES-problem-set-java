import java.util.*;

public class IncreasingArray {
    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
            //input size of array
            int n = sc.nextInt();

            //declare array
            long[] arr = new long[n];

            //declare count variable
            long count = 0;

            //input array
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

      //logic starts here
            for(int i = 1; i < n ; i++){
                if(arr[i]<arr[i-1]){
                    count += arr[i-1]-arr[i];
                    arr[i] = arr[i-1];
                }
            }

            System.out.println(count);
        }
    }
}
