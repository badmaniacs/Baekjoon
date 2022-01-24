package baekjoon.free;
import java.io.*;

public class B_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(br.readLine());
        int[] stack = new int[K];
        int point = 0;
        int sum = 0;
        for (int i = 0; i<K ; i++) {           
            int data = Integer.parseInt(br.readLine());
            if (data==0) {
                point--;
            }
            else {
                stack[point++] = data;
            }
        }
        for (int j = 0; j<point ; j ++ ) {
            sum += stack[j];
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();        
    }  
}
