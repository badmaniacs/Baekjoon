package baekjoon.one;
import java.util.*;

public class seven {
    public static void main(String[] args) {
        int a, b; 
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        b = sc.nextInt();
        System.out.printf("%.10f",(double)a/b);
        sc.close();        
    }
}