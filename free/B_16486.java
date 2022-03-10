package baekjoon.free;

import java.io.*;

public class B_16486 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int dOne = Integer.parseInt(br.readLine());
        int dTwo = Integer.parseInt(br.readLine());
        double PI = 3.141592;
        bw.write(String.format("%s", (dOne*2)+(2*dTwo*PI)));
        bw.flush();
    }   
}
