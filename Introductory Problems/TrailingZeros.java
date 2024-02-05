import java.util.*;

public class TrailingZeros {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        long n = sc.nextLong();
          long fact = 1;
          int count = 0;
          
            for (int i = 1; i <= n; i++) {
                fact *= i;
                while (fact % 10 == 0) {
                    fact /= 10;
                    count++;
                }
                fact %= 1000000000000L;
            }
            System.out.println(count);
    }
  }
}