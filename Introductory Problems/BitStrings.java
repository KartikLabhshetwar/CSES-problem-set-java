import java.util.*;

public class BitStrings {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int mod = 1000000007;
            long result = 1;
            for (int i = 0; i < n; i++) {
                result = (result * 2) % mod;
            }
            System.out.println(result);
        }
    }
}