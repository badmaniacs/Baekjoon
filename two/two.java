package baekjoon.two;
import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s > 89) {
            System.out.println("A");
        } else if (s > 79) {
            System.out.println("B");
        } else if (s > 69) {
            System.out.println("C");
        } else if (s > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        sc.close();
    }
    
}
