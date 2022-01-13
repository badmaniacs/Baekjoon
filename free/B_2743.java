package baekjoon.free;
import java.io.*;

public class B_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split("");
        int leng = data.length;
        bw.write(Integer.toString(leng));
        bw.flush();
        bw.close();
        
    }
    
}
