package baekjoon.free;
import java.io.*;

public class B_2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
    
    bw.write(N);
    bw.flush();
    bw.close();
        
    }
    static int Number(int N) {
        int sum = N % 10;
     return sum;
    }
}
