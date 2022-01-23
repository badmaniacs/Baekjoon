package baekjoon.free;
import java.io.*;

public class B_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        new BufferedWriter(new OutputStreamWriter(System.out));
        String[] size = br.readLine().split(" ");
        int A = Integer.parseInt(size[0]);
        int B = Integer.parseInt(size[1]);
        int[][] mat = new int[A][B];
        for (int i=0;i<A;i++) {
            String[] data = br.readLine().split(" ");
            for (int j=0;j<B;) {
                mat[i][j] = Integer.parseInt(data[j]);
            }
        }



        
    }
    
}
