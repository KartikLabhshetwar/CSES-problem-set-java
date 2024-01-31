import java.util.*;

public class NumberSpiral{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {

            long t = sc.nextLong();

            while(t-- > 0){
                long y = sc.nextLong();
                long x = sc.nextLong();
                long z = Math.max(x,y);
                long z2 = (z-1)*(z-1);

                if(z % 2 == 0){
                    if(z == x){
                        System.out.println(z2 + y);
                    }
                    else{
                        System.out.println(z2 + 2*z-x);
                    }
                }
                else{
                    if(z==y){
                        System.out.println(z2 + x);
                    }
                    else{
                        System.out.println(z2 + 2*z-y);
                    }
                }
            }
        }
    }
}