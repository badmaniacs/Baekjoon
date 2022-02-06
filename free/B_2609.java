package baekjoon.free;

import java.io.*;

public class B_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int gcd = Gcd(A, B);
        bw.write(String.format("%d%n%d", gcd, (A*B)/gcd));
        bw.flush();
        bw.close();
    }
    static int Gcd (int A, int B) {
        if (B==0) {
            return A;
        }
        else {
            return Gcd(B, A%B);
        }      
    }    
}
