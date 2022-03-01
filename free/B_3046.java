package baekjoon.free;
import java.io.*;

public class B_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        bw.write(String.format("%d", Integer.parseInt(input[1])*2-Integer.parseInt(input[0])));
        bw.flush();
        bw.close();
    }
    
}
