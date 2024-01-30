import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt();

            if (n == 1) {
                System.out.println(1);
                return;
            } 
            
            else if (n < 4) {
                System.out.println("NO SOLUTION");
                return;
            } 
            
            else {
                for (int i = 1; i <= n; i ++) {
                    if(i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                for (int i = 1; i <= n; i ++) {
                    if(i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
        
    }
}
