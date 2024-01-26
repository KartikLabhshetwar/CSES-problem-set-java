import java.util.Scanner;

public class weirdAlgorithm {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt();

            System.out.print(n + " ");

            while ( true ){
                if( n == 1){
                    break;
                }
                else if( n % 2 == 0){
                    n = n/2;
                }
                else {
                    n = (n*3) + 1;
                }
                System.out.print(n + " ");
            }
        }
    }
}

