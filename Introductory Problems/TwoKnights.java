import java.util.*;

public class TwoKnights {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int k = 1; k <= n; k++) {
                long total = (long)k * k;
                long attack = 0;
                if(k > 2) {
                    attack = 4 * (k - 1) * (k - 2);
                }
                System.out.println(total * (total - 1) / 2 - attack);
            }
        }
    }
}
