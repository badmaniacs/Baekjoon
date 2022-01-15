package baekjoon.free;
import java.io.*;

public class B_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String x = br.readLine();
        int y = x.charAt(0);
        bw.write(Integer.toString(y));
        bw.flush();
        bw.close();                
    }    
}
