package baekjoon.free;

import java.io.*;

public class B_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++) {
            String[] data = br.readLine().split(" ");
            int H = Integer.parseInt(data[0]);
            int N = Integer.parseInt(data[2]);
            bw.write(String.format("%d%02d%n", N%H==0 ? H : N%H , N%H==0 ? N/H : (N/H)+1));
        }
        bw.flush();
        bw.close();        
    }   
}
