import java.util.*;

public class TwoSet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            long n = sc.nextLong();

            long sum = n * (n + 1) / 2;

            if (sum % 2 != 0) {
                System.out.println("NO");
                return;
            }

            sum = sum / 2;

            ArrayList<Long> set1 = new ArrayList<>();

            ArrayList<Long> set2 = new ArrayList<>();

            for (long i = n; i >= 1; i--) {
                if (i <= sum) {
                    set1.add(i);
                    sum -= i;
                } else {
                    set2.add(i);
                }
            }

            System.out.println("YES");

            System.out.println(set1.size());

            for (long i : set1) {
                System.out.print(i + " ");
            }

            System.out.println();

            System.out.println(set2.size());

            for (long i : set2) {
                System.out.print(i + " ");
            }
            
        }

    }
}
