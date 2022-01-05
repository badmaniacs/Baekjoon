package baekjoon.one;
import java.util.*;

public class eight {
    public static void main(String[] args) {
        int a, b, c; 
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();        
        b = sc.nextInt();
        c = sc.nextInt();        
        System.out.printf("%d%n%d%n%d%n%d", (a+b)%c , ((a%c)+(b%c))%c , (a*b)%c , ((a%c)*(b%c))%c );
        sc.close();        
    }
}
