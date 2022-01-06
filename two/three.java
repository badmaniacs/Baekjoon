package baekjoon.two;
import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y % 4 == 0 && y % 100 != 0) {
            System.out.println("1");
        } else if (y % 400 == 0) {
            System.out.println("1");
        }        
        else {
            System.out.println("0");
        }
    }
}
