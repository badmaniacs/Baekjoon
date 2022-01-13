
package baekjoon.free;
import java.io.*;

public class B_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0;i<N; i++) {
            String[] name = br.readLine().split("");
            String[][] data = new String[N][name.length];
            for (int j = 0;j<name.length;j++) {
                data[i][j] = name[j]; 
            }            
        }
        bw.close();



    }
}