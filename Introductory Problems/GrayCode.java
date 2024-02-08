import java.util.*;

public class GrayCode {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<String> res = new ArrayList<>();
            res.add("0");
            res.add("1");
            for (int i = 2; i <= n; i++) {
                for (int j = res.size() - 1; j >= 0; j--) {
                    res.add(res.get(j));
                }
                for (int j = 0; j < res.size() / 2; j++) {
                    res.set(j, "0" + res.get(j));
                }
                for (int j = res.size() / 2; j < res.size(); j++) {
                    res.set(j, "1" + res.get(j));
                }
            }
            for (String s : res) {
                System.out.println(s);
            }
        }
    }
}