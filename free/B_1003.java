
package baekjoon.free;
import java.io.*;
import java.math.*;

public class B_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        BigInteger a = new BigInteger(data[0]);
        BigInteger b = new BigInteger(data[1]);
        bw.write(String.format("%d%n%d", a.divide(b), a.remainder(b)));
        bw.flush();
    }
}