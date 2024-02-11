import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        sc.close();
        System.out.println(twoSum(arr, x));
    }

    public static String twoSum(long[] arr, long x) {
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            long complement = x - arr[i];
            if (map.containsKey(complement)) {
                return (map.get(complement) + 1) + " " + (i + 1);
            }
            map.put(arr[i], i);
        }
        return "IMPOSSIBLE";
    }
}