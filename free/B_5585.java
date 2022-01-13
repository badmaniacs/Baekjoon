package baekjoon.free;
import java.io.*;

public class B_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 1000 - Integer.parseInt(br.readLine());
        int obak = N / 500;
        int bak = N % 500 / 100;
        int osib = N % 100 / 50;
        int sib = N % 50 / 10;
        int o = N % 10 / 5;
        int il = N % 5 / 1;
        int sum = obak + bak + osib + sib + o + il;
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();

        
    }
    
}
