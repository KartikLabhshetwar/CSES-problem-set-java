import java.util.*;

public class AppleDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] apples = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            apples[i] = sc.nextLong();
            sum += apples[i];
        }
        System.out.println(minDiff(apples, 0, 0, sum));
    }

    public static long minDiff(long[] apples, int i, long sum1, long sum2) {
        if (i == apples.length) {
            return Math.abs(sum1 - sum2);
        }
        return Math.min(minDiff(apples, i + 1, sum1 + apples[i], sum2 - apples[i]),
                minDiff(apples, i + 1, sum1, sum2));
    }
}