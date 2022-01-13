package baekjoon.free;
import java.io.*;

public class B_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(data[i]);            
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();        
    }   
}
