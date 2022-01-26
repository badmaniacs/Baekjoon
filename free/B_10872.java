package baekjoon.free;
import java.io.*;

public class B_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(factorial(N)));
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
