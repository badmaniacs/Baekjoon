package baekjoon.three;
import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        for (int i=0; i<leng; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%d%n",a+b);
        }

        sc.close();
    }
}
