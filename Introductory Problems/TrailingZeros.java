import java.util.*;
public class TrailingZeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt();
            int count = 0;
            for (int i = 5; n / i >= 1; i *= 5) {
                count += n / i;
            }
            System.out.println(count);
        }
    }
}