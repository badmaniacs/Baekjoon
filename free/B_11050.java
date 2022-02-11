package baekjoon.free;

import java.io.*;

public class B_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int result = factorial(a)/(factorial(b)*factorial(a-b));
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();    
    }

    static int factorial(int N) {
        if (N<=1) {
            return 1;
        }
        return N*factorial(N-1);
    }    
}


