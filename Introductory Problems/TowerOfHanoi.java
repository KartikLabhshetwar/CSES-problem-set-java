import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int) Math.pow(2, n) - 1);
        solve(n, 1, 3, 2);
    }

    public static void solve(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println(from + " " + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println(from + " " + to);
        solve(n - 1, aux, to, from);
    }
}