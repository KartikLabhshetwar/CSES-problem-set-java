import java.util.*;

public class CoinPiles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if ((2*a - b) % 3 == 0 && (2*b - a) % 3 == 0 && (2*a - b) >= 0 && (2*b - a) >= 0){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}