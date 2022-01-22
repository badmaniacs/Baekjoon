package baekjoon.free;
import java.io.*;

public class B_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));      
        char[] data = br.readLine().toCharArray();
        int[] arr = new int[26];
        for (int i=0;i<data.length;i++) {
            arr[((int)data[i]-97)] += 1;
        }
        for (int number : arr) {
            bw.write(Integer.toString(number)+" ");
        }
        bw.flush();
        bw.close();        
    }  
}