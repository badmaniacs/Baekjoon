package baekjoon.free;
import java.io.*;

public class B_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String data = br.readLine();
        int[] arr = new int[26];
        for (int i=0;i<arr.length;i++) {
            arr[i] = data.indexOf((char)i+97);
            bw.write(Integer.toString(arr[i])+" ");
        }
        bw.flush();
        bw.close();        
    }  
}
