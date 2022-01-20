package baekjoon.free;
import java.io.*;

public class B_11721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split("");
        for (int i=0;i<data.length;i++) {
            bw.write(data[i]);
            if (i%10==9) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }    
}
