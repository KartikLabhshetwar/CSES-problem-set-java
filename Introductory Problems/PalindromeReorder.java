import java.util.*;

public class PalindromeReorder {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'A']++;
            }
            int odd = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 == 1) {
                    odd++;
                }
            }
            if (odd > 1) {
                System.out.println("NO SOLUTION");
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 == 0) {
                    for (int j = 0; j < freq[i] / 2; j++) {
                        sb.append((char) (i + 'A'));
                    }
                }
            }
            String half = sb.toString();
            String otherHalf = new StringBuilder(half).reverse().toString();
            StringBuilder ans = new StringBuilder(half);
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 == 1) {
                    for (int j = 0; j < freq[i]; j++) {
                        ans.append((char) (i + 'A'));
                    }
                }
            }
            ans.append(otherHalf);
            System.out.println(ans.toString());
        }
    }
}