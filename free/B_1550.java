package baekjoon.free;

import java.io.*;

public class B_1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%s",Integer.parseInt(br.readLine(),16)));
        bw.flush();
    }
}
