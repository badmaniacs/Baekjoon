package baekjoon.two;
import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        M = M - 45;
        if (M<0) {
            M = 60 + M;
            H = H -1;            
        }
        if (H<0) {
            H = 24 + H;
        }
        if (M>59) {
            M = M - 60;
            H = H + 1;
        }
        if (H>23) {
            H = H - 24;
        }
        System.out.printf("%d %d",H,M);
        sc.close();
    }
}
