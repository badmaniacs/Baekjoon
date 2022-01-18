package baekjoon.free;
import java.io.*;

public class B_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int C = Integer.parseInt(data[2]);
        int Q = A / (C-B) + 1;
        if (B>=C) {
            bw.write("-1");
        } 
        else {
            bw.write(Integer.toString(Q));
        }
        bw.flush();
        bw.close();


    }
    
}
