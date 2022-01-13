package baekjoon.free;
import java.io.*;

public class B_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        String[] x = data[0].split("");
        String[] y = data[1].split("");
        String a = "";
        String b = "";
        for (int i = 0; i<3; i++) {
            a += x[2-i];
            b += y[2-i];
        }
        String result = Integer.parseInt(a) > Integer.parseInt(b) ? a : b;
        bw.write(result);
        bw.flush();
        bw.close();              
    }    
}
