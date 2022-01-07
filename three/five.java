package baekjoon.three;
import java.io.*;

public class five {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int s = Integer.parseInt(br.readLine());
        for (int i=1; i<=s;i++) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }    
}
