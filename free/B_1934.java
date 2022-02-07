package baekjoon.free;

import java.io.*;

public class B_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++){
            String[] data = br.readLine().split(" ");
            int A = Integer.parseInt(data[0]);
            int B = Integer.parseInt(data[1]);
            bw.write(String.format("%d%n",(A*B)/Gcd(A, B)));
        }
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
