package baekjoon.three;
import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i=1; i<10; i++) {
            System.out.printf("%d * %d = %d%n",s,i,s*i);

        } 
        sc.close();

    }
}
