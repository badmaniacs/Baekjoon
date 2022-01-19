package baekjoon.free;
import java.io.*;

public class B_10953 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int count = 0;
        while (T!=count) {
        String[] data = br.readLine().split(",");
        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        bw.write(Integer.toString(A+B));
        bw.newLine();
        count++;
        }
        bw.flush();
        bw.close();

    }
    
}
