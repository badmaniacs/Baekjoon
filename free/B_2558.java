package baekjoon.free;

import java.io.*;

public class B_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        bw.write(String.format("%d", A+B));
        bw.flush();
        bw.close();
    }
}
