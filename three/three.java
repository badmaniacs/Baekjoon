package baekjoon.three;
import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=s; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();

    }
}
