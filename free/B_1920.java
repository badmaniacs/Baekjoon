package baekjoon.free;
import java.io.*;

public class B_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));       
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        br.readLine().split(" ");
        for (int i = 0; i<M; i++) {
            for (int j = 0; i<N; i++) {
                
                    if (Integer.parseInt(data[i])==Integer.parseInt(data[j])) {
                        bw.write("1");
                        bw.newLine();
                    }

                bw.write("0");
                bw.newLine(); 
            }

        }bw.flush();
        bw.close();

    }
    
}
