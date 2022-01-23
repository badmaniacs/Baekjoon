package baekjoon.free;
import java.io.*;

public class B_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split("-");
        for (int i=0;i<data.length;i++) {
            String[] data2 = data[i].split("");
            bw.write(data2[0]);
        }
        bw.flush();
        bw.close();
    }    
}
