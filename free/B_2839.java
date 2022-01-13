package baekjoon.free;
import java.io.*;

public class B_2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int five = N / 5;
        int three = ( N - (five * 5) ) / 3;
        int first = five + three;
        int onlythree = N / 3;
        if (first <= onlythree) {
            System.out.println(onlythree);
        }
        else if (five * 5 + three * 3 == 0) {
            System.out.println(three+five);
        }
        else if (five * 5 + three * 3 != 0) {
            System.out.println("-1");
        }
        bw.close();

    }
    
}
