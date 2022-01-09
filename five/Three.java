package baekjoon.five;
import java.io.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = Integer.toString(A*B*C);
        String arr[] = result.split("");
        int count[] = new int[10];
        for (int i = 0; i<arr.length;i++){
            count[Integer.parseInt(arr[i])]++;
        }
        for (int j = 0; j<count.length;j++){
            bw.write(Integer.toString(count[j]));
            bw.newLine();
        }
        bw.flush();
        bw.close();        
    }
}
